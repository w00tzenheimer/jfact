package conformance.autogenerated;

import conformance.Factory;
import junit.framework.TestCase;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_equivalentProperty_001 extends TestCase {
	public void testWebOnt_equivalentProperty_001() {
		String premise = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:first=\"http://www.w3.org/2002/03owlt/equivalentProperty/premises001#\"\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/equivalentProperty/premises001\" >\n"
				+ "   <owl:Ontology/>\n"
				+ "   <owl:ObjectProperty rdf:ID=\"hasHead\">\n"
				+ "      <owl:equivalentProperty>\n"
				+ "         <owl:ObjectProperty rdf:ID=\"hasLeader\"/>\n"
				+ "      </owl:equivalentProperty>\n"
				+ "   </owl:ObjectProperty>\n"
				+ "   <owl:Thing rdf:ID=\"X\">\n" + "     <first:hasLeader>\n"
				+ "        <owl:Thing rdf:ID=\"Y\"/>\n"
				+ "     </first:hasLeader>\n" + "   </owl:Thing>\n"
				+ "</rdf:RDF>";
		String conclusion = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:first=\"http://www.w3.org/2002/03owlt/equivalentProperty/premises001#\"\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/equivalentProperty/conclusions001\" >\n"
				+ "   <owl:Ontology/>\n"
				+ "   <owl:Thing rdf:about=\"premises001#X\">\n"
				+ "     <first:hasHead>\n"
				+ "        <owl:Thing rdf:about=\"premises001#Y\"/>\n"
				+ "     </first:hasHead>\n"
				+ "   </owl:Thing>   \n"
				+ "   <owl:ObjectProperty rdf:about=\"premises001#hasHead\"/>\n"
				+ "</rdf:RDF>";
		String id = "WebOnt_equivalentProperty_001";
		TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
		String d = "<code>hasLeader</code> may be stated to be the <code>owl:equivalentProperty</code> of <code>hasHead</code>.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}