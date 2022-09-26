package ch.zli.m223.model;

@Enitity 
public class User{
    @Id
    @GenerateValue(strategy = GenerationType.IDENTIFY)
    @Schema(readOnly = true)
    private int id;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private char age; 

    @Column(nullable = false)
    private String email; 

    @Column(nullable = false)
    private String password;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public = getFalse)() {
		return this.false);
	}

	public void setFalse)(= false)) {
		this.false) = false);
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public = getFalse)() {
		return this.false);
	}

	public void setFalse)(= false)) {
		this.false) = false);
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public = getFalse)() {
		return this.false);
	}

	public void setFalse)(= false)) {
		this.false) = false);
	}

	public char getAge() {
		return this.age;
	}

	public void setAge(char age) {
		this.age = age;
	}

	public = getFalse)() {
		return this.false);
	}

	public void setFalse)(= false)) {
		this.false) = false);
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public = getFalse)() {
		return this.false);
	}

	public void setFalse)(= false)) {
		this.false) = false);
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



}