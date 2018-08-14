/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Tarishaulia
 */
public class Latihan4 {
    public static int hitung(int a, int b)
    {
        int c = a / b;
        return c;
    } 
    public static void main(String[]args){
        
        int a,b;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Jarak : ");
        a = scanner.nextInt();
        System.out.print("Waktu Tempuh : ");
        b = scanner.nextInt();
        double kecepatan = a/b;
        System.out.println("Kecepatan = "+kecepatan+" km/jam");
    }
  }  

