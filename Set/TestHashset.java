import java.util.HashSet;
public class TestHashset {
    HashSet<String> H1;
    TestHashset(){
        this.H1 = new HashSet<>();
    }
    void saveCountryName(String CountryName){
        this.H1.add(CountryName);
    }
    String getCountryName(String CountryName){
        if (this.H1.contains(CountryName)){
            return CountryName;
        }
        else
            return null;
    }
    public static void main(String[] args) {
        TestHashset obj = new TestHashset();
        obj.saveCountryName("USA");
        obj.saveCountryName("India");
        obj.saveCountryName("Australia");
        obj.saveCountryName("South Africa");

        System.out.println("Testing for India: " + obj.getCountryName("India"));
        System.out.println("Testing for China: " + obj.getCountryName("China"));
    }
}
