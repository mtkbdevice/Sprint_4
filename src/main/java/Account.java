public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        return name.length() >= 3 && name.length() <= 19 && spaceChecker();
    }

    private boolean spaceChecker(){
        char[] nameArray = name.toCharArray();
        int counter = 0;
        for(int i = 0; i < name.length(); i++){
            if(Character.isWhitespace(nameArray[i])){
                counter++;
            }
        }
        if(!name.startsWith(" ") && !name.endsWith(" ")&& counter == 1){
            return true;
        }
        else
            return false;
    }
}
