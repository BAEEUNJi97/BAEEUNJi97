package Java_Pro_Study.s2operator;

import java.util.Scanner;

public class Q1_1 {

    public static void main(String[] args) {
        // Scanner 객체를 사용하여 사용자로부터 나이 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");

        // 입력받은 나이를 정수로 변환
        int age = scanner.nextInt();

        // 나이에 따라 다른 메시지 출력
        if (age >= 18) {
            System.out.println("당신은 성인입니다.");
        } else {
            System.out.println("당신은 미성년자입니다.");
        }

        // Scanner 닫기
        scanner.close();
    }}