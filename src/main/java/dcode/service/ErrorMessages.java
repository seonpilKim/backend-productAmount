package dcode.service;

import lombok.Getter;

@Getter
public enum ErrorMessages {

	PRODUCT_NOT_FOUND("존재하지 않는 product입니다."),
	PROMOTION_NOT_FOUND("존재하지 않는 promotion입니다."),
	PROMOTION_PRODUCT_NOT_FOUND("해당 promotion이 적용되지 않은 product입니다."),
	PROMOTION_INVALID_PERIOD("현재 해당 promotion을 적용할 수 있는 기간이 아닙니다."),
	;

	private String message;

	ErrorMessages(String message) {
		this.message = message;
	}
}
