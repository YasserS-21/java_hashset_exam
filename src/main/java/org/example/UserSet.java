package org.example;




import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UserSet {

    public Set<String> userHashSet;
            
    public UserSet() {
        this.userHashSet = new HashSet<>();
    }

    public boolean addUser(String userName) {

        if (userName == null || userName.trim().isEmpty()){
            throw new IllegalArgumentException("Not a valid String");
        }
        if (containsUser(userName)) {
            return false;
        }
        return userHashSet.add(userName);
    }

    public boolean containsUser(String userName) {
        return userHashSet.contains(userName);
    }

    public int getUserCount() {
        return userHashSet.size();
    }

    public boolean removeUser(String userName) {
        return userHashSet.remove(userName);
    }

    public Set<String> getUsersWithPrefix(String prefix) {
        if (prefix == null) {
            throw new IllegalArgumentException("No NULL values");
        }
        Set<String> usersWithPrefix = new HashSet<>();
        for (String user : userHashSet) {

            if (user.startsWith(prefix)) {
                usersWithPrefix.add(user);
            }

        }
        return usersWithPrefix;
    }
    public boolean areAllUsersUnique(String[] users) {
        if (users == null) {
            throw new IllegalArgumentException("No null values");
        }
        UserSet testingUniqueUsers = new UserSet();
        for (String user : users) {
            testingUniqueUsers.addUser(user);
        }
        return testingUniqueUsers.getUserCount() == users.length;
    }





}
