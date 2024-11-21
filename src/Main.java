public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.65;
        double weightInKilograms = 74.0;

        double index = service.calculate(heightInMeters, weightInKilograms);
        int result = (int) index;

        System.out.println(result);

    }

}