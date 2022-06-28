class addtwoarray{
    public static void main(String[] args) {
        code();
    }
    static void code (){
        int sem1[] = {45,45,56,89,87} ;
        int sem2[] = {87,98,96,54,23};
        int total[] = new int [sem1.length];        

        for(int i = 0; i<sem1.length;i++){
            total[i] = sem1[i] + sem2[i];   
        }
        for(int k = 0 ; k< total.length; k++){
                

            System.out.println(total[k]);
        }

        


    }
}