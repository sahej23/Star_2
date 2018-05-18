/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author BAGGAS
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    int j,k;
    void fun()
    {
        for(j=1;j<=3;j++)
        {
            System.out.print(" ");
        }
        for(k=1;k<=1;k++)
        {
            System.out.println("*");
        }
    }

    public static void main(String[] args){
    
JavaApplication4 s=new JavaApplication4();
int i,l;
for(i=1;i<=7;i++)
{
    if(i<=3)
    {
        s.fun();
    }
    if(i==4)
    {
        for(l=1;l<=7;l++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    if(i>4){
        s.fun();
    }
    
}

    }
    
}
