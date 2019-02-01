import java.util.Vector;

public abstract class Ticket {
    protected int _cost;
    protected String _description;

    public String printCost(Vector<Integer> costList) {
        String msg = "(Cost=$"+ _cost;
        int total = _cost;
        for (int cost : costList){
            msg += "+$" + cost;
            total += cost;
        }
        msg += "=$" + total + ')';

        return msg;
    }

    public String printCost() {
        return "Cost=$"+ _cost;
    }

    public String printDescription() {
        return _description;
    }
}
