public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        boolean isAlien = true;

        if(isAlien == true)
            System.out.println("true -- > I'm  an Alien");

        isAlien= true;

        if(isAlien == true){
            System.out.println("false --> I'm not an Alien");
            System.out.println("I'm scared of Alien");
        }
    }
}