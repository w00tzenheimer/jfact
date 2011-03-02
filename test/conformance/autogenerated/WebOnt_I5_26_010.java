package conformance.autogenerated;

import conformance.Factory;
import junit.framework.TestCase;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_I5_26_010 extends TestCase {
	public void testWebOnt_I5_26_010() {
		String premise = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:first=\"http://www.w3.org/2002/03owlt/I5.26/premises010#\"\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/I5.26/premises010\" >\n"
				+ "   <owl:Ontology/>\n"
				+ "   <owl:ObjectProperty rdf:ID=\"p\" />\n" + "\n"
				+ "</rdf:RDF>";
		String conclusion = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/I5.26/conclusions010\" >\n"
				+ "   \n"
				+ "  <owl:Ontology/>\n"
				+ "  <owl:Restriction rdf:nodeID=\"n\">\n"
				+ "     <owl:onProperty>\n"
				+ "        <owl:ObjectProperty rdf:about=\"premises010#p\" />\n"
				+ "     </owl:onProperty>\n"
				+ "     <owl:minCardinality rdf:datatype=\n"
				+ " \"http://www.w3.org/2001/XMLSchema#int\"\n"
				+ "     >1</owl:minCardinality>\n" + "  </owl:Restriction>\n"
				+ "\n" + "</rdf:RDF>";
		String id = "WebOnt_I5_26_010";
		TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
		String d = "The abstract syntax form of the conclusions is:\n"
				+ "\n"
				+ " EquivalentClasses( restriction( first:p, minCardinality(1) ) )\n"
				+ " ObjectProperty( first:p )\n" + "\n"
				+ "This is trivially true given that first:p is an \n"
				+ "<code>individualvaluedPropertyID</code>.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}