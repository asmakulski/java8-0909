// remove all nulls from the code
public class UserService {

    // should return Optional object
    public User findUser(String lastName) {
        if ("kowalski".equalsIgnoreCase(lastName)) {
            return new User("Jan", "Kowalski", 32);
        } else if ("nowak".equalsIgnoreCase(lastName)) {
            return new User("Andrzej", "Nowak", 45);
        }

        return null;
    }

    // avoid throwing NullPointerException when no user found
    public String getUserDetails(String lastName) {
        User user = findUser(lastName);
        return user.toString();
    }

    // should throw AccessDeniedException if no user found
    public void authorizeUser(String lastName) {
        User user = findUser(lastName);
        if (user == null) {
            throw new AccessDeniedException("User not authorized");
        }
    }
}