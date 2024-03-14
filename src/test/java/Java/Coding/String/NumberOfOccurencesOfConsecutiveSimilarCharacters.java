package Java.Coding.String;

public class NumberOfOccurencesOfConsecutiveSimilarCharacters {

    public String getStringWithNumberOfOccurences(String s) {

        if(s.length()==0) {
            return "";
        }
        String finalString="";
        for(int i=0; i<s.length(); i++) {
            int count=1;
            while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)) {
                i++;
                count++;
            }
            finalString = finalString + s.charAt(i) + count;
        }
        return finalString;
    }

    public static void main(String[] args) {
        NumberOfOccurencesOfConsecutiveSimilarCharacters n = new NumberOfOccurencesOfConsecutiveSimilarCharacters();
        System.out.println(n.getStringWithNumberOfOccurences("aabbccdd"));
    }
}
