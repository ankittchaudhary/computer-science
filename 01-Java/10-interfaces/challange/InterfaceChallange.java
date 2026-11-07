package challange;

class Store{
    Member mb[] = new Member[100];
    private int count = 0;

    void register(Member m){
        mb[count++]=m;

    }

    void inviteSale(){
        for(int i =0; i<count; i++){
            mb[i].callback();
        }
    }
}

interface Member{
    void callback();
}

class Customer implements Member{
    String name;
    Customer(String name){
        this.name=name;
    }
    public void callback(){
        System.out.println("I will visit "+name);
    }
}

public class InterfaceChallange {
    public static void main(String[] args) {
        //
        Store str = new Store();
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Cena");
        Customer c3 = new Customer("Singh");  //regular customer

        str.register(c1); //register for member
        str.register(c2);

        //invite 
        str.inviteSale(); //only those who registered
    }
}
