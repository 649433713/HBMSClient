package VO;

import java.io.Serializable;
import java.util.Date;

import VO.OrderVO;
import VO.WebMarketerAccountVO;;

public class AppealVO implements Serializable{
	Date time;
	WebMarketerAccountVO webMarketerAccountPO;
	String explanation;
	String state;
	OrderVO order;
	
	public AppealVO(Date t,WebMarketerAccountVO wMA,String e,
			String s,OrderVO o){
		time=t;
		webMarketerAccountPO=wMA;
		explanation=e;
		state=s;
		order=o;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public WebMarketerAccountVO getWebMarketerAccountPO() {
		return webMarketerAccountPO;
	}

	public void setWebMarketerAccountPO(WebMarketerAccountVO webMarketerAccountPO) {
		this.webMarketerAccountPO = webMarketerAccountPO;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public OrderVO getOrder() {
		return order;
	}

	public void setOrder(OrderVO order) {
		this.order = order;
	}

}
