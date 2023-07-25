package isFinished;

public class highestScoringWord {
    public static String high(String s) {
        int[] letterScores = new int[26];
        for (int i = 0; i < 26; i++) {
            letterScores[i] = i + 1;
        }

        String[] words = s.split(" ");

        int maxScore = 0;
        String highestScoringWord = "";

        for (String word : words){
            if (word.isEmpty()){
                continue;
            }
            int score = 0;
            for(char c : word.toCharArray()) {
                int position = c - 'a';
                score += letterScores[position];
            }
            if (score > maxScore){
                maxScore = score;
                highestScoringWord = word;
            }

    }
        return highestScoringWord;
    }

    public static void main(String[] args) {
        System.out.println(high("ya zaebalsya nichego ne ponimat"));
    }
}
