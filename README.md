STEP5 book5 – 예외처리


![6](https://github.com/dino-21/book_spring_step5_exception/assets/80396471/13b72ea5-d289-4e67-a947-7654b7d6155a)


![2](https://github.com/dino-21/book_spring_step5_exception/assets/80396471/4bb504b2-9a70-483a-9c27-504c2357a918)
![1](https://github.com/dino-21/book_spring_step5_exception/assets/80396471/ded57a4f-4660-446b-afce-1ebdcc02f333)
![3](https://github.com/dino-21/book_spring_step5_exception/assets/80396471/3f55ae34-ce65-47b4-834d-4065f9bbe37e)
![5](https://github.com/dino-21/book_spring_step5_exception/assets/80396471/85384cf7-b2bf-4b15-a720-92a4456a9de1)


1. CommonExceptionAdivce.java  파일 만들기
@ControllerAdvice // Controller에서 발생한 예외처리


2. error_page.jsp 만들기
<p>${exception.getMessage() }</p>

3. servlet-context..xml 파일 수정
<!-- org.zerock.exception" 패키지 내의 컴포넌트들을 스캔하여 빈으로 등록 -->
<context:component-scan base-package="org.zerock.exception" />
...생략


4.  브라우저에서 확인
http://localhost:8081/sample/ex01?name=dino&age=bbb

5. error_page.jsp 수정
<!-- <p>${exception.getMessage() }</p> -->
<p>이 페이지는 공사중입니다.</p>

6. 브라우저에서 확인
http://localhost:8081/sample/ex01?name=dino&age=bbb
