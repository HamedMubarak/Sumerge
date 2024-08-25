package browser;

import pages.Cart;
import pages.Home;
import pages.Login;
import pages.Product;

public class Browser {

    public Login login;
    public Home home;
    public Product product;
    public Cart cart;

    public Browser() {
        login = new Login();
        home = new Home();
        product = new Product();
        cart = new Cart();
    }
}
