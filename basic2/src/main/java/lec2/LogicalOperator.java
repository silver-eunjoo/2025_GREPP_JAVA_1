package lec2;

public class LogicalOperator {
    public static void main(String[] args) {

        boolean iAmTrue = true;
        boolean iAmFalse = false;

        // &&
        boolean andResult1 = iAmTrue && iAmTrue;
        System.out.println("andResult1 = " + andResult1);

        boolean andResult2 = iAmTrue && iAmFalse;
        System.out.println("andResult2 = " + andResult2);

        boolean andResult3 = iAmFalse && iAmFalse;
        System.out.println("andResult3 = " + andResult3);

        System.out.println();

        // ||
        boolean orResult1 = iAmTrue || iAmTrue;
        System.out.println("orResult1 = " + orResult1);

        boolean orResult2 = iAmTrue || iAmFalse;
        System.out.println("orResult2 = " + orResult2);

        boolean orResult3 = iAmFalse || iAmFalse;
        System.out.println("orResult3 = " + orResult3);

        System.out.println();

        // !
        boolean notTrueResult1 = !iAmTrue;
        System.out.println("notTrueResult1 = " + notTrueResult1);

        boolean notFalseResult1 = !iAmFalse;
        System.out.println("notFalseResult1 = " + notFalseResult1);



    }
}
