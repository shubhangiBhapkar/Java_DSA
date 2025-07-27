import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
public class Item {
    public static void main(String[] args){
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of products:");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter a Item name, Price, and Discount :");
        
        String item[]=new String[n];
        int price[]=new int[n];
        int discount[]=new int[n];
        float dis[] = new float[n];

        for(int i=0;i<n;i++){
            String str[]= br.readLine().split(",");
            item[i]=str[0];
            price[i]=Integer.parseInt(str[1]);
            discount[i]=Integer.parseInt(str[2]);

            dis[i]=(float)(price[i]*discount[i]/100);
        }
        int idx[]=new int[n];
        int j=0;
        float min= Float.MAX_VALUE;
        for(int i=0;i< n;i++){
            if(dis[i]<=min)
            {
                min=dis[i];
                idx[j++]=i;
                //System.out.println(min);
            }
        }
        for(int i=0;i< j;i++){
            System.out.println(item[idx[i]]);
            //System.out.println(idx[i]);
        }
    }

}
