package Dersler.Bolum4NestedSiniflarveGenericYapilar.Ders3AutoboxingveUnboxing;

public class Main {
    public static void main(String[] args) {
        int a = 10;

        // Autoboxing
        Integer b = a; // Java "Integer.valueOf(a)" bu şekilde yazar

        // Boxing
        Integer c = Integer.valueOf(a);

        // AutoUnboxing
        int d = c; // c.intValue();

        // Unboxing
        int i = c.intValue();

        System.out.println(d);

    }
}
