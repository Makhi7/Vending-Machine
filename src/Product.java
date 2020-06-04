public class Product {

    public String description() {
        return "This is a product";
    }

    private int productLevel;

    Product stockOfItems = new Product();

    void addStock(Product items){

        this.stockOfItems = items;
        productLevel = 0;


    }

    int getStock (Product product){
        this.stockOfItems = product;
        return productLevel;
    }

}
