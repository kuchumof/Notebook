package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Supplier;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Service {

    public static List<Supplier> SUPPLIERS = new ArrayList<>();

    public static void printOutMainMenu() {
        System.out.println("Please select an action. Pressing :\n"
                + "1 Search\n"
                + "2 Add new date  \n"
                + "3 Edit current \n"
                + "Select 0 for exit\n\n"
                + "AFTER SELECT OPTIONS PRESS \"ENTER\"");
    }

    /**
     * Method for search
     */
    public static List<Supplier> find(String example) {
        List<Supplier> newListSupplier = new ArrayList<>();
        for (int i = 0; i < SUPPLIERS.size(); i++) {
            Supplier supplier = SUPPLIERS.get(i);
            if (supplier.getInn() != null && supplier.getInn().toString().contains(example)) {
                newListSupplier.add(supplier);
            }
            if (supplier.getCompanyName() != null && supplier.getCompanyName().contains(example)) {
                newListSupplier.add(supplier);
            }
        }
        return newListSupplier;
    }

    /***/
    public static Supplier getByInn(Long Inn) {
        for (int i = 0; i < SUPPLIERS.size(); i++) {
            Supplier supplier = SUPPLIERS.get(i);
            if (supplier.getInn() != null && supplier.getInn().equals(Inn)) {
                return supplier;
            }
        }
        System.out.println("Inn not found");
        return null;
    }

        private static Scanner scanner = new Scanner(System.in);

        public void begins () {
            printOutMainMenu();
            int param = scanner.nextInt();
            while (param != 0) {
                switch (param) {
                    case 1:
                        System.out.println("Введите информацию для поиска");
                        scanner = new Scanner(System.in);
                        String stringForExample = scanner.nextLine();
                        System.out.println(find(stringForExample));

                        printOutMainMenu();
                        System.out.println("Please, select an action by pressing [0-3]");
                        param = scanner.nextInt();
                        break;
                    case 2:
                        Supplier supplier = new Supplier();

                        System.out.println("Enter INN: ");
                        while (!scanner.hasNextLong()) {
                            scanner.next();
                            System.out.println("Entered incorrectly INN! Please try again");
                        }
                        Long textInn = scanner.nextLong();
                        supplier.setInn(textInn);

                        System.out.println("Enter company name: ");
                        scanner = new Scanner(System.in);
                        String textCompanyName = scanner.nextLine();
                        supplier.setCompanyName(textCompanyName);

                        System.out.println("Enter email: ");
                        scanner = new Scanner(System.in);
                        String textEMail = scanner.nextLine();
                        Pattern pattern = Pattern.compile("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$");
                        Matcher matcher = pattern.matcher(textEMail);
                        while (matcher.matches() == false) {
                            System.out.println("Entered incorrectly email! Please try again");
                            scanner = new Scanner(System.in);
                            textEMail = scanner.nextLine();
                            matcher = pattern.matcher(textEMail);
                        }
                        supplier.seteMail(textEMail);

                        System.out.println("Enter contact name: ");
                        scanner = new Scanner(System.in);
                        String textContactName = scanner.nextLine();
                        supplier.setContactName(textContactName);

                        System.out.println("Enter phone number: ");
                        scanner = new Scanner(System.in);
                        String textPhoneNumber = scanner.nextLine();
                        supplier.setPhoneNumber(textPhoneNumber);

                        System.out.println("Enter mobile phone number: ");
                        scanner = new Scanner(System.in);
                        String textMobilePhoneNumber = scanner.nextLine();
                        if (textMobilePhoneNumber == null || textMobilePhoneNumber.isEmpty() || textMobilePhoneNumber.equals("")) {

                        } else {
                            Pattern pattern2 = Pattern.compile("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$");
                            Matcher matcher2 = pattern2.matcher(textMobilePhoneNumber);
                            while (matcher2.matches() == false) {
                                System.out.println("Entered incorrectly Mobile Phone Number! Please try again");
                                scanner = new Scanner(System.in);
                                textMobilePhoneNumber = scanner.nextLine();
                                matcher2 = pattern.matcher(textMobilePhoneNumber);
                            }
                        }
                        supplier.setMobilePhoneNumber(textMobilePhoneNumber);

                        System.out.println("Enter address: ");
                        scanner = new Scanner(System.in);
                        String textAddress = scanner.nextLine();
                        supplier.setAddress(textAddress);

                        System.out.println("Enter city: ");
                        scanner = new Scanner(System.in);
                        String textCity = scanner.nextLine();
                        supplier.setCity(textCity);

                        System.out.println("Enter type: ");
                        scanner = new Scanner(System.in);
                        String textType = scanner.nextLine();
                        supplier.setType(textType);

                        System.out.println("Enter \"1\" if company in OVP, else enter \"2\" ");
                        scanner = new Scanner(System.in);
                        String textIsOvp = scanner.nextLine();

                        boolean b1 = textIsOvp.equalsIgnoreCase("yes");
                        supplier.setOvp(b1);

                        if (textIsOvp.equalsIgnoreCase("yes")) {
                            supplier.setOvp(true);
                        } else {
                            supplier.setOvp(false);
                        }

                        System.out.println("Enter nomenclature: ");
                        scanner = new Scanner(System.in);
                        String textNomenclature = scanner.nextLine();
                        supplier.setNomenclature(textNomenclature);

                        System.out.println("Enter url: ");
                        scanner = new Scanner(System.in);
                        String textUrl = scanner.nextLine();
                        if (textUrl == null || textUrl.isEmpty() || textUrl.equals("")) {

                        } else {
                            Pattern pattern3 = Pattern.compile("^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]");
                            Matcher matcher3 = pattern3.matcher(textUrl);
                            while (matcher3.matches() == false) {
                                System.out.println("Entered incorrectly url! Please try again");
                                scanner = new Scanner(System.in);
                                textUrl = scanner.nextLine();
                                matcher3 = pattern.matcher(textUrl);
                            }
                        }
                        supplier.setUrl(textUrl);

                        System.out.println("Enter working hours: ");
                        scanner = new Scanner(System.in);
                        String textWorkingHours = scanner.nextLine();
                        supplier.setWorkingHours(textWorkingHours);

                        System.out.println("Enter comments: ");
                        scanner = new Scanner(System.in);
                        String textComments = scanner.nextLine();
                        supplier.setComments(textComments);

                        try (PrintWriter printWriter = new PrintWriter(new FileWriter("C:\\Users\\User\\IdeaProjects\\Notebook\\src\\main\\java\\service\\jsonSuppliers.json"))) {
                            Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
                            SUPPLIERS.add(supplier);
                            String jsonString = gson.toJson(SUPPLIERS);
                            printWriter.write(jsonString);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        printOutMainMenu();
                        System.out.println("Please, select an action by pressing [0-3]");
                        param = scanner.nextInt();
                        break;

                    case 3:
                        System.out.println("Enter INN: ");
                        scanner = new Scanner(System.in);
                        Long innForSearch = scanner.nextLong();
                       Supplier findedSupplier =getByInn(innForSearch);
                        System.out.println(findedSupplier);
                        System.out.println("Comments - "+findedSupplier.getComments());
                        System.out.println("Введите новую информ для поля комментарий");
                        scanner = new Scanner(System.in);
                        String newComments = scanner.nextLine();
                        findedSupplier.setComments(newComments);
                        try (PrintWriter printWriter = new PrintWriter(new FileWriter("C:\\Users\\User\\IdeaProjects\\Notebook\\src\\main\\java\\service\\jsonSuppliers.json"))) {
                            Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
                            SUPPLIERS.add(findedSupplier);
                            String jsonString = gson.toJson(SUPPLIERS);
                            printWriter.write(jsonString);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }



                        printOutMainMenu();
                        System.out.println("Please, select an action by pressing [0-3]");
                        param = scanner.nextInt();
                        break;

                    default:
                        param = 0;
                }
            }
        }
    }
