class copyarray{
    static int array[] = {0,5,4,8,7};
    
    static int arrat2[] = new int[array.length];
  
    public static void main(String[] args) {
        code();
        
    }
    static void code(){
        for(int i=0;i < array.length; i++){
            arrat2[i] = array[i];

            System.out.println(arrat2[i]);
    }
}

    

}