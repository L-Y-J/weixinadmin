import com.weixin.service.OrganizationSerVice;
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

	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		ApplicationContext applicationcontext = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/applicationContext.xml");
		organizationSerVice = (OrganizationSerVice) applicationcontext.getBean("OrganizationService");
	}

	@Test
	public void getOrganizations(){
		List organizations = organizationSerVice.getOrganizations();
		System.out.println("test");
	}
}
