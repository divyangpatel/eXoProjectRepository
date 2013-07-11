package org.exoplatform;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped
public class NavigationController implements Serializable {

	private static final long serialVersionUID = 1L;
	@ManagedProperty(value = "#{param.PageId}")
	private String pageId;

	public String moveToPage1() {
		System.out.println("Moving To Page1---------->>>>>>>>");
		return "page1";
	}

	public String moveToPage2() {
		System.out.println("Moving To Page2---------->>>>>>>>");
		return "page2";
	}

	public String moveToHomePage() {
		System.out.println("Moving To Home  Page---------->>>>>>>>");
		return "home";
	}

	public String processPage1() {
    System.out.println("Processing To Page1---------->>>>>>>>");
		return "page";
	}

	public String processPage2() {
		 System.out.println("Processing To Page2---------->>>>>>>>");
		return "page";
	}

	public String showPage() {
		 System.out.println("Into Show Pages---------->>>>>>>>");
		 System.out.println("Page Id=>>>>>>"+pageId);
		if (pageId == null) {
			return "home";
		}
		if (pageId.equals("1")) {
			return "page1";
		} else if (pageId.equals("2")) {
			return "page2";
		} else {
			return "home";
		}
	}

	public String getPageId() {
		 System.out.println("getting PageId---------->>>>>>>>");
		return pageId;
	}

	public void setPageId(String pageId) {
		 System.out.println("Setting PageId---------->>>>>>>>");
		this.pageId = pageId;
	}

}
