package com.harinder.pg;


public class word {
    String pun,eng;
    int imgid=result;

    private static final int result=-1;

    public word (String pun, String eng)
    {
        this.pun=pun;
        this.eng=eng;
    }

    public word (String pun, String eng, int imgid)
    {
        this.pun=pun;
        this.eng=eng;
        this.imgid=imgid;
    }

    public String getPun()
    {return pun;}

    public String getEng() {
        return eng;
    }

    public int getImgid() {
        return imgid;
    }

    public boolean hasimage ()
    {
        if(imgid!=-1)
            return true;
        else return false;
    }
}
