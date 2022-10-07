import entity.Client;
import exception.WrongFieldException;
import exception.WrongSumException;
import service.TransactionService;
import util.Helper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Helper helper = new Helper();
        TransactionService transaction = new TransactionService();
        Client client = new Client("777", "Smith", "1234567890", 1000);


        client.setClientAccountId("0123456789");
        String secondClientID = client.getClientAccountId();

        String account;
        double sumOfMoney;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the accaunt of Client:");
            ;
            account = scanner.nextLine();
            helper.checkAccauntOfClient(account);
        } catch (Exception e) { // Я понимаю, что конструкция типа Exception e не есть хорошо, но не пропускает иные варианты
            do {
                boolean flag = helper.flag;
                System.err.println("You entered an invalid value, please try again");
                Scanner scanner = new Scanner(System.in);
                account = scanner.nextLine();
                try {
                    helper.checkAccauntOfClient(account);
                } catch (WrongFieldException ex) {
                    System.err.println("You entered an invalid value, please try again");
                    account = scanner.nextLine();
                }finally {
                    scanner.close();
                }
            } while (helper.flag == false);
        }


        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the client account to which you will transfer money:");
            ;
            account = scanner.nextLine();
            helper.checkAccauntOfClient(account);
        } catch (Exception e) { // Я понимаю, что конструкция типа Exception e не есть хорошо, но не пропускает иные варианты
            do {
                boolean flag = helper.flag;
                System.err.println("You entered an invalid value, please try again");
                Scanner scanner = new Scanner(System.in);
                account = scanner.nextLine();
                try {
                    helper.checkAccauntOfClient(account);
                } catch (WrongFieldException ex) {
                    System.err.println("You entered an invalid value, please try again");
                    account = scanner.nextLine();
                }finally {
                    scanner.close();
                }
            } while (helper.flag == false);
        }

        try /*(Scanner scanner = new Scanner(System.in))*/ {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the amount of money to transfer:");
            sumOfMoney = scanner.nextDouble();
            helper.checkSumOfClient(sumOfMoney);
        } catch (Exception e) {
            Scanner scanner = new Scanner(System.in);
            do {
                boolean moneyFlag = helper.moneyFlag;
                System.err.println("The amount you entered is greater than 1000, please try again");
                sumOfMoney = scanner.nextDouble();
                try {
                    helper.checkSumOfClient(sumOfMoney);
                } catch (WrongSumException ex) {
                    System.err.println("The amount you entered is greater than 1000, please try again");
                    sumOfMoney = scanner.nextDouble();
                }
            } while (helper.moneyFlag == false);

        }

        transaction.transferOfMoney(client, secondClientID);

    }


}
