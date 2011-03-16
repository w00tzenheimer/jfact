package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_disjointWith_008 extends TestCase {
	public void testWebOnt_disjointWith_008() {
		String premise = "<rdf:RDF\n" + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n" + "    xml:base=\"http://www.w3.org/2002/03owlt/disjointWith/consistent008\" >\n" + "    <owl:Ontology/>\n"
				+ "    <owl:Class rdf:ID=\"A\"/>\n" + "    <owl:Class rdf:nodeID=\"B\">\n" + "      <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "        <owl:Class rdf:ID=\"B\"/>\n" + "      </owl:intersectionOf>\n" + "      <owl:disjointWith rdf:resource=\"#A\"/>\n"
				+ "    </owl:Class>\n" + "    <owl:Class rdf:nodeID=\"C\">\n" + "      <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "        <owl:Class rdf:ID=\"C\"/>\n" + "      </owl:intersectionOf>\n" + "      <owl:disjointWith rdf:resource=\"#A\"/>\n"
				+ "    </owl:Class>\n" + "    <owl:Class rdf:ID=\"D\">\n" + "      <owl:disjointWith rdf:nodeID=\"B\"/>\n" + "      <owl:disjointWith rdf:nodeID=\"C\"/>\n" + "    </owl:Class>\n" + "\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_disjointWith_008";
		TestClasses tc = TestClasses.valueOf("CONSISTENCY");
		String d = "A further example that cannot be generated from the mapping rule\n" + "for DisjointClasses.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}