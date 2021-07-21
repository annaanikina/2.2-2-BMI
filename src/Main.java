public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 53.2;
        double hight = 1.62;
        double bmi = service.calculate(weight, hight);
        System.out.println(bmi);
    }
}
