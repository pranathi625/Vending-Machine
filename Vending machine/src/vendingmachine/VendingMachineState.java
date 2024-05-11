package vendingmachine;
import java.util.*;
import item.Item;
import coin.*;
public class VendingMachineState {
    public VendingMachineState(){
        System.out.println("Currently machine is in Idle state");

    }
    public void clickOnstartProductSelectionButton(){
        System.out.println("Vending Machine is in HasMoneyState");
        
    }
    public void insertCoin(VendingMachine vendingMachine,Coin coin){
        System.out.println("Vending Machine is in HasMoneyState");
        System.out.println("Accepted the coin");
        vendingMachine.getCoinList().add(coin);
    }
    
    public List<Coin> refundFullMoneyy(VendingMachine vendingMachine){
        System.out.println("Returned the full amount back in the coin dispence tray");
        vendingMachine.setVendingMachineState(new VendingMachineState());
        return vendingMachine.getCoinList();
    }
    public void updateInventory(VendingMachine vendingMachine,Item item,int itemCodeNumber){
        vendingMachine.gInventory().addItem(item,itemCodeNumber);

    }
    public void dispenseProduct(VendingMachine vendingMachine,int itemCodeNumber){
        System.out.println("Currently vending Machine is in Dispense State");
        System.out.println("Product has been dispense");
        vendingMachine.gInventory().updateSoldOutItem(itemCodeNumber);
        vendingMachine.setVendingMachineState(new VendingMachineState());

    }
    public void getChange(int itemPrice, int paidByuser){
            System.out.println("Returned the change in the coin Dispence Tray:  "+(paidByuser-itemPrice ));
    }
    public void chooseProduct(VendingMachine vendingMachine,int itemCodeNumber){
        Item item=vendingMachine.gInventory().getItem(itemCodeNumber);
        int paidByuser=0;
        for(Coin coin:vendingMachine.getCoinList()){
            paidByuser+=coin.getValue();
        }
        if(item.getPrice()>paidByuser){
            refundFullMoneyy(vendingMachine);
            return;
        }
        else{
            getChange(item.getPrice(),paidByuser);
            dispenseProduct(vendingMachine, itemCodeNumber);
            return;
        }

           

    }

}
