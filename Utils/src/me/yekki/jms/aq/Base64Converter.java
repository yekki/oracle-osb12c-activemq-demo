package me.yekki.jms.aq;

import java.util.Base64;

import javax.xml.bind.DatatypeConverter;

public class Base64Converter {
   
    public static void main(String[] args) {
        
        byte[] binary = encode("hello");
        //System.out.println(decode2str("ZQ==".getBytes()));
        //System.out.println(new String(binary));
        System.out.println(encode2str("e"));
        
    }
    
    public static byte[] encode(String payload) {
        
        byte[] bytesEncoded = Base64.getEncoder().encode(payload.getBytes());
        return bytesEncoded;
    }
    
    public static String encode2str(String payload) {
        
        return new String(encode(payload));
    }
    
    public static byte[] decode(byte[] bytes) {
        
        byte[] valueDecoded = Base64.getDecoder().decode(bytes);
        return valueDecoded;
    }
    
    
    public static String decode2str(byte[] bytes) {
        
        return new String(decode(bytes));
    }
}
