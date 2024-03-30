public class OperatorPrecedenceChallenge {

    double value1;
    double value2;

    double result;

    double remainder;

    boolean value3;

    OperatorPrecedenceChallenge(double value1,double value2){
        this.value1 = value1;
        this.value2 = value2;
        this.result = (this.value1 + this.value2) * 100.00d;
        this.remainder = this.result % 40.00d;
        this.value3 = this.remainder == 0 ? true : false ;
    }

    public void displayResult(){
        System.out.println("result = "+this.result);
        System.out.println("remainder = "+this.remainder);
        System.out.println("Is No Remainder = "+this.value3);
        if(!this.value3)
            System.out.println("Got some remainder "+this.remainder);
    }


}
