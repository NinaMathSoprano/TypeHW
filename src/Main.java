//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ticketPrice = 11527;
        int bonus1mile = 20;
        int numberOfMiles = ticketPrice / bonus1mile;

               System.out.println("При покупке билета стоимостью " + ticketPrice + " рублей ваш бонус составит " + numberOfMiles + " миль.");
    }
}