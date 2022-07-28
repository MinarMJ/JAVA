class string_example{
    
    static void code (){

        
        String s = "Welcome to Java World";

        char ch = s.charAt(5);
        System.out.println(ch);

        String s2 = s.concat(" - Let us learn");
        System.out.println(s2); 

        int index=s.indexOf("a");
        System.out.println("the positon of a is " + index);

        String replace = s2.replace("a", "e");
        System.out.println(replace);

        String between = s.substring(4, 10);
        System.out.println(between);

        String low = s.toLowerCase();
        System.out.println(low);

        StringBuffer sb = new StringBuffer("This is StringBuffer");
        sb.append("- This is a sample program");
        System.out.println(sb);

        sb.insert(21, "object");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        StringBuilder b = new StringBuilder("builder");
        System.out.println(b);



    }
}
class mainclass{
    public static void main(String[] args) {
        string_example st = new string_example();
        st.code();
    }
}