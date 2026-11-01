
- Abstract classes are useful for defining standards and providing a base for other classes to inherit from.
- Abstract classes are meant for inheritance and cannot be instantiated directly.
- we can not create an obj of an abstract class, but we can create or use as reference type for a derived class object.
- Abstract methods do not have a body and must be implemented by derived classes.

- Without overriding all methods of an absract class the child class will also be absract, so override all its methods to make it concrete.

## Example
Government crafted some standards for Hospitals that this this services each hostipat should provide like: emergency, appointment, admit, billing etc

so actual hospital can extend those standards

//standards
absract class Hospital{
    abstract void emergency();
    abstract void admin();
    abstract void appointment();
    abstract void billing();
}

//actual hospital let say MyHospital will override
class MyHosptal extends Hospital{
    //const

    //override methods
}

Hospital h = new MyHospital();