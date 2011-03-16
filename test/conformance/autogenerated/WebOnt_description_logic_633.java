package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_description_logic_633 extends TestCase {
	public void testWebOnt_description_logic_633() {
		String premise = "<rdf:RDF\n" + "    xmlns:oiled=\"http://oiled.man.example.net/test#\"\n" + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n" + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ " xml:base=\"http://www.w3.org/2002/03owlt/description-logic/inconsistent633\">\n" + " <owl:Ontology rdf:about=\"\"/>\n" + " <owl:Class rdf:ID=\"A.2\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#p1\"/>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#invF\"/>\n" + "    </owl:onProperty>\n"
				+ "    <owl:allValuesFrom>\n" + "     <owl:Class rdf:about=\"#V.3\"/>\n" + "    </owl:allValuesFrom>\n" + "   </owl:Restriction>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#p1.comp\">\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:DatatypeProperty rdf:ID=\"P.1\"/>\n" + "    </owl:onProperty>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#int\"\n" + "    >1</owl:minCardinality>\n"
				+ "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#Unsatisfiable\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n"
				+ "     <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#f\"/>\n" + "    </owl:onProperty>\n" + "    <owl:someValuesFrom rdf:resource=\"#A.2\"/>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:ID=\"V.3\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#f\"/>\n" + "    </owl:onProperty>\n"
				+ "    <owl:someValuesFrom rdf:resource=\"http://oiled.man.example.net/test#p1.comp\"/>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#p1\">\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.1\"/>\n" + "    <owl:maxCardinality rdf:datatype=\"/2001/XMLSchema#int\"\n" + "    >0</owl:maxCardinality>\n" + "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#f\">\n" + "  <rdf:type rdf:resource=\"/2002/07/owl#FunctionalProperty\"/>\n" + " </owl:ObjectProperty>\n"
				+ " <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#invF\">\n" + "  <owl:inverseOf rdf:resource=\"http://oiled.man.example.net/test#f\"/>\n" + " </owl:ObjectProperty>\n"
				+ " <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#r\">\n" + "  <rdf:type rdf:resource=\"/2002/07/owl#TransitiveProperty\"/>\n" + " </owl:ObjectProperty>\n" + " <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#invR\">\n"
				+ "  <owl:inverseOf rdf:resource=\"http://oiled.man.example.net/test#r\"/>\n" + " </owl:ObjectProperty>\n" + " <oiled:Unsatisfiable/>\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_description_logic_633";
		TestClasses tc = TestClasses.valueOf("INCONSISTENCY");
		String d = "DL Test: t7f.3";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}