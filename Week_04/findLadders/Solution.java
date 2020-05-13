class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

        List<List<String>> ans = new ArrayList<>();

        int l = beginWord.length();
        Map<String, List<String>> allComboDict = new HashMap<>();
        wordList.forEach(word -> {
            for (int i = 0; i < l; i++) {
                String newWord = word.substring(0, i) + "*" + word.substring(i + 1, l);
                List<String> transformations = allComboDict.getOrDefault(newWord, new ArrayList<>());
                transformations.add(word);
                allComboDict.put(newWord, transformations);
            }
        });
        System.out.println("------allComboDict:");
        System.out.println(allComboDict.toString());

        Queue<Pair<String, Integer>> q = new LinkedList<>();
        q.add(new Pair(beginWord, 1));
        Map<String, Boolean> visited = new HashMap<>();
        visited.put(beginWord, true);

        System.out.println("------loop queue:");
        while (!q.isEmpty()) {
            Pair<String, Integer> node = q.remove();
            String word = node.getKey();
            int level = node.getValue();
            System.out.println(String.format("word=%s, level=%d", word, level));
            for (int i = 0; i < l; i++) {
                String newWord = word.substring(0, i) + "*" + word.substring(i + 1, l);
                System.out.println(String.format("newWord=%s", newWord));
                for (String adjacentWord : allComboDict.getOrDefault(newWord, new ArrayList<>())) {
                    System.out.println(String.format("adjacentWord=%s", adjacentWord));
                    if (adjacentWord.equals(endWord)) {
                        ans.add(visited.keySet().toArray(String.class));

                    }
                    if (!visited.containsKey(adjacentWord)) {
                        visited.put(adjacentWord, true);
                        q.add(new Pair(adjacentWord, level + 1));
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");
        List<String> ans = solution.ladderLength(beginWord, endWord, wordList);
        System.out.println(ans.toString());
    }

}
