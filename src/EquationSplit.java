import java.util.Collections;
import java.util.LinkedList;

public class EquationSplit {

    LinkedList<String> monomeList = new LinkedList<>();
    Monome monome;

    public void createMonomes(String eq) {
        splitEquation(eq);

        System.out.println(monomeList); //todo remove print

        for (String mon : monomeList) {
            monome = new Monome(mon);
        }

    }


    private void splitEquation(String eq) {
        Collections.addAll(monomeList, eq.split("([-+*/])"));
    }
}
