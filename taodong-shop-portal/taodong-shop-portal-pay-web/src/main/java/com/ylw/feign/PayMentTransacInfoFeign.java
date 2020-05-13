package com.ylw.feign;

import com.ylw.service.api.pay.PayMentTransacInfoService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("taodong-shop-service-pay")
public interface PayMentTransacInfoFeign extends PayMentTransacInfoService {

}
