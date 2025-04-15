//Write a program that prints numbers from 1 to 20 but skips numbers that are multiples of 5 using the continue statement.

public class _10_assignmentContinue {
    public static void main(String[] args) {
        for (int i = 1; i<=20;i++){
            if(i%5==0){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
