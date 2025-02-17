import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;

    public HeartRates(String firstName, String lastName, int birthDay, int birthMonth, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    // Método para calcular a idade
    public int calculateAge() {
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    // Método para calcular a frequência cardíaca máxima
    public int calculateMaxHeartRate() {
        return 220 - calculateAge();
    }

    // Método para calcular a frequência cardíaca alvo (50-85% da máxima)
    public String calculateTargetHeartRate() {
        int maxHeartRate = calculateMaxHeartRate();
        double lowerBound = maxHeartRate * 0.50;
        double upperBound = maxHeartRate * 0.85;
        return String.format("%.0f - %.0f bpm", lowerBound, upperBound);
    }

    // Métodos para obter os valores dos atributos
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

