package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_cardinality_002 extends TestCase {
	public void testWebOnt_cardinality_002() {
		String premise = "<rdf:RDF\n" + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n" + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/cardinality/premises002\" >    \n" + "    <owl:Ontology/>\n" + "    <owl:Class rdf:about=\"conclusions002#c\">\n" + "      <rdfs:subClassOf>\n" + "        <owl:Restriction>\n"
				+ "          <owl:onProperty rdf:resource=\"conclusions002#p\"/>\n" + "          <owl:maxCardinality\n" + " rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\"\n" + "          >1</owl:maxCardinality>\n" + "        </owl:Restriction>\n"
				+ "      </rdfs:subClassOf>\n" + "      <rdfs:subClassOf>\n" + "        <owl:Restriction>\n" + "          <owl:onProperty rdf:resource=\"conclusions002#p\"/>\n" + "          <owl:minCardinality\n"
				+ " rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\"\n" + "          >1</owl:minCardinality>\n" + "        </owl:Restriction>\n" + "       </rdfs:subClassOf>\n" + "     </owl:Class>\n"
				+ "     <owl:ObjectProperty rdf:about=\"conclusions002#p\"/>\n" + "</rdf:RDF>";
		String conclusion = "<rdf:RDF\n" + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n" + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/cardinality/conclusions002\" >\n" + "    <owl:Ontology/>\n" + "    <owl:Class rdf:ID=\"c\">\n" + "      <rdfs:subClassOf>\n" + "        <owl:Restriction>\n" + "          <owl:onProperty rdf:resource=\"#p\"/>\n"
				+ "          <owl:cardinality\n" + " rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\"\n" + "          >1</owl:cardinality>\n" + "        </owl:Restriction>\n" + "      </rdfs:subClassOf>\n" + "    </owl:Class>\n"
				+ "    <owl:ObjectProperty rdf:ID=\"p\"/>\n" + "</rdf:RDF>";
		String id = "WebOnt_cardinality_002";
		TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
		String d = "An <code>owl:cardinality</code> constraint is simply shorthand for a pair of <code>owl:minCardinality</code> and <code>owl:maxCardinality</code> constraints.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}