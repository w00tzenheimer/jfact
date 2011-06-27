package uk.ac.manchester.cs.jfact.visitors;

import uk.ac.manchester.cs.jfact.kernel.datatype.DataValue;
import uk.ac.manchester.cs.jfact.kernel.dl.ConceptAnd;
import uk.ac.manchester.cs.jfact.kernel.dl.ConceptBottom;
import uk.ac.manchester.cs.jfact.kernel.dl.ConceptDataExactCardinality;
import uk.ac.manchester.cs.jfact.kernel.dl.ConceptDataExists;
import uk.ac.manchester.cs.jfact.kernel.dl.ConceptDataForall;
import uk.ac.manchester.cs.jfact.kernel.dl.ConceptDataMaxCardinality;
import uk.ac.manchester.cs.jfact.kernel.dl.ConceptDataMinCardinality;
import uk.ac.manchester.cs.jfact.kernel.dl.ConceptDataValue;
import uk.ac.manchester.cs.jfact.kernel.dl.ConceptName;
import uk.ac.manchester.cs.jfact.kernel.dl.ConceptNot;
import uk.ac.manchester.cs.jfact.kernel.dl.ConceptObjectExactCardinality;
import uk.ac.manchester.cs.jfact.kernel.dl.ConceptObjectExists;
import uk.ac.manchester.cs.jfact.kernel.dl.ConceptObjectForall;
import uk.ac.manchester.cs.jfact.kernel.dl.ConceptObjectMaxCardinality;
import uk.ac.manchester.cs.jfact.kernel.dl.ConceptObjectMinCardinality;
import uk.ac.manchester.cs.jfact.kernel.dl.ConceptObjectSelf;
import uk.ac.manchester.cs.jfact.kernel.dl.ConceptObjectValue;
import uk.ac.manchester.cs.jfact.kernel.dl.ConceptOneOf;
import uk.ac.manchester.cs.jfact.kernel.dl.ConceptOr;
import uk.ac.manchester.cs.jfact.kernel.dl.ConceptTop;
import uk.ac.manchester.cs.jfact.kernel.dl.DataAnd;
import uk.ac.manchester.cs.jfact.kernel.dl.DataBottom;
import uk.ac.manchester.cs.jfact.kernel.dl.DataNot;
import uk.ac.manchester.cs.jfact.kernel.dl.DataOneOf;
import uk.ac.manchester.cs.jfact.kernel.dl.DataOr;
import uk.ac.manchester.cs.jfact.kernel.dl.DataRoleBottom;
import uk.ac.manchester.cs.jfact.kernel.dl.DataRoleName;
import uk.ac.manchester.cs.jfact.kernel.dl.DataRoleTop;
import uk.ac.manchester.cs.jfact.kernel.dl.DataTop;
import uk.ac.manchester.cs.jfact.kernel.dl.DataTypeName;
import uk.ac.manchester.cs.jfact.kernel.dl.DataTypeRestriction;
import uk.ac.manchester.cs.jfact.kernel.dl.FacetMaxExclusive;
import uk.ac.manchester.cs.jfact.kernel.dl.FacetMaxInclusive;
import uk.ac.manchester.cs.jfact.kernel.dl.FacetMinExclusive;
import uk.ac.manchester.cs.jfact.kernel.dl.FacetMinInclusive;
import uk.ac.manchester.cs.jfact.kernel.dl.IndividualName;
import uk.ac.manchester.cs.jfact.kernel.dl.ObjectRoleBottom;
import uk.ac.manchester.cs.jfact.kernel.dl.ObjectRoleChain;
import uk.ac.manchester.cs.jfact.kernel.dl.ObjectRoleInverse;
import uk.ac.manchester.cs.jfact.kernel.dl.ObjectRoleName;
import uk.ac.manchester.cs.jfact.kernel.dl.ObjectRoleProjectionFrom;
import uk.ac.manchester.cs.jfact.kernel.dl.ObjectRoleProjectionInto;
import uk.ac.manchester.cs.jfact.kernel.dl.ObjectRoleTop;

@SuppressWarnings("unused")
public class DLExpressionVisitorAdapter implements DLExpressionVisitor {
	public void visit(ConceptTop expr) {
	}

	public void visit(ConceptBottom expr) {
	}

	public void visit(ConceptName expr) {
	}

	public void visit(ConceptNot expr) {
	}

	public void visit(ConceptAnd expr) {
	}

	public void visit(ConceptOr expr) {
	}

	public void visit(ConceptOneOf expr) {
	}

	public void visit(ConceptObjectSelf expr) {
	}

	public void visit(ConceptObjectValue expr) {
	}

	public void visit(ConceptObjectExists expr) {
	}

	public void visit(ConceptObjectForall expr) {
	}

	public void visit(ConceptObjectMinCardinality expr) {
	}

	public void visit(ConceptObjectMaxCardinality expr) {
	}

	public void visit(ConceptObjectExactCardinality expr) {
	}

	public void visit(ConceptDataValue expr) {
	}

	public void visit(ConceptDataExists expr) {
	}

	public void visit(ConceptDataForall expr) {
	}

	public void visit(ConceptDataMinCardinality expr) {
	}

	public void visit(ConceptDataMaxCardinality expr) {
	}

	public void visit(ConceptDataExactCardinality expr) {
	}

	public void visit(IndividualName expr) {
	}

	public void visit(ObjectRoleTop expr) {
	}

	public void visit(ObjectRoleBottom expr) {
	}

	public void visit(ObjectRoleName expr) {
	}

	public void visit(ObjectRoleInverse expr) {
	}

	public void visit(ObjectRoleChain expr) {
	}

	public void visit(ObjectRoleProjectionFrom expr) {
	}

	public void visit(ObjectRoleProjectionInto expr) {
	}

	public void visit(DataRoleTop expr) {
	}

	public void visit(DataRoleBottom expr) {
	}

	public void visit(DataRoleName expr) {
	}

	public void visit(DataTop expr) {
	}

	public void visit(DataBottom expr) {
	}

	public void visit(DataTypeName expr) {
	}

	public void visit(DataTypeRestriction expr) {
	}

	public void visit(DataValue expr) {
	}

	public void visit(DataNot expr) {
	}

	public void visit(DataAnd expr) {
	}

	public void visit(DataOr expr) {
	}

	public void visit(DataOneOf expr) {
	}

	public void visit(FacetMinInclusive expr) {
	}

	public void visit(FacetMinExclusive expr) {
	}

	public void visit(FacetMaxInclusive expr) {
	}

	public void visit(FacetMaxExclusive expr) {
	}
}