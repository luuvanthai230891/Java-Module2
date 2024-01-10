import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        Date date = new Date();
        System.out.println("Date = " + date);

        String name = "Luu Van Thai";
        StringBuilder nameBuilder = new StringBuilder(name);
//        name += " - 33 tuoi";
        nameBuilder.append("- 30 t");
        System.out.println("Name = " + nameBuilder);

//        doc du lieu nhap vao
        Scanner scanner = new Scanner(System.in);
        System.out.print("hay nhap vao ten cua ban");
        String fullName = scanner.nextLine();
        System.out.println("\nNhap chieu cao");
        float height = Float.parseFloat(String.valueOf(scanner.nextFloat()));
        System.out.printf("\n chieu cao cua ban la %.1f" , height);
        System.err.println("Day la loi");

//          luu y: nuot dong
        scanner.nextLine();
        String description = scanner.nextLine();
        System.out.println(description);

    }
}