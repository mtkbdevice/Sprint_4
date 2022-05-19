public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if(name.length() >= 3 && name.length() <= 19 && spaceChecker() == true){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean spaceChecker(){
        char[] nameArray = name.toCharArray();
        int counter = 0;
        for(int i = 0; i < name.length(); i++){
            if(Character.isWhitespace(nameArray[i]) == true){
                counter++;
            }
        }
        if(Character.isWhitespace(nameArray[0]) != true && Character.isWhitespace(nameArray[nameArray.length - 1]) != true && counter == 1){
            return true;
        }
        else
            return false;
    }
}
