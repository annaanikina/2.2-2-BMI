public class BmiService {
    public double calculate(double weight, double hight) {
        double bmi = weight / Math.pow(hight, 2);
        return bmi;
    }

}
