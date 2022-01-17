package example_for;

public class EnhancedFor {
    public static void main(String[] args) {
        // 향상된 for문
        // java 1.5 이상부터 지원

        String[] carBrandArr = {"hyundai", "kia", "bmw", "audi", "benz"};

        // 배열 또는 배열을 리턴하는 함수 (배열의 값을 변경 할 수는 없고 사용만 가능합니다)
        for(String brand : carBrandArr) {
            System.out.println(brand);
        }

    }
}
