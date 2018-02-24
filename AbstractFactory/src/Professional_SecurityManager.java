public class Professional_SecurityManager implements SecurityManager{
    @Override
    public void checkLimits(Account account) throws Exception {

        if (account.getNumberOfMailboxes() > 5)
            throw new Exception("Number of mailboxes exceeded.");

        if (account.getStorage() > 50)
            throw new Exception("Number of hours exceeded.");
    }
}
