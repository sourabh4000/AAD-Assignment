package Assignment.assignment2;

import java.util.*;

public class techNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();

            if (checkTech(n))
                System.out.println("Tech Number");
            else
                System.out.println("Not a tech number");
            
        }finally{
            sc.close();
        }
    }

    public static boolean checkTech(int n) {
        String num = Integer.toString(n);
        int l=num.length();
        if ((l < 3) && (l%2==0))
            return false;
        else{
            int a = Integer.parseInt(num.substring(0, l/2));
            int b = Integer.parseInt(num.substring(l/2));
            if ((a+b)*(a+b) == n)
            {
                return true;
            }
            else
            {
                return false;
            }
            
        }    
    }
    
}
