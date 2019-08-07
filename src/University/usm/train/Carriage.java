package University.usm.train;

import University.usm.person.Person;

import java.util.List;

public class Carriage {

    private int seatsNumber;

    private CarriageClass carriageClass;

    private Luggage luggage;

    private int carriageNumber;

    private List<Person> passengers;

    public Carriage(int seatsNumber, CarriageClass carriageClass, Luggage luggage, int carriageNumber, List<Person> passengers) {
        this.seatsNumber = seatsNumber;
        this.carriageClass = carriageClass;
        this.luggage = luggage;
        this.carriageNumber = carriageNumber;
        this.passengers = passengers;
    }


    public List<Person> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Person> passengers) {
        this.passengers = passengers;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public CarriageClass getCarriageClass() {
        return carriageClass;
    }

    public void setCarriageClass(CarriageClass carriageClass) {
        this.carriageClass = carriageClass;
    }

    public Luggage getLuggage() {
        return luggage;
    }

    public void setLuggage(Luggage luggage) {
        this.luggage = luggage;
    }

    public int getCarriageNumber() {
        return carriageNumber;
    }

    public void setCarriageNumber(int carriageNumber) {
        this.carriageNumber = carriageNumber;
    }
}
