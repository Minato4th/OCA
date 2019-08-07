package Exceptions.Declaration;


public class Example2 {
}

class CanNotHopException extends Exception { }
class Hopper {
    public void hop() { }
}
//class Bunny extends Hopper {
//    public void hop() throws CanNotHopException { } // DOES NOT COMPILE
//}


//Checked exception
class Hopper2 {
    public void hop() throws CanNotHopException { }
}
class Bunny2 extends Hopper {
    public void hop() { }
}


//Runtime exception
class Hopper3 {
    public void hop() { }
}
class Bunny3 extends Hopper {
    public void hop() throws IllegalStateException { }
}