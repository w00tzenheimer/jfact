package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class FS2RDF_different_individuals_2_ar extends TestCase {
	public void testFS2RDF_different_individuals_2_ar() {
		String premise = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
				+ "    xmlns=\"http://example.org/\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\">\n"
				+ "  <owl:Ontology/>\n"
				+ "  <rdf:Description rdf:about=\"http://example.org/a\">\n"
				+ "    <owl:differentFrom rdf:resource=\"http://example.org/b\"/>\n"
				+ "  </rdf:Description>\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "FS2RDF_different_individuals_2_ar";
		TestClasses tc = TestClasses.valueOf("CONSISTENCY");
		String d = "Functional syntax to RDFXML translation of ontology consisting of a 2 argument DifferentIndividuals";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}