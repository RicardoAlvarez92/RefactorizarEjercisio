package com.generation;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {

       Scanner console = new Scanner( System.in);
        System.out.print("Ingresa un numero ");
        int num1 = console.nextInt();
        System.out.print("Ingresa otro numero  ");
        int num2 = console.nextInt();
        console.close();

        System.out.println( num1+" + "+num2+" = "+ (num1 + num2));
        System.out.println( num1+" - "+num2+" = "+ (num1 - num2));
        System.out.println( num1+" * "+num2+" = "+ (num1 * num2));
        System.out.println( num1+" / "+num2+" = "+ (num1 / num2));

    }
}

