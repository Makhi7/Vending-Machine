public class OverloadedVendingMachine {

  private int stockLevelForSoftDrinks = 0;
  private int stockLevelForSaltySnacks = 0;
  private int stockLevelForChocolates = 0;
  private int stockLevelForProducts = stockLevelForSoftDrinks + stockLevelForSaltySnacks + stockLevelForChocolates;

  void buy(SoftDrinks softdrink){
      System.out.println("buy 1 SoftDrink");
      stockLevelForSoftDrinks --;
      if(stockLevelForSoftDrinks < 0){
        System.out.println("Out of soft drink");
      }
  }
  void buy(SaltySnacks saltySnack){
      System.out.println("buy 1 SaltySnack");
      stockLevelForSaltySnacks --;

    if(stockLevelForSaltySnacks < 0){
      System.out.println("Out of soft salty snacks");
    }
  }

  void buy(Chocolates chocolate){
      System.out.println("buy 1 Chocolate");
      stockLevelForChocolates --;

      if(stockLevelForChocolates < 0){
      System.out.println("Out of soft chocolates");
    }
  }

  void buy(Product product){
      System.out.println("buy 1 of each product");
      stockLevelForSaltySnacks --;
      stockLevelForSoftDrinks --;
      stockLevelForChocolates --;
      if (stockLevelForProducts == 0){
        System.out.println("Out of stock");
      }
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


