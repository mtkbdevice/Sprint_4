public class Praktikum {

    public static void main(String[] args) {

        String nameAndSurname = "Franzz Kafka";
        Account account = new Account(nameAndSurname);

        if(account.checkNameToEmboss()){
            System.out.println("Валидация прошла");
        }
        else{
            System.out.println("Валидация не прошла");
        }
    }
}
