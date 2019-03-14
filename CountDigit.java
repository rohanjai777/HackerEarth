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
public class CountDigit {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c[] = s.toCharArray();
        int a[]  = new int[10]; 
        for(int i=0;i<c.length;i++){
            if(c[i]=='1'){ a[1]++;}
            else if(c[i]=='3'){ a[3]++;}
            else if(c[i]=='4'){ a[4]++;}
            else if(c[i]=='5'){ a[5]++;}
            else if(c[i]=='6'){ a[6]++;}
            else if(c[i]=='7'){ a[7]++;}
            else if(c[i]=='8'){ a[8]++;}
            else if(c[i]=='9'){ a[9]++;}
            else if(c[i]=='2'){ a[2]++;}
            else if(c[i]=='0'){ a[0]++;}
        }
        for(int i=0;i<10;i++){
            System.out.println(i +" "+a[i]);
        }

    }
}
