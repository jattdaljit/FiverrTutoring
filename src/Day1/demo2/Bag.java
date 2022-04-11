package Day1.demo2;

import Day1.temp.Paint;
import Day1.temp.Paint1;

public abstract class Bag {

    // concrete methods
    public void compartments() {

    }

    // abstract method
    abstract public void temp();
}

class Purse extends Bag {

     @Override
     public void temp() {

     }
 }

 class A implements Paint, Paint1 {

     @Override
     public void color() {

     }

     @Override
     public void temp() {
         Paint1.super.temp();
     }

 }
