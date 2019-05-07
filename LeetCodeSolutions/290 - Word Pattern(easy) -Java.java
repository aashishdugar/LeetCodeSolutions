class Solution {
	public boolean wordPattern(String pattern, String str) {
		String[] words = str.split(" ");

		if(words.length != pattern.length()) return false;

		Set set1 = new HashSet<>();
		Set set2 = new HashSet<>();
		Set set3 = new HashSet<>();

		for(int i = 0; i < words.length; i++) {
			set1.add(pattern.charAt(i));
			set2.add(words[i]);
			set3.add(pattern.charAt(i) + words[i]);
		}

		return (set1.size() == set2.size()) && (set2.size() == set3.size());
	}
}