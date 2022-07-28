class string_palindrome {
    public static void main(String[] args) {
         code();
    }

    static void code(){
      String s1 = "racecar";
      StringBuffer buf = new StringBuffer(s1);
      buf.reverse();
      String s2 = buf.toString();
      if(s1.equals(s2)){
         System.out.println("palindrome");
      } else {
         System.out.println("not a palindrome");
      }
    }
}