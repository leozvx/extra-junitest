public class Pessoa {

private String nome;
private double peso;
    public Pessoa(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
