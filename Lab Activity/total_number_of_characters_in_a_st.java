class total_number_of_characters_in_a_string{

    public static void main(String[] args) {
        code();
    }
    static void code (){
        int counter = 0;

    String str = "hi my name is minar";

    for (int i  = 0; i <str.length(); i++){
        if (str.charAt(i) != ' '){
            counter ++;
        }
    }

    System.out.println("total number of char " +counter);
    }

    
}
