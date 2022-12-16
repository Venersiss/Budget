/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practice;

import java.util.Scanner;

/**
 *
 * @author Venersis
 */
public class Practice {

    public static void main(String[] args) {
        int [] pogi ={0,0,0,0};
        
        Scanner input = new Scanner (System.in);
        System.out.println("How many variables?");
        int input1= input.nex3tInt();
        for(int i=0;i<=input1;i++){
            System.out.println("type name of variable");
           pogi[i]=input.nextInt();
            System.out.println(pogi[i]);
        }
        
    }
}
