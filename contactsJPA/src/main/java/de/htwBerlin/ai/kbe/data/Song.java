package de.htwBerlin.ai.kbe.data;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "song")
@Entity
@Table(name = "Song")
public class Song{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="song_name")
    private String songName;
    private String album;
    private String artist;
    private int year;
    private Songlist songlist;

    public Song() {}

    public Song(String songName, String album, String artist, int year) {
        this(songName, album, artist, year, null);
    }

    public Song(String songName, String album, String artist, int year, Songlist songlist) {
    	this.setSongName(songName);
    	this.setAlbum(album);
    	this.setArtist(artist);
    	this.setYear(year);
    	this.setSongList(songlist);
    }

    public int getId() {
    	return id;
    }

    public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

  public void setSongList(Songlist songlist) {
    this.songlist = songlist;
  }

    @Override
    public String toString() {
        return "Song " + songName + " von " + artist + " aus dem Jahr " + year + " vom Album "+ album;
    }
}
