int pairSum(int *arr, int size, int x)
{
	//Write your code here
     int count = 0; 
 
    for (int i = 0; i < size; i++){
        for (int j = i + 1; j < size; j++){
            if (arr[i] + arr[j] == x)
                count++;
        }
    }
 
    return count;
}
