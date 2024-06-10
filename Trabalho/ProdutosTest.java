import org.junit.Assert;
import org.junit.Test;

public class ProdutosTest {
    @Test
    public void testAtualizarEstoque() {
        Produto p = new Produto(1, "Camisa", "Camisa de linho", 200.00f, 10);
        Assert.assertEquals(2, p.atualizarEstoque(8));
    }
}
