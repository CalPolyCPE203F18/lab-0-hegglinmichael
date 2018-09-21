public class Lab00
{
    public static void main(String[] args)
    {
        int x = 5;
        String y = "hello";
        double z = 9.8;

        System.out.printf("x: %d y: %s z: %.1f\n", x, y, z);

        int[] nums = {3, 6, -1, 2};
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        int numFound = charCount(y, 'l');
        System.out.printf("Found: %d\n", numFound);

        for(int i = 1; i < 11; i++){
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println();

    }

    public static int charCount(String s, char c){

        int count = 0;

        for(char i : s.toCharArray()){
            if(i == c){
                count++;
            }
        }

        return count;
    }
}