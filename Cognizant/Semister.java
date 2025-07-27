import java.util.*;
public class Semister {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of semester: ");
        int semN=sc.nextInt();
        System.out.println("Enter no of subjects in 1 semester:");
        int sub1=sc.nextInt();
        System.out.println("Enter no of subjects in 2 semester:");
        int sub2=sc.nextInt();
        System.out.println("Enter no of subjects in 3 semester:");
        int sub3=sc.nextInt();

        System.out.println("Enter semister 1 Marks:");
        int sem1[]=new int[sub1];
        for(int i=0;i<sem1.length;i++)
            sem1[i]=sc.nextInt();
        
        System.out.println("Enter semister 2 Marks:");
        int sem2[]=new int[sub2];
        for(int i=0;i<sem2.length;i++)
            sem2[i]=sc.nextInt();
    
        System.out.println("Enter semister 3 Marks:");
        int sem3[]=new int[sub3];
        for(int i=0;i<sem3.length;i++)
            sem3[i]=sc.nextInt();

        Arrays.sort(sem1);
        System.out.println("Maximum mark in 1 semester:"+sem1[sem1.length-1]);
        Arrays.sort(sem2);
        System.out.println("Maximum mark in 2 semester:"+sem1[sem2.length-1]);
        Arrays.sort(sem3);
        System.out.println("Maximum mark in 3 semester:"+sem3[sem3.length-1]);
    }
   
}
