/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.Scanner;
public class ArrayInsert{
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
           a[i] = sc.nextInt(); 
        }
        while(q-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(x==1){
                a[y]=z;
            }
            else if(x==2){
                int sum=0;
                for(int i=y;i<=z;i++){
                    sum=sum+a[i];
                }
                System.out.println(sum);
            }
        }
    

    }
}
