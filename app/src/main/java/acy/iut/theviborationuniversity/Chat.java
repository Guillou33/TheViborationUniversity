package acy.iut.theviborationuniversity;

/**
 * Created by autierg on 03/03/2016.
 */
public class Chat {
    private int idchat;
    private String typechat;

    public int getIdchat() {
        return idchat;
    }

    public void setIdchat(int idchat) {
        this.idchat = idchat;
    }

    public String getTypechat() {
        return typechat;
    }

    public void setTypechat(String typechat) {
        this.typechat = typechat;
    }

    public Chat(int idchat, String typechat) {
        this.idchat = idchat;
        this.typechat = typechat;
    }
}
