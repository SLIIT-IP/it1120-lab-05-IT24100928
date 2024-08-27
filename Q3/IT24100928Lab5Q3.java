import java.util.Scanner;
public class IT24100928Lab5Q3 {
  
    

    
    public static void main(String[] args) {

        final double room_charge = 48000.0;
        final double discount_1 = 10.0;
        final double discount_2 = 20.0;

        int start_date;
        int end_date;
        int day_s=0;
        

        Scanner input=new Scanner(System.in);
        System.out.print("Enter start Date (1-31): ");
        start_date=input.nextInt();

        System.out.print("Enter end Date (1-31): ");
        end_date=input.nextInt();

       
       
         if(start_date<=0 || start_date>31){

              System.out.println("Error: Days must be between 1 and 31");
              System.exit(0);

        }

         else if(end_date<=0 || end_date>31){
                 
            System.out.println("Error: Days must be between 1 and 31");
            System.exit(0);
           
         }
         else if(end_date<start_date){

            System.out.print("Error: Start Date must be less than End Date");
            System.exit(0);
         }

         else{
        System.out.println(" ");
        System.out.println("Room Charge Per Day: Rs." + room_charge);
        day_s=end_date-start_date;        
        System.out.println("Number of Days Reserved:" + day_s);
              
        }

       

         if(day_s<3){
            double amount=room_charge*day_s;
            System.out.print("Total Amount to be Paid: " + amount);
         }

        else if(day_s<=4){
             double amount=day_s*room_charge;
             double discount_price=amount*discount_1/100;
             double disamount_1=amount-discount_price;
             System.out.print("Total Amount to be Paid: "+ disamount_1);
        }

        else{
            double amount=day_s*room_charge;
            double discount_price_1=amount*discount_2/100;
             double disamount_2=amount-discount_price_1;
            System.out.print("Total Amount to be Paid: " + disamount_2);
        }

    }
}