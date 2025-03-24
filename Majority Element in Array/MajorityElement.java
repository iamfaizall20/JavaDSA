public class MajorityElement {

    static int MajorityElementinArray(int[] arr){
      int count = 0 , current = -1;
      for(int k:arr){
          if(count == 0){
              current = k;
              count++;
          }else if(k == current){
              count++;
          }else{
              count--;
          }
      }
      return current;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,4,4,6,5,8,4,3,4};

        int majority = MajorityElementinArray(arr);
        System.out.println("Majority Element: "+majority);
    }
}
