package ATMSystem;

public class Account {
    private int id;
    private String name;
    private int PIN;
    private float balance;
    private boolean lock = false;
    public Account(int id, String name, int pIN, float balance) {
        this.id = id;
        this.name = name;
        PIN = pIN;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPIN() {
        return PIN;
    }
    public void setPIN(int pIN) {
        PIN = pIN;
    }
    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public boolean isLock() {
        return lock;
    }
    public void setLock(boolean lock) {
        this.lock = lock;
    }
}
