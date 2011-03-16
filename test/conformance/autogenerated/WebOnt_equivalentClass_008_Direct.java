package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_equivalentClass_008_Direct extends TestCase {
	public void testWebOnt_equivalentClass_008_Direct() {
		String premise = "<rdf:RDF\n" + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n" + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "  xmlns:first=\"http://www.w3.org/2002/03owlt/equivalentClass/premises008#\" \n" + "    xml:base=\"http://www.w3.org/2002/03owlt/equivalentClass/premises008\" >\n" + "\n" + "   <owl:Ontology/>\n" + "   <owl:Class rdf:ID=\"c1\">\n"
				+ "     <owl:equivalentClass>\n" + "       <owl:Class rdf:ID=\"c2\"/>\n" + "     </owl:equivalentClass>\n" + "     <first:annotate>description of c1</first:annotate>\n" + "   </owl:Class>\n" + "\n" + "   <owl:AnnotationProperty rdf:ID=\"annotate\" />\n" + "\n"
				+ "</rdf:RDF>";
		String conclusion = "<rdf:RDF\n" + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n" + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ " xmlns:first=\"http://www.w3.org/2002/03owlt/equivalentClass/premises008#\"\n" + " xml:base=\"http://www.w3.org/2002/03owlt/equivalentClass/nonconclusions008\" >\n" + "   <owl:Ontology/>\n" + "   <owl:Class rdf:about=\"premises008#c2\">\n"
				+ "     <first:annotate>description of c1</first:annotate>\n" + "   </owl:Class>\n" + "   <owl:AnnotationProperty rdf:about=\"premises008#annotate\" />\n" + "\n" + "</rdf:RDF>";
		String id = "WebOnt_equivalentClass_008_Direct";
		TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
		String d = "A version of WebOnt-equivalentClass-008 modified for the Direct Semantics, under which annotations in the entailed ontology are ignored.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}