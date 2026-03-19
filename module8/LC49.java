// 49. Group Anagrams
class LC49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String w : strs) {
            char[] c = w.toCharArray();
            Arrays.sort(c);
            String sw = new String(c); 
            if (!map.containsKey(sw)) {
                map.put(sw, new ArrayList<>());
            }
            map.get(sw).add(w);
        }
        return new ArrayList<>(map.values());
    }
}