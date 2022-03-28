package demo2;

// accessSpecifier {extraThing can be final/static or both} class NameOfTheClass { }
public class Tutor {
    // variable -> class level variables / instance level variable
    // methods

    // clean code practices -> Give appropriate variable name which tell the purpose of variable
    // accessSpecifier {extraThing} DataType variableName; -> declaration of variable
    public int age;
    int width = 200;
    public int salary = 100;

    // datatype - int, long, float, double, char -> '', boolean, String -> ""
    // wrapper classes -> Integer, Long, Float, Double, Character
    // BigInteger, BigDecimal, 1.0, 1.66666666666666, 'a' 'b' , '\n', true, false, "1";

    // variable with default scope;
    Integer height = Integer.valueOf("1");


    // method
    //  m1() -> 2 m() -> 1  ///  m() m1()
    // print("daljit", 1);

    //accessSpecifier  {extraThing} returnType-dataType  nameOfMethod (Datatype variableName, Datatype variableName...) {}
    // if a method doesn't return anything -> then returnType should be void -> no return statement is needed
    // if a method return anything -> then there should always be a return statement which return something of return datatype
    // overloading is also called as compile time polymorphism
    // overloading is the concept of having methods with same name but different parameter list.
    public int print() {
        int age = 10;
        if (age > 10) {
            return 1;
        }
        return 0;
    }

    public void m() {

    }

    public int print(String name, int age) {
        int width = 10;
        System.out.println(this.width);
        Tutor tutor = new Tutor(1);
        return 0;
    }

    // constructor -> its a special type of method which has same name as the class and not return type;
    //accessSpecifier  nameOfMethod (Datatype variableName, Datatype variableName...)
    // default constructor
//    public demo2.Tutor() {
//
//    }
    // overloaded constructor / parameterized constructor
    public Tutor(int age) {
        this(1, "");
        this.age = age;
        System.out.println(this.age);
    }

    public Tutor(int age, String name) {

    }
    // this keyword -> refer to class level variables and methods;
    // static keyword -> can be used with class / methods/ variables;

    // main
    public static void main(String[] args) {
        // statements in java are executed one after the other.
        // m()
        //
    }

    // final keyword
    // when used with class , the class cannot be inherited
    // when used with variables , value cannot be changed
    // when used with methods, methods cannot be overridden.
}


class Dog extends Animal {
    // super();

    int age = 100;


    public Dog(String nameOfAnimal, int age) {
        super(nameOfAnimal, age);
        this.age = age;
        super.printHello();
        System.out.println(super.age);
        System.out.println(this.age);
        System.out.println(age);
        System.out.println(super.nameOfAnimal);
    }


    public String nameOfAnimal = "animal";
    public void print() {
        System.out.println(nameOfAnimal);
        printHello();
    }

    // extra methods can be written in subclasses. It acts as a normal class.
    public void anything() {

    }
}
