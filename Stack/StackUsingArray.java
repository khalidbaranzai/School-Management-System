/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackusingarray;
import java.util.Scanner;

class stack
{
    Scanner sc=new Scanner(System.in);
    int n=10;
    int top=(-1);
    int a[]=new int[n];
    void push()
    {
        if(top==(n-1))
        {
            System.out.println("Stack overflow");
        }
        else
        {
            
            System.out.println("Enter the stack item");
            int i=sc.nextInt();
            top=top+1;
            a[top]=i;
            
        }
    }
    void pop()
    {
        if(top==(-1))
            System.out.println("Stack is underflow");
        else
    {
        top=top-1;
        
    }
    }
    void display()
    { 
      
        System.out.println("Elements of stack are");
        for(int j=top; j>=0;j--)
        {
            System.out.println(a[j]);
        }
    }
}
public class StackUsingArray {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        stack s=new stack();
        int l;
        int d;
        do
        {
            System.out.println("Press 1 to push item in stack ");
            System.out.println("Press 2 to pop item in stack ");
            System.out.println("Press 3 to display item/s in stack ");
            System.out.println("Enter your choice ");
            d=sc.nextInt();
            switch(d)
            {
                case 1:
                {   
                    s.push();
                    break;
                }   
                 case 2:
                {   
                    s.pop();
                    break;
                } 
                 case 3:
                {   
                    s.display();
                    break;
                } 
            }
            System.out.println("Enter 0 for go to the main menu ");
            System.out.println("Enter 4 to exit ");
            l=sc.nextInt();
                   }
        while(l==0);
        System.out.println("Exit successfully ");
    }
    
}
