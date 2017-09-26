package com.vestis.vo;

public class ImgVo {
	private int no;
	private String address;
	private String name;
	private String type;
	private long sizes;
	private String dbName;
	
	public ImgVo() {}

	public ImgVo(String address, String name, String type, long sizes, String dbName) {
		this.address = address;
		this.name = name;
		this.type = type;
		this.sizes = sizes;
		this.dbName = dbName;
	}

	public ImgVo(int no, String address, String name, String type, long sizes, String dbName) {
		this.no = no;
		this.address = address;
		this.name = name;
		this.type = type;
		this.sizes = sizes;
		this.dbName = dbName;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getSizes() {
		return sizes;
	}

	public void setSizes(long sizes) {
		this.sizes = sizes;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	@Override
	public String toString() {
		return "ImgVo [no=" + no + ", address=" + address + ", name=" + name + ", type=" + type + ", sizes=" + sizes
				+ ", dbName=" + dbName + "]";
	}
}
