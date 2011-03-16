package conformance.broken;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class rdfbased_sem_restrict_allvalues_cmp_class extends TestCase {
	public void testrdfbased_sem_restrict_allvalues_cmp_class() {
		//XXX test modified because of ontology not compliant with OWL 2
		String premise = "<rdf:RDF\n" + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n" + "    xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
				+ "    xmlns:ex=\"http://www.example.org#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\">\n"
				//added
				+ "  <owl:Class rdf:about=\"http://www.example.org#c1\"/>\n"
				+ "  <owl:Class rdf:about=\"http://www.example.org#c2\"/>\n"
				//end added
				+ "  <rdf:Description rdf:about=\"http://www.example.org#x1\">\n" + "    <owl:allValuesFrom>\n" + "      <rdf:Description rdf:about=\"http://www.example.org#c1\">\n" + "        <rdfs:subClassOf rdf:resource=\"http://www.example.org#c2\"/>\n"
				+ "      </rdf:Description>\n" + "    </owl:allValuesFrom>\n" + "    <owl:onProperty rdf:resource=\"http://www.example.org#p\"/>\n" + "  </rdf:Description>\n" + "  <rdf:Description rdf:about=\"http://www.example.org#x2\">\n"
				+ "    <owl:allValuesFrom rdf:resource=\"http://www.example.org#c2\"/>\n" + "    <owl:onProperty rdf:resource=\"http://www.example.org#p\"/>\n" + "  </rdf:Description>\n" + "</rdf:RDF>";
		String conclusion = "<rdf:RDF\n" + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n" + "    xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n" + "    xmlns:ex=\"http://www.example.org#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\">\n"
				//added
				+ "  <owl:Class rdf:about=\"http://www.example.org#x1\"/>\n" + "  <owl:Class rdf:about=\"http://www.example.org#x2\"/>\n"
				//end added
				+ "  <rdf:Description rdf:about=\"http://www.example.org#x1\">\n" + "    <rdfs:subClassOf rdf:resource=\"http://www.example.org#x2\"/>\n" + "  </rdf:Description>\n" + "</rdf:RDF>";
		String id = "rdfbased_sem_restrict_allvalues_cmp_class";
		TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
		String d = "A universal restriction on some property and some class is a sub class of another universal restriction on the same property but on a super class.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}