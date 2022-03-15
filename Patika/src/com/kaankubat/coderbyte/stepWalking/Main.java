package com.kaankubat.coderbyte.stepWalking;

import java.util.*;

class Main {

    static int CombinatoricsChallenge(int num) {
        // code goes here
        if (num <= 1)
            return num;

        return CombinatoricsChallenge(num - 1) + CombinatoricsChallenge(num - 2);

    }

    static int CombinatoricsChallengeII(int s) {
        return CombinatoricsChallenge(s + 1);
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CombinatoricsChallengeII(Integer.parseInt(s.nextLine())));
    }

}