
class Rectangle{  
    int length;  
    int width;  
    void val(int len, int wid){  
    
     length = len;
     width = wid; 
    }  
    void Area(){

        System.out.println(length*width);
    }  
   }  
   class code
   {  
    public static void main(String args[]){   
      abc();
   }  

   static void abc(){
  
    Rectangle r1=new Rectangle();    
     r1.val(45,5);  
     r1.Area();
   }
}

    