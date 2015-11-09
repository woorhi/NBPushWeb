package com.nbware.push;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nbware.push.model.ReservedSendRequest;
import com.nbware.push.service.ReservedSendRequestService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
			
	@Autowired
	private ReservedSendRequestService reqService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
			
		return "home";
	}	

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getList(Locale locale, Model model) {		
		List<ReservedSendRequest> reqList = reqService.getMsgRequestList();

		model.addAttribute("ReqList", reqList );

		return "getList";
	}

	@RequestMapping(value = "/msg", method = RequestMethod.GET)
	public String reqMsg() {
		return "reqSend";
	}

	@RequestMapping(value = "/msg", method = RequestMethod.POST)
	public String reqSend(@ModelAttribute("req") ReservedSendRequest msg) {
		reqService.setMsgRequest(msg);
		return "redirect:/list";
	}
}
