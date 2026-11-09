class HondaCity{
    static long price=10;
}

public class StaticVariables{
    public static void main(String[] args) {
        
        System.out.println(HondaCity.price); //10  //directly called without creating obj of class

        // static variables are shared globally to all the objects
        HondaCity h1 = new HondaCity();
        HondaCity h2 = new HondaCity();

        System.out.println(h1.price); //10
        System.out.println(h2.price); //10
    }
}