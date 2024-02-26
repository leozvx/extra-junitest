import org.junit.Assert;
import org.junit.Test;

public class ElevadorTest {

@Test
    public void testarCargaAtual() {
    Pessoa pessoa1 = new Pessoa("Pessoa1", 80.0);
    Pessoa pessoa2 = new Pessoa("Pessoa2", 84.0);
    Elevador elev = new Elevador(900.0);
    elev.entrarNoElevador(pessoa1.getPeso());
    Assert.assertEquals(82.0, elev.getCargaAtual(), 0);
    // Resultado falho.
}

@Test
public void testarCargaMax() {
    Pessoa pessoa1 = new Pessoa("Pessoa1", 201.0);
    Elevador elev = new Elevador(201.0);
    elev.entrarNoElevador(pessoa1.getPeso());
    Assert.assertEquals(false, elev.avaliarPeso(elev.getCargaAtual()));
    // Teste vai passar;
}

@Test
public void testarCincoPessoas() {
    Pessoa pessoa1 = new Pessoa("Pessoa1", 60.0);
    Pessoa pessoa2 = new Pessoa("Pessoa2", 90.0);
    Pessoa pessoa3 = new Pessoa("Pessoa3", 12.3);
    Pessoa pessoa4 = new Pessoa("Pessoa4", 70.8);
    Pessoa pessoa5 = new Pessoa("Pessoa5", 62.2);
    Elevador elev = new Elevador(500.0);
    Assert.assertEquals(true, elev.avaliarPeso(elev.getCargaAtual()));
}

}