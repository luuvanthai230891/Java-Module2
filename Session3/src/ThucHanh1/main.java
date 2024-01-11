package ThucHanh1;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i++){
            System.out.print(i + ",");
            if(i % 10 == 0){
                System.out.println(" ");
            }
        }
    }
}
