class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,ArrayList<String>>hm=new HashMap<>();
        for(String s:strs)
        {
            char arr[]=s.toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);
            hm.putIfAbsent(sorted,new ArrayList<>());
            hm.get(sorted).add(s);
        }
        return new ArrayList<>(hm.values());

        
    }
}