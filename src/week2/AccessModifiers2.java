package week2;

public class AccessModifiers2 {
    private static AccesModifiers AccessModifiers

            ;

    public static void main(String[] args) {

        //works because .m1() is a public method
        AccessModifiers.m1();

        // does not work because .m2() has private access
//        AccessModifiers.m2();

        // works because .m3() is default and in the same package
        AccessModifiers.m3();


        //acts as default visibility because it's in the same package
        AccessModifiers.m4();
    }
}
