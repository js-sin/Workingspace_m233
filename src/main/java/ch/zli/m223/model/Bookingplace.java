package ch.zli.m223.model;

@Enitity 
public class Bookingplace{
     @Id
    @GenerateValue(strategy = GenerationType.IDENTIFY)
    @Schema(readOnly = true)
    private int id;

     @Column(nullable = false)
    private String place_number;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlace_number() {
		return this.place_number;
	}

	public void setPlace_number(String place_number) {
		this.place_number = place_number;
	}

    @OneToMany(mappedBy = "bokkingplace")
    @JsonIgnore
    private Set<Booking> booking;
   
}