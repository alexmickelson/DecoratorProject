import java.util.Vector;

public abstract class Addon extends Ticket {
    private Ticket _ticket;
    int _cost;


    public Addon(Ticket ticket){
        _ticket = ticket;
    }

    public String printCost(){

        Vector<Integer> costList = new Vector<>();
        costList.add(_cost);
        return _ticket.printCost(costList);
    }
    public String printCost(Vector<Integer> costList ){
        costList.add(_cost);
        return _ticket.printCost(costList);
    }
    public String printDescription(){
        return _ticket.printDescription() + ", " +  _description;
    }
}
