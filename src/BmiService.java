public class BmiService {
    public int calculate(double heightInMeters, double weightInKilograms) {

        double index;
        index = weightInKilograms / (heightInMeters * heightInMeters);

        return (int)index;
    }
}
