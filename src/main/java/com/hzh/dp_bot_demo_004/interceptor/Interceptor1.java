package com.hzh.dp_bot_demo_004.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Interceptor1 implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // TODO Auto-generated method stub
        String username = (String) request.getParameter("username");
        String password = (String)request.getParameter("password");
        //response.sendRedirect("/log.jsp");
        System.out.println(username);
        System.out.println(password);
        if(username!=null&&!username.equals("")){
            if(password!=null&&!password.equals("")){
                return true;
            }else{
                response.sendRedirect("/log.jsp");
          //      request.getRequestDispatcher("/log.jsp").forward(request,response);
                return false;
            }
        }else{
            response.sendRedirect("/log.jsp");
           // request.getRequestDispatcher("/log.jsp").forward(request,response);
            return false;
        }

    }
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("处理器后方法");
    }
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("处理器完成方法");
    }
}
