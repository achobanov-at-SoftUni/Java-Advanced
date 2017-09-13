package SaveCustomObjectToFile;

import java.io.Serializable;

public class JavaCourse implements Serializable {

    private static String name = "java basics";
    private static int students = 200;

    private static void Info() {

        System.out.printf("Course %s has %d students", name, students);
    }
}
