package conformance.autogenerated;

import conformance.Factory;
import junit.framework.TestCase;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_description_logic_104 extends TestCase {
	public void testWebOnt_description_logic_104() {
		String premise = "<rdf:RDF\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/description-logic/inconsistent104\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\">\n"
				+ "    <owl:Ontology rdf:about=\"\"/>\n"
				+ "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#Unsatisfiable\">\n"
				+ "        <owl:equivalentClass>\n"
				+ "            <owl:Class rdf:about=\"http://oiled.man.example.net/test#c1\"/>\n"
				+ "        </owl:equivalentClass>\n"
				+ "    </owl:Class>\n"
				+ "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#c\">\n"
				+ "        <rdfs:subClassOf>\n"
				+ "            <owl:Class>\n"
				+ "                <owl:complementOf>\n"
				+ "                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#d\"/>\n"
				+ "                </owl:complementOf>\n"
				+ "            </owl:Class>\n"
				+ "        </rdfs:subClassOf>\n"
				+ "    </owl:Class>\n"
				+ "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#d\"/>\n"
				+ "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#f\">\n"
				+ "        <rdfs:subClassOf>\n"
				+ "            <owl:Class rdf:about=\"http://oiled.man.example.net/test#d\"/>\n"
				+ "        </rdfs:subClassOf>\n"
				+ "    </owl:Class>\n"
				+ "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#c1\">\n"
				+ "        <rdfs:subClassOf>\n"
				+ "            <owl:Class rdf:about=\"http://oiled.man.example.net/test#d1\"/>\n"
				+ "        </rdfs:subClassOf>\n"
				+ "        <rdfs:subClassOf>\n"
				+ "            <owl:Class>\n"
				+ "                <owl:complementOf>\n"
				+ "                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#d1\"/>\n"
				+ "                </owl:complementOf>\n"
				+ "            </owl:Class>\n"
				+ "        </rdfs:subClassOf>\n"
				+ "    </owl:Class>\n"
				+ "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#d1\"/>\n"
				+ "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#e3\">\n"
				+ "        <rdfs:subClassOf>\n"
				+ "            <owl:Class rdf:about=\"http://oiled.man.example.net/test#c\"/>\n"
				+ "        </rdfs:subClassOf>\n"
				+ "    </owl:Class>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#r\"/>\n"
				+ "    <rdf:Description>\n"
				+ "        <rdf:type rdf:resource=\"http://oiled.man.example.net/test#Unsatisfiable\"/>\n"
				+ "    </rdf:Description>\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_description_logic_104";
		TestClasses tc = TestClasses.valueOf("INCONSISTENCY");
		String d = "DL Test: heinsohn1.4\n"
				+ "Tbox tests from Heinsohn et al.\n" + "\n"
				+ "Tests incoherency caused by disjoint concept";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}