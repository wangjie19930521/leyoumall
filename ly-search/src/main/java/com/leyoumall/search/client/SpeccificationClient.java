package com.leyoumall.search.client;

import com.leyoumall.item.api.SpeccificationApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("item-service")
public interface SpeccificationClient extends SpeccificationApi {

}
