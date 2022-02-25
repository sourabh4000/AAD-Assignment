package Assignment.assignment2;

import java.util.*;

public class wordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            String s=sc.nextLine();
            int count = 0;
            for(int i=0; i<s.length(); i++)
            {
                if(s.charAt(i) == ' ')
                    count++;
            }
            count++;
            System.out.println(count);

        }finally{
            sc.close();;
        }
    }
}
