package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_description_logic_606 extends TestCase {
	public void testWebOnt_description_logic_606() {
		String premise = "<rdf:RDF\n"
				+ "    xmlns:oiled=\"http://oiled.man.example.net/test#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ " xml:base=\"http://www.w3.org/2002/03owlt/description-logic/consistent606\">\n"
				+ " <owl:Ontology rdf:about=\"\"/>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#p2.comp\">\n"
				+ "  <owl:equivalentClass>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty>\n"
				+ "     <owl:DatatypeProperty rdf:ID=\"P.5\"/>\n"
				+ "    </owl:onProperty>\n"
				+ "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#decimal\"\n"
				+ "    >0</owl:cardinality>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#p3.comp\">\n"
				+ "  <owl:equivalentClass>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty>\n"
				+ "     <owl:ObjectProperty rdf:ID=\"P.6\"/>\n"
				+ "    </owl:onProperty>\n"
				+ "    <owl:maxCardinality rdf:datatype=\"/2001/XMLSchema#byte\"\n"
				+ "    >0</owl:maxCardinality>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#p4.comp\">\n"
				+ "  <owl:equivalentClass>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty>\n"
				+ "     <owl:DatatypeProperty rdf:ID=\"P.7\"/>\n"
				+ "    </owl:onProperty>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#integer\"\n"
				+ "    >1</owl:minCardinality>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#p5.comp\">\n"
				+ "  <owl:equivalentClass>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty>\n"
				+ "     <owl:ObjectProperty rdf:ID=\"P.4\"/>\n"
				+ "    </owl:onProperty>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#nonNegativeInteger\"\n"
				+ "    >1</owl:minCardinality>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:ID=\"C.1.comp\">\n"
				+ "  <owl:equivalentClass>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty>\n"
				+ "     <owl:DatatypeProperty rdf:ID=\"P.1\"/>\n"
				+ "    </owl:onProperty>\n"
				+ "    <owl:maxCardinality rdf:datatype=\"/2001/XMLSchema#int\"\n"
				+ "    >0</owl:maxCardinality>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:ID=\"C.2.comp\">\n"
				+ "  <owl:equivalentClass>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty>\n"
				+ "     <owl:ObjectProperty rdf:ID=\"P.2\"/>\n"
				+ "    </owl:onProperty>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#short\"\n"
				+ "    >1</owl:minCardinality>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:ID=\"C.3.comp\">\n"
				+ "  <owl:equivalentClass>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty>\n"
				+ "     <owl:DatatypeProperty rdf:ID=\"P.3\"/>\n"
				+ "    </owl:onProperty>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#unsignedByte\"\n"
				+ "    >1</owl:minCardinality>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#Satisfiable\">\n"
				+ "  <owl:equivalentClass>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty>\n"
				+ "     <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#invR\"/>\n"
				+ "    </owl:onProperty>\n"
				+ "    <owl:someValuesFrom>\n"
				+ "     <owl:Class rdf:about=\"#A.14\"/>\n"
				+ "    </owl:someValuesFrom>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:ID=\"A.14\">\n"
				+ "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty>\n"
				+ "     <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#r\"/>\n"
				+ "    </owl:onProperty>\n"
				+ "    <owl:someValuesFrom>\n"
				+ "     <owl:Class rdf:about=\"http://oiled.man.example.net/test#p1\"/>\n"
				+ "    </owl:someValuesFrom>\n"
				+ "   </owl:Restriction>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#r\"/>\n"
				+ "    <owl:maxCardinality rdf:datatype=\"/2001/XMLSchema#nonNegativeInteger\"\n"
				+ "    >1</owl:maxCardinality>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:intersectionOf>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:ID=\"C.3\">\n"
				+ "  <owl:equivalentClass>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty rdf:resource=\"#P.3\"/>\n"
				+ "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#unsignedByte\"\n"
				+ "    >0</owl:cardinality>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n"
				+ "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#p4.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#p5.comp\"/>\n"
				+ "  </owl:intersectionOf>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:ID=\"C.2\">\n"
				+ "  <owl:equivalentClass>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty rdf:resource=\"#P.2\"/>\n"
				+ "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#short\"\n"
				+ "    >0</owl:cardinality>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n"
				+ "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#p3.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#p4.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#p5.comp\"/>\n"
				+ "  </owl:intersectionOf>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:ID=\"C.1\">\n"
				+ "  <owl:equivalentClass>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty rdf:resource=\"#P.1\"/>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#int\"\n"
				+ "    >1</owl:minCardinality>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n"
				+ "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#p2.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#p3.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#p4.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#p5.comp\"/>\n"
				+ "  </owl:intersectionOf>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#p5\">\n"
				+ "  <owl:equivalentClass>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty rdf:resource=\"#P.4\"/>\n"
				+ "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#nonNegativeInteger\"\n"
				+ "    >0</owl:cardinality>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#p4\">\n"
				+ "  <rdfs:subClassOf rdf:resource=\"http://oiled.man.example.net/test#p5.comp\"/>\n"
				+ "  <owl:equivalentClass>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty rdf:resource=\"#P.7\"/>\n"
				+ "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#integer\"\n"
				+ "    >0</owl:cardinality>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#p3\">\n"
				+ "  <rdfs:subClassOf rdf:resource=\"#C.3\"/>\n"
				+ "  <owl:equivalentClass>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty rdf:resource=\"#P.6\"/>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#byte\"\n"
				+ "    >1</owl:minCardinality>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#p2\">\n"
				+ "  <rdfs:subClassOf rdf:resource=\"#C.2\"/>\n"
				+ "  <owl:equivalentClass>\n"
				+ "   <owl:Restriction>\n"
				+ "    <owl:onProperty rdf:resource=\"#P.5\"/>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#decimal\"\n"
				+ "    >1</owl:minCardinality>\n"
				+ "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#p1\">\n"
				+ "  <rdfs:subClassOf rdf:resource=\"#C.1\"/>\n"
				+ " </owl:Class>\n"
				+ " <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#invR\">\n"
				+ "  <owl:inverseOf rdf:resource=\"http://oiled.man.example.net/test#r\"/>\n"
				+ " </owl:ObjectProperty>\n" + " <oiled:Satisfiable/>\n"
				+ "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_description_logic_606";
		TestClasses tc = TestClasses.valueOf("CONSISTENCY");
		String d = "DL Test: t1.1";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}