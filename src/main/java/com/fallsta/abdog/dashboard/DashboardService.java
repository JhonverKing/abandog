package com.fallsta.abdog.dashboard;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fallsta.abdog.VO.BasicVO;
import com.fallsta.abdog.VO.RecentlyVO;



@Service
public class DashboardService {
	@Autowired
	private DashboardDao dashboardDao;

	public List getRecentlyAbdog() {
		List<RecentlyVO> dataList = dashboardDao.getRecentlyAbdog();
		return dataList;
	}
	
	public List getTodayAbdog() {
		//ZonedDateTime : ISO-8601 달력 시스템에서 정의하고 있는 타임존의 날짜와 시간을 저장하는 클래스
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		BasicVO basicVO = new BasicVO();
//		basicVO.setDt(seoulDateTime.toString());
		basicVO.setDt("2018-08-15");	//수집서버가 실행중이 아니므로 수정 전까지 18-08-15 로 설정
		
		List<RecentlyVO> dataList = dashboardDao.getTodayAbdog(basicVO);
		return dataList;
	}
	
}
