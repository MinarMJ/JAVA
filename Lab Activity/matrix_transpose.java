class matrix_transpose{
    public static void main(String[] args) {
        code();
    }

    static void code(){

        int mat[][]  = {{1,2,3},{2,3,4},{2,3,5}};

        int tra[][] = new int [3][3];


        for (int K = 0 ; K < 3 ;K++){
            
            for(int j = 0; j < 3 ; j++)
            {
                tra[K][j] = mat[j][K]; 
                
                

            }

            System.out.println();
                
        }


        System.out.println("Printing Matrix without transpose:");

        for (int i = 0; i<3;i++){
            for(int j =0; j<3;j++){
              System.out.print(mat[i][j]);
            }
            System.out.println();
        }

        

        System.out.println("Printing Matrix After Transpose:");

        for (int i = 0; i<3;i++){
            for(int j =0; j<3;j++){
              System.out.print(tra[i][j]);
            }
            System.out.println();
        }

        

      
        


    }
}

