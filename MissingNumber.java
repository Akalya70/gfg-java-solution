class Solution {
    int missingNum(int arr[]) {
        int n=arr.length+1;
        long expected=(long) n*(n+1)/2;
        long actual=0;
        for(int i=0;i<arr.length;i++){
            actual=actual+arr[i];
        }
        long missing=expected-actual;
        return (int)missing;
        
    }
}
