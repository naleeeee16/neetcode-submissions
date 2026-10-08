class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int el : nums){
           map.put(el, map.getOrDefault(el, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (n1, n2) -> map.get(n2) - map.get(n1)
        );
        for (int num : map.keySet()) {
            heap.add(num);
        }
        int[] res = new int[k];
        for (int i =0; i<k; i++){
            if (heap.size()>0){
                res[i]= heap.poll();
            }
        }
        return res;

    }
}
