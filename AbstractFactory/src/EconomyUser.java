public class EconomyUser implements User {
    @Override
    public Account createAccount() {
        return new Economy();
    }

    @Override
    public SecurityManager createSecurityManager() {
        return new Economy_SecurityManager();
    }
}
