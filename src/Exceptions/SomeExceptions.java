package Exceptions;

import java.util.function.Predicate;

class Something extends Exception{}
class SomethingTwo extends Something{}

interface Starter{
    public void some() throws Something;
}
public class SomeExceptions implements Starter{
    @Override
    public void some() throws SomethingTwo {
        StringBuilder n = new StringBuilder().insert(0, "some");
        Predicate df = s -> s.equals("cleas");
    }

    public static void main(String[] args) {

    }
}
