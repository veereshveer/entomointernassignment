package office.management.employeemanagement.exception;

public class UserNotFoundException  extends RuntimeException{
    public UserNotFoundException (String massage) {
        super(massage);
    }
}
