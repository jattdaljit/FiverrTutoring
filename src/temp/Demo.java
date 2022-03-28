package temp;

import demo2.Animal;

public class Demo{

    public void m () {
        Animal animal = new Animal("", 1);
        // not able to access breed variable as its protected and we are in different package
        // and its not a subclass of Animal
        //animal.breed this is not possible
    }
}
