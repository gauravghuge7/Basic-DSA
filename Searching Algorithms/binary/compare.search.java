for(int i=0; i<n; i++) {

   int start = i+1;
   int end = n-1;

   while(start <= end) {

       int mid = (start + end) / 2;

       if(numbers[i] + numbers[mid] == target) {

           ans[0] = i + 1;
           ans[1] = mid + 1;

           return ans;

       }
       else if(numbers[i] + numbers[mid] < target) {
           start = mid+1;
       }

       else {
           end = mid-1;
       }


   }

   

}