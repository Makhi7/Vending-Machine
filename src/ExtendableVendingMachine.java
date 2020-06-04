public class ExtendableVendingMachine {

    Product obj = new Product();
    void buy (Product item){

        this.obj = item;

        if (item instanceof SoftDrinks){
            System.out.println("Buying a soda");
        }
        else if (item instanceof SaltySnacks){
            System.out.println("Buying a packet of chips");
        }
        else if(item instanceof Chocolates){
            System.out.println("Buying a chocolate");
        }
    }

    private int stockLevelOfSoftdrinks;
    private int stockLevelOfSaltySnacks;
    private int stockLevelOfChocolate;

    ExtendableVendingMachine(int stockLevelOfSaltySnacks,int stockLevelOfChocolate,int stockLevelOfSoftdrinks ){

    }

}
