import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar informações ao usuário
        System.out.print("Digite seu primeiro nome: ");
        String firstName = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String lastName = scanner.nextLine();

        System.out.print("Digite o dia do seu nascimento: ");
        int birthDay = scanner.nextInt();

        System.out.print("Digite o mês do seu nascimento: ");
        int birthMonth = scanner.nextInt();

        System.out.print("Digite o ano do seu nascimento: ");
        int birthYear = scanner.nextInt();

        // Criar um objeto da classe HeartRates
        HeartRates person = new HeartRates(firstName, lastName, birthDay, birthMonth, birthYear);

        // Exibir resultados
        System.out.println("\n Informações do Usuário");
        System.out.println("Nome: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Idade: " + person.calculateAge() + " anos");
        System.out.println("Frequência Cardíaca Máxima: " + person.calculateMaxHeartRate() + " bpm");
        System.out.println("Frequência Cardíaca Alvo: " + person.calculateTargetHeartRate());

        scanner.close();
    }
}
