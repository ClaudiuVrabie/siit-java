package week1;

public class FlowControl {

    public static void main(String[] args) {

        // only one of the branches is executed
        if (Integer.parseInt(args[0]) == 1) {
            System.out.println("Number from if is:" + args[0]);
        } else {
            System.out.println("Unknown number from if");
        }

        switch (Integer.parseInt(args[0])) {
            case 1:
                System.out.println("Number from switch is:" + args[0]);
                //if it's not mentioned, execution will pass to below option(s)
                break;
            case 2:
                System.out.println("Number from switch is: " + args[0]);
                break;
            default:
                System.out.println("Unknown number from switch");
        }

    }

}




