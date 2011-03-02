package conformance.autogenerated;

import conformance.Factory;
import junit.framework.TestCase;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_equivalentClass_006 extends TestCase {
	public void testWebOnt_equivalentClass_006() {
		String premise = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/equivalentClass/premises006\" >\n"
				+ "   <owl:Ontology/>\n" + "   <owl:Class rdf:ID=\"A\"/>\n"
				+ "   <owl:Class rdf:ID=\"B\"/>\n" + "</rdf:RDF>";
		String conclusion = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/equivalentClass/conclusions006\" >\n"
				+ "   <owl:Ontology/>\n"
				+ "   <owl:Class>\n"
				+ "      <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "          <owl:Class>\n"
				+ "             <owl:complementOf rdf:resource=\"premises006#A\"/>\n"
				+ "          </owl:Class>\n"
				+ "          <owl:Class>\n"
				+ "             <owl:complementOf rdf:resource=\"premises006#B\"/>\n"
				+ "          </owl:Class>\n"
				+ "      </owl:intersectionOf>\n"
				+ "      <owl:equivalentClass>\n"
				+ "        <owl:Class>\n"
				+ "          <owl:complementOf>\n"
				+ "             <owl:Class>\n"
				+ "               <owl:unionOf rdf:parseType=\"Collection\">\n"
				+ "                 <rdf:Description rdf:about=\"premises006#A\"/>\n"
				+ "                 <rdf:Description rdf:about=\"premises006#B\"/>\n"
				+ "               </owl:unionOf>\n"
				+ "             </owl:Class>\n"
				+ "          </owl:complementOf>\n" + "        </owl:Class>\n"
				+ "      </owl:equivalentClass>\n" + "   </owl:Class>   \n"
				+ "   <owl:Class rdf:about=\"premises006#A\"/>\n"
				+ "   <owl:Class rdf:about=\"premises006#B\"/>\n"
				+ "</rdf:RDF>";
		String id = "WebOnt_equivalentClass_006";
		TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
		String d = "De Morgan's law.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}