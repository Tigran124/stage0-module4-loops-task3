package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a = 0;
        int b = 1;
        int c = 0;
        if (lastFibonacci <= 2){
            if (lastFibonacci == 1){
                System.out.println(a);
            }else {
                System.out.println(a);
                System.out.println(b);
            }
        }else {
            System.out.println(a);
            for (int i = 1; i < lastFibonacci; i++) {
                c = a + b;
                b = a;
                a = c;
                System.out.println(c);
            }
        }
    }
}
