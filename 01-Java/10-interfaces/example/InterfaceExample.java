package example;

class Phone{
    public void call(){
        System.out.println("Phone Call");
    }
    public void sms(){
        System.out.println("Phone SMS Service");
    }
}

//Interfaces
interface ICamera{
    void click();
    void record();
}

interface IMusicPlayer{
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer{
    //own methods
    public void videoCall(){
        System.out.println("Smart Phone making video calls");
    }

    //implementing the interfaces: must implement all methods of the interface
    public void click(){
        System.out.println("Smart Phone clicking photos");
    }
    public void record(){
        System.out.println("Smart Phone recording video");
    }
    public void play(){
        System.out.println("Smart Phone playing music");
    }
    public void stop(){
        System.out.println("Smart Phone stop music");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        //
        SmartPhone sp = new SmartPhone();
        //for sp all methods are available

        Phone p = new SmartPhone();
        //for p only call and sms will be available

        ICamera cm = new SmartPhone();
        //for cm click and record will be there

    }
}
