package javaapplication9;

import java.util.Scanner;
import java.util.Arrays;

public class JavaApplication9 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("dizi boyutu n: ");
        int dizi[]=new int[input.nextInt()];
        
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i+1)+". eleman:");
            dizi[i]=input.nextInt();
        }
        Arrays.sort(dizi);
        System.out.print(Arrays.toString(dizi));
        
       
        
        
    }
    
}
