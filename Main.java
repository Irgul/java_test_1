package com.company;
import java.util.*;


public class Main {
    public static int min(int a, int b, int c, int d){
        if (a>b){
            a=b;
        }
        if (a>c){
            a=c;
        }
        if (a>d){
            a=d;
        }
        return a;
    }

    public static void main(String[] args) {
	// write your code here
        int a;
        Scanner S=new Scanner(System.in);
        a=S.nextInt();
        for (int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                System.out.print(min(i,j,a-i-1, a-j-1));

            }
            System.out.println();

        }


    }
}
