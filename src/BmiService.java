public class BmiService {
    public int calculate(double height, int weight) {
        int result;
        if (height > 0) {
            result = (int) ((double) weight / (height * height));
        } else {
            result = 0;
        }
        return result;
    }
}
