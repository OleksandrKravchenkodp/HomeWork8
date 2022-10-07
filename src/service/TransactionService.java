package service;

import entity.Client;
import exception.UserExpectedError;
import util.Helper;

public class TransactionService {

    Client client = new Client();
    String IDString = client.getClientId();
    Helper helper = new Helper();

    public void transferOfMoney (Client client, String IDString) throws UserExpectedError {

        try{
            helper.checkParametrsOfClients(client.getClientId(), IDString);
        }catch (UserExpectedError error){
            throw new UserExpectedError();
        }


    }


}
