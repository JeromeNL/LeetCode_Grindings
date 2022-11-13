package EasyProblems;

import java.util.List;

public class LC_1773_CountItems_Java {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;
        String itemValue = "";

        for (var product : items) {
                switch (ruleKey) {
                    case "type":
                        itemValue = product.get(0);
                        break;
                    case "color":
                        itemValue = product.get(1);
                        break;
                    case "name":
                        itemValue = product.get(2);
                        break;
                }
                if (itemValue.equalsIgnoreCase(ruleValue)) {
                    counter++;
                }
        }
        return counter;
    }
}

