package dcode.controller;

import java.util.List;

import dcode.model.request.ProductInfoRequest;
import dcode.model.response.ProductAmountResponse;
import dcode.service.ProductService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dcode")
public class DcodeController {

	private final ProductService service;

	//상품 가격 추출 api
	@GetMapping("/product-amount")
	public ResponseEntity<ProductAmountResponse> getProductAmount() {
		final ProductAmountResponse response = service.getProductAmount(getParam());

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	private ProductInfoRequest getParam() {
		return ProductInfoRequest.builder()
			.productId(1)
			.couponIds(List.of(1, 2))
			.build();
	}
}
