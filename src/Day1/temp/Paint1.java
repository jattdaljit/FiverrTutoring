package Day1.temp;

public interface Paint1 {
    void color();

    default void temp() {
        System.out.println("hi");
    }
}
