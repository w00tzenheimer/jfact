package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_description_logic_110 extends TestCase {
	public void testWebOnt_description_logic_110() {
		String premise = "<rdf:RDF\n" + "    xml:base=\"http://www.w3.org/2002/03owlt/description-logic/inconsistent110\"\n" + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n" + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n" + "    xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\">\n" + "    <owl:Ontology rdf:about=\"\"/>\n" + "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#Unsatisfiable\">\n"
				+ "        <owl:equivalentClass>\n" + "            <owl:Class>\n" + "                <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "                    <owl:Restriction>\n"
				+ "                        <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#r\"/>\n" + "                        <owl:someValuesFrom>\n" + "                            <owl:Class>\n" + "                                <owl:complementOf>\n"
				+ "                                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#e\"/>\n" + "                                </owl:complementOf>\n" + "                            </owl:Class>\n" + "                        </owl:someValuesFrom>\n"
				+ "                    </owl:Restriction>\n" + "                    <owl:Restriction>\n" + "                        <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#r\"/>\n" + "                        <owl:allValuesFrom>\n"
				+ "                            <owl:Class rdf:about=\"http://oiled.man.example.net/test#d\"/>\n" + "                        </owl:allValuesFrom>\n" + "                    </owl:Restriction>\n" + "                    <owl:Restriction>\n"
				+ "                        <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#r\"/>\n" + "                        <owl:allValuesFrom>\n" + "                            <owl:Class>\n"
				+ "                                <owl:unionOf rdf:parseType=\"Collection\">\n" + "                                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#e\"/>\n" + "                                    <owl:Class>\n"
				+ "                                    <owl:complementOf>\n" + "                                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#d\"/>\n" + "                                    </owl:complementOf>\n"
				+ "                                    </owl:Class>\n" + "                                </owl:unionOf>\n" + "                            </owl:Class>\n" + "                        </owl:allValuesFrom>\n" + "                    </owl:Restriction>\n"
				+ "                </owl:intersectionOf>\n" + "            </owl:Class>\n" + "        </owl:equivalentClass>\n" + "    </owl:Class>\n" + "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#c\">\n" + "        <rdfs:subClassOf>\n"
				+ "            <owl:Class>\n" + "                <owl:complementOf>\n" + "                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#d\"/>\n" + "                </owl:complementOf>\n" + "            </owl:Class>\n"
				+ "        </rdfs:subClassOf>\n" + "    </owl:Class>\n" + "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#d\"/>\n" + "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#e\"/>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#r\"/>\n" + "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#s\"/>\n" + "    <rdf:Description>\n"
				+ "        <rdf:type rdf:resource=\"http://oiled.man.example.net/test#Unsatisfiable\"/>\n" + "    </rdf:Description>\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_description_logic_110";
		TestClasses tc = TestClasses.valueOf("INCONSISTENCY");
		String d = "DL Test: heinsohn4.1\n" + "Tbox tests from Heinsohn et al.\n" + "\n" + "Tests role restrictions";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}