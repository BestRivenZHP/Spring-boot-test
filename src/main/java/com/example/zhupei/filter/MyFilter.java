package com.example.zhupei.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class MyFilter implements Filter{

	
	  public void destroy() {
      }

      
      public void doFilter(ServletRequest srequest, ServletResponse sresponse, FilterChain
              filterChain)
              throws IOException, ServletException {
          HttpServletRequest request = (HttpServletRequest) srequest;
          //打印请求Url
          System.out.println("this is MyFilter,url :" + request.getRequestURI());
          filterChain.doFilter(srequest, sresponse);
      }

      
      public void init(FilterConfig arg0) throws ServletException {
      }
  
}
