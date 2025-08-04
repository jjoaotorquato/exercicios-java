public class ex20_MaiorNum {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        int greater = list[0];
        
        for(int nums : list){
            if(nums > greater){
                greater = nums;
            }
        }
        System.out.println("greater: "+greater);
    }
}
