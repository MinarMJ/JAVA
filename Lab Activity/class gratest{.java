class gratest{
    public static void main(String[] args) {
        
       
        int number1 = 2;
        int number2 = 66;
        int number3 = 4;
        if (number1 > number2 && number1 > number3){
            System.out.println("the grater number is "+number1);
        }
        else if((number2 > number1 && number2 > number3)){
            System.out.println("the grater number is "+number2);
        }
        else{
            System.out.println("the grater number is "+number3);
        }

    }
}