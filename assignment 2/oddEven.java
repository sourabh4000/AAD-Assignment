package Assignment.assignment2;

public class oddEven {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        
        int even[]=new int[arr.length];
        int ec=0;
        int odd[]=new int[arr.length];
        int oc=0;

        for(int i=0; i<arr.length; i++)
        {
            if (arr[i]%2==0)
            {
                even[ec]=arr[i];
                ec++;
            }
            else
            {
                odd[oc]=arr[i];
                oc++;
            }
        }

        for(int i=0; i<ec; i++)
        {
            System.out.print(even[i]+", ");
        }
        System.out.println("\n");
        for(int i=0; i<oc; i++)
        {
            System.out.print(odd[i]+", ");
        }
    }
    
}
