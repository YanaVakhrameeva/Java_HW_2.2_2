public class BmiService {
    public int calculate(int weight, int height){
        int BMI = weight*10000/height/height;
        return BMI;
    }
}
