package Main;

import Solid_Pesquisa.User;

public class Main {
    public static void main(String[] args) {
       User user = new User("John Doe", "john@example.com");
        user.save();
    }
}