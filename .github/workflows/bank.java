import java.util.HashMap;

public class Bank {
    private HashMap<String, Account> accounts = new HashMap<>();

    public void createAccount(String username, String password) throws Exception {
        if (accounts.containsKey(username)) {
            throw new Exception("Account already exists.");
        }
        accounts.put(username, new Account(username, password));
    }

    public Account authenticate(String username, String password) throws Exception {
        Account account = accounts.get(username);
        if (account == null || !account.getPassword().equals(password)) {
            throw new Exception("Invalid username or password.");
        }
        return account; // Return the authenticated account
    }
}
