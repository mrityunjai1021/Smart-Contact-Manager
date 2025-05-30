package com.scm.helpers;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import jakarta.servlet.http.HttpSession;

@Component
public class SessionHelper {

    @SuppressWarnings("CallToPrintStackTrace")
    public static void removeMessage(){
        try{
            @SuppressWarnings("null")
            HttpSession session=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
            .getRequest()
            .getSession();
            session.removeAttribute("message");
        }
        catch (Exception e) {
            System.out.println("Error in SessionHelper:"+e);
            e.printStackTrace();
        }  
    }
}
