package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_description_logic_613 extends TestCase {
	public void testWebOnt_description_logic_613() {
		String premise = "<rdf:RDF\n" + "    xmlns:oiled=\"http://oiled.man.example.net/test#\"\n" + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n" + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + " xml:base=\"http://www.w3.org/2002/03owlt/description-logic/inconsistent613\">\n" + " <owl:Ontology rdf:about=\"\"/>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#p.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:DatatypeProperty rdf:ID=\"P.1\"/>\n" + "    </owl:onProperty>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#int\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:ID=\"V.3\">\n" + "  <owl:equivalentClass>\n"
				+ "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#s\"/>\n" + "    </owl:onProperty>\n" + "    <owl:someValuesFrom>\n" + "     <owl:Class rdf:about=\"/2002/07/owl#Thing\"/>\n"
				+ "    </owl:someValuesFrom>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#Unsatisfiable\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#f\"/>\n" + "    </owl:onProperty>\n" + "    <owl:someValuesFrom>\n"
				+ "     <owl:Class rdf:about=\"http://oiled.man.example.net/test#p\"/>\n" + "    </owl:someValuesFrom>\n" + "   </owl:Restriction>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n"
				+ "     <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#f1\"/>\n" + "    </owl:onProperty>\n" + "    <owl:someValuesFrom>\n" + "     <owl:Class rdf:about=\"#A.2\"/>\n" + "    </owl:someValuesFrom>\n" + "   </owl:Restriction>\n"
				+ "  </owl:intersectionOf>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#p\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.1\"/>\n"
				+ "    <owl:maxCardinality rdf:datatype=\"/2001/XMLSchema#int\"\n" + "    >0</owl:maxCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:ID=\"A.2\">\n"
				+ "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#p.comp\"/>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n"
				+ "     <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#invF1\"/>\n" + "    </owl:onProperty>\n" + "    <owl:allValuesFrom rdf:resource=\"#V.3\"/>\n" + "   </owl:Restriction>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n"
				+ " <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#invF1\">\n" + "  <owl:inverseOf>\n" + "   <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#f1\"/>\n" + "  </owl:inverseOf>\n" + " </owl:ObjectProperty>\n"
				+ " <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#f1\">\n" + "  <rdf:type rdf:resource=\"/2002/07/owl#FunctionalProperty\"/>\n" + " </owl:ObjectProperty>\n" + " <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#f\">\n"
				+ "  <rdf:type rdf:resource=\"/2002/07/owl#FunctionalProperty\"/>\n" + " </owl:ObjectProperty>\n" + " <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#invF\">\n" + "  <owl:inverseOf rdf:resource=\"http://oiled.man.example.net/test#f\"/>\n"
				+ " </owl:ObjectProperty>\n" + " <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#s\">\n" + "  <rdfs:subPropertyOf rdf:resource=\"http://oiled.man.example.net/test#f\"/>\n"
				+ "  <rdfs:subPropertyOf rdf:resource=\"http://oiled.man.example.net/test#f1\"/>\n" + "  <rdf:type rdf:resource=\"/2002/07/owl#FunctionalProperty\"/>\n" + " </owl:ObjectProperty>\n" + " <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#invS\">\n"
				+ "  <owl:inverseOf rdf:resource=\"http://oiled.man.example.net/test#s\"/>\n" + " </owl:ObjectProperty>\n" + " <oiled:Unsatisfiable/>\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_description_logic_613";
		TestClasses tc = TestClasses.valueOf("INCONSISTENCY");
		String d = "DL Test: t10.5";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}