import java.util.*;
public class IncrementCalculation {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter salary:");
        int salary=sc.nextInt();
        System.out.println("Enter appraisal:");
        float rating=sc.nextFloat();

        if(salary<=0 || rating <=0|| rating>5 ){
            System.out.println("Invalid Input");
            return;
        }
        if(rating >=1 && rating <=3) System.out.println(salary+(int)salary*0.1);
        else if( rating >3 && rating <=4) System.out.println(salary+(int)salary*0.25);
        else  System.out.println(salary+(int)salary*0.3);

        
    
}
    
}
