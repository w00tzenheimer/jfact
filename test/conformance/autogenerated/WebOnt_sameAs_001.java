package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_sameAs_001 extends TestCase {
	public void testWebOnt_sameAs_001() {
		String premise = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "xmlns:first=\"http://www.w3.org/2002/03owlt/sameAs/premises001#\"\n"
				+ "  xml:base=\"http://www.w3.org/2002/03owlt/sameAs/premises001\" \n"
				+ "   >\n" + "\n" + "   <owl:Ontology/>\n"
				+ "   <owl:Class rdf:ID=\"c1\">\n" + "     <owl:sameAs>\n"
				+ "       <owl:Class rdf:ID=\"c2\"/>\n"
				+ "     </owl:sameAs>\n"
				+ "     <first:annotate>description of c1</first:annotate>\n"
				+ "   </owl:Class>\n" + "\n"
				+ "   <owl:AnnotationProperty rdf:ID=\"annotate\" />\n" + "\n"
				+ "</rdf:RDF>";
		String conclusion = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ " xmlns:first=\"http://www.w3.org/2002/03owlt/sameAs/premises001#\"\n"
				+ " xml:base=\"http://www.w3.org/2002/03owlt/sameAs/conclusions001\" \n"
				+ " >\n"
				+ "\n"
				+ "   <owl:Ontology/>\n"
				+ "   <owl:Class rdf:about=\"premises001#c2\">\n"
				+ "     <first:annotate>description of c1</first:annotate>\n"
				+ "   </owl:Class>\n"
				+ "   <owl:AnnotationProperty rdf:about=\"premises001#annotate\" />\n"
				+ "\n" + "</rdf:RDF>";
		String id = "WebOnt_sameAs_001";
		TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
		String d = "Annotation properties refer to a class instance. sameAs, in OWL Full, also refers to the class instance.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}