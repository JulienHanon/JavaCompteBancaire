package com.chassagnes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    Client client = new Client ("oui", "non", "23 Rue pierre semard");


    @Test
    void get_nom() {
        assertEquals("oui",client.get_nom());
    }

    @Test
    void get_prenom() {
        assertEquals("non",client.get_prenom());
    }

    @Test
    void get_adresse() {
        assertEquals("23 Rue pierre semard",client.get_adresse());
    }

    @Test
    void set_adresse() {
        client.set_adresse("pogland");
        assertEquals("pogland",client.get_adresse());
    }
}