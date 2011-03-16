package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_InverseFunctionalProperty_001 extends TestCase {
	public void testWebOnt_InverseFunctionalProperty_001() {
		String premise = "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "  xmlns:owl =\"http://www.w3.org/2002/07/owl#\"\n" + "  xmlns:first=\"http://www.w3.org/2002/03owlt/InverseFunctionalProperty/premises001#\" \n"
				+ "  xml:base=\"http://www.w3.org/2002/03owlt/InverseFunctionalProperty/premises001\" >\n" + "    <owl:Ontology/>\n" + "    <owl:InverseFunctionalProperty rdf:ID=\"prop\"/>\n" + "    <rdf:Description rdf:ID=\"subject1\">\n"
				+ "      <first:prop rdf:resource=\"#object\" />\n" + "    </rdf:Description>\n" + "    <rdf:Description rdf:ID=\"subject2\">\n" + "      <first:prop rdf:resource=\"#object\" />\n" + "    </rdf:Description>\n"
				+ "  <rdf:Description rdf:about=\"http://www.w3.org/2002/03owlt/InverseFunctionalProperty/premises001#object\">\n" + "    <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/>\n" + "  </rdf:Description>\n"
				+ "  <rdf:Description rdf:about=\"http://www.w3.org/2002/03owlt/InverseFunctionalProperty/premises001#subject2\">\n" + "    <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/>\n" + "  </rdf:Description>\n"
				+ "  <rdf:Description rdf:about=\"http://www.w3.org/2002/03owlt/InverseFunctionalProperty/premises001#subject1\">\n" + "    <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/>\n" + "  </rdf:Description>\n" + "</rdf:RDF>";
		String conclusion = "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "  xmlns:owl =\"http://www.w3.org/2002/07/owl#\"\n" + "  xml:base=\"http://www.w3.org/2002/03owlt/InverseFunctionalProperty/conclusions001\" >\n" + "    <owl:Ontology/>\n"
				+ "    <rdf:Description rdf:about=\"premises001#subject1\">\n" + "      <owl:sameAs rdf:resource=\"premises001#subject2\" />\n" + "    </rdf:Description>\n" + "</rdf:RDF>";
		String id = "WebOnt_InverseFunctionalProperty_001";
		TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
		String d = "If <code>prop</code> belongs to <code>owl:InverseFunctionalProperty</code>,\n" + "and <code>object</code> denotes a resource\n" + "which is the object of two <code>prop</code> triples, then the <code>subject</code>s\n"
				+ "of these triples have the same denotation.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}