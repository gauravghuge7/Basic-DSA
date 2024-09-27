for(int i = 0; i < n; i++) {
   int start = i + 1;
   int end = n - 1;

   while(start <= end) {

    
    int mid = start + (start + end) / 2;

    if(numbers[i] + numbers[mid] == target) {
        ans[0] = i + 1;  // Convert to 1-based index
        ans[1] = mid + 1; // Convert to 1-based index
        return ans;
    } 
    else if(numbers[i] + numbers[mid] < target) {
        start = mid + 1; // Move the start pointer to the right
    } 
    else {
        end = mid - 1; // Move the end pointer to the left
    }
   }
}