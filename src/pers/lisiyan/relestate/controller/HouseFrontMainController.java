package pers.lisiyan.relestate.controller;


import org.springframework.stereotype.Controller;


import Util.DateUtil;


@Controller("houseFrontMainController")
public class HouseFrontMainController {

	private String navi;

	public void setNavi(String navi) {
		this.navi = navi;
	}
	

	public String todispatch(){
		
		System.out.println("navi-->"+navi);
		
		switch (navi) {
		case DateUtil.HOME:
			
			return "home";
			
		case DateUtil.REGISTESELLRHOUSE:
			
		
			return "registersellhouse";

		case DateUtil.RENTHOUSE:

		   
			return "renthouse";
			
		case DateUtil.SELLHOUSE:
			
			
			return "sellhouse";
			
		case DateUtil.REGISTERENTRHOUSE:
			
			return "registerrenthouse";
			

		}
	
		return "home";
		
	}
}
