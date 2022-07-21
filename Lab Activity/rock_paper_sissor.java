import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

class Game{

    static int computer;
    
     
    static int player_int;

    static int scoreC;
    static int scoreP;


    public static void main(String[] args) {
        code(); 
    }

    static void code(){

    for (int i = 0 ;i<3;i++){


        System.out.println("///////////////////");
        int player_int = 0;
        System.out.println("Enter  1 for rock , 2 for Paper , 3 for sissor");

        Random input = new Random();
        computer = input.nextInt(3) + 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Move");

        player_int = sc.nextInt();
        
        if (computer == 1 && player_int == 2 ){
            System.out.println("you won");
            System.out.println("computer selected " +computer);
            scoreP = scoreP + 1;
        }
        else if (computer == 2 && player_int == 3){
            System.out.println("you won");
            System.out.println("computer selected " +computer);
            scoreP = scoreP + 1;
        }

        else if  (computer == 3 && player_int == 1){
            System.out.println("you won");
            System.out.println("computer selected " +computer);
            scoreP = scoreP + 1;
        }

        else if (player_int == 1 && computer == 1 || player_int == 2 && computer == 2 || player_int == 3 && computer == 3 ){
            System.out.println("Its a TIE");
        }

        else{

            System.out.println("Computer won ");
            System.out.println("computer selected " +computer);
            scoreC = scoreC + 1;

        }
        
    }

    System.out.println("///////////////////");
    cal();


    

    }

    static void cal(){


        if (scoreC > scoreP){
            System.out.println("computer won the Game");
        }
        else{
            System.out.println("You won the Game");
        }

    }

    
    }

   

