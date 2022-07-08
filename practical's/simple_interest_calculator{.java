import java.util.Scanner;

class simple_interest_calculator{
    static double principal_amount ;
    static int  number_of_years ;

    public static void main(String[] args) {
        calculateSimpleInterest();
       
    }

    static void calculateSimpleInterest() {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter principle amount :: ");
        principal_amount = sc.nextDouble();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter number of years");
        number_of_years = sc1.nextInt();
        sc.close();
        sc1.close();

        

        double simple_interest;
        if (principal_amount > 100000){

           if (number_of_years > 10){
            simple_interest = principal_amount * number_of_years * 10 /100;
            System.out.print("The interest amount for a principle of " +principal_amount + " and years " + number_of_years + " is "+simple_interest);
           }
           else if (number_of_years < 10){
            simple_interest = principal_amount * number_of_years * 9.5 /100;
            System.out.print("The interest amount for a principle of " +principal_amount + " and years " + number_of_years + " is "+simple_interest);
           }
        }
        else if (principal_amount < 100000){
            if(number_of_years > 10){
                simple_interest = principal_amount * number_of_years * 5 /100;
                System.out.print("The interest amount for a principle of " +principal_amount + " and years " + number_of_years + " is "+simple_interest);
            }
            else if (number_of_years < 10 ){
                simple_interest = principal_amount * number_of_years * 4.5 / 100;
                System.out.print("The interest amount for a principle of " +principal_amount + " and years " + number_of_years + " is "+simple_interest);
            }
        }

        
        
    }
}