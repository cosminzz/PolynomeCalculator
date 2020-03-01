public class Main {
    public static void main(String[] args) {
        InputData inputData = new InputData();
        EquationSplit equationSplit = new EquationSplit();

        inputData.inputEquation();
        equationSplit.createMonomes(inputData.getEquation());
    }
}
