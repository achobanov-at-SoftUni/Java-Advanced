
package JavaCollections;

import sun.reflect.generics.tree.Tree;

import java.io.PrintStream;
import java.util.*;

public class Examples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("which demo to use? ");
        String demo = input.nextLine();
        switch (demo) {
            case "array": ArrayDemo(); break;
            case "lists": ListsDemo(); break;
            case "tree": TreeSet(); break;
            case "hash": HashSet(); break;
        }
    }

    private static final String spacer = "----------------------------------------";

    private static void ArrayDemo() {

        // !!Важно!! - използвай Ingeter
        Integer[] x = new Integer[3];
        x[0] = 2;
        x[1] = 5;
        x[2] = 6;
        Arrays.sort(x, Collections.reverseOrder());
        for (int num : x) {
            System.out.println(num);
        }

        System.out.printf("Don't try to sort arrays!!!%n%s%n", spacer);
    }

    private static void ListsDemo() {

        System.out.println("#Similarities between Array and Linked Lists");
        ArrayList<String> namesArr = new ArrayList<>();
        LinkedList<String> namesLnk = new LinkedList<>();
        namesArr.add("pesho");
        namesArr.add("maria");
        namesArr.add("penka");
        namesArr.set(1, "Manol");
        namesArr.add(3, "mincho");
        for (String name : namesArr) {
            System.out.println(name);
        }
        System.out.println();

        namesLnk.add("pesho");
        namesLnk.add("maria");
        namesLnk.add("penka");
        namesLnk.set(1, "Manol");
        namesLnk.add(3, "mincho");
        for (String name : namesLnk) {
            System.out.println(name);

        }
        System.out.printf("%s%n", spacer);
    }

    private static void HashSet() {
        HashSet<String> set = new HashSet<String>() {{
            add("pesho");
            add("gosho");
            add("minka");
        }};
        System.out.println(set);
    }

    private static void TreeSet() {

        Set<String> set = new TreeSet<String>();
        set.add("Pesho");
        set.add("Tosho");
        set.add("Pesho");
        set.add("Gosho");
        set.add("Maria");
        set.add("Alice");
//        set.remove("Pesho");
        System.out.println(set);

    }
//    Еквивалент на Речниците в питон.
//    Ключ е HashSet
    private static void HashMap() {

    }
//    Ключ е TreeSet
    private static void TreeMap() {

    }

}
