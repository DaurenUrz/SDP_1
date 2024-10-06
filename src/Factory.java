interface Transport {
    void deliver();
}

class Truck implements Transport {
    public void deliver() {
        System.out.println("Delivering by land using a truck.");
    }
}

class Ship implements Transport {
    public void deliver() {
        System.out.println("Delivering by water using a ship.");
    }
}

class Drone implements Transport {
    public void deliver() {
        System.out.println("Delivering by air using a drone.");
    }
}

abstract class TransportFactory {
    public abstract Transport createTransport();
}

class LandTransportFactory extends TransportFactory {
    public Transport createTransport() {
        return new Truck();
    }
}

class WaterTransportFactory extends TransportFactory {
    public Transport createTransport() {
        return new Ship();
    }
}

class AirTransportFactory extends TransportFactory {
    public Transport createTransport() {
        return new Drone();
    }
}

public class Factory {
    public static void main(String[] args) {
        TransportFactory factory = new WaterTransportFactory();
        Transport transport = factory.createTransport();
        transport.deliver();
    }
}