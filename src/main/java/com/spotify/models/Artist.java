package com.spotify.models;

import java.util.List;

public class Artist {
	private String id;
	private String name;
	private Followers followers;
	private List<String> genres;
	private String uri;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Followers getFollowers() {
		return followers;
	}
	public void setFollowers(Followers followers) {
		this.followers = followers;
	}
	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
	public String getArtistUri() {
		return uri;
	}
	public void setArtistUri(String artistUri) {
		this.uri = artistUri;
	}
	
	@Override
	public String toString() {
		return "Artist id: " + id + "\n"
				+ "Name: " + name + "\n"
				+ "Number of Followers: " + followers.getTotal() + "\n"
				+ "Genres: " + genres + "\n"
				+ "Artist Uri: " + uri;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((uri == null) ? 0 : uri.hashCode());
		result = prime * result + ((genres == null) ? 0 : genres.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + followers.getTotal();
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artist other = (Artist) obj;
		if (uri == null) {
			if (other.uri != null)
				return false;
		} else if (!uri.equals(other.uri))
			return false;
		if (genres == null) {
			if (other.genres != null)
				return false;
		} else if (!genres.equals(other.genres))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (followers != other.followers)
			return false;
		return true;
	}
	
	
}
