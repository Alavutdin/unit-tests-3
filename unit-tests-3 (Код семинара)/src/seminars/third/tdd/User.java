package seminars.third.tdd;

public class User {

    String name;
    String login;
    String pass;
    boolean aunt;
    boolean admin;

    public User() {
        this.login = "admin";
        this.pass = "admin";
        aunt=false;
        admin=false;
    }

    public User(boolean admin) {
        this.admin = admin;
    }

    public boolean checkPass(String login, String pass) {
        if (this.login.equals(login) && this.pass.equals(pass)) {
            aunt=true;
            return true;
        } else {
            return false;
        }
    }


    public boolean evenOddNumber(int n){
        if (n%2==0) return true;
        return false;
    }
    public boolean numberInInterval(int n){
        if (n>=25 && n<=100) return true;
        return false;
    }
}