package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class Contradicting_datatype_Restrictions extends TestCase {
	public void testContradicting_datatype_Restrictions() {
		String premise = "Prefix(:=<http://example.org/>)\n" + "Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>)\n" + "Ontology(\n" + "  Declaration(NamedIndividual(:a))\n" + "  Declaration(DataProperty(:dp))\n" + "  Declaration(Class(:A))\n"
				+ "  SubClassOf(:A DataAllValuesFrom(:dp \n" + "    DataOneOf(\"3\"^^xsd:integer \"4\"^^xsd:integer))\n" + "  ) \n" + "  SubClassOf(:A DataAllValuesFrom(:dp \n" + "    DataOneOf(\"2\"^^xsd:integer \"3\"^^xsd:integer))\n" + "  )\n"
				+ "  SubClassOf(:A DataSomeValuesFrom(:dp \n" + "    DatatypeRestriction(xsd:integer \n" + "      xsd:minInclusive \"4\"^^xsd:integer)\n" + "    )\n" + "  )\n" + "  ClassAssertion(:A :a)\n" + ")";
		String conclusion = "";
		String id = "Contradicting_datatype_Restrictions";
		TestClasses tc = TestClasses.valueOf("INCONSISTENCY");
		String d = "The individual a is in A and thus must have a dp filler that is an integer >= 4. Furthermore the dp fillers must be in the set {3, 4} and in the set {2, 3}. Although 3 is in both sets, 3 is not >= 4, which causes the inconsistency.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}