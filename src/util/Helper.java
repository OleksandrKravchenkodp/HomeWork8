package util;

import entity.Client;
import exception.UserExpectedError;
import exception.WrongFieldException;
import exception.WrongSumException;


public class Helper {

    private Client client = new Client();
    private String str = client.getClientId();

    private double sum = client.getSum();

    private String firstClientID = client.getClientId();
    private String secondClientID = client.getClientId();
    public boolean flag;
    public boolean moneyFlag;

    public void checkAccauntOfClient(String str) throws WrongFieldException {
        flag = true;
        try {
            int checkAccId = str.length();
            if (checkAccId != 10) {
                throw new WrongFieldException();
            } else {
                System.out.println("The client ID parameter is valid");
            }
        } catch (WrongFieldException exeption) {
            System.err.println("Check the client ID parameter size!!!");
            flag = false;
            throw new WrongFieldException();
        }
        //блок finall тут не пишу, потому как тут не нужно закрывать никаких потоков и логики в методе как таковой нету.
    }

    public void checkSumOfClient(double sum) throws WrongSumException {
        try {
            if (sum > 1000) {
                System.err.println("Check customer's amount!!!");
                throw new WrongSumException();
            } else {
                System.out.println("The customer's amount is valid");
                moneyFlag = true;
            }
        } catch (WrongSumException exeption) {
            System.err.println("Please try again");
            moneyFlag = false;
            throw new WrongSumException();
        }
    }

    public void checkParametrsOfClients(String firstClientID, String secondClientID) {
        boolean check = firstClientID.equals(secondClientID);
        if (check == true) {
            System.out.println("ID match everything is ok!");
        } else {
            throw new UserExpectedError();
        }

    }

}
