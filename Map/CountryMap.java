import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountryMap {
    HashMap<String, String> M1;
    CountryMap(){
        this.M1 = new HashMap<>();
    }
    void saveCountryCapital(String CountryName, String capital) {
        this.M1.put(CountryName, capital);
    }
    String getCapital(String CountryName) {
        return this.M1.get(CountryName);
    }
    String getCountry(String capital){
        for (String country: M1.keySet()){
            if (M1.get(country).equals(capital)){
                return country;
            }
        }
        return null;
    }
    HashMap<String, String> mapCapitalCountry(){
        HashMap<String, String> M2 = new HashMap<>();
        for (Map.Entry<String, String> entry: M1.entrySet()){
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }
    ArrayList<String> getCountryList(){
        ArrayList<String> CountryList = new ArrayList<>();
        for (String country: M1.keySet()){
            CountryList.add(country);
        }
        return CountryList;
    }

    public static void main(String[] args) {
        CountryMap obj = new CountryMap();
        obj.saveCountryCapital("India", "New Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");

        System.out.println("Capital of India: " + obj.getCapital("India"));
        System.out.println("Country of Washington: " + obj.getCountry("Washington"));
        HashMap<String, String> M2 = obj.mapCapitalCountry();
        System.out.println("Country : Capital");
        for (Map.Entry<String, String> entry: M2.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        ArrayList<String> CountryList = obj.getCountryList();
        System.out.println("Country List: ");
        for (String country: CountryList){
            System.out.println(country);
        }
    }
    
}
