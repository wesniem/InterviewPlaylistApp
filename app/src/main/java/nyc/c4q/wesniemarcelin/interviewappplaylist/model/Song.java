package nyc.c4q.wesniemarcelin.interviewappplaylist.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by wesniemarcelin on 12/8/16.
 */

public class Song implements Serializable {
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("artist")
    @Expose
    public String artist;
    @SerializedName("label")
    @Expose
    public Object label;
    @SerializedName("image")
    @Expose
    public String image;
    @SerializedName("playlist")
    @Expose
    public Object playlist;
    @SerializedName("artist_id")
    @Expose
    public String artistId;
    @SerializedName("status")
    @Expose
    public Object status;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Object getLabel() {
        return label;
    }

    public void setLabel(Object label) {
        this.label = label;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Object getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Object playlist) {
        this.playlist = playlist;
    }

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }
}