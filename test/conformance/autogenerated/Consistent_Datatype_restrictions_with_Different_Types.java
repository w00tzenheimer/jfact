package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class Consistent_Datatype_restrictions_with_Different_Types extends TestCase {
	public void testConsistent_Datatype_restrictions_with_Different_Types() {
		String premise = "Prefix(:=<http://example.org/>)\n" + "Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>)\n" + "Ontology(\n" + "  Declaration(NamedIndividual(:a))\n" + "  Declaration(DataProperty(:dp))\n" + "  Declaration(Class(:A))\n"
				+ "  SubClassOf(:A DataAllValuesFrom(:dp \n" + "    DataOneOf(\"3\"^^xsd:integer \"4\"^^xsd:int))\n" + "  ) \n" + "  SubClassOf(:A DataAllValuesFrom(:dp \n" + "    DataOneOf(\"2\"^^xsd:short \"3\"^^xsd:int))\n" + "  )\n" + "  ClassAssertion(:A :a)\n"
				+ "  ClassAssertion(DataSomeValuesFrom(:dp \n" + "    DataOneOf(\"3\"^^xsd:integer)) :a\n" + "  )\n" + ")";
		String conclusion = "";
		String id = "Consistent_Datatype_restrictions_with_Different_Types";
		TestClasses tc = TestClasses.valueOf("CONSISTENCY");
		String d = "The individual a must have dp fillers that are in the sets {3, 4} and {2, 3} (different types are used, but shorts and ints are integers). Furthermore, the dp filler must be 3, but since 3 is in both sets, the ontology is consistent.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}