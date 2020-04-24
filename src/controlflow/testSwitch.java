package controlflow;

public class testSwitch {
    public static void main(String[] args) {

        char alphabet = 'A';

        switch (alphabet) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(alphabet + " was found");
                break;
            default:
                System.out.println("no match");
                break;
        }
    }
}
