package exercicios;

public class Retangulo {
    private Double base;
    private Double altura;

    public void setAltura(Double altura) {
        if(altura <= 0) {
            throw new IllegalArgumentException("O lado deve ser maior que zero.");
        }
        this.altura = altura;
    }

    public Retangulo(Double base, Double altura){
        setAltura(altura);
        setBase(base);
    }


    public void setBase(Double base){
        if(base <= 0) {
            throw new IllegalArgumentException("O lado deve ser maior que zero.");
        }
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getBase() {
        return base;
    }

    public Double calcularArea(){
        return base * altura;
    }

    public Double calcularPerimetro(){
        return 2 * (base + altura);
    }
}

