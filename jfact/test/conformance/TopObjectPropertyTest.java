package conformance;

import static org.junit.Assert.*;

import org.junit.Test;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;

public class TopObjectPropertyTest {
    @Test
    public void testReasoner3() throws OWLOntologyCreationException {
        OWLOntologyManager mngr = OWLManager.createOWLOntologyManager();
        OWLOntology ont = mngr.createOntology();
        OWLDataFactory df = mngr.getOWLDataFactory();
        OWLDataProperty p = df.getOWLDataProperty(IRI.create("http://example.com/p"));
        // just so p is known in the ontology
        mngr.applyChange(new AddAxiom(ont, df.getOWLFunctionalDataPropertyAxiom(p)));
        OWLReasonerFactory fac = Factory.factory();
        OWLReasoner r = fac.createNonBufferingReasoner(ont);
        assertTrue(r.isEntailed(df.getOWLSubClassOfAxiom(
                df.getOWLDataSomeValuesFrom(p, df.getIntegerOWLDatatype()),
                df.getOWLDataSomeValuesFrom(p, df.getTopDatatype()))));
    }

    @Test
    public void testReasoner4() throws OWLOntologyCreationException {
        OWLOntologyManager mngr = OWLManager.createOWLOntologyManager();
        OWLOntology ont = mngr.createOntology();
        OWLReasonerFactory fac = Factory.factory();
        OWLReasoner r = fac.createNonBufferingReasoner(ont);
        assertFalse(r.getTopDataPropertyNode().getEntities().isEmpty());
    }

    @Test
    public void testReasoner5() throws OWLOntologyCreationException {
        OWLOntologyManager mngr = OWLManager.createOWLOntologyManager();
        OWLOntology ont = mngr.createOntology();
        mngr.addAxiom(
                ont,
                mngr.getOWLDataFactory().getOWLDataPropertyDomainAxiom(
                        mngr.getOWLDataFactory().getOWLDataProperty(
                                IRI.create("urn:test:datap1")),
                        mngr.getOWLDataFactory().getOWLNothing()));
        OWLReasonerFactory fac = Factory.factory();
        OWLReasoner r = fac.createNonBufferingReasoner(ont);
        assertFalse(r.getBottomDataPropertyNode().getEntities().isEmpty());
        assertTrue(r.getBottomDataPropertyNode().getEntities().size() == 2);
    }
}
