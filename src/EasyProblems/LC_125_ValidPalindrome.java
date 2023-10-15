package EasyProblems;

public class LC_125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        String cleanS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int firstP = 0;
        int lastP = cleanS.length() - 1;

        while(firstP < lastP){
            if(cleanS.charAt(firstP) != cleanS.charAt(lastP)){
               return false;
            }
            else {
                firstP++;
                lastP--;
            }
        }
    return true;
    }
}
