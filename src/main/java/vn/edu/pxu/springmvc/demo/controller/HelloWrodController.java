package vn.edu.pxu.springmvc.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.edu.pxu.springmvc.demo.model.Mobile;

@Controller
public class HelloWrodController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	public List<Mobile> geList() {
		ArrayList<Mobile> mobile = new ArrayList<Mobile>();
		mobile.add(new Mobile(1L, "Laptop", "Hp"));
		mobile.add(new Mobile(2L, "Smartphone", "IPHONE" ));
		mobile.add(new Mobile(3L, "Tablet", "Samsung"));
		return mobile;

	}

	@RequestMapping("/product")
	public String listMobiles(Model model) {
		List<Mobile> mobileList = geList();
		model.addAttribute("mobileList", mobileList);
		return "product";
	}

	@RequestMapping("/des/{id}")
	public String des(@PathVariable Long id, Model model) {
		List<Mobile> mobileList = geList();
		Mobile selectedMobile = null;
		for (Mobile mobile : mobileList) {
			if (mobile.getId().equals(id)) {
				selectedMobile = mobile;
				break;
			}
		}
		model.addAttribute("selectedMobile", selectedMobile);
		return "des";
	}

}