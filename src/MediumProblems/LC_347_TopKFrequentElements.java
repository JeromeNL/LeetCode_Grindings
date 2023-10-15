package MediumProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC_347_TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> amount = new HashMap<>();
        List<Integer> results = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(amount.containsKey(nums[i])){
                amount.put(nums[i], amount.get(nums[i]) + 1);
            } else{
                amount.put(nums[i], 1);
            }
        }


        for (Map.Entry<Integer, Integer> set :
                amount.entrySet()) {

            System.out.println(set.getKey() + " = "
                    + set.getValue());
        }

        for (Map.Entry<Integer, Integer> set :
                amount.entrySet()) {

            int highestValue = 0;
            int highestKey = 0;
            for (Map.Entry<Integer, Integer> setTwo :
                    amount.entrySet()) {
                if(setTwo.getValue() > highestValue){
                    highestValue = setTwo.getValue();
                    highestKey = setTwo.getKey();
                }
            }
            results.add(highestKey);
            amount.remove(highestKey);
        }

        int[] intArray = new int[amount.size()];
        for (int i = 0; i < results.size(); i++) {
            intArray[i] = results.get(i);
        }

        System.out.println(intArray);
        return intArray;
    }
}



