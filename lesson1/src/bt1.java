import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        System.out.println("--bai tap 1--");
        System.out.println("Nhap a,b,c");

        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        System.out.println("a= " + a);
        float b = sc.nextFloat();
        System.out.println("b= " + b);
        float c = sc.nextFloat();
        System.out.println("c= " + c);

        if (a == 0) {
            if (b == 0) {
                System.out.println("Pt vo nghiem!");
            } else {
                System.out.println("Pt co 1 nghiem: " + "x = " + (-c / b));
            }
            return;
        }

        float x1;
        float x2;
        float delta = b * b - 4 * a * c;
        if (delta > 0) {
            x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Pt co 2 nghiem x1= " + x1 + "; x2= " + x2);
        } else if (delta == 0) {
            x1 = (float) (-b / (2 * a));
            System.out.println("nghiem kep x1 = x2 " + x1);
        } else {
            System.out.println("Pt vo nghiem");
        }

        boolean flag = true;
        String name;
        int old = 1;
        String[] male = {"Nam", "Male"};
        String[] female = {"Nu", "Female"};
        String sex;
        double hight = 1.5;
        double weight = 50;

        System.out.println("--Bai tap 2--");
        sc.nextLine();
        System.out.println("Nhap ho ten: ");
        name = sc.nextLine();

        System.out.println("Nhap nam sinh: ");
        while (flag == true) {
            if (sc.hasNextInt()) {
                int date = sc.nextInt();
                old = 2021 - date;
                if (date > 2021 && date < 1900) {
                    System.out.println("Nhap lai");
                } else {
                    flag = false;
                }
            } else {
                sc.next();
                System.out.println("Nhap lai!!!");
            }
        }

        System.out.println("Nhap gioi tinh");
        sex = sc.nextLine();
        while (true) {
            sex = sc.nextLine();
            if (sex.equals(male[0])) {
                sex = male[1];
                break;
            } else if (sex.equals(female[0])) {
                sex = female[1];
                break;
            } else {
                System.out.printf("Nhap lai (Nam hoac Nu): ");
            }
        }

        System.out.println("Nhap chieu cao(meter): ");
        while (true) {
            if (sc.hasNextDouble()) {
                hight = sc.nextDouble();
                if (hight > 0 && hight < 2) break;
                else {
                    System.out.printf("Nhap lai!!!: ");
                }
            } else {
                sc.next();
                System.out.printf("Nhap lai: ");
            }
        }

        System.out.println("Nhap can nang(kg): ");
        while (true) {
            if (sc.hasNextDouble()) {
                weight = sc.nextDouble();
                if (weight > 0 && weight < 200) break;
            } else {
                sc.next();
                System.out.println("Nhap lai: ");
            }
        }

        double BMI = weight / (hight * hight);

        System.out.println("\n" + "--------" + "\n" +
                "Ho ten: " + name + "\n"
                + "Tuoi: " + old + "\n"
                + "Chi so BMI: " + Math.round(BMI * 100.0) / 100.0 + "\n"
                + "Gioi tinh: " + sex);
    }
}
