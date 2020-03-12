package exercicios;

public class Correntista {
    private Integer codigo;
    private String nome;
    private String email;
    private String telefone;

    public Correntista( Integer codigo, String nome){
        setCodigo(codigo);
        setNome(nome);
    }


    public void setCodigo(Integer codigo) {
        if(codigo <= 0) {
            throw new IllegalArgumentException("Deve haver um valor para o codigo");
        }
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}


