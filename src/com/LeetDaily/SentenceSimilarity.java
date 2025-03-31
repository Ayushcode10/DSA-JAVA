package com.LeetDaily;

//1813. Sentence Similarity III

public class SentenceSimilarity {
    public static void main(String[] args) {
        String s1 = "Eating right now";
        String s2 = "Eating";
        System.out.println(areSentencesSimilar(s1,s2));
    }

    public static boolean areSentencesSimilar(String s1, String s2){
        String first = s1;
        String sec = s2;

        if (first.length() == sec.length()){
            return first.equals(sec);
        }

        if(sec.length() < first.length()){
            first = s2;
            sec = s1;
        }
        int i = -1;
        while (i+1<first.length() && first.charAt(i+1) == sec.charAt(i+1)){
            i++;
        }
        int j = first.length();
        int last = sec.length();
        while(j-1>=0 && first.charAt(j-1)==sec.charAt(last-1)){
            j--;
            last--;
        }
        if(i == first.length()-1 && sec.charAt(i+1) == ' '){
            return true;
        }
        if(j == 0 && sec.charAt(last-1) == ' '){
            return true;
        }
        if (i+1>=j && sec.charAt(i) == ' ' && sec.charAt(last) == ' '){
            return true;
        }
        return false;
    }
}
