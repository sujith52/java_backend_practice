// bubble sort array



public class Bubble {
    public static void main(String[] args) {
        int nums[] = {6,9,8,4,2,1,3,5};
        int size = nums.length;
        int minindex = -1;
        int temp = 0;

        System.out.println("Before the sorting !");
        for(int n:nums){
            System.out.print(n+" ");
        }

        for(int i =0;i<size-1;i++){
            minindex = i;
            for(int j=i+1;j<size;j++){
                if(nums[minindex] > nums[j]){
                    minindex = j;
                }
            }
            temp = nums[minindex];
            nums[minindex] = nums[i];
            nums[i] = temp;

            System.out.println();
            for(int n:nums){
                System.out.print(n+" ");
            }
        }




        System.out.println("after  the sorting !");
        for(int n:nums){
            System.out.print(n+" ");
        }
    }
}