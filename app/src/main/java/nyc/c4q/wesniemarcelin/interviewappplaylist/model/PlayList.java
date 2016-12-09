package nyc.c4q.wesniemarcelin.interviewappplaylist.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wesniemarcelin on 12/8/16.
 */

public class PlayList {
    @SerializedName("a")
    @Expose
    public List<Song> a;
    @SerializedName("b")
    @Expose
    public List<Song> b ;
    @SerializedName("c")
    @Expose
    public List<Song> c;
    @SerializedName("inmwt")
    @Expose
    public List<Song> inmwt;
    @SerializedName("totd")
    @Expose
    public List<Song> totd;
    @SerializedName("introducing")
    @Expose
    public List<Song> introducing;

    public List<Song> getA() {
        return a;
    }

    public void setA(List<Song> a) {
        this.a = a;
    }

    public List<Song> getB() {
        return b;
    }

    public void setB(List<Song> b) {
        this.b = b;
    }

    public List<Song> getC() {
        return c;
    }

    public void setC(List<Song> c) {
        this.c = c;
    }

    public List<Song> getInmwt() {
        return inmwt;
    }

    public void setInmwt(List<Song> inmwt) {
        this.inmwt = inmwt;
    }

    public List<Song> getTotd() {
        return totd;
    }

    public void setTotd(List<Song> totd) {
        this.totd = totd;
    }

    public List<Song> getIntroducing() {
        return introducing;
    }

    public void setIntroducing(List<Song> introducing) {
        this.introducing = introducing;
    }
}
