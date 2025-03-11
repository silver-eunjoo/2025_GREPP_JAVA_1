package day4.objects;


import day4.objects.inner.mat.Character;
import day4.objects.inner.mat.CharacterCompare;
import day4.objects.inner.mat.CharacterGoldComparator;
import day4.objects.inner.mat.CharacterLevelComparator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Comparing {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
    }

    private static void test6() {

        List<Character> userGuild = makeGuild(10);

//        userGuild.sort((o1, o2) -> {
//            int result = Integer.compare(o1.getGold(), o2.getGold());
//
//            if(result == 0){
//                result = Integer.compare(o1.getLevel(), o2.getLevel());
//            }
//            return result;
//        });

//        userGuild.sort(
//                Comparator.comparing(
//                        (Character c)  -> c.getGold(), Comparator.reverseOrder()
//                ).thenComparing(
//                        (Character c) -> c.getLevel()
//                )
//        );

        userGuild.sort(
                Comparator.comparing(Character::getGold, Comparator.reverseOrder()).thenComparing(Character::getLevel)
        );



    }

    private static void test5() {
        List<Character> userGuild = makeGuild(10);
        System.out.println("userGuild = " + userGuild);

        // Spring Application -> Database 에서는 SQL로 정렬할 수 있기 때문에
        // 완전히 이해 못하더라도 괜찮음. 다만, 알고리즘이나 객체로 뭔갈 할 때 도움이 됨.
        CharacterGoldComparator goldComparator = new CharacterGoldComparator();
        CharacterLevelComparator levelComparator = new CharacterLevelComparator();

        userGuild.sort(goldComparator);
        userGuild.sort(levelComparator);
        // 그냥 level로 정렬한 거랑 동일함.

        System.out.println("userGuild = " + userGuild);

    }

    private static void test4() {

        System.out.println("Comparing.test4");
        List<Character> userGuild = makeGuild(3);

        System.out.println("userGuild = " + userGuild);

        // gold순으로 정렬
        CharacterGoldComparator comparator = new CharacterGoldComparator();
        userGuild.sort(comparator);

        System.out.println("userGuild = " + userGuild);

    }

    private static ArrayList<Character> makeGuild(int guildSize) {
        return new ArrayList<>(
                IntStream.rangeClosed(1, guildSize)
                        .mapToObj(
                                i -> generateCharacter(i
                                        , generateRandomNumber(100)
                                        , generateRandomNumber(10_000)
                                        , generateRandomNumber(10))
                        ).toList());
    }

    private static void test3() {
        System.out.println("Comparing.test3");
        int PARTY_SIZE = 5;

        List<CharacterCompare> raidParty = makeParty(PARTY_SIZE);
        System.out.println("raidParty = " + raidParty);

        raidParty.sort(null);
        System.out.println("raidParty = " + raidParty);

    }

    private static ArrayList<CharacterCompare> makeParty(int partySize) {
        return new ArrayList<>(
                IntStream.rangeClosed(1, partySize)
                        .mapToObj(i -> new CharacterCompare("user_" + i
                                , generateRandomNumber(100)
                                , generateRandomNumber(10_000)
                                , generateRandomNumber(10))
                        )
                        .toList()
        );
    }

    static int generateRandomNumber(int size) {
        return (int) (Math.random() * size) + 1;
    }

    private static void test2() {

        CharacterCompare user1 = new CharacterCompare(
                "user_2"
                , 15
                , 1_000
                , 2
        );
        CharacterCompare user2 = new CharacterCompare(
                "user_2"
                , 15
                , 1_000
                , 2
        );

        // user1이 더크면 1
        // user2가 더크면 -1
        // 같다면 0
        int isUser1HigherThanUser2 = user1.compareTo(user2);

        System.out.println("isUser1HigherThanUser2 = " + isUser1HigherThanUser2);


    }

    private static Character generateCharacter(int userNumber, int userLevel, int userGold, int itemAmount) {
        String PREFIX = "user_";
        return new Character(
                PREFIX + userNumber
                , userLevel
                , userGold
                , itemAmount
        );
    }

    private static void test1() {

        Character user1 = new Character(
                "user_1"
                , 10
                , 10_000
                , 10
        );

        Character user2 = new Character(
                "user_2"
                , 15
                , 1_000
                , 2
        );

    }
}