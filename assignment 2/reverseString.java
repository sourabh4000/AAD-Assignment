package Assignment.assignment2;

import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        try{
            String str=sc.next();
            String rev="";

            for(int i=0; i<str.length(); i++)
            {
                rev+=str.charAt(str.length()-1-i);
            }

            System.out.println(rev);

        }finally{
            sc.close();
        }
    }
}
