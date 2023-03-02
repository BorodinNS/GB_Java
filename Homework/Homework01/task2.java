package Homework.Homework01;

//Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {
              
        int num = 1000;
                
        for (int i = 2; i < num; i++) {            
            boolean check = true;
            int sqrt_num = (int) Math.sqrt(i);
            for (int j = 2; j <= sqrt_num; j++) {
                if ((i % j) == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                
                System.out.print(i + ", ");
            }            
        }       
    }    
}