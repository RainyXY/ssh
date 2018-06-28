package pers.lisiyan.relestate.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import pers.lisiyan.relestate.model.UserModel;

public class LoginCheckInteceptor implements Interceptor{

	@Override
	public void destroy() {
		System.out.println("登录检查拦截器销毁方法。。。");

	}

	@Override
	public void init() {
		System.out.println("登录检查拦截器初始化方法。。。");

	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("登录检查拦截器拦截方法。。。");
		
		UserModel userModel = (UserModel) ActionContext.getContext().getSession().get("um");
		if(userModel==null){
			System.out.println("go to login");
			return "login";
		}
		else{
			String result=ai.invoke();
			return result;
		}
		
		
		
		
	}
}
