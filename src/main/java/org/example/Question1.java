package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n= sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b=0;
        HashMap<Integer,Integer> h= new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(h.containsKey(b-a[i])){
                int c=b-a[i];
                System.out.println(a[h.get(c)] + "," + a[i]);
                return;
            }
            else{
                h.put(a[i],1);
            }
        }
        System.out.println("No Elements found");
    }
}