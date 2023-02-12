// +Написать программу вычисления n-ого треугольного числа. url

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        int a = Scanner.nextInt();
        Scanner.close();
        System.out.println("Треугольное число = " + Triangle(a) + "\n");
    }

