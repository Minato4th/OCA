package University.usm.train;

import University.usm.person.Person;

import java.util.List;

public class Train {

    private String name;

    private String destination;

    private List<Carriage> carriages;

    private Person driver;

    public Train(String name, String destination, List<Carriage> carriages, Person driver) {
        this.name = name;
        this.destination = destination;
        this.carriages = carriages;
        this.driver = driver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<Carriage> getCarriages() {
        return carriages;
    }

    public void setCarriages(List<Carriage> carriages) {
        this.carriages = carriages;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }
}
