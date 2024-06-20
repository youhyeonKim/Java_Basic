import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Array_max {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("5명의 학생 점수를 입력하세요");
        int[] score = new int[5];
        int temp;
        for(int i=0; i<score.length;i++){
            score[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0; i< 4;i++){
            for(int j=i+1; j< 5;j++){
                if(score[j] > score[i]){
                    temp = score[j];
                    score[j]  = score[i];
                    score[i] = temp;
                }
            }
        }
        for(int i=0; i<score.length;i++){
            System.out.println(i+"등 학생의 점수는"+score[i]);
        }

    }
}
