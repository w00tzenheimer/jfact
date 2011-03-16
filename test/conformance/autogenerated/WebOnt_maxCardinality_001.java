package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_maxCardinality_001 extends TestCase {
	public void testWebOnt_maxCardinality_001() {
		String premise = "<rdf:RDF\n" + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n" + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:first=\"http://www.w3.org/2002/03owlt/maxCardinality/inconsistent001#\"\n" + "    xml:base=\"http://www.w3.org/2002/03owlt/maxCardinality/inconsistent001\" >\n" + "\n" + "    <owl:Ontology/>\n" + "\n"
				+ "    <rdf:Description rdf:about=\"inconsistent001#sb1\">\n" + "        <rdf:type rdf:parseType=\"Resource\">\n" + "            <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#Restriction\"/>\n" + "            <owl:maxCardinality\n"
				+ "              rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\"\n" + "             >2</owl:maxCardinality>\n" + "            <owl:onProperty rdf:resource=\"inconsistent001#prop\"/>\n" + "        </rdf:type>\n"
				+ "        <first:prop rdf:resource=\"inconsistent001#ob1\"/>\n" + "        <first:prop rdf:resource=\"inconsistent001#ob2\"/>\n" + "        <first:prop rdf:resource=\"inconsistent001#ob3\"/>\n" + "    </rdf:Description>\n" + "\n"
				+ "    <rdf:Description rdf:about=\"inconsistent001#ob1\">\n" + "        <owl:differentFrom rdf:resource=\"inconsistent001#ob2\"/>\n" + "        <owl:differentFrom rdf:resource=\"inconsistent001#ob3\"/>\n" + "    </rdf:Description>\n" + "\n"
				+ "    <rdf:Description rdf:about=\"inconsistent001#ob2\">\n" + "        <owl:differentFrom rdf:resource=\"inconsistent001#ob3\"/>\n" + "    </rdf:Description>\n" + "\n" + "    <owl:ObjectProperty rdf:about=\"inconsistent001#prop\"/>\n" + "\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_maxCardinality_001";
		TestClasses tc = TestClasses.valueOf("INCONSISTENCY");
		String d = "A property with maximum cardinality of two cannot take\n" + "three distinct values on some subject node.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}