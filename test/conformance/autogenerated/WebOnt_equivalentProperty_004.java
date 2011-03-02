package conformance.autogenerated;

import conformance.Factory;
import junit.framework.TestCase;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_equivalentProperty_004 extends TestCase {
	public void testWebOnt_equivalentProperty_004() {
		String premise = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/equivalentProperty/premises004\" >\n"
				+ "   <owl:Ontology/>\n"
				+ "   <owl:ObjectProperty rdf:ID=\"p\">\n"
				+ "      <rdfs:domain rdf:resource=\"#d\"/>\n"
				+ "   </owl:ObjectProperty>\n"
				+ "   <owl:ObjectProperty rdf:ID=\"q\">\n"
				+ "      <rdfs:domain rdf:resource=\"#d\"/>\n"
				+ "   </owl:ObjectProperty>\n"
				+ "   <owl:FunctionalProperty rdf:about=\"#q\"/>\n"
				+ "   <owl:FunctionalProperty rdf:about=\"#p\"/>\n"
				+ "   <owl:Thing rdf:ID=\"v\"/>\n"
				+ "   <owl:Class rdf:ID=\"d\">\n"
				+ "     <owl:equivalentClass>\n"
				+ "              <owl:Restriction>\n"
				+ "                <owl:onProperty rdf:resource=\"#p\"/>\n"
				+ "                <owl:hasValue rdf:resource=\"#v\"/>\n"
				+ "              </owl:Restriction>\n"
				+ "     </owl:equivalentClass>\n"
				+ "     <owl:equivalentClass>\n"
				+ "              <owl:Restriction>\n"
				+ "                <owl:onProperty rdf:resource=\"#q\"/>\n"
				+ "                <owl:hasValue rdf:resource=\"#v\"/>\n"
				+ "              </owl:Restriction>\n"
				+ "     </owl:equivalentClass>\n" + "   </owl:Class>\n"
				+ "</rdf:RDF>";
		String conclusion = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/equivalentProperty/conclusions004\" >\n"
				+ "   <owl:Ontology/>\n"
				+ "   <owl:ObjectProperty rdf:about=\"premises004#p\">\n"
				+ "      <owl:equivalentProperty>\n"
				+ "         <owl:ObjectProperty rdf:about=\"premises004#q\"/>\n"
				+ "      </owl:equivalentProperty>\n"
				+ "   </owl:ObjectProperty>\n" + "</rdf:RDF>";
		String id = "WebOnt_equivalentProperty_004";
		TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
		String d = "If <code>p</code> and <code>q</code> have the same property extension then <code>p</code> <code>equivalentProperty</code> <code>q</code>.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}