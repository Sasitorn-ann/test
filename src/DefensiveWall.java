import java.util.Scanner;

public class DefensiveWall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        //int[] rr=new int[a];
        for(int i=0 ; i<a ;i++ )
        {
            arr[i]=sc.nextInt();
        }
        /*for(int i=0 ; i<a ;i++ )
        {
            rr[i]=arr[i];
        }*/
        int gu=0;
        int k=sc.nextInt();
        for(int i=0 ; i<k ; i++)
        {
            
            int num=sc.nextInt();
            int strong=sc.nextInt();
            if(num<=0 || num>a)
            {
                System.out.print("invalid position"+" ");
            }
            else{
                for(int j=0 ; j<a ; j++)
                {
                    if(j==num-1)
                    {
                        
                            arr[j]+=strong;
                            gu+=arr[j];
                        
                        
                    }
                }
            System.out.print(gu+" ");
            }/*System.out.print("[");
            for(int j=0 ;j<a ; j++)
            {
                if(j==a-1)
                {
                    System.out.print(arr[j]+"]");
                }
                if(j<a-1)
                {
                    System.out.print(arr[j]+",");
                }
                
            }*/
            gu=0;
            System.out.println();
        }
        int kit=sc.nextInt();
        /*
        for(int i=0 ; i<a ; i++)
        {
            if(rr[i]!=arr[i])
            {
                count++;
                System.out.print(i+" ");
            }
        }
        
       */
        int count=0;
        for(int i=0 ; i<a ; i++ )
        {
            if(kit>arr[i])
            {
                System.out.print((i+1)+" ");
                count++;
            }
        }
        if(count==0)
        {
            System.out.print("ready");
        }
    }
}
