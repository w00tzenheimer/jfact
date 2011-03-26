package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class New_Feature_DisjointObjectProperties_001 extends TestCase {
	public void testNew_Feature_DisjointObjectProperties_001() {
		String premise = "<?xml version=\"1.0\"?>\n"
				+ "<rdf:RDF\n"
				+ "  xml:base  = \"http://example.org/\"\n"
				+ "  xmlns     = \"http://example.org/\"\n"
				+ "  xmlns:owl = \"http://www.w3.org/2002/07/owl#\"\n"
				+ "  xmlns:rdf = \"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n"
				+ "\n" + "<owl:Ontology/>\n" + "\n"
				+ "<owl:ObjectProperty rdf:about=\"hasFather\" />\n"
				+ "<owl:ObjectProperty rdf:about=\"hasMother\" />\n" + "\n"
				+ "<rdf:Description rdf:about=\"hasFather\">\n"
				+ "  <owl:propertyDisjointWith rdf:resource=\"hasMother\" />\n"
				+ "</rdf:Description>\n" + "\n"
				+ "<rdf:Description rdf:about=\"Stewie\">\n"
				+ "  <hasFather rdf:resource=\"Peter\" />\n"
				+ "</rdf:Description>\n" + "\n"
				+ "<rdf:Description rdf:about=\"Stewie\">\n"
				+ "  <hasMother rdf:resource=\"Lois\" />\n"
				+ "</rdf:Description>\n" + "\n" + "</rdf:RDF>";
		String conclusion = "<?xml version=\"1.0\"?>\n"
				+ "<rdf:RDF\n"
				+ "  xml:base  = \"http://example.org/\"\n"
				+ "  xmlns     = \"http://example.org/\"\n"
				+ "  xmlns:owl = \"http://www.w3.org/2002/07/owl#\"\n"
				+ "  xmlns:rdf = \"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n"
				+ "\n" + "<owl:Ontology/>\n" + "\n"
				+ "<rdf:Description rdf:about=\"Peter\">\n"
				+ "  <owl:differentFrom rdf:resource=\"Lois\" />\n"
				+ "</rdf:Description>\n" + "\n" + "</rdf:RDF>";
		String id = "New_Feature_DisjointObjectProperties_001";
		TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
		String d = "Demonstrates use of a disjoint object properties axiom to infer that two individuals are different based on the example in the Structural Specification and Functional-Style Syntax document.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}