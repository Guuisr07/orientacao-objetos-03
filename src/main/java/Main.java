import exemplos.Conta;
import exemplos.Quadrado;
import exercicios.Circulo;
import exercicios.Correntista;
import exercicios.Retangulo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(1);
        Conta c2 = new Conta(2, 2000.00);
        Conta c3 = new Conta(3, 2000.00, 3000.00);

        Retangulo r1 = new Retangulo(10.0, 20.0);

        Circulo circulo1 = new Circulo(4.0, 3.14);

        Correntista cor1 = new Correntista(342, "Guilherme");
        cor1.setEmail("guisantana0204@gmail.com");
        cor1.setTelefone("(11)95985-1403");

        Conta c4 = Conta.criarComLimite(4, 1500.00);
        Conta c5 = Conta.criarComLimiteESaldo(5, 1500.00, 5000.00);

        Quadrado q1 = new Quadrado(20.0);
        System.out.println(q1.calcularArea());
        System.out.println(q1.calcularPerimetro());
    }
}

