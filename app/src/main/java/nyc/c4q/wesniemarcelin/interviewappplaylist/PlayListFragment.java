package nyc.c4q.wesniemarcelin.interviewappplaylist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.wesniemarcelin.interviewappplaylist.model.PlayList;
import nyc.c4q.wesniemarcelin.interviewappplaylist.model.PlayListResponse;
import nyc.c4q.wesniemarcelin.interviewappplaylist.model.Song;
import nyc.c4q.wesniemarcelin.interviewappplaylist.network.PlayListService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by wesniemarcelin on 12/8/16.
 */

public class PlayListFragment extends Fragment {
    public static final String BASE_URL = "http://www.bbc.co.uk/";
    //Create the receyclerView to be passed through fragment
    RecyclerView playListAView;
    SongAdapter songAdapter;
    List<Song> songList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //We make mRoot a view because we are passing in a recyclerView into this particular fragment
        View mroot = inflater.inflate(R.layout.fragment_playlist, container, false);

        //Identify the recyclerView and pass it through the fragment
        playListAView = (RecyclerView) mroot.findViewById(R.id.playlist_a_recyclerview);
        playListAView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        //Make retrofit call before you return the view thats supposed to show to the user
        fetchPlayListCall();
        return mroot;
    }

    private void fetchPlayListCall() {
        //Retrofit call
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        //Service interface Call
        PlayListService playListService = retrofit.create(PlayListService.class);
        //Calls the method of the service
        Call<PlayListResponse> call = playListService.getPlayList();
        //Making Asynchronous call to know if there was success or failure
        call.enqueue(new Callback<PlayListResponse>() {
            @Override
            public void onResponse(Call<PlayListResponse> call, Response<PlayListResponse> response) {
//                //response.body Retrieves the Response from <> //<PlayListResponse>
                PlayListResponse playlistResponse = response.body();
                PlayList playList = playlistResponse.getPlaylist();
                //Adds the response to the arrayList to be shown in the recyclerView
                songList = playList.getA();
//                PlayListResponse rr = response.body();
//                PlayList playList = rr.getPlayList();
//                songList.addAll(playList.getA());

                Log.d("success", "in there");
                //Call Adapter from before.... needed next(put arraylist into it
                songAdapter = new SongAdapter(songList);
                //Set the adapter to the recyclerView
                playListAView.setAdapter(songAdapter);
                Log.d("Adapter", "adapter attached");
                songAdapter.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<PlayListResponse> call, Throwable t) {
                Log.d("Fail", t.getMessage());
            }
        });
    }
}
