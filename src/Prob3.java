import java.util.Scanner;

public class Prob3 {

  public static void main(String[] args) {
    int[] numbers;
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("입력받을 숫자 개수: ");
    num = sc.nextInt();
    numbers = new int[num];
    for(int i=0; i<num; i++){
      numbers[i] = sc.nextInt();
    }
    for(int n:numbers)
      System.out.print(n+" ");
    Prob3.printUniqueNumber(numbers);
  }
  private static void printUniqueNumber(int[] array){

  }


}
