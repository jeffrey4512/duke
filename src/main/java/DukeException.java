public class DukeException extends Exception {
    /**
     * Constructor for DukeException class.
     *
     * @param message the error message to be displayed
     */
    public DukeException(String message) {
        super(message);
    }

    public String toString() {
        return getMessage(); // return only the exception message
    }
}
