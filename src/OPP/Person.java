package OPP;
import java.util.Scanner;

public class Person {
    private int id;
    private String name;
    private String sex;

    public Person() {
        id = 0;
        name = "";
        sex = "";
    }
    public Person(int i, String n, String s){
        id = i;
        name = n;
        sex = s;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine(); // Clear buffer

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Sex: ");
        sex = sc.nextLine();
    }

    public void output() {
        System.out.printf("%-5d %-15s %-6s", id, name, sex);
    }
    public int getId() {
        return id;
    }
}

// ================= Lecturer =================
class Lecturer extends Person {
    private int hour;
    private float rate;

    public Lecturer() {
        super();
        hour = 0;
        rate = 0;
    }

    public void inputLecturer() {
        Scanner sc = new Scanner(System.in);
        super.input();

        System.out.print("Enter Hour: ");
        hour = sc.nextInt();

        System.out.print("Enter Rate: ");
        rate = sc.nextFloat();
    }

    public void outputLecturer() {
        super.output();
        System.out.printf(" %-6d %-8.2f %-10.2f\n", hour, rate, income());
    }

    public float income() {
        return hour * rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}

// ================= Constructor Program =================
// 2. REMOVE 'public' HERE so it can live inside Person.java
class Main {
    static Scanner sc = new Scanner(System.in);

    static void inputAll(Lecturer[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Lecturer " + (i + 1));
            a[i] = new Lecturer();
            a[i].inputLecturer();
        }
    }

    static void outputAll(Lecturer[] a, int n) {
        System.out.println("ID    Name            Sex    Hour   Rate     Income");
        for (int i = 0; i < n; i++) {
            a[i].outputLecturer();
        }
    }

    static float totalIncome(Lecturer[] a, int n) {
        float total = 0;
        for (int i = 0; i < n; i++) {
            total += a[i].income();
        }
        return total;
    }

    static int search(Lecturer[] a, int n, int id) {
        for (int i = 0; i < n; i++) {
            if (a[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.print("Input number of lecturers: ");
        int n = sc.nextInt();

        Lecturer[] a = new Lecturer[n];

        inputAll(a, n);
        outputAll(a, n);

        System.out.println("Total Income = " + totalIncome(a, n));

        System.out.print("Input ID to search: ");
        int idd = sc.nextInt();

        int pos = search(a, n, idd);

        if (pos == -1) {
            System.out.println("Search not found!");
        } else {
            a[pos].setRate(15);
            System.out.println("After updating rate:");
            outputAll(a, n);
        }
    }
}