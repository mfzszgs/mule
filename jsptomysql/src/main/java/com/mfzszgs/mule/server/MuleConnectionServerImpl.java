package com.mfzszgs.mule.server;

import java.net.URL;
import java.sql.Connection;
import javax.xml.ws.Service;

import com.mfzszgs.mysql.server.Conn;
import com.mfzszgs.mysql.server.MysqlConnectionServer;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.namespace.QName;

@WebService(endpointInterface = "myweb.service.MuleConnectionServer")
public class MuleConnectionServerImpl implements MuleConnectionServer {

	@Override
	@WebMethod
	public Conn getConnection(String dbdriver, String dburl,
			String dbuser, String dbpassword) throws Exception {
		// TODO Auto-generated method stub

		URL url = new URL("http://localhost:10101/mysql?wsdl");
		// 第一个参数是服务的URI
		// 第二个参数是在WSDL发布的服务名
		QName qname = new QName("http://server.mysql.mfzszgs.com/",
				"MysqlConnectionServer");
		// 创建服务
		Service service = Service.create(url, qname);
		// 提取端点接口，服务“端口”。
		MysqlConnectionServer mcs = service
				.getPort(MysqlConnectionServer.class);
		return mcs.getMysqlConnection(dbdriver, dburl, dbuser, dbpassword);
	}

}
