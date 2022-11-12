package EasyProblems;

public class LC_1528_ShuffleString_Java {
    public String restoreString(String s, int[] indices) {
            char[] result = new char[s.length()];
            for(int i = 0; i < indices.length; i++){
                result[indices[i]] = s.charAt(i);
            }
            String str = String.valueOf(result);
            System.out.print(str);
            return str;
    }

}
