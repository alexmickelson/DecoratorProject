import java.util.Vector;

public abstract class Ticket {
    protected int _cost;
    protected String _description;

    public String printCost(Vector<Integer> costList) {
        String msg = "(Cost=$"+ _cost;
        int total = _cost;
        for (int i = costList.size() - 1; i >= 0; i--) {
            msg += "+$" + costList.get(i);
            total += costList.get(i);
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
