package com.chassagnes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompteEpargneTest {


    CompteEpargne compte = new CompteEpargne("512","Michel", 100, 12);
    @Test
    void get_txInteret() {
        assertEquals(12,compte.get_txInteret());
    }


    @Test
    void set_txInteret() {
        compte.set_txInteret(15);
        assertEquals(15,compte.get_txInteret());
    }

    @Test
    void CalculerInteret() {
        compte.CalculerInteret();
        assertEquals(1200, compte.get_solde());
    }


}