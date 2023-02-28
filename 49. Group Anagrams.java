class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     List<List<String>> result=new ArrayList<>();
     HashMap<String,List<String>> map=new HashMap<>();
    for(String values:strs){
        char[] characters=values.toCharArray();
        Arrays.sort(characters);
        String sorted=new String(characters);
        if(!map.containsKey(sorted)){
            map.put(sorted,new ArrayList());
        }
        map.get(sorted).add(values);
    }
    result.addAll(map.values());
    return result;
    }
}