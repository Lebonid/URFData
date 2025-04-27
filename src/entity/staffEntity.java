package entity;

public class staffEntity {

    int idStaff;
    String fioStaff;
    String dayStaff;
    String weekStaff;

    public staffEntity(int idStaff, String fioStaff, String dayStaff, String weekStaff) {
        this.idStaff = idStaff;
        this.fioStaff = fioStaff;
        this.dayStaff = dayStaff;
        this.weekStaff = weekStaff;
    }

    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    public String getFioStaff() {
        return fioStaff;
    }

    public void setFioStaff(String fioStaff) {
        this.fioStaff = fioStaff;
    }

    public String getDayStaff() {
        return dayStaff;
    }

    public void setDayStaff(String dayStaff) {
        this.dayStaff = dayStaff;
    }

    public String getWeekStaff() {
        return weekStaff;
    }

    public void setWeekStaff(String weekStaff) {
        this.weekStaff = weekStaff;
    }
}


