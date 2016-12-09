package nyc.c4q.wesniemarcelin.interviewappplaylist.network;

import nyc.c4q.wesniemarcelin.interviewappplaylist.model.PlayListResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by wesniemarcelin on 12/8/16.
 */

public interface PlayListService {
    @GET("/radio1/playlist.json")
    Call<PlayListResponse> getPlayList();

}
