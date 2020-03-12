package exercicios;

import exemplos.Conta;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CorrentistaTeste {
    @Test
    public void criarCorrentista() {
        Correntista cor1 = new Correntista(342, "Guilherme");
        cor1.setEmail("guisantana0204@gmail.com");
        cor1.setTelefone("(11)95985-1403");
        assertNotNull(cor1);
    }

    @Test
    public void atributosCorrentista (){
        Correntista cor1 = new Correntista(342, "Guilherme");
        cor1.setEmail("guisantana0204@gmail.com");
        cor1.setTelefone("(11)95985-1403");
        assertNotNull(cor1.getCodigo() + cor1.getNome() + cor1.getEmail() + cor1.getTelefone());
    }

}
