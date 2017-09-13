// Boolean statement - true or false.
package FunctionalInterfaceStreamAPI;

public class Examples {

    public static void main(String[] args) {

        operateOnNumbers((x, y, z) -> x + y + z);
    }

    static void operateOnNumbers(NumOperations myDelegate) {

        int x = 12;
        int y = 13;
        int z = 14;

        int result = myDelegate.operate(x, y, z);
        System.out.println(result);
    }

    interface NumOperations {
        int operate(int x, int y, int z);
    }
}
