public class ex19_VerificarPar {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for (int i = 0; i < list.length; i++) {
            if(list[i] %2 == 0){
                System.out.println("even: "+list[i]);
            }
        }
    }
}
