package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        String num = String.valueOf(t);
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '-'){
                continue;
            }
            sum +=  Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        System.out.println(sum);
    }
}
