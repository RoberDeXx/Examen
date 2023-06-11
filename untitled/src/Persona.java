


public class Persona {
    private final String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}


public class CompareWithEquals {
    class CompareWithEquals {

        public static void main(String... argv) {

            @@ -23,7 +17,7 @@ public static void main(String... argv) {
                String s1 = "hola";
                String s2 = s1;
                String s3 = "hola";
                String s4 =  new String("hola"); // aunque el IDE sugiere no hacer explicita la instancia,...
                String s4 = new String("hola"); // aunque el IDE sugiere no hacer explicita la instancia,...

                System.out.println(s1 == s2); // true
                System.out.println(s1 == s3); // true
                System.out.println(s1 == s4); // false: referencias distintas
                System.out.println(s1.equals(s2)); // true
                System.out.println(s1.equals(s3));  // true
                System.out.println(s1.equals(s4)); // true: referencias distintas a objetos iguales
            }
        }