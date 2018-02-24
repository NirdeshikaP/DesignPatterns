public class Test {
    public static void main(String[] args){
        User user = new EconomyUser();
        Account account = user.createAccount();
        SecurityManager securityManager = user.createSecurityManager();
        try {
            securityManager.checkLimits(account);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
