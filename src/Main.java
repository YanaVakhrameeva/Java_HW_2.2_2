public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int BMI = service.calculate(60, 170);
        System.out.println("Body Mass Index:" + BMI);
    }
}