package evgenyt.MementoDemo;

/**
 * Memento pattern demo
 */

public class MementoDemo {
    /** Run point */
    public static void main(String[] args) {
        // Create originator and caretaker
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        // Set and memento originator state
        originator.setState("On");
        careTaker.setMemento(originator.saveState());
        System.out.println("State: " + originator.getState() );
        // Set new state
        originator.setState("Off");
        System.out.println("New state: " + originator.getState() );
        // Restore old state
        originator.restoreState(careTaker.getMemento());
        System.out.println("Restored state: " + originator.getState() );
    }
}
