public class BmiService {
    public double calculate(double heightInMeters, double weightInKilograms) {

        double index;
        index = weightInKilograms / (heightInMeters * heightInMeters);

        return index;
    }
}
