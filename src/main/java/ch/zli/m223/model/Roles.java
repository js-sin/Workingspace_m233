package ch.zli.m223.model;

import java.util.Set;
import javax.persistence.*;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Roles{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(readOnly = true)
    private int id;

    @NotNull
    @Column(nullable =false)
    private String rolename;

    @OneToMany(mappedBy = "roles")
    @JsonIgnore
    private Set<User> user;

	public int getId() {
		return this.id;}
	public void setId(int id) {
		this.id = id;}

	public String getRolename() {
		return this.rolename;}
	public void setRolename(String rolename) {
		this.rolename = rolename;}  
}