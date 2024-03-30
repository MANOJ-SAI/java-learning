public class Main {
    public static void main(String[] args) {

        int challenge = 3;

        switch (challenge){
            case 1:
                (new OperatorPrecedenceChallenge(21.00,80.00)).displayResult();
                break;
            case 2:
                (new IfThenElseChallenge(800,5,100,true)).displayFinalScore();
                (new IfThenElseChallenge(10000,8,200,true)).displayFinalScore();
                break;
            case 3:
                MethodChallenge.displayHighScorePosition("Sai",MethodChallenge.calculateHighScorePosition(1500));
                MethodChallenge.displayHighScorePosition("Manoj",MethodChallenge.calculateHighScorePosition(1000));
                MethodChallenge.displayHighScorePosition("Krish",MethodChallenge.calculateHighScorePosition(500));
                MethodChallenge.displayHighScorePosition("Kalyan",MethodChallenge.calculateHighScorePosition(100));
                MethodChallenge.displayHighScorePosition("Siva",MethodChallenge.calculateHighScorePosition(25));
                break;
            default:
                System.out.println("default case");
        }



    }
}