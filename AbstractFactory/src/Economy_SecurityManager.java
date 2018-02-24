public class Economy_SecurityManager implements SecurityManager{
    @Override
    public void checkLimits(Account account) throws Exception {
        if (account.getHours() > 60)
            throw new Exception("Number of hours exceeded.");

        if (account.getSpeed() > 56)
            throw new Exception("Speed exceeded.");

        if (account.getNumberOfMailboxes() > 1)
            throw new Exception("Number of mailboxes exceeded.");

        if (account.getStorage() > 5)
            throw new Exception("Number of hours exceeded.");
    }
}
