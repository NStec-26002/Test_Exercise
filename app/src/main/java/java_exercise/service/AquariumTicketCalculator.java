package java_exercise.service;

public class AquariumTicketCalculator {
    public int calcFee(int age) throws IllegalArgumentException {
        int result = 0;
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("age=" + age);
        }
        if (age >= 4 && age <= 6) {
            result = 400;
        } else if (age >= 7 && age <= 15) {
            result = 900;
        } else if (age >= 16 && age <= 120) {
            result = 2000;
        }
        return result;
    }
}
