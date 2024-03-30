public class Main {
    public static void main(String[] args) {

        int challenge = 2;

        switch (challenge){
            case 1:
                (new OperatorPrecedenceChallenge(21.00,80.00)).displayResult();
                break;
            case 2:
                (new IfThenElseChallenge(800,5,100,true)).displayFinalScore();
                (new IfThenElseChallenge(10000,8,200,true)).displayFinalScore();
                break;
            default:
                System.out.println("default case");
        }



    }
}