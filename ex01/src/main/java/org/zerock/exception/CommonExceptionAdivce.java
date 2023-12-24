package org.zerock.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.log4j.Log4j;

@ControllerAdvice // Controller에서 발생한 예외처리
@Log4j
public class CommonExceptionAdivce {
  @ExceptionHandler(Exception.class)
  public String except(Exception ex, Model model) {
	log.error("execption----" + ex.getMessage());  // // 발생한 예외의 메시지를 로그에 기록
	model.addAttribute("exception", ex); // // 예외 정보를 모델에 추가하여 뷰에서 사용할 수 있도록한다.
	
	log.error(model); // 모델의 내용을 로그에 기록
	return "error_page"; // 예외가 발생했을 때 보여줄 에러 페이지의 뷰 이름을 반환합니다.
  }
}
