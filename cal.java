/*
=>>Enter First Number then in next line


=>>Enter Second Number and then



=>>Enter the operation (+,-,*,/)
Sample input- 2
                          2
                          +
                          
Sample output- The result is 4                          


*/

import java.util.Scanner;


public class MyClass{


public static void main(String[] args) {


Scanner sc=new Scanner (System.in);
    
    
    
       int a = sc. nextInt();
    
     int b = sc. nextInt();
    
 
    sc.nextLine();
    
    char operation=sc.nextLine().charAt(0);
    
    float result=0;
    
    switch(operation){
    
        case '+':
        
        result =a+b;
        
        break ;
        
        case '-':
        
        result =a-b;
        
        break ;
        
        case '*':
       
        result = a*b;
       
       
       break;
        
        
        case '/':
        
        result =a/b;
        
        break;
        
        default:
        
        System.out.println("Invalid operation");
        
        
        
    }
    System .out.println ("The Result is"+" "+result);
    
    
    System.out.println ("If you liked it give it a like");
        
    }
}