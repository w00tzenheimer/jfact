package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class New_Feature_BottomDataProperty_001 extends TestCase {
	public void testNew_Feature_BottomDataProperty_001() {
		String premise = "<?xml version=\"1.0\"?>\n" + "<rdf:RDF\n" + "  xml:base  = \"http://example.org/\"\n" + "  xmlns     = \"http://example.org/\"\n" + "  xmlns:owl = \"http://www.w3.org/2002/07/owl#\"\n" + "  xmlns:rdf = \"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n"
				+ "\n" + "<owl:Ontology/>\n" + "\n" + "<rdf:Description rdf:about=\"i\">\n" + "  <rdf:type>\n" + "    <owl:Restriction>\n" + "      <owl:onProperty rdf:resource=\"http://www.w3.org/2002/07/owl#bottomDataProperty\" />\n"
				+ "      <owl:someValuesFrom rdf:resource=\"http://www.w3.org/2000/01/rdf-schema#Literal\" />\n" + "    </owl:Restriction>\n" + "  </rdf:type>\n" + "</rdf:Description>\n" + "\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "New_Feature_BottomDataProperty_001";
		TestClasses tc = TestClasses.valueOf("INCONSISTENCY");
		String d = "Demonstrates use of the bottom data property to create an inconsistency.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}