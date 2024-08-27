import java.util.Scanner;

public class IT24100928Lab5Q1 {
  
     public static void main(String[] args) {

        Scanner input=new Scanner(System.in);  
        System.out.print("Enter the first integer:");
        int num1=input.nextInt();

        System.out.print("Enter the second integer:");
        int num2=input.nextInt();

        System.out.print("Enter the third integer:");
        int num3=input.nextInt();
         
        System.out.println(" ");

        System.out.println("User entered numbers are: " + num1 + " " + num2 + " " + num3 );        

        int smallestnum=num1;
        
        if(smallestnum>num2)  
        {
             smallestnum=num2;
             
        }        
        if(smallestnum>num3)
        {
            smallestnum=num3;
            
         }
          
        
         int highestnum=num2;
        
        if(highestnum<num1)  
        {
             highestnum=num1;
             
        }        
        if(highestnum<num3)
        {
            highestnum=num3;
            
         }
          
         
         
        System.out.println("The Smallest number is: " + smallestnum);
        System.out.print("The Largest number is: " + highestnum);
  }      



}