package com.wcy.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 王Sir
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private Integer paymentId;

    private String paymentSerial;

}