package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_I5_26_004 extends TestCase {
	public void testWebOnt_I5_26_004() {
		String premise = "<rdf:RDF\n" + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n" + "    xml:base=\"http://www.w3.org/2002/03owlt/I5.26/consistent004\" >\n" + "    <owl:Ontology/>\n"
				+ "    <owl:Class rdf:nodeID=\"B\">\n" + "      <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "        <owl:Class rdf:ID=\"B\"/>\n" + "      </owl:intersectionOf>\n" + "      <owl:disjointWith>\n" + "         <owl:Class rdf:ID=\"C\"/>\n"
				+ "      </owl:disjointWith>\n" + "    </owl:Class>\n" + "    <owl:Class rdf:ID=\"notB\">\n" + "      <owl:complementOf rdf:nodeID=\"B\"/>\n" + "    </owl:Class>\n" + "\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_I5_26_004";
		TestClasses tc = TestClasses.valueOf("CONSISTENCY");
		String d = "Structure sharing was not permitted in OWL DL, between a class description and an\n" + "owl:disjointWith triple, but is permitted in OWL 2 DL.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}