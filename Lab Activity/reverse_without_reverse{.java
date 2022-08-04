class reverse_without_reverse{
    public static void main(String[] args) {
        code();
    }
    static void code (){
        String str = "Minar";
        for(int i = str.length() ; i>0 ; i--){
            System.out.print(str.charAt(i-1));
        }

    }
}