package Assignment.assignment2;

import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try
        {
            int n = sc.nextInt();

            System.out.println(fact(n));
        }
        finally{
            sc.close();
        }
    }

    public static int fact(int n)
    {
        int ans=1;
        for(int i=1; i<=n; i++)
        {
            ans*=i;
        }

        return ans;
    }
    
}
