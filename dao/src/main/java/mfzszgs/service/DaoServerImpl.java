package mfzszgs.service;
import java.text.DateFormat;  
import java.util.Date;  
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;  

import cn.mldn.lxh.vo.Emp;
@WebService(endpointInterface = "mfzszgs.service.Daoserver")  
public class DaoServerImpl {
	public boolean doCreate(Emp emp) throws Exception{
		return true;
	}
	public List<Emp> findAll(String keyWord) throws Exception{
		return null;
	}
	public Emp findById(int empno) throws Exception{
		return null;
	}
}
