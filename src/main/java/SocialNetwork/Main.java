package SocialNetwork;

import SocialNetwork.User;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Cele");
        User user2 = new User("Indi");
        User user3 = new User("Murmu");
        User user4 = new User("Agus");

        user1.addFollower(user2);
        user1.addFollower(user3);
        user1.addFollower(user4);

        user1.sendMessage("Hola seguidores");

        user1.deleteFollower(user2);

        user1.sendMessage("Hola a todxs!");

    }
}
