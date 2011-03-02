package conformance.autogenerated;

import conformance.Factory;
import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class bnode2somevaluesfrom extends TestCase {
	public void testbnode2somevaluesfrom() {
		String premise = "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "  xmlns:ex=\"http://example.org/\"\n"
				+ "  xml:base=\"http://example.org/\">\n"
				+ "  <owl:Ontology/>\n"
				+ "  <owl:ObjectProperty rdf:about=\"p\"/>\n"
				+ "   \n"
				+ "  <owl:Thing rdf:about=\"a\">\n"
				+ "    <ex:p><rdf:Description rdf:nodeID=\"x\"/></ex:p> \n"
				+ "  </owl:Thing>\n" + "</rdf:RDF>";
		String conclusion = "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"  \n"
				+ "          xmlns:ex=\"http://example.org/\"\n"
				+ "          xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "          xml:base=\"http://example.org/\">\n"
				+ "  <owl:Ontology/>\n"
				+ "  <owl:ObjectProperty rdf:about=\"p\"/>\n"
				+ "  <owl:Thing rdf:about=\"a\">\n"
				+ "        <rdf:type>\n"
				+ "            <owl:Restriction>\n"
				+ "                <owl:onProperty rdf:resource=\"p\"/>\n"
				+ "                <owl:someValuesFrom rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/>\n"
				+ "            </owl:Restriction>\n"
				+ "        </rdf:type>\n"
				+ "    </owl:Thing>\n" + "</rdf:RDF>";
		String id = "bnode2somevaluesfrom";
		TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
		String d = "Shows that a BNode is an existential variable.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}