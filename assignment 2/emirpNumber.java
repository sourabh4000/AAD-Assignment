package Assignment.assignment2;

import java.util.*;
// import Assignment.assignment2.primeNumber;

public class emirpNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();

            if (checkEmirp(n))
                System.out.println("Emirp Number");
            else
                System.out.println("Not an Empirp number");
        }finally{
            sc.close();
        }
    }

    public static boolean checkEmirp(int n) {
        int n1=n;
        int rev=0;
        while(n>0)
        {
            int rem=n%10;
            n/=10;

            rev=rev*10 + rem;
        }
        // System.out.println(rev);

        if (primeNumber.checkPrime(n1) && primeNumber.checkPrime(rev))
            return true;
        else
            return false;
        
    }
    
}
