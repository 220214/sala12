package model;

public class Serie {

	private String major_gere;
	private String title;
	private String subgenere;
	private int premiere;
	private String episodio;
	private String status;
	private int imdb_rating;

	public void setepisodio(String episodio) {
	this.episodio = episodio;
	}
	public void setimdb (int imdb_rating ) {
	this.imdb_rating = imdb_rating;
	}
	public void setmajor (String major_gere) {
	this.major_gere = major_gere;
	}
	public void setpremiere (int premiere) {
	this.premiere = premiere;
	}
	public void setstatus (String status) {
	this.status = status;
	}
	public void setsubgenere (String subgenere) {
	this.subgenere = subgenere;
	}
	public void settitle (String title) {
	this.title = title;
	}
	public String getmajor() {
	return major_gere;
	}
	public String gettitle() {
	return title;
	}
	public String getsubgenere() {
	return subgenere;
	}
	public int getpremiere() {
	return premiere;
	}
	public String getepisodio () {
	 return episodio;
	}
	public String getstatus () {
	 return status;
	}
	 public int getimdb_rating() {
	 return imdb_rating;
	}

}

