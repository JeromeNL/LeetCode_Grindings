package EasyProblems;


public class LC_1859_SortingTheSentence_Java {
    public String sortSentence(String s) {
        String[] sorted = new String[200];
        int lastSpace = 0;

        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                if(lastSpace == 0){
                    String item = s.substring(0, i +1);
                    int pos = Character.getNumericValue(s.charAt(i));
                    sorted[pos - 1] = item;
                    lastSpace = i +1;
                }
                else{
                    String item = s.substring((lastSpace + 1), i +1);
                    int pos = Character.getNumericValue(s.charAt(i));
                    sorted[pos - 1] = item;
                    lastSpace = i +1;
                }
            }
        }
        String result = "";
        for(var item : sorted){
            if(item ==null) {
                result = result.substring(0, (result.length() - 1));
                break;
            }
            item = item.substring(0, (item.length() -1));
            result += item + " ";
        }

        System.out.println(result);
        return result;
    }
}
