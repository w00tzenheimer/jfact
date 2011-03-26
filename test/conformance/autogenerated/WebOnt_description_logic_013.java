package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_description_logic_013 extends TestCase {
	public void testWebOnt_description_logic_013() {
		String premise = "<rdf:RDF\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/description-logic/inconsistent013\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\">\n"
				+ "    <owl:Ontology rdf:about=\"\"/>\n"
				+ "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#Unsatisfiable\">\n"
				+ "        <owl:equivalentClass>\n"
				+ "            <owl:Class>\n"
				+ "                <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "                    <owl:Restriction>\n"
				+ "                        <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#f\"/>\n"
				+ "                        <owl:someValuesFrom>\n"
				+ "                            <owl:Class rdf:about=\"http://oiled.man.example.net/test#p\"/>\n"
				+ "                        </owl:someValuesFrom>\n"
				+ "                    </owl:Restriction>\n"
				+ "                    <owl:Restriction>\n"
				+ "                        <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#f1\"/>\n"
				+ "                        <owl:someValuesFrom>\n"
				+ "                            <owl:Class>\n"
				+ "                                <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "                                    <owl:Class>\n"
				+ "                                    <owl:complementOf>\n"
				+ "                                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#p\"/>\n"
				+ "                                    </owl:complementOf>\n"
				+ "                                    </owl:Class>\n"
				+ "                                    <owl:Restriction>\n"
				+ "                                    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#invF1\"/>\n"
				+ "                                    <owl:allValuesFrom>\n"
				+ "                                    <owl:Restriction>\n"
				+ "                                    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#s\"/>\n"
				+ "                                    <owl:someValuesFrom>\n"
				+ "                                    <owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/>\n"
				+ "                                    </owl:someValuesFrom>\n"
				+ "                                    </owl:Restriction>\n"
				+ "                                    </owl:allValuesFrom>\n"
				+ "                                    </owl:Restriction>\n"
				+ "                                </owl:intersectionOf>\n"
				+ "                            </owl:Class>\n"
				+ "                        </owl:someValuesFrom>\n"
				+ "                    </owl:Restriction>\n"
				+ "                </owl:intersectionOf>\n"
				+ "            </owl:Class>\n"
				+ "        </owl:equivalentClass>\n"
				+ "    </owl:Class>\n"
				+ "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#p\"/>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#invF\">\n"
				+ "        <owl:inverseOf rdf:resource=\"http://oiled.man.example.net/test#f\"/>\n"
				+ "    </owl:ObjectProperty>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#invS\">\n"
				+ "        <owl:inverseOf rdf:resource=\"http://oiled.man.example.net/test#s\"/>\n"
				+ "    </owl:ObjectProperty>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#invF1\">\n"
				+ "        <owl:inverseOf rdf:resource=\"http://oiled.man.example.net/test#f1\"/>\n"
				+ "    </owl:ObjectProperty>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#f\"/>\n"
				+ "    <owl:FunctionalProperty rdf:about=\"http://oiled.man.example.net/test#f\"/>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#s\">\n"
				+ "        <rdfs:subPropertyOf rdf:resource=\"http://oiled.man.example.net/test#f\"/>\n"
				+ "        <rdfs:subPropertyOf rdf:resource=\"http://oiled.man.example.net/test#f1\"/>\n"
				+ "    </owl:ObjectProperty>\n"
				+ "    <owl:FunctionalProperty rdf:about=\"http://oiled.man.example.net/test#s\"/>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#f1\"/>\n"
				+ "    <owl:FunctionalProperty rdf:about=\"http://oiled.man.example.net/test#f1\"/>\n"
				+ "    <rdf:Description>\n"
				+ "        <rdf:type rdf:resource=\"http://oiled.man.example.net/test#Unsatisfiable\"/>\n"
				+ "    </rdf:Description>\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_description_logic_013";
		TestClasses tc = TestClasses.valueOf("INCONSISTENCY");
		String d = "DL Test: t10.5";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}