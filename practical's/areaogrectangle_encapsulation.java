class areaogrectangle_encapsulation{
    private int  length;
    private int width ;


    public void setlength(int l){
        length = l;
    }

    public void stewidth(int w){
        width = w;
    }
    public int getlength(){
        return length;

    }
    public int getwidh(){
        return width;
    }
    public int cal(){
        return width * length;
    }
    public void dis(){
        System.out.print(cal());
    }
}

class code{
    public static void main(String[] args) {
        areaogrectangle_encapsulation e = new areaogrectangle_encapsulation();
        e.setlength(4);
        e.stewidth(4);
        e.dis();
        
    }


}
