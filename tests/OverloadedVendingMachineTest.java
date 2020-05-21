import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OverloadedVendingMachineTest {

    @Test
    void shouldBuyDrink() {
    SoftDrinks cocaCola = new SoftDrinks();
    OverloadedVendingMachine officeVendingMachine = new OverloadedVendingMachine(100,100,100);

    officeVendingMachine.buy(cocaCola);
    officeVendingMachine.buy(cocaCola);
    assertEquals(98,officeVendingMachine.buyCount(cocaCola));
    }


    @Test
    void shouldBuySaltySnacks() {
    SaltySnacks simba = new SaltySnacks();
    OverloadedVendingMachine officeVendingMachine = new OverloadedVendingMachine(100,100,100);

    officeVendingMachine.buy(simba);
    assertEquals(99,officeVendingMachine.buyCount(simba));


    }

    @Test
    void shouldBuyChocolate() {
     Chocolates cadbury = new Chocolates();
     OverloadedVendingMachine officeVendingMachine = new OverloadedVendingMachine(100,100,100);

     officeVendingMachine.buy(cadbury);
     officeVendingMachine.buy(cadbury);
     officeVendingMachine.buy(cadbury);
     assertEquals(97,officeVendingMachine.buyCount(cadbury));

    }

    @Test
    void testBuy2() {

    }

    @Test
    void buyCount() {
    }

    @Test
    void testBuyCount() {
    }

    @Test
    void testBuyCount1() {
    }
}