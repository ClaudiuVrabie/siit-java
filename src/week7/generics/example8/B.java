package week7.generics.example8;

public class B  implements I<String> {

    @Override
    public String doSomething(String s) {
        return s;
    }
}
