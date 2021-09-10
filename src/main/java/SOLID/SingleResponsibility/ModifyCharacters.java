package SOLID.SingleResponsibility;

class ModifyCharacters {

    String text = "";
    public ModifyCharacters(String text){
        this.text = text;
    }

    public String modifyCharactersAtOddIndex(){

        String  resultantText= "";
        for( int i = 0; i < text.length(); i++){
            if (i % 2 != 0)
                resultantText += Integer.toString(i);
            else
                resultantText +=text.charAt(i);
        }
        return resultantText;
    }

}