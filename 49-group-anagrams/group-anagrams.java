class Solution {

     public List<List<String>> groupAnagrams(String[] strs) {
        List<HashMap<Character, Integer>> myMapList = new ArrayList<>();
        boolean[] visited = new boolean[strs.length]; // 1. The Marking Sheet
        for (String str : strs) {
            char[] cArray = str.toCharArray();
            HashMap<Character, Integer> cMap = new HashMap<>();
            for (char c : cArray) {
                cMap.put(c, cMap.getOrDefault(c, 0) + 1);
            }
            myMapList.add(cMap);

        }
        List<List<String>> res = new ArrayList<>();

        for (int i = 0; i < myMapList.size(); i++) {
            if (visited[i]) continue;
            List<String> groupList = new ArrayList<>();
            groupList.add(strs[i]);
            visited[i] =true;
            for (int j = 0; j < myMapList.size(); j++) {
                if (i == j || visited[j]) continue;
                if (myMapList.get(i).equals(myMapList.get(j)) ) {
                    groupList.add(strs[j]);
                    visited[j] =true;
                }
            }
            res.add(groupList);
        }
        return res;
    }
}
