package uk.ac.manchester.cs.jfact.visitors;

/* This file is part of the JFact DL reasoner
 Copyright 2011 by Ignazio Palmisano, Dmitry Tsarkov, University of Manchester
 This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published by the Free Software Foundation; either version 2.1 of the License, or (at your option) any later version. 
 This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 You should have received a copy of the GNU Lesser General Public License along with this library; if not, write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301 USA*/
import uk.ac.manchester.cs.jfact.kernel.Ontology;
import uk.ac.manchester.cs.jfact.kernel.dl.axioms.*;

@SuppressWarnings("javadoc")
public interface DLAxiomVisitorEx<O> {
    public O visit(AxiomDeclaration axiom);

    public O visit(AxiomEquivalentConcepts axiom);

    public O visit(AxiomDisjointConcepts axiom);

    public O visit(AxiomEquivalentORoles axiom);

    public O visit(AxiomEquivalentDRoles axiom);

    public O visit(AxiomDisjointUnion axiom);

    public O visit(AxiomDisjointORoles axiom);

    public O visit(AxiomDisjointDRoles axiom);

    public O visit(AxiomSameIndividuals axiom);

    public O visit(AxiomDifferentIndividuals axiom);

    public O visit(AxiomFairnessConstraint axiom);

    public O visit(AxiomRoleInverse axiom);

    public O visit(AxiomORoleSubsumption axiom);

    public O visit(AxiomDRoleSubsumption axiom);

    public O visit(AxiomORoleDomain axiom);

    public O visit(AxiomDRoleDomain axiom);

    public O visit(AxiomORoleRange axiom);

    public O visit(AxiomDRoleRange axiom);

    public O visit(AxiomRoleTransitive axiom);

    public O visit(AxiomRoleReflexive axiom);

    public O visit(AxiomRoleIrreflexive axiom);

    public O visit(AxiomRoleSymmetric axiom);

    public O visit(AxiomRoleAsymmetric axiom);

    public O visit(AxiomORoleFunctional axiom);

    public O visit(AxiomDRoleFunctional axiom);

    public O visit(AxiomRoleInverseFunctional axiom);

    public O visit(AxiomConceptInclusion axiom);

    public O visit(AxiomInstanceOf axiom);

    public O visit(AxiomRelatedTo axiom);

    public O visit(AxiomRelatedToNot axiom);

    public O visit(AxiomValueOf axiom);

    public O visit(AxiomValueOfNot axiom);

    public O visitOntology(Ontology ontology);
}
