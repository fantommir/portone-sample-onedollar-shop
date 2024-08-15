package seaung.onedollershop.domain.service;

import com.siot.IamportRestClient.response.IamportResponse;
import com.siot.IamportRestClient.response.Payment;
import seaung.onedollershop.web.request.PaymentCallbackRequest;
import seaung.onedollershop.web.request.RequestPayDto;

public interface PaymentService {
    // 결제 요청 데이터 조회
    RequestPayDto findRequestDto(String orderUid);
    // 결제(콜백)
    IamportResponse<Payment> paymentByCallback(PaymentCallbackRequest request);
}
