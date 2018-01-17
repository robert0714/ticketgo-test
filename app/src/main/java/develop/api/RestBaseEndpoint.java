package develop.api;
 

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory; 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import develop.service.api.model.ErrorResponse;

@RestController
public class RestBaseEndpoint extends WebMvcConfigurerAdapter {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@ExceptionHandler(Exception.class)
	@ResponseBody
	ResponseEntity<ErrorResponse> handleCommonBadRequest(HttpServletRequest req, Exception ex) {

		final String stackTrace = ExceptionUtils.getStackTrace(ex);

		final String msg = String.format("%s: \n %s", ex.getMessage(), stackTrace);

		ErrorResponse errorResponse = new ErrorResponse(msg, HttpStatus.EXPECTATION_FAILED);

		log.error(ex.getMessage(), ex);

		return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(errorResponse);

	}

}