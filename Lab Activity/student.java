import java.util.Scanner;

class student{
   public static void main(String[] args) {

    code();
    
   }

   static void code(){

    Scanner n = new Scanner(System.in);

    System.out.println("Enter name :: ");

    String name = n.nextLine();

    Scanner i = new Scanner(System.in);

    System.out.println("Enter ID :: ");

    int id = i.nextInt();

    Scanner g = new Scanner(System.in);

    System.out.println("Enter Gender :: ");

    String gender = g.nextLine();

    Scanner s = new Scanner(System.in);

    System.out.println("Enter standard :: ");

    int standard = i.nextInt();

    System.out.println("Name ::: " +name);

    System.out.println("id ::: " + id);

    System.out.println("Gender ::: " + gender);

    System.out.println("Standard ::: " + standard);




   }
}