public class VariablesLesson {
    public static void main (String[] args) {
        int sum, num;
        sum = 0;
        num = 0;
        sum ++;
        sum += 5;
        sum *= 5;
        sum --;
        num = sum++;
        num = ++sum;
        System.out.println("sum = " + sum + ", num = " + num);
    }
}