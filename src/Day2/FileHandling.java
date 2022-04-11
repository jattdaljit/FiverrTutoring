package Day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileHandling {

    static String name = "daljit";
    static StringBuffer buffer = new StringBuffer("daljit");

    public static void main(String[] args) {
        // two types of exception -> checked/compile
        //
        //
        // unchecked/runtime

        try {
            readFile();
        } catch (Exception e) {
            return;
        } finally {
            System.out.println("");
        }
        // two ways of handling -> throws exception from method and pass the responsibility to calling method
        // handle the exception then and there using try catch (best possible thing)
        System.out.println();


        // try with resource
        try {
            System.out.println("");
        } catch (Exception e) {

        }

    }


    public static void readFile() throws AgeNotProperException, FileNotFoundException {
        File file = new File("src/data.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        System.out.println();
        int age = 10;
        if (age < 5) {
            throw new AgeNotProperException("The age of the user should not be less than 5!");
        }

        // 100 lines

    }
}


class AgeNotProperException extends RuntimeException {
    AgeNotProperException(String message) {
        super(message);
    }
}
