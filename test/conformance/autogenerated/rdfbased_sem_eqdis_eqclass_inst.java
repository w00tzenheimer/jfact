package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class rdfbased_sem_eqdis_eqclass_inst extends TestCase {
	public void testrdfbased_sem_eqdis_eqclass_inst() {
		//XXX test modified because of ontology not compliant with OWL 2
		String premise = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
				+ "    xmlns:ex=\"http://www.example.org#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\">\n"
				//added
				+ "<owl:Class rdf:about=\"http://www.example.org#c2\"/>\n"
				+ "<owl:Class rdf:about=\"http://www.example.org#c1\"/>\n"
				//end added
				+ "  <ex:c1 rdf:about=\"http://www.example.org#x\"/>\n"
				+ "  <ex:c2 rdf:about=\"http://www.example.org#y\"/>\n"
				+ "  <rdf:Description rdf:about=\"http://www.example.org#c1\">\n"
				+ "    <owl:equivalentClass rdf:resource=\"http://www.example.org#c2\"/>\n"
				+ "  </rdf:Description>\n" + "</rdf:RDF>";
		String conclusion = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
				+ "    xmlns:ex=\"http://www.example.org#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\">\n"
				//added
				+ "<owl:Class rdf:about=\"http://www.example.org#c2\"/>\n"
				+ "<owl:Class rdf:about=\"http://www.example.org#c1\"/>\n"
				//end added
				+ "  <ex:c2 rdf:about=\"http://www.example.org#x\"/>\n"
				+ "  <ex:c1 rdf:about=\"http://www.example.org#y\"/>\n"
				+ "</rdf:RDF>";
		String id = "rdfbased_sem_eqdis_eqclass_inst";
		TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
		String d = "For two equivalent classes, any instance of one class is also an instance of the other class, and vice versa.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}