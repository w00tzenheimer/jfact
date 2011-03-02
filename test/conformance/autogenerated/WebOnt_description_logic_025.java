package conformance.autogenerated;

import conformance.Factory;
import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_description_logic_025 extends TestCase {
	public void testWebOnt_description_logic_025() {
		String premise = "<rdf:RDF\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/description-logic/consistent025\"\n"
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
				+ "                            <owl:Class rdf:about=\"http://oiled.man.example.net/test#a\"/>\n"
				+ "                        </owl:complementOf>\n"
				+ "                    </owl:Class>\n"
				+ "                    <owl:Restriction>\n"
				+ "                        <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#invF\"/>\n"
				+ "                        <owl:someValuesFrom>\n"
				+ "                            <owl:Class rdf:about=\"http://oiled.man.example.net/test#a\"/>\n"
				+ "                        </owl:someValuesFrom>\n"
				+ "                    </owl:Restriction>\n"
				+ "                    <owl:Restriction>\n"
				+ "                        <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#invR\"/>\n"
				+ "                        <owl:someValuesFrom>\n"
				+ "                            <owl:Restriction>\n"
				+ "                                <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#invF\"/>\n"
				+ "                                <owl:someValuesFrom>\n"
				+ "                                    <owl:Class rdf:about=\"http://oiled.man.example.net/test#a\"/>\n"
				+ "                                </owl:someValuesFrom>\n"
				+ "                            </owl:Restriction>\n"
				+ "                        </owl:someValuesFrom>\n"
				+ "                    </owl:Restriction>\n"
				+ "                </owl:intersectionOf>\n"
				+ "            </owl:Class>\n"
				+ "        </owl:equivalentClass>\n"
				+ "    </owl:Class>\n"
				+ "    <owl:Class rdf:about=\"http://oiled.man.example.net/test#a\"/>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#invF\">\n"
				+ "        <owl:inverseOf rdf:resource=\"http://oiled.man.example.net/test#f\"/>\n"
				+ "    </owl:ObjectProperty>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#invR\">\n"
				+ "        <owl:inverseOf rdf:resource=\"http://oiled.man.example.net/test#r\"/>\n"
				+ "    </owl:ObjectProperty>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#f\">\n"
				+ "        <rdfs:subPropertyOf rdf:resource=\"http://oiled.man.example.net/test#r\"/>\n"
				+ "    </owl:ObjectProperty>\n"
				+ "    <owl:FunctionalProperty rdf:about=\"http://oiled.man.example.net/test#f\"/>\n"
				+ "    <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#r\"/>\n"
				+ "    <owl:TransitiveProperty rdf:about=\"http://oiled.man.example.net/test#r\"/>\n"
				+ "    <rdf:Description>\n"
				+ "        <rdf:type rdf:resource=\"http://oiled.man.example.net/test#Satisfiable\"/>\n"
				+ "    </rdf:Description>\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_description_logic_025";
		TestClasses tc = TestClasses.valueOf("CONSISTENCY");
		String d = "DL Test: t5f.1\n" + "Non-finite model example from paper\n"
				+ "\n"
				+ "The concept should be coherent but has no finite model";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}