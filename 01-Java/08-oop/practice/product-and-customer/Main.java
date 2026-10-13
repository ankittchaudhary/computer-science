class Product{
    private String itemNumber;
    private String itemName;
    private int itemPrice;
    private int itemQuanity;
    private boolean isItemInStock;

    private static int itemInc = 001;

    //constructors
    public Product(String name, int price, int quanity){
        this.itemNumber = "ITM"+ itemInc++;
        this.itemName=name;
        this.itemPrice=price;
        this.itemQuanity=quanity;
    }

    // item number get only
    public String getItemNumber(){
        return itemNumber;
    }
    public String getItemName(){
        return itemName;
    }
    public int getItemPrice(){
        return itemPrice;
    }
    public void setItemPrice(int price){
        this.itemPrice=price;
    }

    public int getItemQuanity(){
        return itemQuanity;
    }
    public void setItemQuantity(int quantity){
        this.itemQuanity=itemQuanity+quantity;
    }

    public boolean isItemInStock(){
        isItemInStock = itemQuanity>0? true: false;
        return isItemInStock;
    }
}

public class Main {
    public static void main(String[] args) {
        // Constructor practice
        Product p1 = new Product("Macbook pro m4 pro", 149000, 6);
        System.out.println(p1.getItemNumber());
        System.out.println(p1.getItemName());
        System.out.println(p1.getItemPrice());
        System.out.println(p1.getItemQuanity());
        System.out.println(p1.isItemInStock());

        System.out.println("===========================================");
        Product p2 = new Product("Macbook pro m5 pro", 169000, 0);
        System.out.println(p2.getItemNumber());
        System.out.println(p2.getItemName());
        System.out.println(p2.getItemPrice());
        System.out.println(p2.getItemQuanity());
        System.out.println(p2.isItemInStock());
    }
}
