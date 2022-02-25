package Assignment.assignment2;

import java.util.*;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        try
        {
            n=sc.nextInt();

            if (checkPrime(n))
                System.out.println("Prime Number");
            else
                System.out.println("Not a prime number");
        }
        finally
        {
            sc.close();
        }
    }

    public static boolean checkPrime(int n)
    {
        if (n==0 || n==1)
            return false;

        else
        {
            for(int i=2; i<n; i++)
            {
                if (n%i==0)
                    return false;
            }

            return true;
        }
    }
    
}
