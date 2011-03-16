package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_disjointWith_009 extends TestCase {
	public void testWebOnt_disjointWith_009() {
		String premise = "<rdf:RDF\n" + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n" + "    xml:base=\"http://www.w3.org/2002/03owlt/disjointWith/consistent009\" >\n" + "    <owl:Ontology/>\n"
				+ "    <owl:Class rdf:ID=\"A\"/>\n" + "    <owl:Class rdf:nodeID=\"B\">\n" + "      <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "        <owl:Class rdf:ID=\"B\"/>\n" + "      </owl:intersectionOf>\n" + "      <owl:disjointWith rdf:resource=\"#A\"/>\n"
				+ "    </owl:Class>\n" + "    <owl:Class rdf:nodeID=\"C\">\n" + "      <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "        <owl:Class rdf:ID=\"C\"/>\n" + "      </owl:intersectionOf>\n" + "      <owl:disjointWith rdf:resource=\"#A\"/>\n"
				+ "    </owl:Class>\n" + "    <owl:Class rdf:ID=\"D\">\n" + "      <owl:disjointWith rdf:nodeID=\"B\"/>\n" + "      <owl:disjointWith rdf:nodeID=\"C\"/>\n" + "      <owl:disjointWith rdf:resource=\"#A\"/>\n" + "    </owl:Class>\n" + "\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_disjointWith_009";
		TestClasses tc = TestClasses.valueOf("CONSISTENCY");
		String d = "If the owl:disjointWith edges in the graph form\n" + "undirected complete subgraphs which share URIref nodes\n" + "but do not share blank node\n" + "then this may be within OWL DL.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}