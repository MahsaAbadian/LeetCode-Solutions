class Solution {
    public void swap(int i, int j, int[] A){
        int temp = A[i];
        A[i]=A[j];
        A[j]=temp;
    }
    public int[] sortArrayByParity(int[] A) {
        int s = 0; int e = A.length-1;
        while(s<e){
            while(s<A.length && (A[s]&1)==0)
                s++;
            while(e>=0 && (A[e]&1)==1)
                e--;
            if(s>=e)
                break;
            swap(s,e,A);
            s++;
            e--;
        }
        return A;
    }
}
