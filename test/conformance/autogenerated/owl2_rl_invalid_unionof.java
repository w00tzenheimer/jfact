package conformance.autogenerated;

import conformance.Factory;
import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class owl2_rl_invalid_unionof extends TestCase {
	public void testowl2_rl_invalid_unionof() {
		String premise = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\">\n"
				+ "  <owl:Ontology />\n"
				+ "  <owl:Class rdf:about=\"http://owl2.test/rules#C\">\n"
				+ "    <owl:unionOf rdf:parseType=\"Collection\">\n"
				+ "      <owl:Class rdf:about=\"http://owl2.test/rules#C1\"/>\n"
				+ "      <owl:Class rdf:about=\"http://owl2.test/rules#C2\"/>\n"
				+ "    </owl:unionOf>\n" + "  </owl:Class>\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "owl2_rl_invalid_unionof";
		TestClasses tc = TestClasses.valueOf("CONSISTENCY");
		String d = "OWL 2 RL does not allow owl:unionOf to define a named class (it can be used as a subclass expression).";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}