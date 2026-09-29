package ph.edu.liceo.portal.data;

import java.util.ArrayList;

import ph.edu.liceo.portal.model.User;

public class UserData {

    private ArrayList<User> users;

    public UserData() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public User findByEmail(String email) {

        for (User user : users) {

            if (user.getEmail().equalsIgnoreCase(email)) {
                return user;
            }
        }

        return null;
    }

    public User findById(int id) {

        for (User user : users) {

            if (user.getId() == id) {
                return user;
            }
        }

        return null;
    }
}