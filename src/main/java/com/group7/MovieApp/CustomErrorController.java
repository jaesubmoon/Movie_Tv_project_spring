package com.group7.MovieApp;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {
	@RequestMapping("/error")
	public String handleError(HttpServletRequest request) {
		// 404 : NotFound Error 명시
				Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
				Integer satusCode = Integer.valueOf(status.toString());
				if(satusCode== HttpStatus.NOT_FOUND.value())
					return "react/index";
				
				return "react/index";
	}

}
