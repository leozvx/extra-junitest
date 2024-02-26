import org.junit.Assert;
import org.junit.Test;

public class ElevadorTest {

@Test
    public void testarCargaAtual() {
    Pessoa pessoa1 = new Pessoa("Pessoa1", 80.0);
    Pessoa pessoa2 = new Pessoa("Pessoa2", 84.0);
    Elevador elev = new Elevador();
    elev.entrarNoElevador(pessoa1.getPeso());
    Assert.assertEquals(82.0, elev.getCargaAtual(), 0);
    // Resultado falho.
}

@Test
public void testarCargaMax() {
    Pessoa pessoa1 = new Pessoa("Pessoa1", 201.0);
    Elevador elev = new Elevador();
    elev.entrarNoElevador(pessoa1.getPeso());
    Assert.assertEquals(false, elev.avaliarPeso(elev.getCargaAtual()));
    // Teste vai passar;
}
}