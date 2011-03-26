package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class rdfbased_sem_chain_def extends TestCase {
	public void testrdfbased_sem_chain_def() {
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
				+ "<owl:ObjectProperty rdf:about=\"http://www.example.org#p\"/>\n"
				//end added
				+ "  <rdf:Description rdf:about=\"http://www.example.org#x\">\n"
				+ "    <ex:p1>\n"
				+ "      <rdf:Description rdf:about=\"http://www.example.org#y\">\n"
				+ "        <ex:p2 rdf:resource=\"http://www.example.org#z\"/>\n"
				+ "      </rdf:Description>\n"
				+ "    </ex:p1>\n"
				+ "  </rdf:Description>\n"
				+ "  <rdf:Description rdf:about=\"http://www.example.org#p\">\n"
				+ "    <owl:propertyChainAxiom rdf:parseType=\"Collection\">\n"
				+ "      <rdf:Description rdf:about=\"http://www.example.org#p1\"/>\n"
				+ "      <rdf:Description rdf:about=\"http://www.example.org#p2\"/>\n"
				+ "    </owl:propertyChainAxiom>\n" + "  </rdf:Description>\n"
				+ "</rdf:RDF>";
		String conclusion = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
				+ "    xmlns:ex=\"http://www.example.org#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\">\n"
				//added
				+ "<owl:ObjectProperty rdf:about=\"http://www.example.org#p1\"/>\n"
				+ "<owl:ObjectProperty rdf:about=\"http://www.example.org#p2\"/>\n"
				+ "<owl:ObjectProperty rdf:about=\"http://www.example.org#p\"/>\n"
				//end added
				+ "  <rdf:Description rdf:about=\"http://www.example.org#x\">\n"
				+ "    <ex:p rdf:resource=\"http://www.example.org#z\"/>\n"
				+ "  </rdf:Description>\n" + "</rdf:RDF>";
		String id = "rdfbased_sem_chain_def";
		TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
		String d = "For a sub property chain axiom with super property p and chain properties p1 and p2, from x p1 y and y p2 z follows x p z.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}