package school;

public class Teacher {
    public Teacher(){
        //here Teacher is in same package as Student so testing access modifiers here
        // a: default, b: private, c: protected, d: public
        Student s = new Student();
        System.out.println(s.a); //accessible as default is accessible within same package
        //System.out.println(s.b); //b is private so not accessible outside class
        System.out.println(s.c); //accessible as protected accessible everywhere in same package, also in different package subclass
        System.out.println(s.d); //accessible everywhere
    }
}
