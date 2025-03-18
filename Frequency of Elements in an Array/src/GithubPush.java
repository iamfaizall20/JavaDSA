public class GithubPush {
    public static void ArraySort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 1, 3, 4, 2};
        boolean[] visited = new boolean[arr.length];
            ArraySort(arr);
            for (int i = 0; i < arr.length; i++) {
                if(visited[i])
                    continue;
                int count = 1;
                for (int j =i+1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println(arr[i] + " appeared " + count + " Times");
            }
    }
}