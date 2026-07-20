class Solution {

    public void moveZeroes(int[] arr) {

        int n = arr.length;

        int temp[] = new int[n];

        int index = 0;

        for(int i = 0; i < n; i++){

            if(arr[i] != 0){

                temp[index] = arr[i];
                index++;
            }
        }

        while(index < n){

            temp[index] = 0;
            index++;
        }

        for(int i = 0; i < n; i++){

            arr[i] = temp[i];
        }
    }
}