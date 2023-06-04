//2114. Maximum Number of Words Found in Sentences
//        A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
//        You are given an array of strings sentences, where each sentences[i] represents a single sentence.
//        Return the maximum number of words that appear in a single sentence.

//        Example 1:
//        Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
//        Output: 6
//        Explanation:
//        - The first sentence, "alice and bob love leetcode", has 5 words in total.
//        - The second sentence, "I think so too", has 4 words in total.
//        - The third sentence, "this is great, thanks very much", has 6 words in total.
//        Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.

package com.ArraysAndArrayList;
public class MaximumWordsInSentence {
    public static void main(String[] args) {
        String[] str = {"alice and bob loves leetcode","i think so too","this is great thanks very much"};
        System.out.println(mostWordsFound1(str));

    }
    public static int mostWordsFound(String[] sentences) {
        int words = Integer.MIN_VALUE;
        for (int i = 0;i<sentences.length;i++){
            int count = 0;
            String curr = sentences[i];
            for (int j = 0; j< curr.length() ; j++) {
                if(curr.charAt(j)==' '){
                    count++;

                }
                if(j==curr.length()-1){
                    count++;
                }

            }
            if(count>words){
                words  = count;
            }
        }

        return words;
    }

    //other way start the counting by 1
    public static int mostWordsFound1(String[] sentences) {
        int words = Integer.MIN_VALUE;
        for (int i = 0;i<sentences.length;i++){
            int count = 1;
            String curr = sentences[i];
            for (int j = 0; j< curr.length() ; j++) {
                if(curr.charAt(j)==' '){
                    count++;

                }
            }
            if(count>words){
                words  = count;
            }
        }
        return words;
    }
}
