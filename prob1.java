package task3;
import java.util.Scanner;

public class prob1 {
    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        int[] a;
        int[] b;
        int[] c;
        int aindix = 0;
        int bindix = 0;
        int cindix = 0;
        System.out.println("enter the size of the first array");
        int s1 = array.nextInt();
        a = new int[s1];
        System.out.println("enter the first array");
        for (int i = 0; i < s1; i++) {
            int a1 = array.nextInt();
            a[i] = a1;

        }
        System.out.println("enter the size of the second array");
        int s2 = array.nextInt();
        b = new int[s2];
        System.out.println("enter the second array");
        for (int i = 0; i < s2; i++) {
            int a2 = array.nextInt();
            b[i] = a2;
        }
        c = new int[s1 + s2];
        
        while (aindix < s1 && bindix < s2) {
            if (a[aindix] <= b[bindix]) {

                c[cindix] = a[aindix];
                aindix++;
                cindix++;
            }
            else {
                c[cindix] = b[bindix];
                bindix++;
                cindix++;
            }
        }
       
        
        while (aindix < s1) {
            c[cindix] = a[aindix];
            aindix++;
            cindix++;
        }
        while (bindix < s2) {
            c[cindix] = b[bindix];
            bindix++;
            cindix++;
        }
        System.out.println("the the merged array is ");
        for (int i = 0; i < s1 + s2; i++) {

            System.out.print(c[i] + " ");
        }

    }

}