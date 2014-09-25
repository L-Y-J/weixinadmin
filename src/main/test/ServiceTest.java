import com.weixin.bean.WxOrganization;
import com.weixin.bean.WxUser;
import com.weixin.service.OrganizationSerVice;
import com.weixin.service.UserService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

/**
 * Created by yongjie on 14-9-22.
 */
public class ServiceTest {

	private static OrganizationSerVice organizationSerVice;
	private static UserService userService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		ApplicationContext applicationcontext = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/applicationContext.xml");
		organizationSerVice = (OrganizationSerVice) applicationcontext.getBean("OrganizationService");
		userService = (UserService) applicationcontext.getBean("UserService");
	}

	@Test
	public void getOrganizations(){
		List<WxOrganization> organizations = organizationSerVice.getOrganizations();
		for (WxOrganization o : organizations)
			System.out.println(o.getOrganizationName());
	}

	@Test
	public void getOrganization(){
		WxOrganization organization = organizationSerVice.getOrganization(2);
		System.out.println(organization.getId()+": "+organization.getOrganizationName());
	}

	@Test
	public void addOrganization(){
		WxOrganization wxOrganization = new WxOrganization();
		wxOrganization.setOrganizationLevel(0);
		wxOrganization.setOrganizationName("test4");
		organizationSerVice.addOrganization(wxOrganization);
	}

	@Test
	public void updateOrganization(){
		WxOrganization organization = organizationSerVice.getOrganization(1);
		organization.setOrganizationName("test11");
		organizationSerVice.updateOrganization(organization);
	}

	@Test
	public void delOrganization(){
		WxOrganization organization = organizationSerVice.getOrganization(1);
		organizationSerVice.delOrganization(organization);
	}

	@Test
	public void getUSers(){
		List<WxUser> users = userService.getUsers();
		for (WxUser u : users)
			System.out.println(u.getId());
	}

	@Test
	public void getUser(){
		WxUser user = userService.getUser(1);
		System.out.println(user.getId());
	}

	@Test
	public void addUser(){
		WxUser wxUser = new WxUser();
		wxUser.setDepartmentId(0);
		wxUser.setEmail("646558434@qq.com");
		wxUser.setEnable(1);
		wxUser.setGender(1);
		wxUser.setMobile("18207132940");
		wxUser.setName("liyongjie");
		wxUser.setPositionId(1);
		wxUser.setTel("6431892");
		wxUser.setWeixinId("weixin6");
		userService.addUser(wxUser);
	}

	@Test
	public void updateUser(){
		WxUser user = userService.getUser(1);
		userService.updateUser(user);
	}

	@Test
	public void delUser(){
		WxUser user = userService.getUser(1);
		userService.delUser(user);
	}
}
