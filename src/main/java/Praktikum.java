public class Praktikum {

    public static void main(String[] args) {

        String nameAndSername = "Franzz Kafka";
        Account account = new Account(nameAndSername);

        if(account.checkNameToEmboss() == true){
            System.out.println("Валидация прошла");
        }
        else{
            System.out.println("Валидация не прошла");
        }
    }
}
