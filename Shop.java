
import java.util.Scanner;

public class Shop {
    //display price list
    public static void main(String[] args){

        //prise list variables
        int ap=50;
        int or=30;
        int ma=20;
        int ba=15;

        System.out.println("------Price List------");
        System.out.println(""); 
        System.out.println("    Apple  = Rs."+ap);
        System.out.println("    Orange = Rs."+or);
        System.out.println("    Mango  = Rs."+ma);
        System.out.println("    Banana = Rs."+ba);
        System.out.println("-----------------------");  
        System.out.println("");      
    
        //create veriable for after discount price
        float disp=0;

       
        Scanner input =new Scanner(System.in);

        
        //get quenty input from customers
        System.out.print("Enter the Apple Quenty : ");
        int apple =input.nextInt();

        System.out.print("Enter the Orange Quenty : ");
        int orange =input.nextInt();

        System.out.print("Enter the Mango Quenty : ");
        int mango =input.nextInt();

        System.out.print("Enter the Banana Quenty : ");
        int banana =input.nextInt();

        //get buget from the customer
        System.out.print("Enter Your Budget : ");
        float budget =input.nextFloat();



        //create variable for total price of selected items
        int total = (apple*50)+(orange*30)+(mango*20)+(banana*15);

        System.out.println("");

        
        //finding the discount
        if(total>10000){
            System.out.println("You Have 50% Discount");
            float dis=total*0.5f;
            disp =total-dis;
            System.out.println("Discount price is :"+disp);
        }
        else if(total>3000){
            System.out.println("You Have 25% Discount");
            float dis=total*0.25f;
            disp =total-dis;
            System.out.println("Discount price is :"+disp);
        }
        else if(total>2000){
            System.out.println("You Have 20% Discount");
            float dis=total*0.2f;
            disp =total-dis;
            System.out.println("Discount price is :"+disp);
        }
        else if(total>1000){
            System.out.println("You Have 10% Discount");
            float dis=total*0.1f;
             disp =total-dis;
            System.out.println("Discount price is :"+disp);
        }
        else{
            System.out.println("You Haven't any Discount");
            float dis=total*0.0f;
            disp =total-dis;
        }

        System.out.println("------Bill------");
        System.out.println("");
        System.out.println("Product      Quentity     Price");
        System.out.println("  Apple        "+apple+ "        Rs."+ap);
        System.out.println("  Orange       "+orange+ "        Rs."+or);
        System.out.println("  Mango        "+mango+ "        Rs."+ma);
        System.out.println("  Banana       "+banana+ "        Rs."+ba);

        System.out.println("Total price is : Rs."+ total);


        float balance= 0;

        //display balance
        balance = budget - disp;
        System.out.println("Your Balance is :Rs."+balance);


    }
}
