/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.algo;
import java.util.Scanner;
/**
 *
 * @author ahediouedcherkaoui1
 */
public class TPAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        
        System.out.print("saisir x : ");
        x = sc.nextInt();
        System.out.print("saisir y : ");
        y = sc.nextInt();
        
        System.out.println("Avant permutation :" + "x=" + x + " y="+y);
        System.out.println("Apres permutation :" + "x=" + y + " y="+x);
    }

    
}