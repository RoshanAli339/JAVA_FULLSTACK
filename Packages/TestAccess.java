import test.Foundation;

public class TestAccess {
    public static void main(String[] args) {
        Foundation ob = new Foundation();
        // ob.var1 = 90; cannot access private variables
        // ob.var2 = 23; cannot access default variables
        // ob.var3 = 123; cannot access protected variables
        ob.var4 = 12323;
    }
}
