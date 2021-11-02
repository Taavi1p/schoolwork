public class Auto {

    private String mark;
    private String autonumber;
    private String värv;
    private int tippkiirus;

    public Auto(String mark, String autonumber, String värv, int tippkiirus) {
        this.mark = mark;
        this.autonumber = autonumber;
        this.värv = värv;
        this.tippkiirus = tippkiirus;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getAutonumber() {
        return autonumber;
    }

    public void setAutonumber(String autonumber) {
        this.autonumber = autonumber;
    }

    public String getVärv() {
        return värv;
    }

    public void setVärv(String värv) {
        this.värv = värv;
    }

    public int getTippkiirus() {
        return tippkiirus;
    }

    public void setTippkiirus(int tippkiirus) {
        this.tippkiirus = tippkiirus;
    }

    public String auto_andmed() {
        return ("Auto { mark:" + mark + " autovärv:" + värv + " autonumber:" + autonumber + "tippkiirus:" + tippkiirus + "{")
    }
}
