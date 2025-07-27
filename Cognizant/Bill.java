import java.util.*;
public class Bill {
    public static int generateBill(int pizza,int puff,int drink){
        int pizzaBill = pizza *100;
        int puffBill = puff *20;
        int drinkBill = drink *10;
        return (pizzaBill+puffBill+drinkBill);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter no of pizza bought:");
        int pizza =sc.nextInt();
        System.out.println("Enter no of puff bought:");
        int puff =sc.nextInt();
        System.out.println("Enter no of cold drink bought:");
        int drink =sc.nextInt();

        //output
        System.out.println("No of pizza:"+pizza);
        System.out.println("No of puff:"+puff);
        System.out.println("No of cold drink:"+drink);
        System.out.println("Total bill :"+generateBill(pizza,puff,drink));
        System.out.println("ENJOY THE SHOW!!!");
    }
}
