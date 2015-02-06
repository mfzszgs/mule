package myweb.service;  
import java.util.List;

import javax.jws.WebService;  
import javax.jws.WebMethod;  
import javax.jws.soap.SOAPBinding;  
import javax.jws.soap.SOAPBinding.Style;  

import cn.mldn.lxh.vo.Emp;
@WebService  
@SOAPBinding(style=Style.RPC)  
public interface TimeServer {  
    @WebMethod  
    String getTimeAsString(String str);  
    @WebMethod  
    long getTimeAsElapsed();  
    @WebMethod
	public List<Emp> findAll(String keyWord) throws Exception ;
}  
