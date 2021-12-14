package com.bl;

import java.util.Scanner;

public class LineComparision {
    public static void main(String args[]){
        // Displaying the Welcome Message
        System.out.println("welcome to Line Comparision Computation");

        int x1,x2,y1,y2,p1,p2,q1,q2;
        double r,res;

        System.out.println("enter first value");
        Scanner sc=new Scanner(System.in);
        x1=sc.nextInt();
        System.out.println("enter second value");
        x2=sc.nextInt();
        System.out.println("enter third point");
        y1=sc.nextInt();
        System.out.println("enter fourth point");
        y2=sc.nextInt();


        int a=x2-x1;
        int b=y2-y1;
        //inputs for second line
        System.out.println("enter first value");
        p1=sc.nextInt();
        System.out.println("enter second value");
        p2=sc.nextInt();
        System.out.println("enter third point");
        q1=sc.nextInt();
        System.out.println("enter fourth point");
        q2=sc.nextInt();

        int c=p2-p1;
        int d=q2-q1;

        r=(Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)));
        res=(Math.sqrt(Math.pow(c, 2)+Math.pow(d, 2)));
        System.out.println(r);

        //compare of the two lines
        if(r==res){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }

}
