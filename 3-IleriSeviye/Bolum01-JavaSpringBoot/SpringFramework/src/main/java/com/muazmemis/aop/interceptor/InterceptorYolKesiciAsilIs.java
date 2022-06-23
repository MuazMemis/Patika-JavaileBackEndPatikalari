package com.muazmemis.aop.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@InterceptorYolKesici
public class InterceptorYolKesiciAsilIs {

    @AroundInvoke
    public Object loglama(InvocationContext context) {
        System.out.println("İlk Hali: " + context.getMethod().getName());

        // Kullanıcı giriş yapmış mı?
        boolean isLogin = false; // Yol kesici olacak değişken
        Object isContinue = null; // Eğer yol kesilmezse devam edecek.

        if (isLogin) {
            // Önce sisteme giriş yapsın
            System.out.println("!!! Önce sisteme giriş yapsın !!!");
            return null;
        } else {
            try {
                isContinue = context.proceed(); // devam etmesini sağlar
                System.out.println("Sonraki Hali: " + isContinue);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return isContinue;
        }

    }

}
