package Dersler.Bolum04NestedSiniflarveGenericYapilar.Ders7GenericBoundedTypes;

public class Main {
    public static void main(String[] args) {

        /*Integer a = null;
        NullableGeneric<Integer> n1 = new NullableGeneric<>(a);
        n1.run();*/

        /*String a = "null";
        NullableGeneric<String> n1 = new NullableGeneric<>(a);
        n1.run();*/
/*
        Double a = null;
        NullableGeneric<Double> n1 = new NullableGeneric<>(a); // Integer tanımlanırsa double kabul etmez.
        n1.run();*/

        A aObje = null;
        NullableGeneric<A> n1 = new NullableGeneric<>(aObje);
        n1.run();
        
        A a2 = new A();

    }
}
