abstract class Ticket {
    String source;
    String destination;


    Ticket(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    abstract double getPrice();

    void showTicket() {
        System.out.println("From: " + source + " To: " + destination);
        System.out.println("Price: $" + getPrice());
    }
}

class BusTicket extends Ticket {
    double busFare;

    BusTicket(String source, String destination, double busFare) {
        super(source, destination);
        this.busFare = busFare;
    }

    @Override
    double getPrice() {
        return busFare;
    }
}

class TrainTicket extends Ticket {
    double trainFare;

    TrainTicket(String source, String destination, double trainFare) {
        super(source, destination);
        this.trainFare = trainFare;
    }

    @Override
    double getPrice() {
        return trainFare;
    }
}


class TicketSystem {
    public static void main(String[] args) {
        BusTicket bus = new BusTicket("Delhi", "Banglore", 25.50);
        TrainTicket train = new TrainTicket("Delhi", "Banglore", 40.75);

        System.out.println("Bus Ticket:");
        bus.showTicket();

        System.out.println("\nTrain Ticket:");
        train.showTicket();
    }
}
