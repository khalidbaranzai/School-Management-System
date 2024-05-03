/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackusingll;

import java.util.Scanner;
class stack
{
    static class Node
    {
        int data;
        Node next ;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
        
    }
    Node top=null;
    void push(Scanner sc)
    {
     System.out.println("Enter your data ");
     int data=sc.nextInt();
     Node new_node=new Node(data);
     if(top==null)
     {
         top=new_node;
     }
     else
     {
         new_node.next=top;
         top=new_node;
     }
    }
    void pop()
    {
        if(top==null)
        {
            System.out.println("Stack is empty ");
        }
        else
        {
            top=top.next;
        }
    }
    void display()
    {
        Node temp=top;
        while(temp!=null)
        {
             System.out.println(temp.data);
             temp=temp.next;
        }
    }
}

/**
 *
 * @author Al Hafiz Enterprises
 */
public class StackusingLL {

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
                    s.push(sc);
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
            System.out.println("Enter 5 to exit ");
            l=sc.nextInt();
                   }
        while(l==0);
        System.out.println("Exit successfully ");
    }
    
}
