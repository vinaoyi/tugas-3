/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;


public class vina {
     public static void main(String[] args) {
        System.out.println("Tugas Terakhir----!!");
        
        int[] array = new int[100];
        System.out.println("Masukkan Nilai...");
        
        for(int i=1; i<array.length; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nilai "+i+" : ");
            array[i] = scanner.nextInt();
            if(array[i]==-1){
                i=100;
                System.out.println("Berhenti..."); 
            }
        }
        int max = array[0];
        for(int i=1; i<array.length; i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        int min = array[0];
        for(int i=1; i<array.length; i++){
            if(min>array[i]){
                min=array[i];  
            }
        }
        System.out.println("Nilai max = "+max);
        System.out.println("Nilai min = "+min);
         
    } 
}
    

