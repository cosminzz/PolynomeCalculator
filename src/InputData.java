import java.util.Scanner;

public class InputData {
    private Scanner in = new Scanner(System.in);
    private String equation;

    public void inputEquation() {
        System.out.println("Enter your equation:");
        this.equation = in.next();

        System.out.println("Equation: " + equation);
    }

    public String getEquation() {
        return equation;
    }
}
