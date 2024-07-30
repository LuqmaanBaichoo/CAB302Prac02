import java.util.ArrayList;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    // TODO Now: Add a constructor to initialize the users list with the default user
    public AuthenticationService() {
        users = new ArrayList<>();
        users.add(new User("defaultUser", "password123"));
    }

    // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise
    public User signUp(String userName, String password){
        for(User user : users){
            if(user.getUsername().equals(userName)) {
                return null;
            }
        }

        User newUser = new User(userName, password);
        users.add(newUser);

        return newUser;
    }
    // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise

    public User logIn(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }

        return null;
    }

}