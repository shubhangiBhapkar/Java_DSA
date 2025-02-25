import java.util.*;
import java.util.Scanner;
public class cost {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter eraser price");
        float eraser=sc.nextFloat();

        System.out.println("Enter pen price");
        float pen=sc.nextFloat();

        System.out.println("Enter pencil price");
        float pencil=sc.nextFloat();

        float price=(eraser+pen+pencil);
        System.out.println("price:"+price);

        int $=24;
        System.out.println($);
    }
}
