public class Main {
    public static void main(String[] args) {

        int topScore = 80;

        if (topScore < 100){
            System.out.println("You got high score");
        }

        int secondTopScore = 60;

        if((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if(topScore > 90 || secondTopScore <=90)
            System.out.println("Either both conditions are true");

        int newValue = 50;

        if(newValue == 50){
            System.out.println("It is true");
        }

        boolean isCar = false;

        // if we use if(newValue = 50) it shows error because it is int value
        // below if condition is working because the if condition needs the boolean value. SSo we assign boolean value
        if(isCar = true){
            System.out.println("it's working");
        }
    }
}