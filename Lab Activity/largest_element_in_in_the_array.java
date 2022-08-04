class largest_element_in_in_the_array{
    static int code(){
        int arr[] = {1,3,2,4,5,6};

        int a = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > a)
                a = arr[i];
         
        return a;
    }
    public static void main(String[] args) {
        System.out.println("the largets number is "+code());
    }
}