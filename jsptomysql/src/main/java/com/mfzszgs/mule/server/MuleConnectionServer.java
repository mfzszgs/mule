package com.mfzszgs.mule.server;

import java.sql.Connection;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.mfzszgs.mysql.server.Conn;

@WebService
@SOAPBinding(style = Style.RPC)
public interface MuleConnectionServer {
	@WebMethod
	public Conn getConnection(String dbdriver,String dburl,String dbuser,String dbpassword) throws Exception;
}
