package ch.zli.m223.model;

@Enitity 
public class Booking{
    @Id
    @GenerateValue (strategy = GenerationType.IDENTIFY)
    @Schema(readOnly = true)
    private int id;

    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private char status;

    @ManyToOne
    @JoinColumn(name = "bookingplace")
    private Bookingplace bookingplace;

    @ManyToMany
    @JoinColumn(name = "user")
    private User user;

     @ManyToOne
    @JoinColumn(name = "bookingdate")
    private Bookingdate bookingdate;


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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public = getFalse)() {
		return this.false);
	}

	public void setFalse)(= false)) {
		this.false) = false);
	}

	public char getStatus() {
		return this.status;
	}

	public void setStatus(char status) {
		this.status = status;
	}
}