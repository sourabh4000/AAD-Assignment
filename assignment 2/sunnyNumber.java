package Assignment.assignment2;

import java.util.*;
import java.lang.Math;

public class sunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            double n=sc.nextDouble();

            if (checkSunny(n))
                System.out.println("Tech Number");
            else
                System.out.println("Not a tech number");
        }finally{
            sc.close();
        }
    }

    public static boolean checkSunny(double n) {
        double num=n+1;

        if (Math.sqrt(num) - Math.floor(Math.sqrt(num)) == 0)
            return true;
        else    
            return false;
    }
    
}
