package com.fallsta.abdog.dashboard;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fallsta.abdog.VO.BasicVO;
import com.fallsta.abdog.VO.RecentlyVO;



@Repository
public class DashboardDao {

	@Autowired
	@Resource(name="sqlSessionAbandog")
	private SqlSession sqlSessionAbdog;
	
	public List<RecentlyVO> getRecentlyAbdog(BasicVO basicVO){
		return  sqlSessionAbdog.selectList("com.fallsta.abdog.dashboard.getRecentlyValue", basicVO);
		
	}
}
