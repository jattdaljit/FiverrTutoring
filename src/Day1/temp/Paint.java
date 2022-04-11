package Day1.temp;

public interface Paint {
    int age = 0;
    void color();


    default void temp() {
        System.out.println("hello");
    }


}
