package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class rdfbased_sem_eqdis_eqprop_subprop_1 extends TestCase {
	public void testrdfbased_sem_eqdis_eqprop_subprop_1() {
		//XXX test modified because of ontology not compliant with OWL 2
		String premise = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
				+ "    xmlns:ex=\"http://www.example.org#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\">\n"
				//added
				+ "<owl:ObjectProperty rdf:about=\"http://www.example.org#p1\"/>\n"
				+ "<owl:ObjectProperty rdf:about=\"http://www.example.org#p2\"/>\n"
				//end added
				+ "  <rdf:Description rdf:about=\"http://www.example.org#p1\">\n"
				+ "    <owl:equivalentProperty rdf:resource=\"http://www.example.org#p2\"/>\n"
				+ "  </rdf:Description>\n" + "</rdf:RDF>";
		String conclusion = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
				+ "    xmlns:ex=\"http://www.example.org#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\">\n"
				//added
				+ "<owl:ObjectProperty rdf:about=\"http://www.example.org#p1\"/>\n"
				+ "<owl:ObjectProperty rdf:about=\"http://www.example.org#p2\"/>\n"
				//end added
				+ "  <rdf:Description rdf:about=\"http://www.example.org#p2\">\n"
				+ "    <rdfs:subPropertyOf>\n"
				+ "      <rdf:Description rdf:about=\"http://www.example.org#p1\">\n"
				+ "        <rdfs:subPropertyOf rdf:resource=\"http://www.example.org#p2\"/>\n"
				+ "      </rdf:Description>\n" + "    </rdfs:subPropertyOf>\n"
				+ "  </rdf:Description>\n" + "</rdf:RDF>";
		String id = "rdfbased_sem_eqdis_eqprop_subprop_1";
		TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
		String d = "Two equivalent properties are sub properties of each other.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}