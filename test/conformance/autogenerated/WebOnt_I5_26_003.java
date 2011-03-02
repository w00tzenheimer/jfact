package conformance.autogenerated;

import conformance.Factory;
import junit.framework.TestCase;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_I5_26_003 extends TestCase {
	public void testWebOnt_I5_26_003() {
		String premise = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/I5.26/consistent003\" >\n"
				+ "    <owl:Ontology/>\n"
				+ "    <owl:Class rdf:nodeID=\"B\">\n"
				+ "      <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "        <owl:Class rdf:ID=\"B\"/>\n"
				+ "      </owl:intersectionOf>\n" + "    </owl:Class>\n"
				+ "    <owl:Class rdf:ID=\"notB\">\n"
				+ "      <owl:complementOf rdf:nodeID=\"B\"/>\n"
				+ "    </owl:Class>\n" + "    <owl:Class rdf:ID=\"u\">\n"
				+ "      <owl:unionOf rdf:parseType=\"Collection\">\n"
				+ "         <rdf:Description rdf:nodeID=\"B\"/>\n"
				+ "         <owl:Class rdf:ID=\"A\"/>\n"
				+ "      </owl:unionOf>\n" + "    </owl:Class>\n" + "\n"
				+ "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_I5_26_003";
		TestClasses tc = TestClasses.valueOf("CONSISTENCY");
		String d = "Structure sharing was not permitted in OWL DL, between two class descriptions, but is permitted in OWL 2 DL.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}