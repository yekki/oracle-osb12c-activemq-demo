package me.yekki.jms.aq;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class HelloWorld {
    public HelloWorld() {
        super();
    }
    
    @WebMethod
    public String sayHello(String msg) {
        
        return "Hello, " + msg;
    }
}
