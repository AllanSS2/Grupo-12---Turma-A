package Teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class EscolhaEspadaTest {

    @Test
    public void testEscolherEspadaValidChoice() {
        String[] espadas = {"Espada Longa", "Espada Curta", "Espada Bastarda", "Katana", "Sabre"};
        assertEquals("Espada Longa", EscolhaEspada.escolherEspada(espadas, 0));
        assertEquals("Katana", EscolhaEspada.escolherEspada(espadas, 3));
        assertEquals("Sabre", EscolhaEspada.escolherEspada(espadas, 4));
    }

    @Test
    public void testEscolherEspadaInvalidChoice() {
        String[] espadas = {"Espada Longa", "Espada Curta", "Espada Bastarda", "Katana", "Sabre"};
        assertThrows(IllegalArgumentException.class, () -> {
            EscolhaEspada.escolherEspada(espadas, -1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            EscolhaEspada.escolherEspada(espadas, 5);
        });
    }
}