
public class Main {

    public static void main(String[] args) {
        Dog rex = new Dog("Rex", "Shepard", 1, 'm');
        Dog shara = new Dog("Shara", "Pincher", 1, 'f');
        Dog charlie = new Dog("Chalie", 'f');

        System.out.println(rex.age);
        System.out.println(rex.getName());
        System.out.println(rex.breed);
        System.out.println(rex.gender);

//        rex.name = "Pesho";
        System.out.println(rex.getName());
        rex.setName("Horse");
        System.out.println(rex.getName());


        rex.bark();
    }
}
