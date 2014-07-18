import org.junit.Assert;
import org.junit.Test;

public class SupermarketSpec {

    @Test
    public void itAddsAProductToShoppingCart() throws Exception {

        ShoppingCart cart = new ShoppingCart();

        cart.add("Dove Soap", 30, 5);

        Assert.assertEquals("Dove Soap", cart.getProductName());
        Assert.assertEquals(30, cart.getPrice());
        Assert.assertEquals(5, cart.getQty());

        Assert.assertEquals(150, cart.getTotalPrice());

    }
}
