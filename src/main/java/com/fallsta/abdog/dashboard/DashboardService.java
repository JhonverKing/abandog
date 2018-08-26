package com.fallsta.abdog.dashboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fallsta.abdog.VO.BasicVO;
import com.fallsta.abdog.VO.RecentlyVO;



@Service
public class DashboardService {
	@Autowired
	private DashboardDao dashboardDao;

	public List getRecentlyAbdog(BasicVO basicVO) {
		List<RecentlyVO> recentlyDataList = dashboardDao.getRecentlyAbdog(basicVO);
		return recentlyDataList;
	}
	
}
