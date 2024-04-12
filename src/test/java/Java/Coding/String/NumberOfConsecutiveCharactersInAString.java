package Java.Coding.String;

public class NumberOfConsecutiveCharactersInAString {

    public String stringWithCharactersCount(String s) {

        if(s=="") {
            return s;
        }
        String finalString="";
        for(int i=0; i<s.length(); i++) {

            int count =1;
            while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)) {
                count++;
            }
            finalString = finalString + s.charAt(i) + count;
        }
        return  finalString;

    }

    public static void main(String[] args) {

        NumberOfOccurencesOfConsecutiveSimilarCharacters n = new NumberOfOccurencesOfConsecutiveSimilarCharacters();

        System.out.println(n.getStringWithNumberOfOccurences("aabbccdd"));

    }

}
