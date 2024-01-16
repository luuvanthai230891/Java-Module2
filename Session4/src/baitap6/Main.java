package baitap6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.inputData(sc);
        employee1.displayData();

        Employee employee2 = new Employee();
        employee2.inputData(sc);
        employee2.displayData();

        Employee employee3 = new Employee();
        employee3.inputData(sc);
        employee3.displayData();

        Employee employee4 = new Employee();
        employee4.inputData(sc);
        employee4.displayData();

        Employee employee5 = new Employee();
        employee5.inputData(sc);
        employee5.displayData();


    }
}
