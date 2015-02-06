package mfzszgs.service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import java.util.*;
import cn.mldn.lxh.vo.*;

@WebService
@SOAPBinding(style = Style.RPC)
public interface DaoServer {

	@WebMethod
	public boolean doCreate(Emp emp) throws Exception;

	@WebMethod
	public List<Emp> findAll(String keyWord) throws Exception;

	@WebMethod
	public Emp findById(int empno) throws Exception;
}
