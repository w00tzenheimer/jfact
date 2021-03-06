package uk.ac.manchester.cs.jfact.kernel;

/* This file is part of the JFact DL reasoner
 Copyright 2011 by Ignazio Palmisano, Dmitry Tsarkov, University of Manchester
 This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published by the Free Software Foundation; either version 2.1 of the License, or (at your option) any later version.
 This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 You should have received a copy of the GNU Lesser General Public License along with this library; if not, write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301 USA*/
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import uk.ac.manchester.cs.jfact.datatypes.Literal;
import uk.ac.manchester.cs.jfact.kernel.dl.*;
import uk.ac.manchester.cs.jfact.kernel.dl.interfaces.*;
import uk.ac.manchester.cs.jfact.kernel.voc.Vocabulary;

public class ExpressionManager {
    /** Cache for the inverse roles */
    protected class InverseRoleCache {
        /** map tail into an object head(tail) */
        private Map<ObjectRoleExpression, ObjectRoleExpression> map;

        /** get an object corresponding to Head.Tail */
        public ObjectRoleExpression get(ObjectRoleExpression tail) {
            // try to find cached dep-set
            if (map != null && map.containsKey(tail)) {
                return map.get(tail);
            }
            // no cached entry -- create a new one and cache it
            ObjectRoleExpression concat = build(tail);
            if (map == null) {
                map = new HashMap<ObjectRoleExpression, ObjectRoleExpression>();
            }
            map.put(tail, concat);
            return concat;
        }

        /** clear the cache */
        public void clear() {
            if (map != null) {
                map.clear();
            }
        }

        public ObjectRoleExpression build(ObjectRoleExpression tail) {
            return new ObjectRoleInverse(tail);
        }
    }

    protected static class DataroleNameCreator implements NameCreator<DataRoleName> {
        public DataRoleName makeEntry(String name) {
            return new DataRoleName(name);
        }
    }

    protected static class ObjectroleNameCreator implements NameCreator<ObjectRoleName> {
        public ObjectRoleName makeEntry(String name) {
            return new ObjectRoleName(name);
        }
    }

    protected static class IndividualNameCreator implements NameCreator<IndividualName> {
        public IndividualName makeEntry(String name) {
            return new IndividualName(name);
        }
    }

    protected static class ConceptNameCreator implements NameCreator<ConceptName> {
        public ConceptName makeEntry(String name) {
            return new ConceptName(name);
        }
    }

    /** nameset for concepts */
    private NameSet<ConceptName> conceptNameset = new NameSet<ConceptName>(
            new ConceptNameCreator());
    /** nameset for individuals */
    private NameSet<IndividualName> individualNameset = new NameSet<IndividualName>(
            new IndividualNameCreator());
    /** nameset for object roles */
    private NameSet<ObjectRoleName> objectRoleNameset = new NameSet<ObjectRoleName>(
            new ObjectroleNameCreator());
    /** nameset for data roles */
    private NameSet<DataRoleName> dataRoleNameset = new NameSet<DataRoleName>(
            new DataroleNameCreator());
    /** TOP concept */
    private ConceptTop top = new ConceptTop();
    /** BOTTOM concept */
    private ConceptBottom bottom = new ConceptBottom();
    private DataTop DTop = new DataTop();
    /** TOP object role */
    private ObjectRoleExpression objectRoleTop = new ObjectRoleTop();
    /** BOTTOM object role */
    private ObjectRoleExpression objectRoleBottom = new ObjectRoleBottom();
    /** TOP data role */
    private DataRoleExpression dataRoleTop = new DataRoleTop();
    /** BOTTOM data role */
    private DataRoleExpression dataRoleBottom = new DataRoleBottom();
    /** TOP data element */
    private DataTop dataTop = new DataTop();
    /** BOTTOM data element */
    private DataBottom dataBottom = new DataBottom();
    /** cache for the role inverses */
    private InverseRoleCache inverseRoleCache = new InverseRoleCache();

    /** set Top/Bot properties */
    public void setTopBottomRoles(String topORoleName, String botORoleName,
            String topDRoleName, String botDRoleName) {
        objectRoleTop = new ObjectRoleName(topORoleName);
        objectRoleBottom = new ObjectRoleName(botORoleName);
        dataRoleTop = new DataRoleName(topDRoleName);
        dataRoleBottom = new DataRoleName(botDRoleName);
    }

