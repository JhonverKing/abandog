package com.fallsta.abdog.dashboard;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fallsta.abdog.VO.BasicVO;
import com.fallsta.abdog.VO.RecentlyVO;

@RestController
public class DashboardController { 
	@Autowired
	private DashboardService dashboardService;
	
	@RequestMapping("/getRecentlyAbdog")
	public List getRecentlyAbdog(){ 
		List<RecentlyVO> result = dashboardService.getRecentlyAbdog();
		return result; 
	}
	
	@RequestMapping("/getTodayAbdog")
	public List getTodayAbdog(){ 
		List<RecentlyVO> result = dashboardService.getTodayAbdog();
		return result; 
	}
	
	@RequestMapping("/getRangeAbdog")
	public List getRangeAbdog(){ 
//		List<RecentlyVO> result = dashboardService.getTodayAbdog();
		return null; 
	}
	
	@RequestMapping("/getTest")
	public String getTest(@RequestParam String str){   
		return "test : "+str;
	}
}
