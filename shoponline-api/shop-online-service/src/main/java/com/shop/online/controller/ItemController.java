package com.shop.online.controller;



import com.shop_online.api.spec.StoreApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;


public class ItemController implements StoreApi {
    @Override
    public ResponseEntity<Void> deleteOrder(Long orderId) {
        return null;
    }
}