    public void clearNameCache(NameSet<?> ns) {
        ns.clear();
    }

    public void clearNameCache() {
        clearNameCache(conceptNameset);
        clearNameCache(objectRoleNameset);
        clearNameCache(dataRoleNameset);
        clearNameCache(individualNameset);
    }

    // top/bottom roles
    /** @return true iff R is a top object role */
    public boolean isUniversalRole(ObjectRoleComplexExpression R) {
        return R.equals(objectRoleTop);
    }

    /** @return true iff R is a top data role */
    public boolean isUniversalRole(DataRoleExpression R) {
        return R.equals(dataRoleTop);
    }

    /** @return true iff R is a bottom object role */
    public boolean isEmptyRole(ObjectRoleComplexExpression R) {
        return R.equals(objectRoleBottom);
    }

    /** @return true iff R is a bottom data role */
    public boolean isEmptyRole(DataRoleExpression R) {
        return R.equals(dataRoleBottom);
    }

    /** get number of registered concepts */
    public int nConcepts() {
        return conceptNameset.size();
    }

    /** get number of registered individuals */
    public int nIndividuals() {
        return individualNameset.size();
    }

    /** get number of registered object roles */
    public int nORoles() {
        return objectRoleNameset.size();
    }

    /** get number of registered data roles */
    public int nDRoles() {
        return dataRoleNameset.size();
    }

    /** get TOP concept */
    public ConceptExpression top() {
        return top;
    }

    /** get BOTTOM concept */
    public ConceptExpression bottom() {
        return bottom;
    }

    /** get named concept */
    public ConceptExpression concept(String name) {
        return conceptNameset.insert(name);
    }

    /** get negation of a concept C */
    public ConceptExpression not(ConceptExpression C) {
        return new ConceptNot(C);
    }

    /** get an n-ary conjunction expression; take the arguments from the last
     * argument list */
    public ConceptExpression and(List<Expression> l) {
        return new ConceptAnd(l);
    }

    /** @return C and D */
    public ConceptExpression and(ConceptExpression C, ConceptExpression D) {
        return and(Arrays.<Expression> asList(C, D));
    }

    /** @return C or D */
    public ConceptExpression or(ConceptExpression C, ConceptExpression D) {
        return or(Arrays.<Expression> asList(C, D));
    }

    /** get an n-ary disjunction expression; take the arguments from the last
     * argument list */
    public ConceptExpression or(List<Expression> l) {
        return new ConceptOr(l);
    }

    /** get an n-ary one-of expression; take the arguments from the last argument
     * list */
    public ConceptExpression oneOf(List<Expression> l) {
        return new ConceptOneOf(l);
    }

    public ObjectRoleExpression inverse(ObjectRoleExpression R) {
        return inverseRoleCache.get(R);
    }

    /** @return concept {I} for the individual I */
    public ConceptExpression oneOf(IndividualExpression I) {
        return oneOf(Arrays.<Expression> asList(I));
    }

    /** get self-reference restriction of an object role R */
    public ConceptExpression selfReference(ObjectRoleExpression R) {
        return new ConceptObjectSelf(R);
    }

    /** get value restriction wrt an object role R and an individual I */
    public ConceptExpression value(ObjectRoleExpression R, IndividualExpression I) {
        return new ConceptObjectValue(R, I);
    }

    /** get existential restriction wrt an object role R and a concept C */
    public ConceptExpression exists(ObjectRoleExpression R, ConceptExpression C) {
        return new ConceptObjectExists(R, C);
    }

    /** get universal restriction wrt an object role R and a concept C */
    public ConceptExpression forall(ObjectRoleExpression R, ConceptExpression C) {
        return new ConceptObjectForall(R, C);
    }

    /** get min cardinality restriction wrt number N, an object role R and a
     * concept C */
    public ConceptExpression minCardinality(int n, ObjectRoleExpression R,
            ConceptExpression C) {
        return new ConceptObjectMinCardinality(n, R, C);
    }

    /** get max cardinality restriction wrt number N, an object role R and a
     * concept C */
    public ConceptExpression maxCardinality(int n, ObjectRoleExpression R,
            ConceptExpression C) {
        return new ConceptObjectMaxCardinality(n, R, C);
    }

