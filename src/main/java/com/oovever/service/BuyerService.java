package com.oovever.service;

import com.oovever.dto.OrderDTO;

/**
 * @Author OovEver
 * @Date 2017/12/5 0:37
 */
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
