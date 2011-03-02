package conformance.autogenerated;

import conformance.Factory;
import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_description_logic_005 extends TestCase {
	public void testWebOnt_description_logic_005() {
		String premise = "<rdf:RDF\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/description-logic/consistent005\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\">\n"
				+ "    <owl:Ontology rdf:about=\"\"/>\n"
				+ "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#Satisfiable\">\n"
				+ "        <owl:equivalentClass>\n"
				+ "            <owl:Class>\n"
				+ "                <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "                    <owl:Class>\n"
				+ "                        <owl:complementOf>\n"
				+ "                            <owl:Restriction>\n"
				+ "                                <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#rx3a\"/>\n"
				+ "                                <owl:someValuesFrom>\n"
				+ "                                    <owl:Class>\n"
				+ "                                    <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "                                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#c1\"/>\n"
				+ "                                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#c2\"/>\n"
				+ "                                    </owl:intersectionOf>\n"
				+ "                                    </owl:Class>\n"
				+ "                                </owl:someValuesFrom>\n"
				+ "                            </owl:Restriction>\n"
				+ "                        </owl:complementOf>\n"
				+ "                    </owl:Class>\n"
				+ "                    <owl:Restriction>\n"
				+ "                        <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#rx3a\"/>\n"
				+ "                        <owl:someValuesFrom>\n"
				+ "                            <owl:Class rdf:about=\"http://oiled.man.example.net/test#c1\"/>\n"
				+ "                        </owl:someValuesFrom>\n"
				+ "                    </owl:Restriction>\n"
				+ "                    <owl:Restriction>\n"
				+ "                        <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#rx4a\"/>\n"
				+ "                        <owl:someValuesFrom>\n"
				+ "                            <owl:Class rdf:about=\"http://oiled.man.example.net/test#c2\"/>\n"
				+ "                        </owl:someValuesFrom>\n"
				+ "                    </owl:Restriction>\n"
				+ "                </owl:intersectionOf>\n"
				+ "            </owl:Class>\n"
				+ "        </owl:equivalentClass>\n"
				+ "    </owl:Class>\n"
				+ "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#c1\"/>\n"
				+ "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#c2\"/>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#rx1\"/>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#rx2\"/>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#rx3\">\n"
				+ "        <rdfs:subPropertyOf rdf:resource=\"http://oiled.man.example.net/test#rx1\"/>\n"
				+ "        <rdfs:subPropertyOf rdf:resource=\"http://oiled.man.example.net/test#rx\"/>\n"
				+ "    </owl:ObjectProperty>\n"
				+ "    <owl:FunctionalProperty rdf:about=\"http://oiled.man.example.net/test#rx3\"/>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#rx4\">\n"
				+ "        <rdfs:subPropertyOf rdf:resource=\"http://oiled.man.example.net/test#rx2\"/>\n"
				+ "        <rdfs:subPropertyOf rdf:resource=\"http://oiled.man.example.net/test#rx\"/>\n"
				+ "    </owl:ObjectProperty>\n"
				+ "    <owl:FunctionalProperty rdf:about=\"http://oiled.man.example.net/test#rx4\"/>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#rxa\"/>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#rx1a\"/>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#rx2a\"/>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#rx3a\">\n"
				+ "        <rdfs:subPropertyOf rdf:resource=\"http://oiled.man.example.net/test#rx1a\"/>\n"
				+ "        <rdfs:subPropertyOf rdf:resource=\"http://oiled.man.example.net/test#rxa\"/>\n"
				+ "    </owl:ObjectProperty>\n"
				+ "    <owl:FunctionalProperty rdf:about=\"http://oiled.man.example.net/test#rx3a\"/>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#rx4a\">\n"
				+ "        <rdfs:subPropertyOf rdf:resource=\"http://oiled.man.example.net/test#rx2a\"/>\n"
				+ "        <rdfs:subPropertyOf rdf:resource=\"http://oiled.man.example.net/test#rxa\"/>\n"
				+ "    </owl:ObjectProperty>\n"
				+ "    <owl:FunctionalProperty rdf:about=\"http://oiled.man.example.net/test#rx4a\"/>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#rx\"/>\n"
				+ "    <owl:FunctionalProperty rdf:about=\"http://oiled.man.example.net/test#rx\"/>\n"
				+ "    <rdf:Description>\n"
				+ "        <rdf:type rdf:resource=\"http://oiled.man.example.net/test#Satisfiable\"/>\n"
				+ "    </rdf:Description>\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_description_logic_005";
		TestClasses tc = TestClasses.valueOf("CONSISTENCY");
		String d = "DL Test: fact4.2";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}