    /** get exact cardinality restriction wrt number N, an object role R and a
     * concept C */
    public ConceptExpression cardinality(int n, ObjectRoleExpression R,
            ConceptExpression C) {
        return new ConceptObjectExactCardinality(n, R, C);
    }

    /** get value restriction wrt a data role R and a data value V */
    public ConceptExpression value(DataRoleExpression R, Literal<?> V) {
        return new ConceptDataValue(R, V);
    }

    /** get existential restriction wrt a data role R and a data expression E */
    public ConceptExpression exists(DataRoleExpression R, DataExpression E) {
        return new ConceptDataExists(R, E);
    }

    /** get universal restriction wrt a data role R and a data expression E */
    public ConceptExpression forall(DataRoleExpression R, DataExpression E) {
        return new ConceptDataForall(R, E);
    }

    /** get min cardinality restriction wrt number N, a data role R and a data
     * expression E */
    public ConceptExpression
            minCardinality(int n, DataRoleExpression R, DataExpression E) {
        return new ConceptDataMinCardinality(n, R, E);
    }

    /** get max cardinality restriction wrt number N, a data role R and a data
     * expression E */
    public ConceptExpression
            maxCardinality(int n, DataRoleExpression R, DataExpression E) {
        return new ConceptDataMaxCardinality(n, R, E);
    }

    /** get exact cardinality restriction wrt number N, a data role R and a data
     * expression E */
    public ConceptExpression cardinality(int n, DataRoleExpression R, DataExpression E) {
        return new ConceptDataExactCardinality(n, R, E);
    }

    // individuals
    /** get named individual */
    public IndividualExpression individual(String name) {
        return individualNameset.insert(name);
    }

    // object roles
    /** get TOP object role */
    public ObjectRoleExpression objectRoleTop() {
        return objectRoleTop;
    }

    /** get BOTTOM object role */
    public ObjectRoleExpression objectRoleBottom() {
        return objectRoleBottom;
    }

    /** get named object role */
    public ObjectRoleExpression objectRole(String name) {
        return objectRoleNameset.insert(name);
    }

    /** get a role chain corresponding to R1 o ... o Rn; take the arguments from
     * the last argument list */
    public ObjectRoleComplexExpression compose(List<Expression> l) {
        return new ObjectRoleChain(l);
    }

    public ObjectRoleComplexExpression compose(Expression e1, Expression e2) {
        return new ObjectRoleChain(Arrays.asList(e1, e2));
    }

    /** get a expression corresponding to R projected from C */
    public ObjectRoleComplexExpression projectFrom(ObjectRoleExpression R,
            ConceptExpression C) {
        return new ObjectRoleProjectionFrom(R, C);
    }

    /** get a expression corresponding to R projected into C */
    public ObjectRoleComplexExpression projectInto(ObjectRoleExpression R,
            ConceptExpression C) {
        return new ObjectRoleProjectionInto(R, C);
    }

    // data roles
    /** get TOP data role */
    public DataRoleExpression dataRoleTop() {
        return dataRoleTop;
    }

    /** get BOTTOM data role */
    public DataRoleExpression dataRoleBottom() {
        return dataRoleBottom;
    }

    /** get named data role */
    public DataRoleExpression dataRole(String name) {
        return dataRoleNameset.insert(name);
    }

    // data expressions
    /** get TOP data element */
    public DataExpression dataTop() {
        return dataTop;
    }

    /** get BOTTOM data element */
    public DataExpression dataBottom() {
        return dataBottom;
    }

    /** get basic string data type */
    public String getDataTop() {
        // XXX there is no link between TDLDataTop and the uri
        return Vocabulary.LITERAL;
    }

    /** get negation of a data expression E */
    public DataExpression dataNot(DataExpression E) {
        return new DataNot(E);
    }

    /** get an n-ary data conjunction expression */
    public DataExpression dataAnd(List<Expression> l) {
        return new DataAnd(l);
    }

    /** get an n-ary data disjunction expression */
    public DataExpression dataOr(List<Expression> l) {
        return new DataOr(l);
    }

    /** get an n-ary data one-of expression */
    public DataExpression dataOneOf(List<Expression> l) {
        return new DataOneOf(l);
    }

    public void clear() {
        conceptNameset.clear();
        individualNameset.clear();
        objectRoleNameset.clear();
        dataRoleNameset.clear();
        inverseRoleCache.clear();
    }
}
