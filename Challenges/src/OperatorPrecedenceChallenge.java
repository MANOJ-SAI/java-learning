public class OperatorPrecedenceChallenge {

    double value1;
    double value2;

    double result;

    double remainder;

    boolean value3;

    OperatorPrecedenceChallenge(double value1,double value2){
        this.value1 = value1;
        this.value2 = value2;
        this.result = (this.value1 + this.value2) * 100.00;
        this.remainder = this.result % 40.00;
        this.value3 = this.remainder == 0.00 ;
    }

    public void displayResult(){
        System.out.println("result = "+this.result);
        System.out.println("remainder = "+this.remainder);
        System.out.println("boolean value = "+this.value3);
    }


}
