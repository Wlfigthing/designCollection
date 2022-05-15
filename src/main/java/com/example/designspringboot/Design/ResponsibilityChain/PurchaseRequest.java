package com.example.designspringboot.Design.ResponsibilityChain;

import lombok.Data;

@Data
public class PurchaseRequest {
    private int type = 0;//请求类型
    private float price = 0.0f;
    private int id = 0;
    //构造器
    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }


}
