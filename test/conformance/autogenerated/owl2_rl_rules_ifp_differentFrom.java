package conformance.autogenerated;

import conformance.Factory;
import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class owl2_rl_rules_ifp_differentFrom extends TestCase {
	public void testowl2_rl_rules_ifp_differentFrom() {
		String premise = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:j.0=\"http://owl2.test/rules/\">\n"
				+ "  <owl:Ontology />\n"
				+ "  <owl:InverseFunctionalProperty rdf:about=\"http://owl2.test/rules/ifp\">\n"
				+ "    <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#ObjectProperty\"/>\n"
				+ "  </owl:InverseFunctionalProperty>\n"
				+ "  <owl:NamedIndividual rdf:about=\"http://owl2.test/rules/Y2\">\n"
				+ "    <j.0:ifp>\n"
				+ "      <owl:NamedIndividual rdf:about=\"http://owl2.test/rules/X2\"/>\n"
				+ "    </j.0:ifp>\n"
				+ "  </owl:NamedIndividual>\n"
				+ "  <owl:NamedIndividual rdf:about=\"http://owl2.test/rules/X1\"/>\n"
				+ "  <owl:NamedIndividual rdf:about=\"http://owl2.test/rules/Y1\">\n"
				+ "    <owl:differentFrom rdf:resource=\"http://owl2.test/rules/Y2\"/>\n"
				+ "    <j.0:ifp rdf:resource=\"http://owl2.test/rules/X1\"/>\n"
				+ "  </owl:NamedIndividual>\n" + "</rdf:RDF>";
		String conclusion = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\">\n"
				+ "  <owl:Ontology />\n"
				+ "  <owl:NamedIndividual rdf:about=\"http://owl2.test/rules/X1\">\n"
				+ "    <owl:differentFrom>\n"
				+ "      <owl:NamedIndividual rdf:about=\"http://owl2.test/rules/X2\"/>\n"
				+ "    </owl:differentFrom>\n" + "  </owl:NamedIndividual>\n"
				+ "</rdf:RDF>";
		String id = "owl2_rl_rules_ifp_differentFrom";
		TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
		String d = "This test checks the interaction between inverse functional property and differentFrom assertions.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}