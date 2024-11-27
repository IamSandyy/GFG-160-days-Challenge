class Solution {
    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int second_largest=-1;
        for( int i =arr.length-2;i>=0;i--){
            if(arr[i]!=arr[arr.length-1]){
                second_largest=arr[i];
                break;
            }
        
        } 
        return second_largest;// Code Here
    }
}