import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        final List<String> cityNames = new ArrayList<>(3);
        cityNames.add("Venezia");
        cityNames.add("Roma");
        cityNames.add("Messina");
        cityNames.add("Catania");
        cityNames.set(1,"Tegucigalpa");

        System.out.println(cityNames.toString());


        List<String> kingsOfRome = new ArrayList<>();
        kingsOfRome.add("Romulus");
        kingsOfRome.add("Numa Pompilius");
        kingsOfRome.add("Tullus Hostilius");
        kingsOfRome.add("Ancus Marcius");
        kingsOfRome.add("Lucius Tarquinius Priscus");
        kingsOfRome.add("Servius Tullius");
        kingsOfRome.add("Lucius Tarquinius Superbus");

        System.out.println(kingsOfRome.toString());

        String[] kingofRomeArray = kingsOfRome.toArray(new String[0]);
        kingofRomeArray[6] = "Lucius Tarquinius Supercar";

        System.out.println(Arrays.toString(kingofRomeArray));





    }
}