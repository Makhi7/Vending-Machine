public class Chocolates extends Product {

    @Override
    public String description(){

        return "This is a Chocolate";
    }

    private int chocolateLevel = 0;

    Chocolates stockOfChocolate = new Chocolates();

    void addStock(Chocolates bar){
        this.stockOfChocolate = bar;
        chocolateLevel =0;
        chocolateLevel += 3;
    }

    int getStock (Chocolates chocolates){
        this.stockOfChocolate = chocolates;
        return chocolateLevel;
    }

}
