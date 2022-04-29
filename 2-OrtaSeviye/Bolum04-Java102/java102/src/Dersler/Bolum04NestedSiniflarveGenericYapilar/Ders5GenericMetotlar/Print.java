package Dersler.Bolum04NestedSiniflarveGenericYapilar.Ders5GenericMetotlar;

public class Print {
    public static <T,U> void printArray(T[] arr,U[] arr2) {
        for (T t : arr) {
            System.out.println(t);
        }
        for (U u : arr2) {
            System.out.println(u);
        }
    }
}
