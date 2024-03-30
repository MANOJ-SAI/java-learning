public class MethodOverLoading {
    public static double convertToCentimeters(int heightInInches){
        return heightInInches*2.54d;
    }

    public static double convertToCentimeters(int heightInfeet,int heightInInches){
        return convertToCentimeters((heightInfeet*12)+heightInInches);
    }
}
