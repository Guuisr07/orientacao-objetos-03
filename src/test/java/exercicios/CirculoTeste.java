package exercicios;

import exemplos.Conta;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CirculoTeste {
    @Test
    public void criarObjetoRetangulo(){
        Circulo circulo1 = new Circulo(4.0,3.14);
        assertNotNull(circulo1);
    }

    @Test
    public void presencaAtributoRaio() {
        Circulo circulo1 = new Circulo(4.0, 3.14);
        assertNotNull(circulo1.getRaio());
    }

    @Test
    public void presencaAtributoPI() {
        Circulo circulo1 = new Circulo(4.0, 3.14);
        assertNotNull(circulo1.getPi());
    }

    @Test
    public void metodoCalcularArea() {
        Circulo circulo1 = new Circulo(4.0, 3.14);
        Double valorEsperado = 50.24;
        Double valorObtido = circulo1.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro() {
        Circulo circulo1 = new Circulo(4.0, 3.14);
        Double valorEsperado = 25.12;
        Double valorObtido = circulo1.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }


}
