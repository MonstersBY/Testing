package bsu.romanchenko;

import java.util.Scanner;

public class Triangle {
    public static boolean Tri(int a,int b,int c) {
        return a > 0 && b > 0 && c > 0 && !(a >= b + c || b >= a + c || c >= a + b);
    }

    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int a = sa.nextInt();
        int b = sb.nextInt();
        int c = sc.nextInt();
        boolean res;
        res = Tri(a,b,c);
        System.out.println(res ? "Треугольник существует.":"Треугольник не существует.");
    }
}
