/**
 * 
 */
package test.dushyant.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dushyant
 *
 */
@RestController
public class DemoRestcontroller {
	
	@Autowired
	private ApplicationContext ctx;
	
	@Value("${app.env}")
	private String cfg;
	
	@GetMapping("profiles")
	public String[] getProfiles() {
		return ctx.getEnvironment().getActiveProfiles();
	}
	
	@GetMapping("cfg")
	public String getConfig() {
		return cfg;
	}

}
