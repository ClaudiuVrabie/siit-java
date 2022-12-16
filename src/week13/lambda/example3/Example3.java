package week13.lambda.example3;

public class Example3 {
    public static void main(String[] args) {

//        FOCUS ON THE RIGHT SIDE OF THE ->
//       most used
        Z z1 = () -> 5;
        Z z2 = () -> m1();

//        "return" works only inside a block of code
        Z z3 = () -> {
            if(true) {
                m1();
            }else
                return 5;
            return 0;
        };
    }
    static int m1(){
        return 5;
    }
}
