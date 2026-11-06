import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Utils {
    public static void schoolClass2JSONFile(ArrayList<SchoolClass> elements){

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("elenco_classi.json")) {
            gson.toJson(elements, writer);
            System.out.println("File JSON creato con successo!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<SchoolClass> fromJSONFile2ArrayListOfSchoolClasses(String jsonFileName) {

        Gson gson = new Gson();
        ArrayList<SchoolClass> schoolClasses = null;

        try (FileReader reader = new FileReader(jsonFileName)) {
            Type listType = new TypeToken<ArrayList<SchoolClass>>() {
            }.getType();

            schoolClasses = gson.fromJson(reader, listType);

        } catch (IOException e) {
            System.err.println("Errore durante la lettura del file: " + e.getMessage());
        }
        return schoolClasses;
    }
}
