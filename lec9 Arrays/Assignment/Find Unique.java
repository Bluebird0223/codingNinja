public class Solution{  

    public static int findUnique(int[] arr){
		//Your code goes here
        int k=0;
        boolean [] visited = new boolean[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            int x = arr[i];
            if(visited[i]==false) {
                boolean isDuplicate = false;
                for (int j = i + 1; j < arr.length; j++) {
                    if (x == arr[j]) {
                        isDuplicate = true;
                        visited[j] = true;
                    }
                }
                if (!isDuplicate)
                    k=x;

            }
        }

        return k;
        
    }
}
