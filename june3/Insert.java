
// insertion of the java 
public class Insert {
    public static void main(String[] args) {
        int nums[] = {5,8,9,4,2,7};
        for(int i =1;i<nums.length;i++){
            int key = nums[i];
            int j = i-1;
            while (j>=0 && nums[j] > key) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }

        System.out.println("The out put is :");
        for(int n:nums){
            System.out.print(n+"  ");
        }
    }
}
