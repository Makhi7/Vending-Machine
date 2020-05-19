public class OverloadedVendingMachine {
  void buy(SoftDrinks softdrink){
      System.out.println("buy 1 SoftDrink");
  }
  void buy(SaltySnacks saltySnack){
      System.out.println("buy 1 SaltySnack");
  }

  void buy(Chocolates chocolate){
      System.out.println("buy 1 Chocolate");
  }

  void buy(Product product){
      System.out.println("buy 1 of each product");
  }

  private int stockLevel;

  OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
    // set the stockLevel instance variables for each product in the constructor
    stockLevel = softDrinkQty;
    stockLevel = saltySnacksQty;
    stockLevel = chocolatesQty;
  }
}


