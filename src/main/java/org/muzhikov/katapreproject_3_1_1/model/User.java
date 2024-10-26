package org.muzhikov.katapreproject_3_1_1.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long _id;
	
	@Column(name = "first_name")
	private String _firstName;
	
	@Column(name = "last_name")
	private String _lastName;
	
	@Column(name = "email")
	private String _email;
	
	public User() {
	
	}
	
	public User(String _firstName, String _lastName, String _email) {
		this._firstName = _firstName;
		this._lastName = _lastName;
		this._email = _email;
	}
	
	public Long get_id() {
		return _id;
	}
	
	public void set_id(Long _id) {
		this._id = _id;
	}
	
	public String get_firstName() {
		return _firstName;
	}
	
	public void set_firstName(String _firstName) {
		this._firstName = _firstName;
	}
	
	public String get_lastName() {
		return _lastName;
	}
	
	public void set_lastName(String _lastName) {
		this._lastName = _lastName;
	}
	
	public String get_email() {
		return _email;
	}
	
	public void set_email(String _email) {
		this._email = _email;
	}
}
