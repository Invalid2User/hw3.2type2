public class BmiService {
    public void calculate(int weight, double height){

        int a = 2;
        double b = Math.pow(height, a);
        double bmi = (weight / b);

        System.out.println("Your BMI is " + bmi);
    }
}
