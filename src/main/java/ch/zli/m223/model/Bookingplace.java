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
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.print.attribute.standard.DateTimeAtCreation;

import java.time.LocalDate;
import javax.persistence.Id;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Bookingplace{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(readOnly = true)
    private int id;

    @Column(nullable = false)
    private String place_number;

    @Column(nullable = false)
    private String room_name;


@OneToMany(mappedBy = "bookingplace")
@JsonIgnore
private Set<Booking> booking;


	public int getId() {
		return this.id;}
	public void setId(int id) {
		this.id = id;}

	public String getPlace_number() {
		return this.place_number;}
	public void setPlace_number(String place_number) {
		this.place_number = place_number;}

	public String getRoom_name() {
		return this.room_name;	}
	public void setRoom_name(String room_name) {
		this.room_name = room_name;}




}

