package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_description_logic_901 extends TestCase {
	public void testWebOnt_description_logic_901() {
		String premise = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/description-logic/premises901\" >\n"
				+ "  <owl:Ontology/>\n"
				+ "  <owl:ObjectProperty rdf:ID=\"r\"/>\n"
				+ "  <owl:ObjectProperty rdf:ID=\"p\">\n"
				+ "    <rdfs:subPropertyOf rdf:resource=\"#r\"/>\n"
				+ "    <rdfs:range>\n" + "      <owl:Class rdf:ID=\"A\"/>\n"
				+ "    </rdfs:range>\n" + "  </owl:ObjectProperty>\n"
				+ "  <owl:ObjectProperty rdf:ID=\"q\">\n"
				+ "    <rdfs:subPropertyOf rdf:resource=\"#r\"/>\n"
				+ "    <rdfs:range>\n" + "      <owl:Class rdf:ID=\"B\"/>\n"
				+ "    </rdfs:range>\n" + "  </owl:ObjectProperty>\n"
				+ "  <owl:Class rdf:about=\"#A\">\n"
				+ "    <owl:disjointWith rdf:resource=\"#B\"/>\n"
				+ "  </owl:Class>\n" + "</rdf:RDF>";
		String conclusion = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:first=\"http://www.w3.org/2002/03owlt/description-logic/premises901#\"\n"
				+ "    xmlns:second=\"http://www.w3.org/2002/03owlt/description-logic/conclusions901#\"\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/description-logic/conclusions901\" >\n"
				+ "  <owl:Ontology/>\n"
				+ "  <owl:Class>\n"
				+ "    <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "       <owl:Restriction>\n"
				+ "          <owl:onProperty>\n"
				+ "            <owl:ObjectProperty rdf:about=\"premises901#p\"/>\n"
				+ "          </owl:onProperty>\n"
				+ "          <owl:minCardinality rdf:datatype=\n"
				+ "\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\"\n"
				+ "          >2</owl:minCardinality>\n"
				+ "       </owl:Restriction>\n"
				+ "       <owl:Restriction>\n"
				+ "          <owl:onProperty>\n"
				+ "            <owl:ObjectProperty rdf:about=\"premises901#q\"/>\n"
				+ "          </owl:onProperty>\n"
				+ "          <owl:minCardinality rdf:datatype=\n"
				+ "\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\"\n"
				+ "          >3</owl:minCardinality>\n"
				+ "       </owl:Restriction>\n"
				+ "    </owl:intersectionOf>\n"
				+ "    <rdfs:subClassOf>\n"
				+ "       <owl:Restriction>\n"
				+ "          <owl:onProperty>\n"
				+ "            <owl:ObjectProperty rdf:about=\"premises901#r\"/>\n"
				+ "          </owl:onProperty>\n"
				+ "          <owl:minCardinality rdf:datatype=\n"
				+ "\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\"\n"
				+ "          >5</owl:minCardinality>\n"
				+ "       </owl:Restriction>\n" + "    </rdfs:subClassOf>\n"
				+ "  </owl:Class>\n" + "</rdf:RDF>";
		String id = "WebOnt_description_logic_901";
		TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
		String d = "This entailment can be replicated for any three natural numbers i, j, k such that i+j >= k. In this example, they are chosen as 2, 3 and 5.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}