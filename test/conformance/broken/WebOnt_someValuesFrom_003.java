package conformance.broken;

import conformance.Factory;
import junit.framework.TestCase;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_someValuesFrom_003 extends TestCase {
	public void testWebOnt_someValuesFrom_003() {
		String premise = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:first=\"http://www.w3.org/2002/03owlt/someValuesFrom/premises003#\"\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/someValuesFrom/premises003\" >\n"
				+ "   <owl:Ontology/>\n" + "   <owl:Class rdf:ID=\"person\">\n"
				+ "     <owl:equivalentClass>\n" + "       <owl:Restriction>\n"
				+ "         <owl:onProperty>\n"
				+ "            <owl:ObjectProperty rdf:ID=\"parent\"/>\n"
				+ "         </owl:onProperty>\n"
				+ "         <owl:someValuesFrom rdf:resource=\"#person\" />\n"
				+ "       </owl:Restriction>\n"
				+ "      </owl:equivalentClass>\n" + "    </owl:Class>\n"
				+ "    <first:person rdf:ID=\"fred\" />\n" + "\n"
				+ "</rdf:RDF>";
		String conclusion = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:first=\"http://www.w3.org/2002/03owlt/someValuesFrom/premises003#\"\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/someValuesFrom/conclusions003\" >\n"
				+ "   <owl:Ontology/>\n"
				+ "   <owl:ObjectProperty rdf:about=\"premises003#parent\"/>\n"
				+ "   <owl:Thing rdf:about=\"premises003#fred\">\n"
				+ "     <first:parent>\n" + "       <owl:Thing>\n"
				+ "         <first:parent>\n" + "            <owl:Thing/>\n"
				+ "         </first:parent>\n" + "       </owl:Thing>\n"
				+ "     </first:parent>\n" + "   </owl:Thing>\n" + "</rdf:RDF>";
		String id = "WebOnt_someValuesFrom_003";
		TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
		String d = "A simple infinite loop for implementors to avoid.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}