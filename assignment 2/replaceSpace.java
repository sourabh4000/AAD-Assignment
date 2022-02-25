package Assignment.assignment2;

import java.util.*;

public class replaceSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try
        {
            String str = sc.nextLine();
            String str2 = "";
            char ch = sc.next().charAt(0);

            for(int i=0; i<str.length(); i++)
            {
                if (str.charAt(i)==' ')
                {
                    str2+=ch;
                }
                else
                    str2+=str.charAt(i);
            }

            System.out.println(str2);
        }
        finally{
            sc.close();
        }
    }
    
}
