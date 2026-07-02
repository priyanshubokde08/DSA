class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int x : bulbs){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 == 1) list.add(entry.getKey());
        }
        Collections.sort(list);
        return list;
    }
}