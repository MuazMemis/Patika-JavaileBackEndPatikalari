package Dersler.Bolum9MultiThreadsveConcurrency.Ders3ThreadDurdurmakBekletmek;

public class Counter implements Runnable {
    private String name;
    private int id;
    private boolean isRun = true;

    public Counter(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " Çalıştı.");

        int i = 0;
        while (isRun) {
            try {
                Thread.sleep(1000L * this.id);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + " : " + i++);
        }

        System.out.println(this.getName() + " bitti.");
    }

    public void stop() {
        this.isRun = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
