package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        for (int i = 0; i <= lengthOfLastNumber; i++) {
            sum += buildNum(i);
        }
        System.out.println(sum);
    }

    public int buildNum(int numbLength){
        if (numbLength == 0){
            return 0;
        }
        StringBuilder num = new StringBuilder();
        for (int i = 1; i <= numbLength; i++) {
            num.append("9");
        }
        return Integer.parseInt(String.valueOf(num));
    }
}
