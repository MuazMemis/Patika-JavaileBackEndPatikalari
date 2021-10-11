package Dersler.Bolum4NestedSiniflarveGenericYapilar.Ders4GenericSiniflar;

public class Main {
    public static void main(String[] args) {
/*        // undefined
        String s1;

        // null
        String s2 = null;

        // empty
        String s3 = "";*/

//        String str = "123";
//        String str = null;
//        Nullable n = new Nullable(str);
//        n.run();

//        Integer a = 23;
//        Integer a = null;
//        NullableInteger n = new NullableInteger(a);
//        n.run();

//        Integer a = 23;
//        NullableGeneric<Integer> n = new NullableGeneric<>(a);
//        n.run();

//        String str = "asdvf";
//        NullableGeneric<String> n = new NullableGeneric<>(str);
//        n.run();

        Integer a = 23;
        String str = "asdvf";
        Double d = 1.14;
        String c = "dev";
        Test<Integer, String, Double> t = new Test<>(a, str, d);
        t.setObj2(c);
        t.showInfo();
    }
}
