package conformance.autogenerated;

import conformance.Factory;
import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class New_Feature_ObjectQCR_001 extends TestCase {
	public void testNew_Feature_ObjectQCR_001() {
		String premise = "<?xml version=\"1.0\"?>\n"
				+ "<rdf:RDF\n"
				+ "  xml:base  = \"http://example.org/\"\n"
				+ "  xmlns     = \"http://example.org/\"\n"
				+ "  xmlns:owl = \"http://www.w3.org/2002/07/owl#\"\n"
				+ "  xmlns:rdf = \"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n"
				+ "\n" + "<owl:Ontology/>\n" + "\n"
				+ "<owl:ObjectProperty rdf:about=\"fatherOf\" />\n"
				+ "<owl:Class rdf:about=\"Man\" />\n" + "\n"
				+ "<rdf:Description rdf:about=\"Peter\">\n"
				+ "  <fatherOf rdf:resource=\"Stewie\" />\n"
				+ "  <fatherOf rdf:resource=\"Chris\" />\n"
				+ "</rdf:Description>\n" + "\n"
				+ "<Man rdf:about=\"Stewie\" />\n"
				+ "<Man rdf:about=\"Chris\" />\n" + "\n"
				+ "<rdf:Description rdf:about=\"Stewie\">\n"
				+ "  <owl:differentFrom rdf:resource=\"Chris\" />\n"
				+ "</rdf:Description>\n" + "\n" + "</rdf:RDF>";
		String conclusion = "<?xml version=\"1.0\"?>\n"
				+ "<rdf:RDF\n"
				+ "  xml:base  = \"http://example.org/\"\n"
				+ "  xmlns     = \"http://example.org/\"\n"
				+ "  xmlns:owl = \"http://www.w3.org/2002/07/owl#\"\n"
				+ "  xmlns:rdf = \"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n"
				+ "\n"
				+ "<owl:Ontology/>\n"
				+ "\n"
				+ "<owl:ObjectProperty rdf:about=\"fatherOf\" />\n"
				+ "<owl:Class rdf:about=\"Man\" />\n"
				+ "\n"
				+ "<rdf:Description rdf:about=\"Peter\">\n"
				+ "  <rdf:type>\n"
				+ "    <owl:Restriction>\n"
				+ "      <owl:onProperty rdf:resource=\"fatherOf\" />\n"
				+ "      <owl:minQualifiedCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">2</owl:minQualifiedCardinality>\n"
				+ "      <owl:onClass rdf:resource=\"Man\" />\n"
				+ "    </owl:Restriction>\n" + "  </rdf:type>\n"
				+ "</rdf:Description>\n" + "\n" + "</rdf:RDF>";
		String id = "New_Feature_ObjectQCR_001";
		TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
		String d = "Demonstrates a qualified minimum cardinality object property restriction based on example in the Structural Specification and Functional-Style Syntax document.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}