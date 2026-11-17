class NegativeDimensionExcetion extends Exception{
    public NegativeDimensionExcetion(String message){
        super(message); // super class constructor is called to set the message, super is used to call the parent class constructor.
    }
}

class ThrowVsThrows{

    static float area(float length, float width) throws NegativeDimensionExcetion{ //means this method throws exception
        if(length < 0 || width <0){
            throw new NegativeDimensionExcetion ("Length or width should not be negative"); //throw exception
        }
        return length*width;
    }

    public static void main(String[] args) {
        // throw vs throws

        /*
        throw -> verb ;means throw xyz exceptio 
        throws -> adj ; means abc method throws exception and calling method must handle it using try catch block
        */

        try{
            System.out.println(area(-10.6f, 88.5f));
        } catch(NegativeDimensionExcetion e){
            System.out.println(e); //prints the message
        } finally{
            System.out.println("finally block is always executed");
        }
    }
}