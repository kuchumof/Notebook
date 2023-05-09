package service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Supplier;

import java.io.FileReader;
import java.util.List;

import static service.Service.SUPPLIERS;

public class GsonParser {
    public static void parse() {

        try (FileReader reader = new FileReader("C:\\Users\\User\\IdeaProjects\\Notebook\\src\\main\\java\\service\\jsonSuppliers.json")) {

            List<Supplier> supplier = new Gson().fromJson(reader, new TypeToken<List<Supplier>>() {
            }.getType());

            SUPPLIERS.addAll(supplier);

        } catch (Exception e) {
            System.out.println("Parsing error " + e.toString());
        }
    }
}