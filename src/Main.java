/*
Implement the getUserData () method that should return all parameters of the user, including all items that he is driving.
Implement checkLoginPassword() that checks login and password of user
If login and password is right it returns true else false;
 */

public class Main {
    public static void main (String[] Args) {
        User user = new User("Z123", "Zhandos", "Gabdullauly", "Jan", "Jan123");
        System.out.println(user.getUserData());

        System.out.println(user.checkLoginPassword("Jan", "Jan123"));
    }
}
