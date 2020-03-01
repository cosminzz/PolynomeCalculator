import java.util.Collections;
import java.util.LinkedList;

public class EquationSplit {

    LinkedList<String> monomeList = new LinkedList<>();

    public void createMonomes(String eq) {
        splitEquation(eq);

        for (String mon : monomeList) {
            new Monome(mon).initializer();
        }
    }

    private void splitEquation(String eq) {
        Collections.addAll(monomeList, eq.split("([-+*/])"));
    }
}
