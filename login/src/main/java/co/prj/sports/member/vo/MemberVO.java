package co.prj.sports.member.vo;

import java.sql.Date;

public class MemberVO {
	private String id;
	private String password;
	private String name;
	private Date birth;
	private String gender;
	private String author;
	private char state;
	
	public MemberVO() {	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public char getState() {
		return state;
	}

	public void setState(char state) {
		this.state = state;
	}
	
	
}
