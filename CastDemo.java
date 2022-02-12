class CastDemo{
    public static void main(String args[]) {

        int i=257;
        byte b;
        double d=323.42;

        System.out.println("Conversion of int into byte");
        b=(byte) i;
        System.out.println("i and b "+i+" "+b);

        System.out.println("Conversion of Double into int");
        i=(int)d;
        System.out.println("i and d "+i+" "+d);


        System.out.println("Conversion of double into byte");
        b=(byte)d;
        System.out.println("b and d "+b+" "+d);
        
    }


}