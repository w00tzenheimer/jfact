package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_description_logic_001 extends TestCase {
	public void testWebOnt_description_logic_001() {
		String premise = "<rdf:RDF\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/description-logic/inconsistent001\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\">\n"
				+ "    <owl:Ontology rdf:about=\"\"/>\n"
				+ "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#Unsatisfiable\">\n"
				+ "        <owl:equivalentClass>\n"
				+ "            <owl:Class>\n"
				+ "                <owl:unionOf rdf:parseType=\"Collection\">\n"
				+ "                    <owl:Class>\n"
				+ "                        <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "                            <owl:Class rdf:about=\"http://oiled.man.example.net/test#a\"/>\n"
				+ "                            <owl:Class rdf:about=\"http://oiled.man.example.net/test#b\"/>\n"
				+ "                        </owl:intersectionOf>\n"
				+ "                    </owl:Class>\n"
				+ "                    <owl:Class>\n"
				+ "                        <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "                            <owl:Class rdf:about=\"http://oiled.man.example.net/test#a\"/>\n"
				+ "                            <owl:Class rdf:about=\"http://oiled.man.example.net/test#c\"/>\n"
				+ "                        </owl:intersectionOf>\n"
				+ "                    </owl:Class>\n"
				+ "                    <owl:Class>\n"
				+ "                        <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "                            <owl:Class rdf:about=\"http://oiled.man.example.net/test#b\"/>\n"
				+ "                            <owl:Class rdf:about=\"http://oiled.man.example.net/test#c\"/>\n"
				+ "                        </owl:intersectionOf>\n"
				+ "                    </owl:Class>\n"
				+ "                </owl:unionOf>\n"
				+ "            </owl:Class>\n"
				+ "        </owl:equivalentClass>\n"
				+ "    </owl:Class>\n"
				+ "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#a\">\n"
				+ "        <rdfs:subClassOf>\n"
				+ "            <owl:Class>\n"
				+ "                <owl:complementOf>\n"
				+ "                    <owl:Class>\n"
				+ "                        <owl:unionOf rdf:parseType=\"Collection\">\n"
				+ "                            <owl:Class rdf:about=\"http://oiled.man.example.net/test#b\"/>\n"
				+ "                            <owl:Class rdf:about=\"http://oiled.man.example.net/test#c\"/>\n"
				+ "                        </owl:unionOf>\n"
				+ "                    </owl:Class>\n"
				+ "                </owl:complementOf>\n"
				+ "            </owl:Class>\n"
				+ "        </rdfs:subClassOf>\n"
				+ "    </owl:Class>\n"
				+ "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#b\">\n"
				+ "        <rdfs:subClassOf>\n"
				+ "            <owl:Class>\n"
				+ "                <owl:complementOf>\n"
				+ "                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#c\"/>\n"
				+ "                </owl:complementOf>\n"
				+ "            </owl:Class>\n"
				+ "        </rdfs:subClassOf>\n"
				+ "    </owl:Class>\n"
				+ "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#c\"/>\n"
				+ "    <rdf:Description>\n"
				+ "        <rdf:type rdf:resource=\"http://oiled.man.example.net/test#Unsatisfiable\"/>\n"
				+ "    </rdf:Description>\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_description_logic_001";
		TestClasses tc = TestClasses.valueOf("INCONSISTENCY");
		String d = "DL Test: fact1.1\n" + "\n"
				+ "If a, b and c are disjoint, then:\n" + "\n"
				+ "(a and b) or (b and c) or (c and a)\n" + "\n"
				+ "is unsatisfiable.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}