package conformance.broken;

import java.util.Set;

import junit.framework.TestCase;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.io.StringDocumentSource;
import org.semanticweb.owlapi.model.OWLLogicalAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.profiles.OWL2DLProfile;
import org.semanticweb.owlapi.profiles.OWLProfileReport;
import org.semanticweb.owlapi.reasoner.InferenceType;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.SimpleConfiguration;
import org.semanticweb.owlapi.reasoner.TimedConsoleProgressMonitor;

import conformance.Factory;
import conformance.TestClasses;

public class WebOnt_description_logic_661 extends TestCase {
	public void _testWebOnt_description_logic_661() throws Exception {
		String premise = "<rdf:RDF\n" + "    xmlns:oiled=\"http://oiled.man.example.net/test#\"\n" + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n" + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ " xml:base=\"http://www.w3.org/2002/03owlt/description-logic/premises661\">\n" + " <owl:Ontology rdf:about=\"\"/>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C82.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n"
				+ "    <owl:onProperty>\n" + "     <owl:DatatypeProperty rdf:ID=\"P.65\"/>\n" + "    </owl:onProperty>\n" + "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#short\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C94.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:ID=\"P.30\"/>\n" + "    </owl:onProperty>\n"
				+ "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#short\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C30.comp\">\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:ID=\"P.8\"/>\n" + "    </owl:onProperty>\n" + "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#int\"\n" + "    >0</owl:cardinality>\n"
				+ "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C78.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n"
				+ "     <owl:DatatypeProperty rdf:ID=\"P.25\"/>\n" + "    </owl:onProperty>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#nonNegativeInteger\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C132.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:ID=\"P.48\"/>\n" + "    </owl:onProperty>\n"
				+ "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#byte\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C140\">\n"
				+ "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C74\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C138.comp\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C78\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C10\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.25\"/>\n"
				+ "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#nonNegativeInteger\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C76\">\n"
				+ "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C2.comp\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4\"/>\n" + "  </owl:intersectionOf>\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:ID=\"P.24\"/>\n" + "    </owl:onProperty>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#unsignedByte\"\n"
				+ "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C74\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C54\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C72.comp\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C72\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C68.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C70\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:DatatypeProperty rdf:ID=\"P.21\"/>\n"
				+ "    </owl:onProperty>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#integer\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C70\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C2\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4.comp\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C28\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C26\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C16.comp\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n"
				+ "    <owl:onProperty>\n" + "     <owl:DatatypeProperty rdf:ID=\"P.7\"/>\n" + "    </owl:onProperty>\n" + "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#integer\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C26\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:about=\"http://oiled.man.example.net/test#R1\"/>\n"
				+ "    </owl:onProperty>\n" + "    <owl:someValuesFrom>\n" + "     <owl:Class rdf:about=\"http://oiled.man.example.net/test#C24\"/>\n" + "    </owl:someValuesFrom>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C24\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C16\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C2\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C22\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C20\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C16\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n"
				+ "     <owl:ObjectProperty rdf:ID=\"P.6\"/>\n" + "    </owl:onProperty>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#byte\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C20\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#R1\"/>\n" + "    <owl:someValuesFrom>\n"
				+ "     <owl:Class rdf:about=\"http://oiled.man.example.net/test#C18\"/>\n" + "    </owl:someValuesFrom>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C92.comp\">\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:DatatypeProperty rdf:ID=\"P.29\"/>\n" + "    </owl:onProperty>\n" + "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#int\"\n" + "    >0</owl:cardinality>\n"
				+ "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C40.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n"
				+ "     <owl:DatatypeProperty rdf:ID=\"P.11\"/>\n" + "    </owl:onProperty>\n" + "    <owl:maxCardinality rdf:datatype=\"/2001/XMLSchema#nonNegativeInteger\"\n" + "    >0</owl:maxCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C76.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.24\"/>\n"
				+ "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#unsignedByte\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C88.comp\">\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:ID=\"P.64\"/>\n" + "    </owl:onProperty>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#int\"\n" + "    >1</owl:minCardinality>\n"
				+ "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C12.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n"
				+ "     <owl:DatatypeProperty rdf:ID=\"P.3\"/>\n" + "    </owl:onProperty>\n" + "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#unsignedByte\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C48.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:DatatypeProperty rdf:ID=\"P.13\"/>\n" + "    </owl:onProperty>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#byte\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C128\">\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#R1\"/>\n" + "    <owl:someValuesFrom>\n" + "     <owl:Class rdf:about=\"http://oiled.man.example.net/test#C126\"/>\n"
				+ "    </owl:someValuesFrom>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C130.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n"
				+ "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:ID=\"P.44\"/>\n" + "    </owl:onProperty>\n" + "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#short\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C126\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C124\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C34.comp\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C124\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C10.comp\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C102.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:DatatypeProperty rdf:ID=\"P.35\"/>\n" + "    </owl:onProperty>\n"
				+ "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#integer\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C122\">\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#R1\"/>\n" + "    <owl:someValuesFrom>\n" + "     <owl:Class rdf:about=\"http://oiled.man.example.net/test#C120\"/>\n"
				+ "    </owl:someValuesFrom>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C138.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n"
				+ "    <owl:onProperty>\n" + "     <owl:DatatypeProperty rdf:ID=\"P.47\"/>\n" + "    </owl:onProperty>\n" + "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#decimal\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C120\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C118\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C34\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C58\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C56\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C34\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C56\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C10.comp\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C54\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C14\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C52\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C52\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C32.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C50.comp\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C50\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C48.comp\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n"
				+ "    <owl:onProperty>\n" + "     <owl:DatatypeProperty rdf:ID=\"P.15\"/>\n" + "    </owl:onProperty>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#int\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:DatatypeProperty rdf:ID=\"P.1\"/>\n"
				+ "    </owl:onProperty>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#int\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C88\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C16\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C2\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.64\"/>\n"
				+ "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#int\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C90.comp\">\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:ID=\"P.52\"/>\n" + "    </owl:onProperty>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#unsignedByte\"\n"
				+ "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C86\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C84\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C16\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n"
				+ "     <owl:ObjectProperty rdf:ID=\"P.28\"/>\n" + "    </owl:onProperty>\n" + "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#integer\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C84\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#R1\"/>\n" + "    <owl:someValuesFrom>\n"
				+ "     <owl:Class rdf:about=\"http://oiled.man.example.net/test#C82\"/>\n" + "    </owl:someValuesFrom>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n"
				+ "     <owl:DatatypeProperty rdf:ID=\"P.53\"/>\n" + "    </owl:onProperty>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#nonNegativeInteger\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C50.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.15\"/>\n"
				+ "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#int\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C82\">\n"
				+ "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C16.comp\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C2\"/>\n" + "  </owl:intersectionOf>\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.65\"/>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#short\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C80\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C76.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C78.comp\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C86.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n"
				+ "    <owl:onProperty rdf:resource=\"#P.28\"/>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#integer\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C98.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:DatatypeProperty rdf:ID=\"P.63\"/>\n" + "    </owl:onProperty>\n"
				+ "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#integer\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C10.comp\">\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:ID=\"P.16\"/>\n" + "    </owl:onProperty>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#short\"\n" + "    >1</owl:minCardinality>\n"
				+ "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C22.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.6\"/>\n"
				+ "    <owl:maxCardinality rdf:datatype=\"/2001/XMLSchema#byte\"\n" + "    >0</owl:maxCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C34.comp\">\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:DatatypeProperty rdf:ID=\"P.9\"/>\n" + "    </owl:onProperty>\n" + "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#short\"\n" + "    >0</owl:cardinality>\n"
				+ "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C46.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n"
				+ "     <owl:ObjectProperty rdf:ID=\"P.12\"/>\n" + "    </owl:onProperty>\n" + "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#decimal\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C108\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C106\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C34.comp\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:ID=\"P.36\"/>\n"
				+ "    </owl:onProperty>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#int\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C106\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#R1\"/>\n" + "    <owl:someValuesFrom>\n"
				+ "     <owl:Class rdf:about=\"http://oiled.man.example.net/test#C104\"/>\n" + "    </owl:someValuesFrom>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C18.comp\">\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:ID=\"P.56\"/>\n" + "    </owl:onProperty>\n" + "    <owl:maxCardinality rdf:datatype=\"/2001/XMLSchema#integer\"\n"
				+ "    >0</owl:maxCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C104\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C34\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C100.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:DatatypeProperty rdf:ID=\"P.49\"/>\n" + "    </owl:onProperty>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#integer\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C112.comp\">\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:DatatypeProperty rdf:ID=\"P.39\"/>\n" + "    </owl:onProperty>\n" + "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#nonNegativeInteger\"\n"
				+ "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C102\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C100\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C34\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n"
				+ "    <owl:onProperty rdf:resource=\"#P.35\"/>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#integer\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C136.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:ID=\"P.46\"/>\n" + "    </owl:onProperty>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#nonNegativeInteger\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C100\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#R1\"/>\n" + "    <owl:someValuesFrom>\n"
				+ "     <owl:Class rdf:about=\"http://oiled.man.example.net/test#C98\"/>\n" + "    </owl:someValuesFrom>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n"
				+ "    <owl:onProperty rdf:resource=\"#P.49\"/>\n" + "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#integer\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C38\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#R1\"/>\n" + "    <owl:someValuesFrom>\n"
				+ "     <owl:Class rdf:about=\"http://oiled.man.example.net/test#C36\"/>\n" + "    </owl:someValuesFrom>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C108.comp\">\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.36\"/>\n" + "    <owl:maxCardinality rdf:datatype=\"/2001/XMLSchema#int\"\n" + "    >0</owl:maxCardinality>\n" + "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C36\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C34.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C34\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n"
				+ "    <owl:onProperty rdf:resource=\"#P.9\"/>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#short\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C32\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C30.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C2\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:ID=\"P.14\"/>\n" + "    </owl:onProperty>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#integer\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C30\">\n"
				+ "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C22.comp\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C28.comp\"/>\n" + "  </owl:intersectionOf>\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.8\"/>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#int\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C138\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#R1\"/>\n"
				+ "    <owl:someValuesFrom rdf:resource=\"http://oiled.man.example.net/test#C136.comp\"/>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.47\"/>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#decimal\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C136\">\n"
				+ "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C116\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C134.comp\"/>\n" + "  </owl:intersectionOf>\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.46\"/>\n" + "    <owl:maxCardinality rdf:datatype=\"/2001/XMLSchema#nonNegativeInteger\"\n" + "    >0</owl:maxCardinality>\n" + "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C2.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:ID=\"P.22\"/>\n"
				+ "    </owl:onProperty>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#int\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C134\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C130.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C132\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:DatatypeProperty rdf:ID=\"P.45\"/>\n"
				+ "    </owl:onProperty>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#unsignedByte\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C132\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C2\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4.comp\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.48\"/>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#byte\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C130\">\n"
				+ "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C122\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C128\"/>\n" + "  </owl:intersectionOf>\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.44\"/>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#short\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C68\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C60\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C66\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:ID=\"P.20\"/>\n"
				+ "    </owl:onProperty>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#byte\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C66\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#R1\"/>\n" + "    <owl:someValuesFrom>\n"
				+ "     <owl:Class rdf:about=\"http://oiled.man.example.net/test#C64\"/>\n" + "    </owl:someValuesFrom>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C64\">\n"
				+ "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C62\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C34.comp\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C62\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C10.comp\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C72.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n"
				+ "    <owl:onProperty rdf:resource=\"#P.21\"/>\n" + "    <owl:maxCardinality rdf:datatype=\"/2001/XMLSchema#integer\"\n" + "    >0</owl:maxCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C60\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#R1\"/>\n"
				+ "    <owl:someValuesFrom rdf:resource=\"http://oiled.man.example.net/test#C58\"/>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C84.comp\">\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.53\"/>\n" + "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#nonNegativeInteger\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C96.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:ID=\"P.38\"/>\n"
				+ "    </owl:onProperty>\n" + "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#unsignedByte\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C32.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.14\"/>\n" + "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#integer\"\n"
				+ "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C68.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n"
				+ "    <owl:onProperty rdf:resource=\"#P.20\"/>\n" + "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#byte\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C8\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C2.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:ID=\"P.2\"/>\n" + "    </owl:onProperty>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#short\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C16.comp\">\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:ObjectProperty rdf:ID=\"P.4\"/>\n" + "    </owl:onProperty>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#nonNegativeInteger\"\n"
				+ "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C28.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n"
				+ "    <owl:onProperty rdf:resource=\"#P.7\"/>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#integer\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C6\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C2\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4.comp\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#TEST\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C6\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C140\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C110.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty>\n" + "     <owl:DatatypeProperty rdf:ID=\"P.37\"/>\n" + "    </owl:onProperty>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#short\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4\">\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.1\"/>\n" + "    <owl:maxCardinality rdf:datatype=\"/2001/XMLSchema#int\"\n" + "    >0</owl:maxCardinality>\n" + "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C134.comp\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.45\"/>\n"
				+ "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#unsignedByte\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C2\">\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.22\"/>\n" + "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#int\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C18\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C16.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C2\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.56\"/>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#integer\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C16\">\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.4\"/>\n" + "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#nonNegativeInteger\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C14\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C8.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C12.comp\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C12\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4.comp\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C10\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n"
				+ "    <owl:onProperty rdf:resource=\"#P.3\"/>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#unsignedByte\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C98\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C34.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.63\"/>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#integer\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C10\">\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.16\"/>\n" + "    <owl:maxCardinality rdf:datatype=\"/2001/XMLSchema#short\"\n" + "    >0</owl:maxCardinality>\n" + "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C96\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C94.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C2\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.38\"/>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#unsignedByte\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C94\">\n"
				+ "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C86.comp\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C92.comp\"/>\n" + "  </owl:intersectionOf>\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.30\"/>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#short\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C92\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C90\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C16.comp\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.29\"/>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#int\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C90\">\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#R1\"/>\n" + "    <owl:someValuesFrom rdf:resource=\"http://oiled.man.example.net/test#C88\"/>\n" + "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.52\"/>\n" + "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#unsignedByte\"\n" + "    >0</owl:cardinality>\n"
				+ "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C118\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C10.comp\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C116\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C80\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C114\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C114\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C96.comp\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C112.comp\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C112\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C110.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.39\"/>\n"
				+ "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#nonNegativeInteger\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C110\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C102.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C108.comp\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.37\"/>\n"
				+ "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#short\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C8.comp\">\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.2\"/>\n" + "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#short\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n"
				+ " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C48\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C40.comp\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C46.comp\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.13\"/>\n"
				+ "    <owl:cardinality rdf:datatype=\"/2001/XMLSchema#byte\"\n" + "    >0</owl:cardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C46\">\n"
				+ "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C44\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C34.comp\"/>\n" + "  </owl:intersectionOf>\n"
				+ "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"#P.12\"/>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#decimal\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n"
				+ "  </owl:equivalentClass>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C44\">\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#R1\"/>\n"
				+ "    <owl:someValuesFrom>\n" + "     <owl:Class rdf:about=\"http://oiled.man.example.net/test#C42\"/>\n" + "    </owl:someValuesFrom>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C42\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C34\"/>\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C4\"/>\n" + "  </owl:intersectionOf>\n" + " </owl:Class>\n" + " <owl:Class rdf:about=\"http://oiled.man.example.net/test#C40\">\n" + "  <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C38\"/>\n" + "   <owl:Class rdf:about=\"http://oiled.man.example.net/test#C34\"/>\n" + "  </owl:intersectionOf>\n" + "  <owl:equivalentClass>\n" + "   <owl:Restriction>\n"
				+ "    <owl:onProperty rdf:resource=\"#P.11\"/>\n" + "    <owl:minCardinality rdf:datatype=\"/2001/XMLSchema#nonNegativeInteger\"\n" + "    >1</owl:minCardinality>\n" + "   </owl:Restriction>\n" + "  </owl:equivalentClass>\n" + " </owl:Class>\n"
				+ " <owl:Thing rdf:about=\"http://oiled.man.example.net/test#V822576\">\n" + "  <rdf:type rdf:resource=\"http://oiled.man.example.net/test#C16\"/>\n" + "  <rdf:type rdf:resource=\"http://oiled.man.example.net/test#C2\"/>\n"
				+ "  <rdf:type rdf:resource=\"http://oiled.man.example.net/test#C34\"/>\n" + "  <rdf:type rdf:resource=\"http://oiled.man.example.net/test#C4\"/>\n" + "  <rdf:type>\n" + "   <owl:Restriction>\n"
				+ "    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#R1\"/>\n" + "    <owl:allValuesFrom rdf:resource=\"http://oiled.man.example.net/test#C98.comp\"/>\n" + "   </owl:Restriction>\n" + "  </rdf:type>\n" + "  <rdf:type>\n"
				+ "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#R1\"/>\n" + "    <owl:allValuesFrom rdf:resource=\"http://oiled.man.example.net/test#C88.comp\"/>\n" + "   </owl:Restriction>\n" + "  </rdf:type>\n"
				+ "  <rdf:type>\n" + "   <owl:Restriction>\n" + "    <owl:onProperty rdf:resource=\"http://oiled.man.example.net/test#R1\"/>\n" + "    <owl:allValuesFrom rdf:resource=\"http://oiled.man.example.net/test#C82.comp\"/>\n" + "   </owl:Restriction>\n"
				+ "  </rdf:type>\n" + "  <rdf:type rdf:resource=\"http://oiled.man.example.net/test#C132.comp\"/>\n" + "  <rdf:type rdf:resource=\"http://oiled.man.example.net/test#C100.comp\"/>\n" + "  <rdf:type rdf:resource=\"http://oiled.man.example.net/test#C108.comp\"/>\n"
				+ "  <rdf:type rdf:resource=\"http://oiled.man.example.net/test#C102.comp\"/>\n" + "  <rdf:type rdf:resource=\"http://oiled.man.example.net/test#C90.comp\"/>\n" + "  <rdf:type rdf:resource=\"http://oiled.man.example.net/test#C84.comp\"/>\n"
				+ "  <rdf:type rdf:resource=\"http://oiled.man.example.net/test#C92.comp\"/>\n" + "  <rdf:type rdf:resource=\"http://oiled.man.example.net/test#C86.comp\"/>\n" + "  <rdf:type rdf:resource=\"http://oiled.man.example.net/test#C18.comp\"/>\n"
				+ "  <rdf:type rdf:resource=\"http://oiled.man.example.net/test#C78.comp\"/>\n" + "  <rdf:type rdf:resource=\"http://oiled.man.example.net/test#C96.comp\"/>\n" + "  <rdf:type rdf:resource=\"http://oiled.man.example.net/test#C76.comp\"/>\n"
				+ "  <rdf:type rdf:resource=\"http://oiled.man.example.net/test#C134.comp\"/>\n" + "  <rdf:type rdf:resource=\"http://oiled.man.example.net/test#C10.comp\"/>\n" + "  <rdf:type rdf:resource=\"http://oiled.man.example.net/test#C112.comp\"/>\n" + " </owl:Thing>\n"
				+ "</rdf:RDF>";
		String conclusion = "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "      xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n" + "      xml:base=\"http://www.w3.org/2002/03owlt/description-logic/conclusions661\"\n" + ">\n" + "<owl:Ontology/>\n"
				+ "<owl:Thing rdf:about=\"http://oiled.man.example.net/test#V822576\">\n" + "  <rdf:type>\n" + "<owl:Class rdf:about=\"http://oiled.man.example.net/test#C110\"/>\n" + "</rdf:type>\n" + "</owl:Thing>\n"
				+ "<owl:Thing rdf:about=\"http://oiled.man.example.net/test#V822576\">\n" + "  <rdf:type>\n" + "<owl:Class rdf:about=\"http://oiled.man.example.net/test#C94\"/>\n" + "</rdf:type>\n" + "</owl:Thing>\n"
				+ "<owl:Thing rdf:about=\"http://oiled.man.example.net/test#V822576\">\n" + "  <rdf:type>\n" + "<owl:Class rdf:about=\"http://oiled.man.example.net/test#C136\"/>\n" + "</rdf:type>\n" + "</owl:Thing>\n"
				+ "<owl:Thing rdf:about=\"http://oiled.man.example.net/test#V822576\">\n" + "  <rdf:type>\n" + "<owl:Class rdf:about=\"http://oiled.man.example.net/test#C58\"/>\n" + "</rdf:type>\n" + "</owl:Thing>\n"
				+ "<owl:Thing rdf:about=\"http://oiled.man.example.net/test#V822576\">\n" + "  <rdf:type>\n" + "<owl:Class rdf:about=\"http://oiled.man.example.net/test#C80\"/>\n" + "</rdf:type>\n" + "</owl:Thing>\n"
				+ "<owl:Thing rdf:about=\"http://oiled.man.example.net/test#V822576\">\n" + "  <rdf:type>\n" + "<owl:Class rdf:about=\"http://oiled.man.example.net/test#C56\"/>\n" + "</rdf:type>\n" + "</owl:Thing>\n"
				+ "<owl:Thing rdf:about=\"http://oiled.man.example.net/test#V822576\">\n" + "  <rdf:type>\n" + "<owl:Class rdf:about=\"http://oiled.man.example.net/test#C116\"/>\n" + "</rdf:type>\n" + "</owl:Thing>\n"
				+ "<owl:Thing rdf:about=\"http://oiled.man.example.net/test#V822576\">\n" + "  <rdf:type>\n" + "<owl:Class rdf:about=\"http://oiled.man.example.net/test#C114\"/>\n" + "</rdf:type>\n" + "</owl:Thing>\n" + "</rdf:RDF>";
		String id = "WebOnt_description_logic_661";
		TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
		String d = "DL Test: k_branch\n" + "ABox test from DL98 systems comparison.";
		//		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		//		r.setReasonerFactory(Factory.factory());
		//		//XXX slow
		//		r.run();
		verify(premise, conclusion);
	}

