class NastingIfElse {

    public static void main(String[] args) {
        int a = 34 , b = 354, c = 88 , d = 153;
        int ans;
    
        if ( a > b ) {
            if ( a > c ) {
                if ( a > d ) {
                 ans = a;
                }
                else {
                 ans = d;
                }
            }
            else if ( c > d ) {
             ans = c;
            }
            else {
             ans = d;
            }
        }
        else if ( b > c ) {
            if ( b > d ) {
             ans = b;
            }
            else {
             ans = d;
            }
        }
        else if ( c > d ) {
         ans = c;
        }
        else {
         ans = d;
        }
        System.out.println("Biggest number of three is " + ans);

    }

}