public class Main {
    public static void main (String[] args) {
        byte myChallengeByte = 10;
        short myChallengeShort = 20;
        int myChallengeInt = 1;
        long myChallengeLong = 50000L + 10L *(myChallengeByte + myChallengeInt + myChallengeShort);
        System.out.println(myChallengeLong);
    }

}
