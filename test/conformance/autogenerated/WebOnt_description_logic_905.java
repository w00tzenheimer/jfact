package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_description_logic_905 extends TestCase {
	public void testWebOnt_description_logic_905() {
		String premise = "<rdf:RDF\n" + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n" + "    xmlns:rdfs= \"http://www.w3.org/2000/01/rdf-schema#\"\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/description-logic/consistent905\" >\n" + "   <owl:Ontology/>\n" + "   <owl:FunctionalProperty rdf:ID=\"p-N-to-1\" >\n" + "     <owl:inverseOf>\n" + "        <owl:ObjectProperty rdf:ID=\"invP-1-to-N\" />\n"
				+ "     </owl:inverseOf>\n" + "     <rdfs:domain rdf:resource=\"#cardinality-N\" />\n" + "     <rdfs:range rdf:resource=\"#only-d\" />\n" + "   </owl:FunctionalProperty>\n" + "   <owl:ObjectProperty rdf:about=\"#p-N-to-1\" />\n"
				+ "   <owl:FunctionalProperty rdf:ID=\"q-M-to-1\" >\n" + "     <owl:inverseOf>\n" + "        <owl:ObjectProperty  rdf:ID=\"invQ-1-to-M\" />\n" + "     </owl:inverseOf>\n" + "     <rdfs:domain rdf:resource=\"#cardinality-N-times-M\" />\n"
				+ "     <rdfs:range rdf:resource=\"#cardinality-N\" />\n" + "   </owl:FunctionalProperty>\n" + "   <owl:ObjectProperty rdf:about=\"#q-M-to-1\" />\n" + "   <owl:FunctionalProperty rdf:ID=\"r-N-times-M-to-1\">\n" + "     <owl:inverseOf>\n"
				+ "        <owl:ObjectProperty  rdf:ID=\"invR-N-times-M-to-1\" />\n" + "     </owl:inverseOf>\n" + "     <rdfs:domain rdf:resource=\"#cardinality-N-times-M\" />\n" + "     <rdfs:range rdf:resource=\"#only-d\" />\n" + "   </owl:FunctionalProperty>\n"
				+ "   <owl:ObjectProperty rdf:about=\"#r-N-times-M-to-1\"/>\n" + "    <owl:Class rdf:ID=\"only-d\">\n" + "      <owl:oneOf rdf:parseType=\"Collection\">\n" + "         <owl:Thing rdf:ID=\"d\"/>\n" + "      </owl:oneOf>\n" + "      <owl:equivalentClass>\n"
				+ "        <owl:Restriction>\n" + "          <owl:onProperty rdf:resource=\"#invP-1-to-N\"/>\n" + "          <owl:cardinality rdf:datatype=\n" + "            \"http://www.w3.org/2001/XMLSchema#integer\"\n" + "           >2</owl:cardinality>\n"
				+ "        </owl:Restriction>\n" + "      </owl:equivalentClass>\n" + "      <owl:equivalentClass>\n" + "         <owl:Restriction>\n" + "           <owl:onProperty rdf:resource=\"#invR-N-times-M-to-1\"/>\n" + "          <owl:cardinality rdf:datatype=\n"
				+ "            \"http://www.w3.org/2001/XMLSchema#integer\"\n" + "           >6</owl:cardinality>\n" + "        </owl:Restriction>\n" + "      </owl:equivalentClass>\n" + "    </owl:Class>\n" + "    <owl:Class rdf:ID=\"cardinality-N\">\n"
				+ "       <owl:equivalentClass>\n" + "         <owl:Restriction>\n" + "           <owl:onProperty rdf:resource=\"#p-N-to-1\"/>\n" + "           <owl:someValuesFrom rdf:resource=\"#only-d\"/>\n" + "         </owl:Restriction>\n" + "       </owl:equivalentClass>\n"
				+ "       <owl:equivalentClass>\n" + "         <owl:Restriction>\n" + "             <owl:onProperty rdf:resource=\"#invQ-1-to-M\"/>\n" + "             <owl:cardinality rdf:datatype=\n" + "               \"http://www.w3.org/2001/XMLSchema#integer\"\n"
				+ "              >3</owl:cardinality>\n" + "         </owl:Restriction>\n" + "       </owl:equivalentClass>\n" + "    </owl:Class>\n" + "    <owl:Class rdf:ID=\"cardinality-N-times-M\">\n" + "       <owl:equivalentClass>\n" + "          <owl:Restriction>\n"
				+ "            <owl:onProperty rdf:resource=\"#q-M-to-1\"/>\n" + "            <owl:someValuesFrom rdf:resource=\"#cardinality-N\"/>\n" + "          </owl:Restriction>\n" + "       </owl:equivalentClass>\n" + "    </owl:Class>\n"
				+ "    <owl:Class rdf:about=\"#cardinality-N-times-M\">\n" + "       <owl:equivalentClass>\n" + "          <owl:Restriction>\n" + "            <owl:onProperty rdf:resource=\"#r-N-times-M-to-1\"/>\n" + "            <owl:someValuesFrom rdf:resource=\"#only-d\"/>\n"
				+ "          </owl:Restriction>\n" + "       </owl:equivalentClass>\n" + "    </owl:Class>\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_description_logic_905";
		TestClasses tc = TestClasses.valueOf("CONSISTENCY");
		String d = "This test shows integer multiplication in OWL DL.\n" + "\n" + "N is 2. M is 3. N times M is 6.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}