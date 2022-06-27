class arrayexample{
    static  int []array = {1,2,3,5,4};
    public static void main(String[] args) {
     
        code();

    }
    static void code(){
        for (int i =0;i< array.length;i++){
            System.out.println(array[i]+"");
        }
        for (int i = array.length -1;i>=0;i-- ){
            System.out.println(array[i]+"");
        }

    }
}