	public static void verify(String premise, String consequence) throws Exception {
		OWLOntology premiseOntology = null;
		OWLOntology conclusionOntology = null;
		OWLOntologyManager m = OWLManager.createOWLOntologyManager();
		m.setSilentMissingImportsHandling(true);
		try {
			if (premise != null) {
				StringDocumentSource documentSource = new StringDocumentSource(premise);
				premiseOntology = m.loadOntologyFromOntologyDocument(documentSource);
				OWL2DLProfile profile = new OWL2DLProfile();
				OWLProfileReport report = profile.checkOntology(premiseOntology);
				if (report.getViolations().size() > 0) {
					System.out.println("JUnitRunner.run() premise violations:\n" + report.toString());
					System.out.println("\n" + premise + "\n");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("JUnitRunner.run() premise:\n" + premise);
			throw new RuntimeException(e);
		}
		try {
			if (consequence != null) {
				StringDocumentSource documentSource = new StringDocumentSource(consequence);
				conclusionOntology = m.loadOntologyFromOntologyDocument(documentSource);
				OWL2DLProfile profile = new OWL2DLProfile();
				OWLProfileReport report = profile.checkOntology(conclusionOntology);
				if (report.getViolations().size() > 0) {
					System.out.println("JUnitRunner.run() conclusion violations:\n" + report.toString());
					System.out.println("\n" + consequence + "\n");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("JUnitRunner.run() conclusion:\n" + consequence);
			throw new RuntimeException(e);
		}
		System.out.println("WebOnt_description_logic_661.testWebOnt_description_logic_661()");
		System.in.read();
		OWLReasoner reasoner = Factory.factory().createReasoner(premiseOntology, new SimpleConfiguration(new TimedConsoleProgressMonitor()));
		reasoner.precomputeInferences(InferenceType.values());
		Set<OWLLogicalAxiom> logicalAxioms = conclusionOntology.getLogicalAxioms();
		for (OWLLogicalAxiom ax : logicalAxioms) {
			System.out.println("checking " + ax.toString().replace("http://oiled.man.example.net/test#", ""));
			if (!reasoner.isEntailed(ax)) {
				System.out.println("WebOnt_description_logic_661.verify() Not entailed: " + ax);
			}
		}
	}
}