package Bolum1AccessModifier.Ders2StaticAnahtarSozcugu;

public class Player {
    public String name;
    public int id;
    public static int count = 22;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }

/*    public void showName() {
//        System.out.println(this.count);
//        System.out.println(Player.count);
        System.out.println(this.name);
    }*/

    public static void showName() {
        Player p1 = new Player("a",1);
        System.out.println(p1.name);
    }

}