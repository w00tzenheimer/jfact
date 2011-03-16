package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_miscellaneous_102 extends TestCase {
	public void testWebOnt_miscellaneous_102() {
		String premise = "<rdf:RDF\n" + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n" + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:first=\"http://www.w3.org/2002/03owlt/miscellaneous/consistent102#\"\n" + "    xml:base=\"http://www.w3.org/2002/03owlt/miscellaneous/consistent102\" >\n" + "   <owl:Ontology/>\n" + "   <owl:Thing rdf:ID=\"i\">\n" + "     <rdf:type>\n"
				+ "         <owl:Class>\n" + "            <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "               <owl:Restriction>\n" + "                  <owl:onProperty>\n" + "                    <owl:ObjectProperty rdf:ID=\"p\"/>\n"
				+ "                  </owl:onProperty>\n" + "                  <owl:allValuesFrom>\n" + "                    <owl:Class rdf:ID=\"a\"/>\n" + "                  </owl:allValuesFrom>\n" + "               </owl:Restriction>\n" + "               <owl:Restriction>\n"
				+ "                  <owl:onProperty>\n" + "                    <owl:ObjectProperty rdf:about=\"#p\"/>\n" + "                  </owl:onProperty>\n" + "                  <owl:someValuesFrom>\n" + "                    <owl:Class rdf:ID=\"s\"/>\n"
				+ "                  </owl:someValuesFrom>\n" + "               </owl:Restriction>\n" + "             </owl:intersectionOf>\n" + "         </owl:Class>\n" + "     </rdf:type>\n" + "   </owl:Thing>\n" + "\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_miscellaneous_102";
		TestClasses tc = TestClasses.valueOf("CONSISTENCY");
		String d = "Abstract syntax restrictions with multiple components\n" + "are in OWL DL.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}