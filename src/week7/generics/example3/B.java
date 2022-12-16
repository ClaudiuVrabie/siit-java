package week7.generics.example3;

// PRIMITIVES CANNOT BE USED AS GENERICS
// CONVENTION IS TO USE CAPITAL LETTER WHEN DECLARING GENERICS
public class B<T> {

    T a;

    public B() {

    }

    public B(T a) {
        this.a = a;
    }
}
