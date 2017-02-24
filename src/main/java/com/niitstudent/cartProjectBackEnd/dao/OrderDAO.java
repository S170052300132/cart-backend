package com.niitstudent.cartProjectBackEnd.dao;
import java.util.List;

import com.niitstudent.cartProjectBackEnd.domainobj.CartInfo;
import com.niitstudent.cartProjectBackEnd.domainobj.OrderDetailInfo;
import com.niitstudent.cartProjectBackEnd.domainobj.OrderInfo;
import com.niitstudent.cartProjectBackEnd.domainobj.PaginationResult;


public interface OrderDAO {
	public void saveOrder(CartInfo cartInfo);
	 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 

}
