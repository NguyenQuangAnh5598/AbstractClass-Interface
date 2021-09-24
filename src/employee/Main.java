package employee;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee[] lish = new Employee[4];
        lish[0] = new FullTime("1", "A", 23, "2454354", "ghsukdjug", 1212, 121, 2000);
        lish[1] = new FullTime("2", "C", 29, "24645454354", "g5456hsukdjug", 531313416, 221, 2000);
        lish[2] = new FullTime("3", "D", 27, "2454355454", "ghsukdj545645ug", 5116, 231, 2000);
        lish[3] = new PartTime("4", "B", 25, "53465", "ljghdsfuo", 15);
//        printEmployee(lish);
//        lowSalary(lish);
        sortLish(lish);

    }

    public static void printEmployee(Employee[] lish) {
        for (int i = 0; i < lish.length; i++) {
            System.out.println(lish[i].toString());
        }
    }

    public static Employee newFullTime() {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập code");
        String code = scanner.nextLine();
        System.out.println("Nhập tên");
        String name = scan.nextLine();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        System.out.println("Nhập số điện thoại");
        String phone = scan.nextLine();
        System.out.println("Nhập Email");
        String email = scan.nextLine();
        System.out.println("Nhập lương thưởng");
        double bonus = scanner.nextDouble();
        System.out.println("Nhập lương phạt");
        double forfeit = scan.nextDouble();
        System.out.println("Nhập lương ");
        double salary = scanner.nextDouble();
        return new FullTime(code, name, age, phone, email, bonus, forfeit, salary);
    }

    public static double getAverage(Employee[] lish) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < lish.length; i++) {
            if (lish[i] instanceof FullTime) {
                sum += lish[i].calculateSalary();
                count++;
            }
        }
        return sum / count;
    }

    public static void lowSalary(Employee[] lish) {
        for (int i = 0; i < lish.length; i++) {
            if (lish[i] instanceof FullTime && lish[i].calculateSalary() < getAverage(lish)) {
                System.out.println(lish[i]);
            }
        }
    }

    public static double sumPart(Employee[] lish) {
        double sum = 0;
        for (int i = 0; i < lish.length; i++) {
            if (lish[i] instanceof PartTime) {
                sum += lish[i].calculateSalary();

            }
        }
        return sum;
    }

    public static void sortLish(Employee[] lish) {
        int count = 0;
        for (int i = 0; i < lish.length; i++) {
            if (lish[i] instanceof FullTime) {
                count++;
            }
        }
        Employee[] newLish = new Employee[count];
        for (int i = 0, j = 0; i < lish.length; i++) {
            if (lish[i] instanceof FullTime) {
                newLish[j] = lish[i];
                j++;
            }
        }
        Employee a;
        for (int i = 0; i < newLish.length; i++) {
            for (int j = 1; j < newLish.length; j++) {
                if (newLish[i].calculateSalary() > newLish[j].calculateSalary()) {
                    a = newLish[i];
                    newLish[i] = newLish[j];
                    newLish[j] = a;
                }
            }
        }
        for (int i = 0; i < newLish.length; i++) {
            System.out.println(newLish[i]);
        }
    }
}
