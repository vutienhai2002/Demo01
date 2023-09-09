package vn.edu.pxu.springmvc.demo.model;

public class Mobile {
	private Long id;
	private String name;
	private String brandName;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Mobile(Long id, String name, String brandName) {
		super();
		this.id = id;
		this.name = name;
		this.brandName = brandName;
	}

	public Mobile() {
		super();

	}
}
