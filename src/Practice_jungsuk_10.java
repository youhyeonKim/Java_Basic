import java.util.Scanner;

public class Practice_jungsuk_10 {

  public static void main(String[] args) {
    int answer = (int)(Math.random()*100)+1;
    int input = 0;
    int count = 0;
    Scanner s = new Scanner(System.in);
    do{
      count++;
      System.out.print("1~100 사이의 값을 입력하세요");
      input = s.nextInt();
      if (input < answer) {
        System.out.println("더 큰수를 입력하세요");
      }
      else if (input > answer) {
        System.out.println("더 작은수를 입력하세요");
      }
      else {
        System.out.println("맞혔습니다.");
        break;
      }
    }while(true);
    System.out.println("시도횟수는 "+count+"번입니다.");
  }

}
