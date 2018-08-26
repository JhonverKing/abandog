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
	public List getRecentlyAbdog(BasicVO basicVO){ 
		List<RecentlyVO> result = dashboardService.getRecentlyAbdog(basicVO);
		return result; 
	}
	
	@RequestMapping("/getTest")
	public String getTest(@RequestParam String str){   
		return "test : "+str;
	}
}
