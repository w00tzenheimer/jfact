package conformance.broken;

import junit.framework.TestCase;
import uk.ac.manchester.cs.jfact.JFactFactory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class one_two extends TestCase {
	public void testone_two() {
		String premise = "<rdf:RDF xmlns=\"urn:test#\"\n" + "     xml:base=\"http://example.com/\"\n" + "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n" + "     xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n" + "    <owl:Ontology rdf:about=\"\"/>\n" + "\n" + "    <owl:ObjectProperty rdf:about=\"2a=a\">\n" + "        <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#FunctionalProperty\"/>\n"
				+ "        <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#InverseFunctionalProperty\"/>\n" + "        <rdfs:label rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">2a_to_a</rdfs:label>\n" + "    </owl:ObjectProperty>\n" + "\n"
				+ "    <owl:ObjectProperty rdf:about=\"2a=b-and-c\">\n" + "        <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#FunctionalProperty\"/>\n" + "        <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#InverseFunctionalProperty\"/>\n"
				+ "        <rdfs:label rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">2a-to-b-and-c</rdfs:label>\n" + "    </owl:ObjectProperty>\n" + "\n" + "    <owl:ObjectProperty rdf:about=\"a=2a'\">\n"
				+ "        <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#FunctionalProperty\"/>\n" + "        <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#InverseFunctionalProperty\"/>\n"
				+ "        <rdfs:label rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">a-to-2a'</rdfs:label>\n" + "        <owl:inverseOf rdf:resource=\"2a=a\"/>\n" + "    </owl:ObjectProperty>\n" + "    \n" + "\n" + "    <owl:ObjectProperty rdf:about=\"a=b\">\n"
				+ "        <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#FunctionalProperty\"/>\n" + "        <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#InverseFunctionalProperty\"/>\n"
				+ "        <rdfs:label rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">a-to-b</rdfs:label>\n" + "    </owl:ObjectProperty>\n" + "    \n" + "    <owl:ObjectProperty rdf:about=\"b-and-c=2a'\">\n"
				+ "        <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#FunctionalProperty\"/>\n" + "        <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#InverseFunctionalProperty\"/>\n"
				+ "        <rdfs:label rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">b-and-c-to-2a'</rdfs:label>\n" + "        <owl:inverseOf rdf:resource=\"2a=b-and-c\"/>\n" + "    </owl:ObjectProperty>\n" + "\n" + "    <owl:ObjectProperty rdf:about=\"b=a'\">\n"
				+ "        <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#FunctionalProperty\"/>\n" + "        <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#InverseFunctionalProperty\"/>\n"
				+ "        <rdfs:label rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">b-to-a'</rdfs:label>\n" + "        <owl:inverseOf rdf:resource=\"a=b\"/>\n" + "    </owl:ObjectProperty>\n" + "    \n" + "    <owl:ObjectProperty rdf:about=\"b=c\">\n"
				+ "        <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#FunctionalProperty\"/>\n" + "        <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#InverseFunctionalProperty\"/>\n"
				+ "        <rdfs:label rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">b-to-c</rdfs:label>\n" + "    </owl:ObjectProperty>\n" + "    \n" + "    <owl:ObjectProperty rdf:about=\"c=b'\">\n"
				+ "        <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#FunctionalProperty\"/>\n" + "        <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#InverseFunctionalProperty\"/>\n"
				+ "        <rdfs:label rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">c-to-b'</rdfs:label>\n" + "        <owl:inverseOf rdf:resource=\"b=c\"/>\n" + "    </owl:ObjectProperty>\n" + "    \n" + "    <owl:Class rdf:about=\"2a\">\n"
				+ "        <rdfs:label rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">2a</rdfs:label>\n" + "        <rdfs:subClassOf>\n" + "            <owl:Restriction>\n" + "                <owl:onProperty rdf:resource=\"2a=b-and-c\"/>\n"
				+ "                <owl:someValuesFrom rdf:resource=\"b-and-c\"/>\n" + "            </owl:Restriction>\n" + "        </rdfs:subClassOf>\n" + "        <rdfs:subClassOf>\n" + "            <owl:Restriction>\n"
				+ "                <owl:onProperty rdf:resource=\"2a=a\"/>\n" + "                <owl:someValuesFrom rdf:resource=\"a\"/>\n" + "            </owl:Restriction>\n" + "        </rdfs:subClassOf>\n" + "        <owl:disjointWith rdf:resource=\"a\"/>\n"
				+ "        <owl:disjointWith rdf:resource=\"b\"/>\n" + "        <owl:disjointWith rdf:resource=\"b-and-c\"/>\n" + "        <owl:disjointWith rdf:resource=\"c\"/>\n" + "    </owl:Class>\n" + "\n" + "    <owl:Class rdf:about=\"a\">\n"
				+ "        <rdfs:label rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">a</rdfs:label>\n" + "        <owl:equivalentClass>\n" + "            <owl:Class>\n" + "                <owl:oneOf rdf:parseType=\"Collection\">\n"
				+ "                    <rdf:Description rdf:about=\"http://example.com/j\"/>\n" + "                    <rdf:Description rdf:about=\"http://example.com/k\"/>\n" + "                    <rdf:Description rdf:about=\"http://example.com/i\"/>\n"
				+ "                </owl:oneOf>\n" + "            </owl:Class>\n" + "        </owl:equivalentClass>\n" + "        <rdfs:subClassOf>\n" + "            <owl:Restriction>\n" + "                <owl:onProperty rdf:resource=\"a=b\"/>\n"
				+ "                <owl:someValuesFrom rdf:resource=\"b\"/>\n" + "            </owl:Restriction>\n" + "        </rdfs:subClassOf>\n" + "        <rdfs:subClassOf>\n" + "            <owl:Restriction>\n" + "                <owl:onProperty rdf:resource=\"a=2a'\"/>\n"
				+ "                <owl:someValuesFrom rdf:resource=\"2a\"/>\n" + "            </owl:Restriction>\n" + "        </rdfs:subClassOf>\n" + "        <owl:disjointWith rdf:resource=\"b\"/>\n" + "        <owl:disjointWith rdf:resource=\"c\"/>\n" + "    </owl:Class>\n"
				+ "    \n" + "    <owl:Class rdf:about=\"b\">\n" + "        <rdfs:label rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">b</rdfs:label>\n" + "        <rdfs:subClassOf>\n" + "            <owl:Restriction>\n"
				+ "                <owl:onProperty rdf:resource=\"b=a'\"/>\n" + "                <owl:someValuesFrom rdf:resource=\"a\"/>\n" + "            </owl:Restriction>\n" + "        </rdfs:subClassOf>\n" + "        <rdfs:subClassOf>\n" + "            <owl:Restriction>\n"
				+ "                <owl:onProperty rdf:resource=\"b=c\"/>\n" + "                <owl:someValuesFrom rdf:resource=\"c\"/>\n" + "            </owl:Restriction>\n" + "        </rdfs:subClassOf>\n" + "        <owl:disjointWith rdf:resource=\"c\"/>\n"
				+ "    </owl:Class>\n" + "\n" + "    <owl:Class rdf:about=\"b-and-c\">\n" + "        <rdfs:label rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">b-and-c</rdfs:label>\n" + "        <owl:equivalentClass>\n" + "            <owl:Class>\n"
				+ "                <owl:unionOf rdf:parseType=\"Collection\">\n" + "                    <rdf:Description rdf:about=\"b\"/>\n" + "                    <rdf:Description rdf:about=\"c\"/>\n" + "                </owl:unionOf>\n" + "            </owl:Class>\n"
				+ "        </owl:equivalentClass>\n" + "        <rdfs:subClassOf>\n" + "            <owl:Restriction>\n" + "                <owl:onProperty rdf:resource=\"b-and-c=2a'\"/>\n" + "                <owl:someValuesFrom rdf:resource=\"2a\"/>\n"
				+ "            </owl:Restriction>\n" + "        </rdfs:subClassOf>\n" + "    </owl:Class>\n" + "    \n" + "    <owl:Class rdf:about=\"c\">\n" + "        <rdfs:label rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">c</rdfs:label>\n"
				+ "        <rdfs:subClassOf>\n" + "            <owl:Restriction>\n" + "                <owl:onProperty rdf:resource=\"c=b'\"/>\n" + "                <owl:someValuesFrom rdf:resource=\"b\"/>\n" + "            </owl:Restriction>\n" + "        </rdfs:subClassOf>\n"
				+ "    </owl:Class>\n" + "\n" + "    <rdf:Description rdf:about=\"http://example.com/i\">\n" + "        <rdfs:label>i</rdfs:label>\n" + "    </rdf:Description>\n" + "\n" + "    <rdf:Description rdf:about=\"http://example.com/j\">\n"
				+ "        <rdfs:label>j</rdfs:label>\n" + "    </rdf:Description>\n" + "\n" + "    <rdf:Description rdf:about=\"http://example.com/k\">\n" + "        <rdfs:label>k</rdfs:label>\n" + "    </rdf:Description>\n" + "\n" + "    <rdf:Description>\n"
				+ "        <rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#AllDifferent\"/>\n" + "        <owl:distinctMembers rdf:parseType=\"Collection\">\n" + "            <rdf:Description rdf:about=\"http://example.com/j\"/>\n"
				+ "            <rdf:Description rdf:about=\"http://example.com/k\"/>\n" + "            <rdf:Description rdf:about=\"http://example.com/i\"/>\n" + "        </owl:distinctMembers>\n" + "    </rdf:Description>\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "one_two";
		TestClasses tc = TestClasses.valueOf("INCONSISTENCY");
		String d = "Start with 3 classes, a,b,c and relate them so instances have to be in a 1:1 relationship with each other.\n" + "\n" + "The class b-and-c is the union of b and c. Therefore there have to be 2 instances of b-and-c for every instance of a.\n" + "\n"
				+ "Relate the class 2a to b-and-c so that *their* instances are in 1:1 relationship.\n" + "\n" + "Now relate 2a to a so that *their* instances are in a 1:1 relationship. This should lead to a situation in which every instance\n"
				+ "of 2a is 1:1 with an instance of a, and at the same time 2:1 with an instance of a.\n" + "\n"
				+ "Unless all the classes have an infinite number of members or are empty this doesn't work. This example has a is the enumerated class {i,j,k} (i,j,k all different individuals). So it should be inconsistent.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		//r.setReasonerFactory(Factory.factory());
		r.setReasonerFactory(new JFactFactory());
		r.run();
	}
}