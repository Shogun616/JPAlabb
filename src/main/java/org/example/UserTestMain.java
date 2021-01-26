package org.example;

public class UserTestMain {

    public static void main(String[] args) {

        UserDAO udao = new UserDAOImpl();

        udao.create(new User("880930-0472","Philip", "Mattsson", "phma", "philip.mattsson@iths.se"));

        System.out.println(udao.getByFirstName("Lennart"));
        System.out.println(udao.getByFirstName("Valdemar"));
        System.out.println(udao.getByFirstName("Svea"));

        System.out.println(udao.getByLastName("Matsson"));
        System.out.println(udao.getByLastName("Waltersson"));
        System.out.println(udao.getByLastName("Solberg"));

        System.out.println(udao.updateByUserName("580802-4175", "sius"));
        System.out.println(udao.updateByUserName("811008-5301", "sion"));

        System.out.println(udao.updateByFirstName("530720-7675", "Alvin"));
        System.out.println(udao.updateByLastName("910806-1370", "Muller"));

        System.out.println(udao.remove("880930-0472"));
    }
}