import java.util.*;
 public class continuestmt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i==2)
            continue;
            System.out.println("continue example");
            System.out.println(i);
        }
    }
 }