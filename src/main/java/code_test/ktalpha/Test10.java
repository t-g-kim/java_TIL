package code_test.ktalpha;

public class Test10 {
    /*
    다음 SQL문에 대한 설명 중, 틀린 것을 고르시오

    SELECT ENAME, LOWER(ENAME), UPPER(LOWER(ENAME)), LENGTH(ENAME), ABS(SAL-COMM)
    FROM EMP
    WHERE LENGTH(ENAME) > 4
    ORDER BY LENGTH(ENAME);
    답안을 선택하세요.
    1
    `LOWER`는 소문자로 변환한 결과를 리턴하는 함수, `UPPER` 는 대문자로 변환한 결과를 리턴하는 함수, `LENGTH`는 문자열의 길이를 리턴하는 함수, `ABS`는 절대값을 리턴하는 함수이다.
    2
    `UPPER(LOWER(ENAME))`는 함수가 함수를 호출하는 Nested Function Call이며, `ENAME`을 소문자로 변환한 값을 리턴한다.
    3
    `LOWER`, `UPPER`, `LENGTH`, `ABS`와 같은 단일 행 함수는 SELECT 절, WHERE 절, ORDER BY 절에서 사용이 가능하다.
     */
}
