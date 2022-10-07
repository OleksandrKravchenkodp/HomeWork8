package entity;

public class Client {

    String clientId;
    String clientSurname;
    String clientAccountId;
    double sum;

    public Client() {
    }

    public Client(String clientId, String clientSurname, String clientAccountId, double sum) {
        this.clientId = clientId;
        this.clientSurname = clientSurname;
        this.clientAccountId = clientAccountId;
        this.sum = sum;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getClientAccountId() {
        return clientAccountId;
    }

    public void setClientAccountId(String clientAccountId) {
        this.clientAccountId = clientAccountId;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
