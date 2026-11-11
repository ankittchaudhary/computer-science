class CoffeeMachine{
    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;

    static private CoffeeMachine machine=null; //ref for the obj

    //making constructor private means obj can not be created
    private CoffeeMachine(){
        coffeeQty=1;
        milkQty=1;
        waterQty=1;
        sugarQty=1;
    }

    //public methods
    public void fillWater(float qty){
        waterQty=qty;
    }

    public void fillSugar(float qty){
        sugarQty=qty;
    }

    public float getCoffee(){
        return 0.23f; //example
    }

    // method to create obj
    static CoffeeMachine getInstance(){
        if(machine==null){
            machine=new CoffeeMachine();
        }
        return machine;
    }
    

}


public class Singleton{
    public static void main(String[] args) {
        // Singleton class: class of which one object can be created
        // use cases: like database connection

        //CoffeeMachine machine1 = new CoffeeMachine(); //error: constructor is private and not visible here

        //how to get obj?? we have method
        CoffeeMachine machine1 = CoffeeMachine.getInstance(); //we get instance of the obj, as getInstance is pvt we can use without creating obj
        machine1.fillSugar(10);
        machine1.fillWater(20);

        System.out.println(machine1.getCoffee());
    }
}