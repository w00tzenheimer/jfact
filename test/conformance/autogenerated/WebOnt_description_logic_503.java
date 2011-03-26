package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_description_logic_503 extends TestCase {
	public void testWebOnt_description_logic_503() {
		String premise = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:first=\"http://www.w3.org/2002/03owlt/description-logic/consistent503#\"\n"
				+ "    xml:base=\"http://www.w3.org/2002/03owlt/description-logic/consistent503\" >\n"
				+ " <owl:Ontology/>\n" + " <first:Test />\n"
				+ " <owl:Class rdf:about='#plus1'>\n"
				+ "  <owl:disjointWith>\n"
				+ "   <owl:Class rdf:about='#minus1'/>\n"
				+ "  </owl:disjointWith>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#plus2'>\n"
				+ "  <owl:disjointWith>\n"
				+ "   <owl:Class rdf:about='#minus2'/>\n"
				+ "  </owl:disjointWith>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#plus3'>\n"
				+ "  <owl:disjointWith>\n"
				+ "   <owl:Class rdf:about='#minus3'/>\n"
				+ "  </owl:disjointWith>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#plus4'>\n"
				+ "  <owl:disjointWith>\n"
				+ "   <owl:Class rdf:about='#minus4'/>\n"
				+ "  </owl:disjointWith>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#plus5'>\n"
				+ "  <owl:disjointWith>\n"
				+ "   <owl:Class rdf:about='#minus5'/>\n"
				+ "  </owl:disjointWith>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#plus6'>\n"
				+ "  <owl:disjointWith>\n"
				+ "   <owl:Class rdf:about='#minus6'/>\n"
				+ "  </owl:disjointWith>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#plus7'>\n"
				+ "  <owl:disjointWith>\n"
				+ "   <owl:Class rdf:about='#minus7'/>\n"
				+ "  </owl:disjointWith>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#plus8'>\n"
				+ "  <owl:disjointWith>\n"
				+ "   <owl:Class rdf:about='#minus8'/>\n"
				+ "  </owl:disjointWith>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#plus9'>\n"
				+ "  <owl:disjointWith>\n"
				+ "   <owl:Class rdf:about='#minus9'/>\n"
				+ "  </owl:disjointWith>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus7'/>\n"
				+ "     <rdf:Description rdf:about='#minus9'/>\n"
				+ "     <rdf:Description rdf:about='#minus8'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus1'/>\n"
				+ "     <rdf:Description rdf:about='#plus2'/>\n"
				+ "     <rdf:Description rdf:about='#minus8'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus4'/>\n"
				+ "     <rdf:Description rdf:about='#plus7'/>\n"
				+ "     <rdf:Description rdf:about='#minus5'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus2'/>\n"
				+ "     <rdf:Description rdf:about='#plus3'/>\n"
				+ "     <rdf:Description rdf:about='#minus1'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#minus1'/>\n"
				+ "     <rdf:Description rdf:about='#plus5'/>\n"
				+ "     <rdf:Description rdf:about='#plus8'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#minus8'/>\n"
				+ "     <rdf:Description rdf:about='#minus6'/>\n"
				+ "     <rdf:Description rdf:about='#minus3'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#minus3'/>\n"
				+ "     <rdf:Description rdf:about='#minus8'/>\n"
				+ "     <rdf:Description rdf:about='#plus7'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#minus3'/>\n"
				+ "     <rdf:Description rdf:about='#plus6'/>\n"
				+ "     <rdf:Description rdf:about='#plus8'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#minus4'/>\n"
				+ "     <rdf:Description rdf:about='#minus6'/>\n"
				+ "     <rdf:Description rdf:about='#plus8'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus6'/>\n"
				+ "     <rdf:Description rdf:about='#plus7'/>\n"
				+ "     <rdf:Description rdf:about='#plus3'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus3'/>\n"
				+ "     <rdf:Description rdf:about='#plus6'/>\n"
				+ "     <rdf:Description rdf:about='#minus9'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#minus5'/>\n"
				+ "     <rdf:Description rdf:about='#minus2'/>\n"
				+ "     <rdf:Description rdf:about='#plus3'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus5'/>\n"
				+ "     <rdf:Description rdf:about='#plus8'/>\n"
				+ "     <rdf:Description rdf:about='#plus2'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#minus2'/>\n"
				+ "     <rdf:Description rdf:about='#minus7'/>\n"
				+ "     <rdf:Description rdf:about='#minus3'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#minus6'/>\n"
				+ "     <rdf:Description rdf:about='#minus8'/>\n"
				+ "     <rdf:Description rdf:about='#minus5'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus2'/>\n"
				+ "     <rdf:Description rdf:about='#plus7'/>\n"
				+ "     <rdf:Description rdf:about='#minus3'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus9'/>\n"
				+ "     <rdf:Description rdf:about='#minus1'/>\n"
				+ "     <rdf:Description rdf:about='#minus2'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus1'/>\n"
				+ "     <rdf:Description rdf:about='#plus7'/>\n"
				+ "     <rdf:Description rdf:about='#minus6'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus1'/>\n"
				+ "     <rdf:Description rdf:about='#plus9'/>\n"
				+ "     <rdf:Description rdf:about='#minus3'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#minus8'/>\n"
				+ "     <rdf:Description rdf:about='#minus9'/>\n"
				+ "     <rdf:Description rdf:about='#minus2'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#minus9'/>\n"
				+ "     <rdf:Description rdf:about='#minus8'/>\n"
				+ "     <rdf:Description rdf:about='#plus2'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus5'/>\n"
				+ "     <rdf:Description rdf:about='#plus8'/>\n"
				+ "     <rdf:Description rdf:about='#plus4'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#minus7'/>\n"
				+ "     <rdf:Description rdf:about='#plus2'/>\n"
				+ "     <rdf:Description rdf:about='#plus5'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#minus1'/>\n"
				+ "     <rdf:Description rdf:about='#plus7'/>\n"
				+ "     <rdf:Description rdf:about='#minus4'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus7'/>\n"
				+ "     <rdf:Description rdf:about='#minus8'/>\n"
				+ "     <rdf:Description rdf:about='#plus4'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#minus3'/>\n"
				+ "     <rdf:Description rdf:about='#plus2'/>\n"
				+ "     <rdf:Description rdf:about='#minus6'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus1'/>\n"
				+ "     <rdf:Description rdf:about='#minus2'/>\n"
				+ "     <rdf:Description rdf:about='#minus9'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus7'/>\n"
				+ "     <rdf:Description rdf:about='#plus3'/>\n"
				+ "     <rdf:Description rdf:about='#minus2'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#minus7'/>\n"
				+ "     <rdf:Description rdf:about='#plus8'/>\n"
				+ "     <rdf:Description rdf:about='#plus4'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus1'/>\n"
				+ "     <rdf:Description rdf:about='#minus7'/>\n"
				+ "     <rdf:Description rdf:about='#minus5'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#minus5'/>\n"
				+ "     <rdf:Description rdf:about='#plus4'/>\n"
				+ "     <rdf:Description rdf:about='#minus3'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus6'/>\n"
				+ "     <rdf:Description rdf:about='#plus7'/>\n"
				+ "     <rdf:Description rdf:about='#minus1'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#minus1'/>\n"
				+ "     <rdf:Description rdf:about='#plus7'/>\n"
				+ "     <rdf:Description rdf:about='#minus9'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus3'/>\n"
				+ "     <rdf:Description rdf:about='#plus2'/>\n"
				+ "     <rdf:Description rdf:about='#plus6'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus8'/>\n"
				+ "     <rdf:Description rdf:about='#plus3'/>\n"
				+ "     <rdf:Description rdf:about='#minus7'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#minus1'/>\n"
				+ "     <rdf:Description rdf:about='#plus9'/>\n"
				+ "     <rdf:Description rdf:about='#minus8'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus5'/>\n"
				+ "     <rdf:Description rdf:about='#minus9'/>\n"
				+ "     <rdf:Description rdf:about='#minus7'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#minus7'/>\n"
				+ "     <rdf:Description rdf:about='#plus3'/>\n"
				+ "     <rdf:Description rdf:about='#minus9'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus3'/>\n"
				+ "     <rdf:Description rdf:about='#minus1'/>\n"
				+ "     <rdf:Description rdf:about='#minus2'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus6'/>\n"
				+ "     <rdf:Description rdf:about='#plus1'/>\n"
				+ "     <rdf:Description rdf:about='#plus4'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus6'/>\n"
				+ "     <rdf:Description rdf:about='#minus7'/>\n"
				+ "     <rdf:Description rdf:about='#plus5'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus8'/>\n"
				+ "     <rdf:Description rdf:about='#minus6'/>\n"
				+ "     <rdf:Description rdf:about='#plus3'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus5'/>\n"
				+ "     <rdf:Description rdf:about='#minus2'/>\n"
				+ "     <rdf:Description rdf:about='#plus6'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#plus8'/>\n"
				+ "     <rdf:Description rdf:about='#plus3'/>\n"
				+ "     <rdf:Description rdf:about='#minus5'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n"
				+ " <owl:Class rdf:about='#Test'>\n" + "  <rdfs:subClassOf>\n"
				+ "   <owl:Class>\n"
				+ "    <owl:unionOf rdf:parseType='Collection'>\n"
				+ "     <rdf:Description rdf:about='#minus2'/>\n"
				+ "     <rdf:Description rdf:about='#minus4'/>\n"
				+ "     <rdf:Description rdf:about='#minus9'/>\n"
				+ "    </owl:unionOf>\n" + "   </owl:Class>\n"
				+ "  </rdfs:subClassOf>\n" + " </owl:Class>\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_description_logic_503";
		TestClasses tc = TestClasses.valueOf("CONSISTENCY");
		String d = "This is a different encoding of test 501.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}