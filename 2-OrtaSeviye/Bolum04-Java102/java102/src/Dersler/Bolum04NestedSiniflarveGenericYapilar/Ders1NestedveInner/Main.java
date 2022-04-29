package Dersler.Bolum04NestedSiniflarveGenericYapilar.Ders1NestedveInner;

public class Main {
    public static void main(String[] args) {
//        Out o = new Out();
//        o.run();
//        Out.In in = o.new In();
//        in.run();

//        Out.In in2 = o.getIn();
//        in2.run();

//        Out.In.run();

//        Local local = new Local();
//        local.run();

        Anonim a = new Anonim() {
//            public int a = 20;

            @Override
            public void run() {
                System.out.println(this.a);
                System.out.println("Anonim olarak yazılmış run metodu !");
                print();
            }

            public void print() {
                System.out.println("Print metodu !");
            }
        };
        a.run();
//        a.print();


    }
}
