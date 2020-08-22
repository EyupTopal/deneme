public class Main {
    public static void main(String[] args) {
        Product product = new Product ();

        product.name = "laptop";
        product.description = "Asus Laptop";
        product.id = 123456;
        product.price = 50;
        product.stockAmaount = 3;

        ProductManager productManager=new ProductManager ();
        productManager.add (product);
    }
}
