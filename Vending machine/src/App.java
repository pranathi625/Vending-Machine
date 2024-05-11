
import vendingmachine.*;
import item.*;
public class App {
    public static void main(String[] args) throws Exception {
       VendingMachine vendingMachine=new VendingMachine();

        System.out.println("| Fill the Inventory |");
        fillInventory(vendingMachine);
        System.out.println("| Display the Inventory |");
        displayInventory(vendingMachine);
    }
    private static void fillInventory(VendingMachine vendingMachine){
        ItemShelf[] itemShelfsSlots =vendingMachine.gInventory().getInventory();
        for(int i=0;i<itemShelfsSlots.length;i++){
            Item item=new Item();
            if(i==0){
                item.setItemType("OREO");
                item.setPrice(30);
            }
            else if(i==1){
                item.setItemType("JUICE");
                item.setPrice(40);
            }
            else if (i==2){
                item.setItemType("COKE");
                item.setPrice(45);
                
            }
            else if (i==3){
                item.setItemType("SODA");
                item.setPrice(20);
                
            }
            else if (i==4){
                item.setItemType("CHIPS");
                item.setPrice(20);
                
            }
            else if (i==7){
                item.setItemType("CHOCOLATE");
                item.setPrice(60);
                
            }
            else if (i==6){
                item.setItemType("CANDY");
                item.setPrice(5);
                
            }
            else if (i==5){
                item.setItemType("CAKE");
                item.setPrice(50);
                
            }
            itemShelfsSlots[i].setItem(item);
            itemShelfsSlots[i].setSoldOut(false);
            
        
        }
    }
    private static void displayInventory(VendingMachine vendingMachine){
        ItemShelf[] itemShelfSlots=vendingMachine.gInventory().getInventory();
        for(ItemShelf shelf:itemShelfSlots){
            System.out.println("Item Code: "+shelf.getItemCode()+"    Item: "+shelf.getItem().getType()+"    Item Price: "+shelf.getItem().getPrice()+"   isAvailable: "+shelf.isSoldOut());
        }
    }
    
}
