import java.util.Scanner;
import java.util.*;
public class shiyan2_1 {
    public static void main(String[] args)  {
        Scanner s =new Scanner(System.in);
        int max=0,min=0;
        int n;
        n=s.nextInt();
        double ave,sum=0;
        int[]a;
        a = new int[n];

        for(int i=0;i<n;i++) {
            a[i] = s.nextInt();
            sum=sum+a[i];
        }
        Arrays.sort(a);
        max=a[n-1];
        min=a[0];

        sum=sum-max-min;
        ave=sum/(n-2);
        System.out.printf("max = %d\n",max);
        System.out.printf("min = %d\n",min);
        System.out.printf("ave = %.6f",ave);

    }

}



