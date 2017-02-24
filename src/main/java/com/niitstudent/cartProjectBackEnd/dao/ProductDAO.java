package com.niitstudent.cartProjectBackEnd.dao;

import com.niitstudent.cartProjectBackEnd.domainobj.PaginationResult;
import com.niitstudent.cartProjectBackEnd.domainobj.Product;
import com.niitstudent.cartProjectBackEnd.domainobj.ProductInfo;


public interface ProductDAO
{
	
	 public Product findProduct(String code);
	    
	    public ProductInfo findProductInfo(String code) ;
	  
	    
	    public PaginationResult<ProductInfo> queryProducts(int page,
	                       int maxResult, int maxNavigationPage  );
	    
	    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
	                       int maxNavigationPage, String likeName);
	 
	    public void save(ProductInfo productInfo);


}
