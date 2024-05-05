package se.zust.edu.cn;

public interface UserServiceI {
    boolean login(String username, String password);
    boolean logout();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(String username);

}
