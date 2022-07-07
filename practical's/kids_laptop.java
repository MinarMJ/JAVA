import java.util.Scanner;

class laptop{
    public static void main(String[] args) {
        code();
    }

    static void code(){
        int value;
      
       do{ Scanner val = new Scanner(System.in);
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for substraction");
        System.out.println("Enter 3 for  multiplication");
        System.out.println("Enter 4  to quit");

        value = val.nextInt();

        switch (value) {
            case 1:
            System.out.println("enter two numbers");
            System.out.println("enter number 1 ::: ");
            Scanner a = new Scanner(System.in);
            int val1 = a.nextInt(); 
            System.out.println("enter number 2 ::: ");
            Scanner b = new Scanner(System.in);
            int val2 = b.nextInt(); 
            int ans = val1 + val2;
            System.out.println("answer is = " +ans);

                
                break;
        
            case 2:
            System.out.println("enter two numbers");
            System.out.println("enter number 1 ::: ");
            Scanner c = new Scanner(System.in);
            int val3 = c.nextInt(); 
            System.out.println("enter number 2 ::: ");
            Scanner d = new Scanner(System.in);
            int val4 = d.nextInt(); 
            int ans1 = val3 - val4;
            System.out.println("answer is = " +ans1);


            case 3:
            System.out.println("enter two numbers");
            System.out.println("enter number 1 ::: ");
            Scanner e = new Scanner(System.in);
            int val1u = e.nextInt(); 
            System.out.println("enter number 2 ::: ");
            Scanner f= new Scanner(System.in);
            int val2u = f.nextInt(); 
            int ans3 = val1u * val2u;
            System.out.println("answer is = " +ans3);
            
                default:
                break;
        }
    }while(value != 4);
      

    }
}
    






        
        
    

