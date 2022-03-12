package Intro;

public class digitDegree {


    public static int digitDegree(int n, int count, int sum) {
  
      
        
        if (n == 1|| n == 2||n == 3||n == 4||n == 5||n == 6||n == 7||n == 8||n == 9) {
            return count;
        } else {
            sum = 0;
            while (n != 0) {
                sum += n % 10;
                n = n / 10;
            }
            System.out.println("sum: " + sum);
            count++;

            digitDegree(sum, count, sum);
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println("Degree: " + digitDegree(777773, 0, 0));
    }

}
