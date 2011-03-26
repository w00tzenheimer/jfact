package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_equivalentClass_009 extends TestCase {
	public void testWebOnt_equivalentClass_009() {
		String premise = "<rdf:RDF\n"
				+ "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
				+ "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
				+ " xml:base=\"http://www.w3.org/2002/03owlt/equivalentClass/consistent009\" >\n"
				+ " \n" + "   <owl:Ontology/>\n"
				+ " <owl:Class rdf:nodeID=\"a\">\n"
				+ "   <owl:oneOf rdf:parseType=\"Collection\">\n"
				+ "      <owl:Thing rdf:ID=\"A\"/>\n" + "   </owl:oneOf>\n"
				+ "   <owl:equivalentClass>   \n"
				+ "     <owl:Class rdf:nodeID=\"b\">\n"
				+ "       <owl:unionOf rdf:parseType=\"Collection\">\n"
				+ "          <owl:Class rdf:ID=\"B\"/>\n"
				+ "       </owl:unionOf>\n" + "     </owl:Class>\n"
				+ "   </owl:equivalentClass>  \n"
				+ "   <owl:equivalentClass>    \n"
				+ "     <owl:Class rdf:nodeID=\"c\">\n"
				+ "       <owl:intersectionOf rdf:parseType=\"Collection\">\n"
				+ "          <owl:Class rdf:ID=\"C\"/>\n"
				+ "       </owl:intersectionOf>\n" + "     </owl:Class>\n"
				+ "   </owl:equivalentClass>  \n"
				+ "   <owl:equivalentClass>    \n"
				+ "     <owl:Class rdf:nodeID=\"d\">\n"
				+ "       <owl:complementOf>\n"
				+ "          <owl:Class rdf:ID=\"D\"/>\n"
				+ "       </owl:complementOf>\n" + "     </owl:Class>\n"
				+ "   </owl:equivalentClass>  \n" + "\n" + " </owl:Class>\n"
				+ "\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_equivalentClass_009";
		TestClasses tc = TestClasses.valueOf("CONSISTENCY");
		String d = "A possible mapping of the EquivalentClasses axiom,\n"
				+ "which is connected but without a Hamiltonian path.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}