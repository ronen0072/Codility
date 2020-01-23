class Solution {
    public int solution(int[] A) {
        int[] maxUpHere =  new int[A.length];
        maxUpHere[0] = A[0];

        for(int i = 1;  i < A.length; i++){
            maxUpHere[i] = Integer.MIN_VALUE;

            for(int die = 1; die <= 6; die++){
                if(i-die >= 0){
                    maxUpHere[i] = Math.max(maxUpHere[i], maxUpHere[i-die]+A[i]);
                }
            }
        }

        return maxUpHere[A.length -1];
    }
}
