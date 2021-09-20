package Konular.OOP.OgrenciNotSistemi;

public class Teacher {
    String name;
    String mobilePhoneNo;
    String branch;

    public Teacher(String name, String mobilePhoneNo, String branch) {
        this.name = name;
        this.mobilePhoneNo = mobilePhoneNo;
        this.branch = branch;
    }

    public void print() {
        System.out.println("Adı : " + this.name);
        System.out.println("Telefonu : " + this.mobilePhoneNo);
        System.out.println("Bölümü : " + this.branch);
    }
}
