public class Employee {
    // Nitelikler
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03; // %3 vergi
        }
    }


    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30; // Fazla mesai saatleri başına 30 TL
        }
        return 0;
    }


    public double raiseSalary() {
        int currentYear = 2021;
        int yearsWorked = currentYear - hireYear;

        if (yearsWorked < 10) {
            return salary * 0.05; // %5 artış
        } else if (yearsWorked >= 10 && yearsWorked <= 20) {
            return salary * 0.10; // %10 artış
        } else {
            return salary * 0.15; // %15 artış
        }
    }


    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double totalSalary = salary + tax + bonus + raise;

        return "Adı : " + name + "\n" +
                "Maaşı : " + salary + "\n" +
                "Çalışma Saati : " + workHours + "\n" +
                "Başlangıç Yılı : " + hireYear + "\n" +
                "Vergi : " + tax + "\n" +
                "Bonus : " + bonus + "\n" +
                "Maaş Artışı : " + raise + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + (salary + bonus + tax) + "\n" +
                "Toplam Maaş : " + totalSalary;
    }

    public static void main(String[] args) {
        // Test için bir çalışan oluşturma
        Employee employee = new Employee("Kemaal", 2000.0, 45, 1985);

        // Çalışan bilgilerini yazdırma
        System.out.println(employee.toString());
    }}
