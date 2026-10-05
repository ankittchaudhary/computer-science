public class Sum {
    public static void main(String[] args) {
        // Sum in command line
        double sum =0;

        for(String x: args){
            if(x.matches("[0-9\\.]+")){
                sum=sum+Double.parseDouble(x);
            }
            else{
                System.out.println("Please enter valid number");
                return;
            }
        }

        System.out.println(sum);
    }
}
