import java.util.Scanner;

public class Main {

    public static final String KAT_A = "Введите катет A: ";

    public static final String KAT_B = "Введите катет B: ";

    public static final String HYPOTENUSE = "Введите гипотенузу: ";

    public static final String RADIUS = "Введите радиус круга: ";

    public static double per2(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return p;
    }

    public static double square(double a, double b, double c, double p) {
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(KAT_A);
        double a = scanner.nextDouble();

        System.out.print(KAT_B);
        double b = scanner.nextDouble();

        System.out.print(HYPOTENUSE);
        double c = scanner.nextDouble();

        if ((a < c + b) && (b < c + a) && (c < b + a)) {
            System.out.println("Такой треугольник существует");
        } else {
            System.out.print("Такого треугольника несуществует");
            return;
        }

        System.out.print(RADIUS);
        double r = scanner.nextDouble();

        double p = per2(a, b, c);

        double s = square(a, b, c, p);

        if (r == s / p) {
            System.out.printf("В окружность R = %1$.2f можно вписать треугольник A = %2$.2f B = %3$.2f С = %3$.2f", r, a, b, c);
        } else
            System.out.print("В такую окружность нельзя вписать данный треугольник");

    }
}

//даётся a,b,c и r(круга)
//проверить существует ли треугольник и можно ли вписать в него окружность
//неравенство треугольника (a<b+c) and (b<a+c) and (с<a+b)
//r=s/p
//s = sqrt(p*(p-a)(p-b)(p-c)
//p = (a+b+c)/2
//сделать название констант большими буквами