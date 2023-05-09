package service;

public class Main {

    static {
        GsonParser.parse();
    }

    public static void main(String[] args) {
        Service service = new Service();
        service.begins();

    }

}
