public class DecoratorMain {
    public static void main(String args[]){
        Ticket ticket1 = new EphSlc();
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());

        ticket1 = new Usb(ticket1);
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());

        ticket1 = new Eyemask(ticket1);
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());

        ticket1 = new Wifi(ticket1);
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());

        ticket1 = new Parachute(ticket1);
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());

        ticket1 = new LiveTV(ticket1);
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());

        ticket1 = new Headphone(ticket1);
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());

        ticket1 = new Blanket(ticket1);
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());

        ticket1 = new Drink(ticket1);
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());

        ticket1 = new Luggage(ticket1);
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());

        ticket1 = new Luggage(ticket1);
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());






        ticket1 = new EphLax();
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());

        ticket1 = new Usb(ticket1);
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());

        ticket1 = new Eyemask(ticket1);
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());

        ticket1 = new Wifi(ticket1);
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());

        ticket1 = new Parachute(ticket1);
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());

        ticket1 = new LiveTV(ticket1);
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());

        ticket1 = new Headphone(ticket1);
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());

        ticket1 = new Blanket(ticket1);
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());

        ticket1 = new Drink(ticket1);
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());

        ticket1 = new Luggage(ticket1);
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());

        ticket1 = new Luggage(ticket1);
        System.out.println(ticket1.printDescription());
        System.out.println(ticket1.printCost());


        Ticket example1 = new EphLax();
        example1 = new Wifi(example1);
        example1 = new Blanket(example1);

        System.out.println("Example1: " + example1.printDescription() + " " + example1.printCost());

        Ticket example2 = new EphLax();
        example2 = new Wifi(example2);
        example2 = new Blanket(example2);
        example2 = new Blanket(example2);
        example2 = new Blanket(example2);
        example2 = new Eyemask(example2);
        System.out.println("Example2 " + example2.printDescription() + " " + example2.printCost());
    }
}
