package herald.aarush.onlinemoney.contollers;


import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import herald.aarush.onlinemoney.domain.Finance;
import herald.aarush.onlinemoney.domain.Organization;
import herald.aarush.onlinemoney.service.OrgService;
import herald.aarush.onlinemoney.service.exceptions.UserAlreadyPresentException;


@Controller
@RequestMapping(value="/")
public class MainPageController {
	
	@ModelAttribute("username")
	  String getUserName(Principal principal) {
		if(principal!=null)
			return principal.getName();
		else
			return null;
	}
	
	@Autowired
	private OrgService orgserviceimpl;
	
	@RequestMapping(method=RequestMethod.GET)
	public String getHomePage(Model model,HttpServletRequest request){	
		
		return "index";
	
	}
	
	@RequestMapping(value="howto", method=RequestMethod.GET)
	public String getHow(Model model,HttpServletRequest request){	
		
		return "howto";
	
	}

	@RequestMapping(value="acclogin", method=RequestMethod.GET)
	public String getAcclogin(Model model,HttpServletRequest request){
		
		return "acclogin";
	
	}
	@RequestMapping(value="checkpayable", method=RequestMethod.GET)
	public String getPayable(Model model,HttpServletRequest request){
		List<Finance> allpayable = orgserviceimpl.checkPayable();
		model.addAttribute("allpayable",allpayable);
		
		return "checkpayable";
	
	}
	@RequestMapping(value="checkdeposit", method=RequestMethod.GET)
	public String getDeposit(Model model,HttpServletRequest request){
		List<Finance> alldeposit = orgserviceimpl.checkDeposit();
		model.addAttribute("alldeposit",alldeposit);
		return "checkdeposit";
	
	}
	
	@RequestMapping(value="checkreceivable", method=RequestMethod.GET)
	public String getReceivable(Model model,HttpServletRequest request){
		List<Finance> allreceivable = orgserviceimpl.checkReceivable();
		model.addAttribute("allreceivable",allreceivable);
		return "checkreceivable";
	
	}
	
	@RequestMapping(value="checkwithdraw", method=RequestMethod.GET)
	public String getWithdraw(Model model,HttpServletRequest request){
		List<Finance> allwithdraw = orgserviceimpl.checkWithdraw();
		model.addAttribute("allwithdraw",allwithdraw);
		return "checkwithdraw";
	
	}
	
	@RequestMapping(value="alltransaction", method=RequestMethod.GET)
	public String getTran(Model model,HttpServletRequest request){
		List<Finance> allt = orgserviceimpl.AllTransactions();
		model.addAttribute("allt",allt);
		
		return "alltransaction";
	}
	@RequestMapping(value="orglogin", method=RequestMethod.GET)
	public String getOrglogin(Model model,HttpServletRequest request){
		
		return "orglogin";
	
	}
	@RequestMapping(value="about", method=RequestMethod.GET)
	public String getAbout(Model model,HttpServletRequest request){
		
		return "about";
	
	}
	@RequestMapping(value="registeruser", method=RequestMethod.GET)
	public String getRegisterPage(Model model,HttpServletRequest request){
		model.addAttribute("org",new Organization());
		return "register";
	}
	
	@RequestMapping(value= {"registeruser"}, method=RequestMethod.POST)
	public String insertOrg(@ModelAttribute("org") @Valid Organization org, BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			return "register";
		}
		try {
		boolean result=orgserviceimpl.registerOrg(org);
		if (result)
			return "redirect:registeruser?message=Registration is successful";	
		else
			return "redirect:register?message=Unknown problem occured! Please contact administrator";	
		}catch (UserAlreadyPresentException e) {
			bindingResult.rejectValue("username", "username", e.getMessage()); 
			return "register";
	
	}
	}
	@RequestMapping(value="transaction", method=RequestMethod.GET)
	public String getTransaction(Model model,HttpServletRequest request){
		model.addAttribute("money",new Finance());
		return "transaction";
	}
	

	@RequestMapping(value= {"transaction"}, method=RequestMethod.POST)
	public String insertNewUser(@ModelAttribute("money") @Valid Finance money, BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			return "transaction";
		}

		boolean result=orgserviceimpl.saveTransaction(money);
		if (result)
			return "redirect:transaction?message=TransactionSuccessful";	
		else
			return "redirect:transaction?message=Unknown problem occured! Please contact administrator";	
		}
	
	
	@RequestMapping(value = "logout/success",method=RequestMethod.GET)
	public String logoutSuccess(Model model) {
		
		
		return "redirect:/?message=Logout Successful";
		
	}
	
	
	@RequestMapping(value = "login/failure",method=RequestMethod.GET)
	public String loginFailure(Model model) {
		
		return "redirect:/?message=Unable to login.Please check your username and password";
		
	}
}
