package ch.zli.m223.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;
import javax.validation.constraints.Max;
import javax.annotation.processing.Generated;

import java.time.LocalDate;
import javax.persistence.Id;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema()
    private int id;

    @Column(nullable = false)
    private char gender;

    @Column(nullable = false)
	@Max(value = 120)
    private String firstname;

    @Column(nullable = false)
	@Max(value = 120)
    private String lastname;

    @Column(nullable = false)
	@Max(value = 2)
    private int age;

	@Email
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private LocalDate register_date;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    //print Set<Booking> booking;


    //Getter and Setter
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getGender() {
		return this.gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}


	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getRegister_date() {
		return register_date;
	}

	public void setRegister_date(LocalDate register_date) {
		this.register_date = register_date;
	}


}
