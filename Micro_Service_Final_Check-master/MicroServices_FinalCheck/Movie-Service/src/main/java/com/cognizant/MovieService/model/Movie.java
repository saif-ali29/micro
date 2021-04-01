package com.cognizant.MovieService.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Column(name = "title")
	private String title;
	@Column(name = "boxOffice")
	private String boxOffice;
	@Column(name = "active")
	private boolean active;
	@Column(name = "dateOfLaunch")
	private Date dateOfLaunch;
	@Column(name = "genre")
	private String genre;
	@Column(name = "teaser")
	private boolean hasTeaser;
	public Movie(long id, String title, String boxOffice, boolean active, Date dateOfLaunch, String genre,
			boolean hasTeaser) {
		super();
		this.id = id;
		this.title = title;
		this.boxOffice = boxOffice;
		this.active = active;
		this.dateOfLaunch = dateOfLaunch;
		this.genre = genre;
		this.hasTeaser = hasTeaser;
	}
	public Movie() {
		
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", boxOffice=" + boxOffice + ", active=" + active
				+ ", dateOfLaunch=" + dateOfLaunch + ", genre=" + genre + ", hasTeaser=" + hasTeaser + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBoxOffice() {
		return boxOffice;
	}
	public void setBoxOffice(String boxOffice) {
		this.boxOffice = boxOffice;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Date getDateOfLaunch() {
		return dateOfLaunch;
	}
	public void setDateOfLaunch(Date dateOfLaunch) {
		this.dateOfLaunch = dateOfLaunch;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public boolean isHasTeaser() {
		return hasTeaser;
	}
	public void setHasTeaser(boolean hasTeaser) {
		this.hasTeaser = hasTeaser;
	}
	
	
}
