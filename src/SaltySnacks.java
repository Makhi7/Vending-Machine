public class SaltySnacks extends Product {

    @Override
    public String description(){

        return "This is a Salty Snack";
    }

    private int saltySnackLevel = 0;


    SaltySnacks stockOfCrisps = new SaltySnacks();

    void addStock(SaltySnacks crisps){
        this.stockOfCrisps = crisps;
        saltySnackLevel = 0;
        saltySnackLevel += 3;
    }

    int getStock (SaltySnacks saltySnacks){
        this.stockOfCrisps = saltySnacks;
        return saltySnackLevel;
    }

}
