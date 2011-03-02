package conformance.autogenerated;

import conformance.Factory;
import junit.framework.TestCase;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_description_logic_615 extends TestCase {
	public void testWebOnt_description_logic_615() {
		String premise = "<rdf:RDF\n"
				+ "    xmlns:oiled=\"http://oiled.man.example.net/test#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ " xml:base=\"http://www.w3.org/2002/03owlt/description-logic/inconsistent615\">\n"
				+ " <owl:Ontology rdf:about=\"\"/>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#p.comp\">\n"
				+ "  <owl:equivalentClass>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty>\n"
				+ "     <owl:DatatypeProperty rdf:ID=\"P.1\"/>\n"
				+ "    </owl:onProperty>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#int\"\n"
				+ "    >1</owl:minCardinality>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#q.comp\">\n"
				+ "  <owl:equivalentClass>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty>\n"
				+ "     <owl:ObjectProperty rdf:ID=\"P.2\"/>\n"
				+ "    </owl:onProperty>\n"
				+ "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#short\"\n"
				+ "    >0</owl:cardinality>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:ID=\"V.5\">\n"
				+ "  <owl:equivalentClass>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty>\n"
				+ "     <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#s\"/>\n"
				+ "    </owl:onProperty>\n"
				+ "    <owl:allValuesFrom>\n"
				+ "     <owl:Class rdf:about=\"http://oiled.man.example.net/test#p\"/>\n"
				+ "    </owl:allValuesFrom>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#Unsatisfiable\">\n"
				+ "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#s\"/>\n"
				+ "    <owl:someValuesFrom>\n"
				+ "     <owl:Class rdf:about=\"#A.3\"/>\n"
				+ "    </owl:someValuesFrom>\n"
				+ "   </owl:Restriction>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty>\n"
				+ "     <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#r\"/>\n"
				+ "    </owl:onProperty>\n"
				+ "    <owl:someValuesFrom>\n"
				+ "     <owl:Class rdf:about=\"#A.4\"/>\n"
				+ "    </owl:someValuesFrom>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:intersectionOf>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:ID=\"A.4\">\n"
				+ "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty>\n"
				+ "     <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#invR\"/>\n"
				+ "    </owl:onProperty>\n"
				+ "    <owl:maxCardinality rdf:datatype=\"/2001/XMLSchema#nonNegativeInteger\"\n"
				+ "    >1</owl:maxCardinality>\n"
				+ "   </owl:Restriction>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty>\n"
				+ "     <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#invR\"/>\n"
				+ "    </owl:onProperty>\n"
				+ "    <owl:someValuesFrom rdf:resource=\"#V.5\"/>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:intersectionOf>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:ID=\"A.3\">\n"
				+ "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#p.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#q.comp\"/>\n"
				+ "  </owl:intersectionOf>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#q\">\n"
				+ "  <owl:equivalentClass>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty rdf:resource=\"#P.2\"/>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#short\"\n"
				+ "    >1</owl:minCardinality>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#p\">\n"
				+ "  <owl:equivalentClass>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty rdf:resource=\"#P.1\"/>\n"
				+ "    <owl:maxCardinality rdf:datatype=\"/2001/XMLSchema#int\"\n"
				+ "    >0</owl:maxCardinality>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n"
				+ " <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#invR\">\n"
				+ "  <owl:inverseOf rdf:resource=\"http://oiled.man.example.net/test#r\"/>\n"
				+ " </owl:ObjectProperty>\n" + " <oiled:Unsatisfiable/>\n"
				+ "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_description_logic_615";
		TestClasses tc = TestClasses.valueOf("INCONSISTENCY");
		String d = "DL Test: t12.1";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}