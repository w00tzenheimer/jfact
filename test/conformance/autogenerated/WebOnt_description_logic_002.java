package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_description_logic_002 extends TestCase {
	public void testWebOnt_description_logic_002() {
		String premise = "<rdf:RDF\n" + "    xml:base=\"http://www.w3.org/2002/03owlt/description-logic/inconsistent002\"\n" + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n" + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\">\n" + "    <owl:Ontology rdf:about=\"\"/>\n" + "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#Unsatisfiable\">\n"
				+ "        <rdfs:subClassOf>\n" + "            <owl:Class rdf:about=\"http://oiled.man.example.net/test#c\"/>\n" + "        </rdfs:subClassOf>\n" + "        <rdfs:subClassOf>\n" + "            <owl:Class>\n" + "                <owl:complementOf>\n"
				+ "                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#d\"/>\n" + "                </owl:complementOf>\n" + "            </owl:Class>\n" + "        </rdfs:subClassOf>\n" + "    </owl:Class>\n"
				+ "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#c\">\n" + "        <rdfs:subClassOf>\n" + "            <owl:Restriction>\n" + "                <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#r\"/>\n"
				+ "                <owl:allValuesFrom>\n" + "                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#c\"/>\n" + "                </owl:allValuesFrom>\n" + "            </owl:Restriction>\n" + "        </rdfs:subClassOf>\n"
				+ "    </owl:Class>\n" + "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#d\"/>\n" + "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#r\"/>\n" + "    <owl:Restriction>\n"
				+ "        <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#r\"/>\n" + "        <owl:allValuesFrom>\n" + "            <owl:Class rdf:about=\"http://oiled.man.example.net/test#c\"/>\n" + "        </owl:allValuesFrom>\n"
				+ "        <rdfs:subClassOf>\n" + "            <owl:Class rdf:about=\"http://oiled.man.example.net/test#d\"/>\n" + "        </rdfs:subClassOf>\n" + "    </owl:Restriction>\n" + "    <rdf:Description>\n"
				+ "        <rdf:type rdf:resource=\"http://oiled.man.example.net/test#Unsatisfiable\"/>\n" + "    </rdf:Description>\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_description_logic_002";
		TestClasses tc = TestClasses.valueOf("INCONSISTENCY");
		String d = "DL Test: fact2.1";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}