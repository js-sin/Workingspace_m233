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

import javax.persistence.Id;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Booking{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Schema(readOnly = true)
    private int id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private char status;


    @ManyToMany
    @JoinColumn(name = "user")
    private User user;

     @ManyToMany
    @JoinColumn(name = "user")
    private Bookingplace bookingplace;

    public int getId() {
		return this.id;}
	public void setId(int id) {
		this.id = id;}

	public String getTitle() {
		return this.title;}
	public void setTitle(String title) {
		this.title = title;}

	public char getStatus() {
		return this.status;}
	public void setStatus(char status) {
		this.status = status;
	}
}