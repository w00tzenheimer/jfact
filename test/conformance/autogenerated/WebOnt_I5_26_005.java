package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_I5_26_005 extends TestCase {
	public void testWebOnt_I5_26_005() {
		String premise = "<rdf:RDF\n" + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n" + "    xml:base=\"http://www.w3.org/2002/03owlt/I5.26/consistent005\" >\n" + "   <owl:Ontology/>\n"
				+ "   <owl:Class rdf:nodeID=\"B\">\n" + "      <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "        <owl:Class rdf:ID=\"B\"/>\n" + "      </owl:intersectionOf>\n" + "      <owl:disjointWith>\n" + "         <owl:Class rdf:ID=\"C\"/>\n"
				+ "      </owl:disjointWith>\n" + "      <owl:equivalentClass>\n" + "         <owl:Class rdf:ID=\"D\"/>\n" + "      </owl:equivalentClass>\n" + "    </owl:Class>\n" + "\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_I5_26_005";
		TestClasses tc = TestClasses.valueOf("CONSISTENCY");
		String d = "Structure sharing was not permitted in OWL DL, between an owl:equivalentClass triple and an\n" + "owl:disjointWith triple, but is permitted in OWL 2 DL.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}