class  texcalculator{
    static float basicsalary = 30000;
    static boolean citizenship;
    static float tax;

    public static void main(String[] args) {
        calculatetex();
    }

    static void calculatetex(){
        tax = 30 * basicsalary / 100;
        System.out.print("The Tax of the employee for the" +basicsalary +" is " +tax);
    }
}

