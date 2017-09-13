package TextEditingAndRegularExpressions;

public class Examples {

    public static void main(String[] args) {

        String name = "Hello";      // Array of chars
        StringBuilder sbuilder = new StringBuilder();    // List of Strings
        sbuilder.append("Hello from the other side!\n");
        sbuilder.append("It's me.");
        System.out.println(sbuilder);

        String adelle = sbuilder.toString();
        int startIndex = adelle.indexOf("from");
        int endIndex = startIndex + 4;
        System.out.println(adelle.substring(startIndex, endIndex));
        System.out.println(adelle.toUpperCase());
        System.out.println(adelle.toLowerCase());
        System.out.println(adelle.replace("Hello", "Bye bye"));     // Returns new string
        adelle += "      ";
        System.out.println(adelle.trim() + "d");
        String languages = "C#, Java, JavaScript; HTML, CSS C++";
        String[] arrLangs = languages.split("[, ;]+");
        for (String var : arrLangs) {
            System.out.println(var);
        }
    }
}
