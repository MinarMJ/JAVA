class student{
    private int student_id ;
    private String student_name ;
    private String course ;

    public  int getstudent_id(){
        return student_id;
    }
    public  void setstudent_id(int id){
        this.student_id = id;
    }


    public String getstudent_name(){
        return student_name;
    }
    public void setstudent_name(String str1){
        this.student_name = str1;
    }

    public String getcourse(){
        return course;
    }
    public void setcourse(String str2){
        this.course = str2;
    }
}

class code{
    public static void main(String[] args) {
        co();
    }

    static void co() {

        student student1 = new student();
        student1.setstudent_id(12);
        System.out.println(student1.getstudent_id());

        student student2 = new student();
        student2.setstudent_name("minar");
        System.out.println(student2.getstudent_name());

        student student3 = new student();
        student3.setcourse("java");
        System.out.println(student3.getcourse());

        
        
       
    }
    
    
          
    
}