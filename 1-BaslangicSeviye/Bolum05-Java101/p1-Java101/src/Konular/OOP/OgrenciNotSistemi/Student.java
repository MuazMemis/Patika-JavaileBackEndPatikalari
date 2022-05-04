package Konular.OOP.OgrenciNotSistemi;

public class Student {
    String name, stuNo;
    int classes;
    Course c1;
    Course c2;
    Course c3;
    double avarage;
    boolean isPass;


    public Student(String name, int classes, String stuNo, Course c1, Course c2, Course c3) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100)
            this.c1.note = note1;
        if (note2 >= 0 && note2 <= 100)
            this.c2.note = note2;
        if (note3 >= 0 && note3 <= 100)
            this.c3.note = note3;
        calcAvarage();
    }

    public void printNote() {
        System.out.println(this.c1.name + " Notu\t" + this.c1.note);
        System.out.println(this.c2.name + " Notu\t" + this.c2.note);
        System.out.println(this.c3.name + " Notu\t" + this.c3.note);
        System.out.println("Ortalamanız : " + this.avarage);
    }

    public void isPass() {
        if (this.avarage > 55) {
            System.out.println("Sınıfı geçti.");
        } else
            System.out.println("Sınıfta kaldı.");
        printNote();
    }

    public void calcAvarage() {
        this.avarage = (this.c2.note + this.c3.note + this.c1.note) / 3.0;
    }
}
