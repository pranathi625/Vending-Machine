package item;

public enum ItemType {
    OREO("OREO"),
    JUICE("JUICE"),
    COKE("COKE"),
    SODA("SODA"),
    CHIPS("CHIPS"),
    CHOCOLATE("CHOCOLATE"),
    CANDY("CANDY"),
    CAKE("CAKE");
     private final String type;
    
     ItemType(String type){
        this.type=type;
     }
     public String getType(){
        return this.type;
     }
}
