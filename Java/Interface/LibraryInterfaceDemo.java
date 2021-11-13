package Interface;

public class LibraryInterfaceDemo 
{
    public static void main(String[] args)
    {
        LibraryUser kidInstance = new KidUsers(10, "kid");
        kidInstance.registerAccount();
        kidInstance.requestBook();

        LibraryUser kidInstanceTwo = new KidUsers(18, "fiction");
        kidInstanceTwo.registerAccount();
        kidInstanceTwo.requestBook();

        LibraryUser adultInstance = new AdultUser(5, "kids");
        adultInstance.registerAccount();
        adultInstance.requestBook();

        adultInstance = new AdultUser(23, "fiction");
        adultInstance.registerAccount();
        adultInstance.requestBook();
    }
}
