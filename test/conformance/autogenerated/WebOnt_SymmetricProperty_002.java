package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_SymmetricProperty_002 extends TestCase {
	public void testWebOnt_SymmetricProperty_002() {
		String premise = "<rdf:RDF\n" + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n" + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ "    xmlns:first=\"http://www.w3.org/2002/03owlt/SymmetricProperty/premises002#\"\n" + "    xml:base=\"http://www.w3.org/2002/03owlt/SymmetricProperty/premises002\" >\n" + "\n" + "    <owl:Ontology/>\n" + "\n"
				+ "    <owl:InverseFunctionalProperty rdf:about=\"#equalityOnA\">\n" + "      <rdfs:range>\n" + "         <owl:Class rdf:ID=\"A\">\n" + "           <owl:oneOf rdf:parseType=\"Collection\">\n" + "              <owl:Thing rdf:ID=\"a\"/>\n"
				+ "              <owl:Thing rdf:ID=\"b\"/>\n" + "           </owl:oneOf>\n" + "         </owl:Class>\n" + "      </rdfs:range>\n" + "    </owl:InverseFunctionalProperty>\n" + "\n" + "    <owl:Thing rdf:about=\"#a\">\n"
				+ "      <first:equalityOnA rdf:resource=\"#a\"/>\n" + "    </owl:Thing>\n" + "    <owl:Thing rdf:about=\"#b\">\n" + "      <first:equalityOnA rdf:resource=\"#b\"/>\n" + "    </owl:Thing>\n" + "\n" + "    <owl:Thing rdf:ID=\"c\"/>\n" + "\n" + "</rdf:RDF>";
		String conclusion = "<rdf:RDF\n" + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n" + "    xmlns:first=\"http://www.w3.org/2002/03owlt/SymmetricProperty/premises002#\"\n"
				+ "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n" + "    xml:base=\"http://www.w3.org/2002/03owlt/SymmetricProperty/conclusions002\" >\n" + "\n" + "   <owl:Ontology/>\n" + "\n" + "   <owl:SymmetricProperty rdf:about=\"premises002#equalityOnA\">\n"
				+ "     <rdfs:domain>\n" + "        <owl:Class>\n" + "          <owl:oneOf rdf:parseType=\"Collection\">\n" + "             <owl:Thing rdf:about=\"premises002#a\"/>\n" + "             <owl:Thing rdf:about=\"premises002#b\"/>\n"
				+ "             <owl:Thing rdf:about=\"premises002#c\"/>\n" + "          </owl:oneOf>\n" + "        </owl:Class>\n" + "     </rdfs:domain>\n" + "   </owl:SymmetricProperty>\n" + "\n" + "   <owl:Thing rdf:about=\"premises002#a\">\n"
				+ "     <first:equalityOnA rdf:resource=\"premises002#a\"/>\n" + "   </owl:Thing>\n" + "\n" + "</rdf:RDF>";
		String id = "WebOnt_SymmetricProperty_002";
		TestClasses tc = TestClasses.valueOf("POSITIVE_IMPL");
		String d = "Test illustrating extensional semantics of <code>owl:SymmetricProperty</code>.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}