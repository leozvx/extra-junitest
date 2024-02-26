public class Elevador {
private int id;
private double cargaMaxima = 201.0;
private double cargaAtual;
private boolean sinalAlerta;

    public Elevador() {
        this.id = id;
        this.cargaMaxima = cargaMaxima;
        this.cargaAtual = cargaAtual;
        this.sinalAlerta = sinalAlerta;
    }

    public double entrarNoElevador(Double peso) {
        Calculadora calc = new Calculadora();
        return this.cargaAtual = calc.somar(cargaAtual, peso);
    }

    public double sairDoElevador(double peso) {
        Calculadora calc = new Calculadora();
        return this.cargaAtual = calc.somar(cargaAtual, peso);
    }
    public boolean avaliarPeso(double peso) {
        return cargaAtual > cargaMaxima;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(double cargaAtual) {
        this.cargaAtual = cargaAtual;
    }

    public boolean isSinalAlerta() {
        return sinalAlerta;
    }

    public void setSinalAlerta(boolean sinalAlerta) {
        this.sinalAlerta = sinalAlerta;
    }
}
