package com.hsy.springcloud.dao;

import com.hsy.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao {
    int create(Payment payment);
    Payment getPaymentById(Long id);
}
