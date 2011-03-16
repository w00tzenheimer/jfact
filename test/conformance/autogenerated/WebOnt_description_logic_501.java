package conformance.autogenerated;

import junit.framework.TestCase;
import conformance.Factory;
import conformance.JUnitRunner;
import conformance.TestClasses;

public class WebOnt_description_logic_501 extends TestCase {
	public void testWebOnt_description_logic_501() {
		String premise = "<rdf:RDF\n" + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n" + "    xml:base=\"http://www.w3.org/2002/03owlt/description-logic/consistent501\" >\n" + "<owl:Ontology/>\n"
				+ "<owl:Class rdf:ID='TorF'> \n" + "  <owl:oneOf rdf:parseType='Collection'>\n" + "     <owl:Thing rdf:ID='T'>\n" + "        <owl:differentFrom rdf:resource='#F'/>\n" + "     </owl:Thing>\n" + "     <owl:Thing rdf:ID='F'/>\n" + "  </owl:oneOf>\n"
				+ "  <owl:oneOf rdf:parseType='Collection'>\n" + "     <owl:Thing rdf:about='#plus1'/>\n" + "     <owl:Thing rdf:about='#minus1'/>\n" + "  </owl:oneOf>\n" + "  <owl:oneOf rdf:parseType='Collection'>\n" + "     <owl:Thing rdf:about='#plus2'/>\n"
				+ "     <owl:Thing rdf:about='#minus2'/>\n" + "  </owl:oneOf>\n" + "  <owl:oneOf rdf:parseType='Collection'>\n" + "     <owl:Thing rdf:about='#plus3'/>\n" + "     <owl:Thing rdf:about='#minus3'/>\n" + "  </owl:oneOf>\n"
				+ "  <owl:oneOf rdf:parseType='Collection'>\n" + "     <owl:Thing rdf:about='#plus4'/>\n" + "     <owl:Thing rdf:about='#minus4'/>\n" + "  </owl:oneOf>\n" + "  <owl:oneOf rdf:parseType='Collection'>\n" + "     <owl:Thing rdf:about='#plus5'/>\n"
				+ "     <owl:Thing rdf:about='#minus5'/>\n" + "  </owl:oneOf>\n" + "  <owl:oneOf rdf:parseType='Collection'>\n" + "     <owl:Thing rdf:about='#plus6'/>\n" + "     <owl:Thing rdf:about='#minus6'/>\n" + "  </owl:oneOf>\n"
				+ "  <owl:oneOf rdf:parseType='Collection'>\n" + "     <owl:Thing rdf:about='#plus7'/>\n" + "     <owl:Thing rdf:about='#minus7'/>\n" + "  </owl:oneOf>\n" + "  <owl:oneOf rdf:parseType='Collection'>\n" + "     <owl:Thing rdf:about='#plus8'/>\n"
				+ "     <owl:Thing rdf:about='#minus8'/>\n" + "  </owl:oneOf>\n" + "  <owl:oneOf rdf:parseType='Collection'>\n" + "     <owl:Thing rdf:about='#plus9'/>\n" + "     <owl:Thing rdf:about='#minus9'/>\n" + "  </owl:oneOf>\n" + "</owl:Class>\n"
				+ "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus7'/>\n" + "            <rdf:Description rdf:about='#minus9'/>\n"
				+ "            <rdf:Description rdf:about='#minus8'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n"
				+ "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus1'/>\n" + "            <rdf:Description rdf:about='#plus2'/>\n" + "            <rdf:Description rdf:about='#minus8'/>\n" + "        </owl:oneOf>\n"
				+ "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus4'/>\n"
				+ "            <rdf:Description rdf:about='#plus7'/>\n" + "            <rdf:Description rdf:about='#minus5'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n"
				+ "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus2'/>\n" + "            <rdf:Description rdf:about='#plus3'/>\n"
				+ "            <rdf:Description rdf:about='#minus1'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n"
				+ "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#minus1'/>\n" + "            <rdf:Description rdf:about='#plus5'/>\n" + "            <rdf:Description rdf:about='#plus8'/>\n" + "        </owl:oneOf>\n"
				+ "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#minus8'/>\n"
				+ "            <rdf:Description rdf:about='#minus6'/>\n" + "            <rdf:Description rdf:about='#minus3'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n"
				+ "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#minus3'/>\n" + "            <rdf:Description rdf:about='#minus8'/>\n"
				+ "            <rdf:Description rdf:about='#plus7'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n"
				+ "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#minus3'/>\n" + "            <rdf:Description rdf:about='#plus6'/>\n" + "            <rdf:Description rdf:about='#plus8'/>\n" + "        </owl:oneOf>\n"
				+ "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#minus4'/>\n"
				+ "            <rdf:Description rdf:about='#minus6'/>\n" + "            <rdf:Description rdf:about='#plus8'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n"
				+ "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus6'/>\n" + "            <rdf:Description rdf:about='#plus7'/>\n"
				+ "            <rdf:Description rdf:about='#plus3'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n"
				+ "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus3'/>\n" + "            <rdf:Description rdf:about='#plus6'/>\n" + "            <rdf:Description rdf:about='#minus9'/>\n" + "        </owl:oneOf>\n"
				+ "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#minus5'/>\n"
				+ "            <rdf:Description rdf:about='#minus2'/>\n" + "            <rdf:Description rdf:about='#plus3'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n"
				+ "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus5'/>\n" + "            <rdf:Description rdf:about='#plus8'/>\n"
				+ "            <rdf:Description rdf:about='#plus2'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n"
				+ "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#minus2'/>\n" + "            <rdf:Description rdf:about='#minus7'/>\n" + "            <rdf:Description rdf:about='#minus3'/>\n" + "        </owl:oneOf>\n"
				+ "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#minus6'/>\n"
				+ "            <rdf:Description rdf:about='#minus8'/>\n" + "            <rdf:Description rdf:about='#minus5'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n"
				+ "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus2'/>\n" + "            <rdf:Description rdf:about='#plus7'/>\n"
				+ "            <rdf:Description rdf:about='#minus3'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n"
				+ "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus9'/>\n" + "            <rdf:Description rdf:about='#minus1'/>\n" + "            <rdf:Description rdf:about='#minus2'/>\n" + "        </owl:oneOf>\n"
				+ "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus1'/>\n"
				+ "            <rdf:Description rdf:about='#plus7'/>\n" + "            <rdf:Description rdf:about='#minus6'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n"
				+ "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus1'/>\n" + "            <rdf:Description rdf:about='#plus9'/>\n"
				+ "            <rdf:Description rdf:about='#minus3'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n"
				+ "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#minus8'/>\n" + "            <rdf:Description rdf:about='#minus9'/>\n" + "            <rdf:Description rdf:about='#minus2'/>\n" + "        </owl:oneOf>\n"
				+ "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#minus9'/>\n"
				+ "            <rdf:Description rdf:about='#minus8'/>\n" + "            <rdf:Description rdf:about='#plus2'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n"
				+ "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus5'/>\n" + "            <rdf:Description rdf:about='#plus8'/>\n"
				+ "            <rdf:Description rdf:about='#plus4'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n"
				+ "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#minus7'/>\n" + "            <rdf:Description rdf:about='#plus2'/>\n" + "            <rdf:Description rdf:about='#plus5'/>\n" + "        </owl:oneOf>\n"
				+ "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#minus1'/>\n"
				+ "            <rdf:Description rdf:about='#plus7'/>\n" + "            <rdf:Description rdf:about='#minus4'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n"
				+ "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus7'/>\n" + "            <rdf:Description rdf:about='#minus8'/>\n"
				+ "            <rdf:Description rdf:about='#plus4'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n"
				+ "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#minus3'/>\n" + "            <rdf:Description rdf:about='#plus2'/>\n" + "            <rdf:Description rdf:about='#minus6'/>\n" + "        </owl:oneOf>\n"
				+ "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus1'/>\n"
				+ "            <rdf:Description rdf:about='#minus2'/>\n" + "            <rdf:Description rdf:about='#minus9'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n"
				+ "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus7'/>\n" + "            <rdf:Description rdf:about='#plus3'/>\n"
				+ "            <rdf:Description rdf:about='#minus2'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n"
				+ "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#minus7'/>\n" + "            <rdf:Description rdf:about='#plus8'/>\n" + "            <rdf:Description rdf:about='#plus4'/>\n" + "        </owl:oneOf>\n"
				+ "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus1'/>\n"
				+ "            <rdf:Description rdf:about='#minus7'/>\n" + "            <rdf:Description rdf:about='#minus5'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n"
				+ "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#minus5'/>\n" + "            <rdf:Description rdf:about='#plus4'/>\n"
				+ "            <rdf:Description rdf:about='#minus3'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n"
				+ "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus6'/>\n" + "            <rdf:Description rdf:about='#plus7'/>\n" + "            <rdf:Description rdf:about='#minus1'/>\n" + "        </owl:oneOf>\n"
				+ "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#minus1'/>\n"
				+ "            <rdf:Description rdf:about='#plus7'/>\n" + "            <rdf:Description rdf:about='#minus9'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n"
				+ "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus3'/>\n" + "            <rdf:Description rdf:about='#plus2'/>\n"
				+ "            <rdf:Description rdf:about='#plus6'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n"
				+ "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus8'/>\n" + "            <rdf:Description rdf:about='#plus3'/>\n" + "            <rdf:Description rdf:about='#minus7'/>\n" + "        </owl:oneOf>\n"
				+ "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#minus1'/>\n"
				+ "            <rdf:Description rdf:about='#plus9'/>\n" + "            <rdf:Description rdf:about='#minus8'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n"
				+ "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus5'/>\n" + "            <rdf:Description rdf:about='#minus9'/>\n"
				+ "            <rdf:Description rdf:about='#minus7'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n"
				+ "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#minus7'/>\n" + "            <rdf:Description rdf:about='#plus3'/>\n" + "            <rdf:Description rdf:about='#minus9'/>\n" + "        </owl:oneOf>\n"
				+ "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus3'/>\n"
				+ "            <rdf:Description rdf:about='#minus1'/>\n" + "            <rdf:Description rdf:about='#minus2'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n"
				+ "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus6'/>\n" + "            <rdf:Description rdf:about='#plus1'/>\n"
				+ "            <rdf:Description rdf:about='#plus4'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n"
				+ "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus6'/>\n" + "            <rdf:Description rdf:about='#minus7'/>\n" + "            <rdf:Description rdf:about='#plus5'/>\n" + "        </owl:oneOf>\n"
				+ "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus8'/>\n"
				+ "            <rdf:Description rdf:about='#minus6'/>\n" + "            <rdf:Description rdf:about='#plus3'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n"
				+ "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus5'/>\n" + "            <rdf:Description rdf:about='#minus2'/>\n"
				+ "            <rdf:Description rdf:about='#plus6'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n"
				+ "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#plus8'/>\n" + "            <rdf:Description rdf:about='#plus3'/>\n" + "            <rdf:Description rdf:about='#minus5'/>\n" + "        </owl:oneOf>\n"
				+ "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "<rdf:Description rdf:about='#T'>\n" + "   <rdf:type>\n" + "      <owl:Class>\n" + "        <owl:oneOf rdf:parseType='Collection'>\n" + "            <rdf:Description rdf:about='#minus2'/>\n"
				+ "            <rdf:Description rdf:about='#minus4'/>\n" + "            <rdf:Description rdf:about='#minus9'/>\n" + "        </owl:oneOf>\n" + "      </owl:Class>\n" + "   </rdf:type>\n" + "</rdf:Description>\n" + "</rdf:RDF>";
		String conclusion = "";
		String id = "WebOnt_description_logic_501";
		TestClasses tc = TestClasses.valueOf("CONSISTENCY");
		String d = "This is the classic 3 SAT problem.";
		JUnitRunner r = new JUnitRunner(premise, conclusion, id, tc, d);
		r.setReasonerFactory(Factory.factory());
		r.run();
	}
}