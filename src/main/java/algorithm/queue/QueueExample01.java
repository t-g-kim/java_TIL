package algorithm.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample01 {
    public static void main(String[] args) {
        // 1. 선언
        Queue<Integer> q = new LinkedList<>();        // linked list로 선언해야함

// 2. 삽입
        q.add(10);            // {10}
        q.offer(2);            // {10, 2}

// 3. 프론트값 반환
        q.peek();            // 10

// 4. 삭제
        q.remove();
        q.poll();

// 5. 초기화
        q.clear();

// 6. 비었는지
        q.isEmpty();

        System.out.println(q.isEmpty());
    }
}
