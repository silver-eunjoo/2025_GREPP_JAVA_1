package day4.encapsulation;

public class EncTests {
    public static void main(String[] args) {
        Encapsulation friend = new Encapsulation("JD"
                , 24
                , "Mannheim University"
                , 3
        );

        System.out.println("JD.name = " + friend.getName());

        friend.setName("DJ");
        System.out.println("friend's name = " + friend.getName());

    }
}
