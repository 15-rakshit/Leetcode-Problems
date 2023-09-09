class Solution {
    public int firstMissingPositive(int[] arr) {
        
    int i = 0;
    int n = arr.length;

    while(i<n){
   int correct = arr[i] - 1;

   if(arr[i] > 0 && arr[i] <= n && arr[i] != arr[correct]){

    swap(i, correct, arr);

   }

else{
    i++;
}

    } 


    for(int j =0; j < n; j++){

      if(arr[j] != j+1){
          return j+1;
      }

    }

    return n + 1;



    }

    public void swap(int a, int b, int[] arr){

        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}