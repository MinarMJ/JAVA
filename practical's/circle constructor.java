class circle{
    float radius;

    circle(){
        radius = 1.5f;
    }

   
}

class shape {
    public static void main(String[] args) {
       code();
    }

    static void code(){
        circle c = new circle();
        System.out.print(c.radius);
    }

}