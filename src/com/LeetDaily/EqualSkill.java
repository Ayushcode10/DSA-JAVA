package com.LeetDaily;

import java.util.Arrays;

public class EqualSkill {

//    2491. Divide Players Into Teams of Equal Skill

    public static void main(String[] args) {
        int[] arr = {3,2,5,1,3,4};
        long ans = frequencyMethod(arr);
        System.out.println(ans);
    }

    public static long sortingMethod(int[] skill){
        //O(nLogn)

        int n = skill.length;
        int sum = 0;
        //sum all the elements
        for (int j : skill) {
            sum += j;
        }
        //calculate how many teams to form
        int totalTeams = n/2;
        //calculate how much totalSkill is required
        int targetSkill = sum / totalTeams;
        //initialise total chemistry
        long totalChem = 0;

        //sort the array
        Arrays.sort(skill);
        for (int i = 0; i<n/2; i++){
            //calculate the teamSkill by pairing the first and the last element
            //and adding them
            int teamSkill = skill[i] + skill[n-i-1];

            //if the teamSkill != targetSkill, then it cant be divided equally
            if (teamSkill != targetSkill){
                return -1;
            }

            //otherwise calculate the total chem as per the ques
            totalChem += (long)skill[i]*skill[n-i-1];
        }
        return totalChem;
    }


    public static long frequencyMethod(int[] skill) {
        //O(n)
        int n = skill.length;
        int sum = 0;
        //making an array to count the frequency of each skill level
        int[] skillFrequency = new int[1001];

        for(int playerSkill : skill){
            sum += playerSkill;
            //maintaining occurrences of the skills
            skillFrequency[playerSkill]++;
        }
        //calculating total Teams
        int totalTeams = n/2;
        //calculating total skill required to equalise each team
        int targetSkill = sum/totalTeams;
        //if cant be divided equally, quit
        if(sum % totalTeams != 0){
            return -1;
        }

        long totalChem = 0;


        for(int playerSkill : skill){
            //checking partner's skill required for the playerskill to get the target skill lv
            int partnerSkill = targetSkill - playerSkill;

            //if not present in the frequency table then quit
            if (skillFrequency[partnerSkill] == 0){
                return -1;
            }
            //otherwise calculate the chem as per the question
            totalChem += (long)playerSkill * (long)partnerSkill;
            //also keep removing the frequency after using the skill lv
            skillFrequency[partnerSkill]--;
        }
        // Return half of totalChemistry as each pair is counted twice
        return totalChem/2;

    }
}
