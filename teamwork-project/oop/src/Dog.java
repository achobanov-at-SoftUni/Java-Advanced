
public class Dog {

    public String breed;
    public String color;
    private String name;    // Visible only for Dog. Use 'setName' and 'getName'
    public int age;
    public char gender;

    public Dog(String name, char gender) {
        this.name = name;
        this.age = 2;
        this.breed = "{No info given}";
        this.gender = gender;
    }

    public Dog(String name,String breed, int age, char gender) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        if (name.length() < 3) {
            System.out.println("Names must have length of alteast 3 chars.");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void bark() {

        System.out.println("BauBau");
    }
}
