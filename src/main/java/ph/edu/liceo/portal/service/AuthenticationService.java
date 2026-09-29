package service;

import ph.edu.liceo.portal.data.DataStore;
import ph.edu.liceo.portal.model.AccountStatus;
import ph.edu.liceo.portal.model.User;

public class AuthenticationService {

    public User login(String email, String password) {

        for (User user : DataStore.users) {

            if (user.getEmail().equalsIgnoreCase(email)
                    && user.getPassword().equals(password)) {

                if (user.getStatus() == AccountStatus.ACTIVE) {
                    return user;
                }

                return null;
            }
        }

        return null;
    }
}