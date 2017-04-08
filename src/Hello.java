/**
 * Created by MoniMo on 4/8/17.
 */
public class Hello {
    public static void main(String[] args) {
        double cm = calcFeetAndInchesToCentimeters(5,6);
        System.out.println(cm);
        System.out.println(calcFeetAndInchesToCentimeters(66));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >= 0 || inches >=0 || inches <= 12)
            return 2.54*(feet*12 + inches);
        else return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >=0) {
            //int newInches = inches % 12;
            //int newFeet = (int) (inches / 12);
            return calcFeetAndInchesToCentimeters(((int)(inches/12)),inches%12);
        }
        else return -1;

    }

}
