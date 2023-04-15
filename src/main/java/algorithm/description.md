
DFS 한드라마를 처음부터 끝까지 본다.
BFS 여러개의 드라마를 한편씩 챙겨본다.

유형  
경로탐색 유형 (최단거리, 시간)
네트워크 유형 (연결)

--- 
모든 경우의수를 확인해본다
DFS 한놈만 끝까지 팬다 -> 재귀함수, 재귀를 타고타고 타서 탈출조건에 먼저 도달하고 그다음 파라미터를 하나씩 바꿔가며 정답을 찾는다.
  
BFS 여러놈을 한대씩 떄리면서 가는 유형
Queue, linked list
가장 먼저 넣었던 것을 꺼내서, 연결된 점을 Queue에 넣기, queue가 빌때까지 반복
-> 순서가 보장되어야 하기때문에 queue, linked list를 사용

---
DFS는 동작 검증을 하기 쉽다. 하나의 조합을 완성해서 정답과 비교 또다른 조합을 완성해 비교, 확인이 빠르고 쉽다.

BFS는 한번의 여러조합을 한칸씩 만들어 정답을 비교하는 시점에 분석을 하기 쉽지 않다.
시간복잡도가 낮다

---
대표유형
경로탐색, 네트워크, 조합만들기 => DFS BFS

DFS : Stack
BFS : QUEUE



참고
https://www.youtube.com/watch?v=_hxFgg7TLZQ 
https://www.youtube.com/watch?v=BsYbdUnKZ-Y
https://www.youtube.com/watch?v=_2yD46UxSso&list=PLlV7zJmoG4XI9VguUVNMu3pCjssb4aR_0