package Dersler.Bolum04NestedSiniflarveGenericYapilar.Ders1NestedveInner;

public class Out {
    public int a = 5;
    public static int b = 15;

    // Inner Class
    public static class In {
        public static int a = 10;

        public static void run() {
            System.out.println("In sınıfına ait run metodu çalıştı !");
            int a = 1;
            System.out.println(a);
            System.out.println(In.a);
            System.out.println(Out.b);
//            System.out.println(this.a);
//            System.out.println(Out.this.a);
        }
    }

    public void run() {
//        System.out.println("Out sınıfına ait run metodu");
//        In in = new In();
//        in.run();
        In.run();
    }

//    public In getIn() {
////        In in = new In();
////        return in;
//        return new In();
//    }
}
