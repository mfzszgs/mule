package myweb.service;  
import java.text.DateFormat;  
import java.util.ArrayList;
import java.util.Date;  
import java.util.List;

import javax.jws.WebService;  

import cn.mldn.lxh.vo.Emp;
@WebService(endpointInterface = "myweb.service.TimeServer")  
public class TimeServerImpl implements TimeServer {  
    /** 
     * 返回从1970年1月1日0点0时0分起的毫秒数 
     */  
    public long getTimeAsElapsed() {  
        return new Date().getTime();  
    }  
    /** 
     * 返回如“2009-12-21”格式的日期 
     */  
    public String getTimeAsString(String str) {  
        Date date = new Date();  
        DateFormat df = DateFormat.getDateInstance();  
        return df.format(date)+str;  
    }  
	public List<Emp> findAll(String keyWord) throws Exception {
		List<Emp> all = new ArrayList<Emp>() ;
//		String sql = "SELECT empno,ename,job,hiredate,sal FROM emp WHERE ename LIKE ? OR job LIKE ?" ;
//		this.pstmt = this.conn.prepareStatement(sql) ;
//		this.pstmt.setString(1,"%"+keyWord+"%") ;
//		this.pstmt.setString(2,"%"+keyWord+"%") ;
//		ResultSet rs = this.pstmt.executeQuery() ;
		Emp emp = null ;
		int i=2;
		while(i-- !=0){
			emp = new Emp() ;
			emp.setEmpno(1) ;
			emp.setEname("2") ;
			emp.setJob("3") ;
			emp.setHiredate(new Date()) ;
			emp.setSal(5) ;
			all.add(emp) ;
		}
//		this.pstmt.close() ;
		return all ;
	}
}  
