public class Session1{
    public static void main(String[] args) {
        int nums[] = {5,8,2,9,1};
        for(int n:nums){
            System.out.print(n+" ");
        }
        int nums[] = {1,2,3,4,5};
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        System.out.println(sum);

        int nums[] = {5,8,2,15,3};
        int max =nums[0];

        for(int i =0;i<nums.length;i++){
            if (nums[i] > max)
                max = nums[i]; 
        }
        System.out.println(max);
        int nums[] = {5,8,2,15,3};
        int max =nums[0];

        for(int i =0;i<nums.length;i++){
            if (nums[i] < max)
                max = nums[i]; 
        }
        System.out.println(max);

        int nums[] = {1,2,3,4,5,6,7,8,10};
        int odd = 0;
        int even = 0;

        for(int i =0;i<nums.length;i++){
            if (nums[i] % 2 == 0) {
                even = even +1;
            } else{
                odd = odd +1;
            }
        }
        System.out.println("the odd is "+ odd+" \n the even is :"+ even);

    }
}