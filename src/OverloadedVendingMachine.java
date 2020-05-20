public class OverloadedVendingMachine {

  private int stockLevelForSoftDrinks = 0;
  private int stockLevelForSaltySnacks = 0;
  private int stockLevelForChocolates = 0;
  private int stockLevelForProducts = 0;

  void buy(SoftDrinks softdrink){
      System.out.println("buy 1 SoftDrink");
      stockLevelForSoftDrinks --;
  }
  void buy(SaltySnacks saltySnack){
      System.out.println("buy 1 SaltySnack");
      stockLevelForSaltySnacks --;
  }

  void buy(Chocolates chocolate){
      System.out.println("buy 1 Chocolate");
      stockLevelForChocolates --;
  }

  void buy(Product product){
      System.out.println("buy 1 of each product");
  }

  int buyCount(SoftDrinks softdrink){
    return stockLevelForSoftDrinks;
  }
  int buyCount(SaltySnacks saltySnack){
    return stockLevelForSaltySnacks;
  }

  int buyCount(Chocolates chocolate){
    return stockLevelForChocolates;
  }


  OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
    // set the stockLevel instance variables for each product in the constructor
    stockLevelForSoftDrinks = softDrinkQty;
    stockLevelForSaltySnacks = saltySnacksQty;
    stockLevelForChocolates = chocolatesQty;
  }
}


