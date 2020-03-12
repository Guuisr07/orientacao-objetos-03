package exercicios;

public class Circulo {
    private Double area;
    private Double raio;
    private Double pi;

    public Circulo(Double raio, Double pi){
        setPi(pi);
        setRaio(raio);
    }


    public void setRaio(Double raio){
        if(raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero.");
        }
        this.raio = raio;
    }

    public void setPi(Double pi){
        if(pi <= 0) {
            throw new IllegalArgumentException("O valor de PI deve ser maior que zero.");
        }
        this.pi = pi;
    }

    public Double getRaio() {
        return raio;
    }

    public Double getPi() {
        return pi;
    }

    public Double calcularArea(){
        return area = pi * (raio * raio);

    }

    public Double calcularPerimetro(){
        return 2 * (pi * raio);
    }
}


