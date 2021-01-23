package org.example;

public class UserTestMain {

    public static void main(String[] args) {

        UserDAO udao = new UserDAOImpl();

        //udao.create();

        System.out.println(udao.getByFirstName("Lennart"));
        System.out.println(udao.getByFirstName("Valdemar"));
        System.out.println(udao.getByFirstName("Svea"));

        System.out.println(udao.getByLastName("Matsson"));
        System.out.println(udao.getByLastName("Waltersson"));
        System.out.println(udao.getByLastName("Solberg"));

        System.out.println(udao.update("530720-7675", "Alvin"));

        System.out.println(udao.remove("880930-0752"));
    }
}