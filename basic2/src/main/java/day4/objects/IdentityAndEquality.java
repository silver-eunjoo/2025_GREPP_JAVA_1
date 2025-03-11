package day4.objects;

import day4.objects.inner.MemberV1;
import day4.objects.inner.MemberV2;
import day4.objects.inner.MemberV3;

public class IdentityAndEquality {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
    }

    private static void test6() {
        MemberV3 member1 = new MemberV3(1, "John", "admin@example.com");
        MemberV3 member2 = new MemberV3(2, "John", "other@example.com");
        MemberV3 member3 = new MemberV3(3, "Tom", "admin@example.com");

        boolean result1 = member1.equals(member2);
        boolean result2 = member1.equals(member3);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);



    }

    // getClass 함수에 native가 붙어있음.
    // 컴파일러가 넣어주는 함수이다.
    static void test5() {
        Class<MemberV2> memberV2Class = MemberV2.class; // 메타정보가 들어있는 JVM이 달아주는 객체
        System.out.println("memberV2Class = " + memberV2Class);

        MemberV1 member1 = new MemberV1(1, "John", "admin@example.com");
        MemberV1 member2 = new MemberV1(1, "John", "admin@example.com");

        boolean result1 = member1.getClass() == member2.getClass();
        System.out.println("result1 = " + result1); // true

    }

    // Objects - util

    private static void test4() {
        System.out.println("IdentityAndEquality.test4");

        MemberV2 member1 = new MemberV2(1, "John", "admin@example.com");
        MemberV2 member2 = new MemberV2(1, "John", "admin@example.com");

        System.out.println("member1.equals(member2) = " + member1.equals(member2)); // true
        
    }

    private static void test3() {
        System.out.println("IdentityAndEquality.test3");

        // given
        MemberV1 member1 = new MemberV1(1, "John", "admin@example.com");
        MemberV1 member2 = new MemberV1(1, "John", "admin@example.com");

        // when
        boolean result = member1.equals(member2);

        // then
        System.out.println("(result==true) = " + (result == true));

        System.out.println("member1.equals(member2) = " + member1.equals(member2)); // false

        // equals의 규칙 (동등성 체크 on non-null object references)
        /*
            1. reflexive (반사성) : 자기 자신과 비교했을 땐 반드시 true가 반환된다.
            2. symmetric (대칭성) : 두 객체가 같다고 판단되면, 순서를 바꿔도 true가 반환되어야 한다.
            3. transitive (추이성) : 삼단 논법 느낌 a=b, b=c => a=c
            4. consistent (일관성) : 비교대상이 안 바뀌었을 때, 비교 결과가 항상 같게 나와야 한다.
            5. 비교 대상이 null 일 땐, 무조건 false를 반환한다.
         */
        
        
    }

    private static void test2() {
        System.out.println("IdentityAndEquality.test2");

        MemberV1 member1 = new MemberV1(1, "John", "admin@example.com");
        MemberV1 member2 = new MemberV1(1, "John", "admin@example.com");

        boolean result1 = member1 == member2; // 동일성 (Identity) // false

        System.out.println("result1 = " + result1);

        MemberV1 member3 = member1;

        boolean result2 = member3 == member1;
        System.out.println("result2 = " + result2); // true
    }

    private static void test1() {

        System.out.println("IdentityAndEquality.test1"); //soutm

        MemberV1 member1 = new MemberV1(1, "John", "admin@example.com");
        MemberV1 member2 = new MemberV1(1, "John", "admin@example.com");

        int member1_id = member1.getMemberId();
        int member2_id = member2.getMemberId();

        boolean result1 = member1_id == member2_id; // true

        System.out.println("result1 = " + result1);

        String name1 = member1.getName();
        String name2 = new String("John"); // 이건 객체를 또 만들게 되는 것임. 그럼 다른 곳에
        String name3 = "John";

        boolean result2 = name1 == name3; // 중복을 최소화하기 위해 문자열 상수 풀이 존재한다. 거기서 꺼내서 비교하기 때문에 name1== name3은 true가 나온다.
        boolean result3 = name1 == name2; //false
        System.out.println("result2 = " + result2); // true


        System.out.println("IdentityAndEquality.test1");

    }
}
