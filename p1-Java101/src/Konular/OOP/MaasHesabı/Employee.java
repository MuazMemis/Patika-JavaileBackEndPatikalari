package Konular.OOP.MaasHesabı;

public class Employee {
    String name;
    public double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void maasHesapla() {
        tax();
        bonus();
        raiseSalary();

        employeeInfo();
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş : " + totalSalary());
    }

    public double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        }
        return 0;
    }

    public double bonus() {
        if (this.workHours > 40) {
            int overtime = this.workHours - 40;
            return overtime * 30;
        }
        return 0;
    }

    public double raiseSalary() {
        int workYear = 2021 - this.hireYear;

        if (workYear < 10) {
            return this.salary * 0.05;
        } else if (workYear > 9 && workYear < 20) {
            return this.salary * 0.1;
        } else if (workYear > 19) {
            return this.salary * 0.15;
        }

        return 0;
    }

    public double totalSalary() {
        return this.salary - tax() + bonus() + raiseSalary();
    }

    public void employeeInfo() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
    }

}
