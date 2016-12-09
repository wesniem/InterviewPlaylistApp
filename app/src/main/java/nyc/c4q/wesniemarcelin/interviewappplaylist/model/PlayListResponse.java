package nyc.c4q.wesniemarcelin.interviewappplaylist.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by wesniemarcelin on 12/8/16.
 */

public class PlayListResponse {
    @SerializedName("playlist")
    @Expose
    public PlayList playlist;

    public PlayList getPlaylist() {
        return playlist;
    }

    public void setPlaylist(PlayList playlist) {
        this.playlist = playlist;
    }
}
