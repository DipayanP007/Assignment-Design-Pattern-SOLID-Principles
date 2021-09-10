package SOLID.SingleResponsibility;

class ReverseString{

    String text;
    ReverseString(String text){
        this.text = text;
    }
    public String reverseString(){

        String tempString = "";
        for(int i = text.length() - 1; i >= 0; i--){
            tempString += text.charAt(i);
        }
        return tempString;
    }

}
