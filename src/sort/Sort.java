package sort;
/**
 *
 * @author Jisheng
 */
import java.util.Scanner;
public class Sort{
    public static void main(String[] args){
        Scanner kbd = new Scanner (System.in);
        System.out.println("How many numbers would you like to sort: ");
        int number = kbd.nextInt();
        int array[] = new int [number];
        for (int t = 0; t < number; t++){
            System.out.println("Enter number: ");
            array[t] = kbd.nextInt();
        }
        ascending (array, number);
        descending(array, number);
    }
    
    private static void ascending(int[] array, int number){
        for(int i=0;i<array.length;i++)
            for(int j=0;j<array.length-1;j++)
               if(array[j]>array[j+1]){  
                   int t=array[j];  
                   array[j]=array[j+1];  
                   array[j+1]=t;  }
        System.out.print("asceding： ");
        for(int i=0;i<array.length;i++)
           System.out.print(array[i]+"  ");
    }     

    private static void descending(int[] array, int number) {
        for(int i=0;i<array.length;i++)
            for(int j=0;j<array.length-1;j++)
               if(array[j]<array[j+1]){  
                   int t=array[j];  
                   array[j]=array[j+1];  
                   array[j+1]=t;  }
        System.out.print("desceding： ");
        for(int i=0;i<array.length;i++)
           System.out.print(array[i]+"  ");
    }
}