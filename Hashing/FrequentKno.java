import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Min-heap ordered by frequency
        PriorityQueue<Map.Entry<Integer,Integer>> pq =          //putting key and value in priority queue
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue()); //custome comparator
                        // Compare two entries (a and b)
                        // Subtract their values (frequency)
                        // If a.getValue() is smaller → a comes first.

        // Push entries in heap
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            pq.add(entry);
            if (pq.size() > k) {
                pq.poll(); // remove smallest frequency
            }
        }

        
        int[] result = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {
            result[i++] = pq.poll().getKey();
        }

        return result;
    }
}
