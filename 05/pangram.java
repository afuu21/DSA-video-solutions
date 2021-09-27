class Solution {
    public boolean checkIfPangram(String sentance){
        Set<Character> set = new HashSet<>();
        for(int i=0; i<sentance.length(); i++) {
            set.add(sentance.charAt(i));
        }
        return set.size()== 26;
    }
}