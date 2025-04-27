package entity;

import java.util.Date;

public class guestEntity {

    int idGuest;
    String fioGuest;
    int passportGuest;
    String cityGuest;
    Date dateInGuest;
    int roomDayGuest;
    int roomIdRoom;


    public guestEntity(int idGuest, String fioGuest, int passportGuest, String cityGuest, Date dateInGuest, int roomDayGuest, int roomIdRoom) {
        this.idGuest = idGuest;
        this.fioGuest = fioGuest;
        this.passportGuest = passportGuest;
        this.cityGuest = cityGuest;
        this.dateInGuest = dateInGuest;
        this.roomDayGuest = roomDayGuest;
        this.roomIdRoom = roomIdRoom;
    }


    public int getIdGuest() {
        return idGuest;
    }

    public void setIdGuest(int idGuest) {
        this.idGuest = idGuest;
    }

    public String getFioGuest() {
        return fioGuest;
    }

    public void setFioGuest(String fioGuest) {
        this.fioGuest = fioGuest;
    }

    public int getPassportGuest() {
        return passportGuest;
    }

    public void setPassportGuest(int passportGuest) {
        this.passportGuest = passportGuest;
    }

    public String getCityGuest() {
        return cityGuest;
    }

    public void setCityGuest(String cityGuest) {
        this.cityGuest = cityGuest;
    }

    public Date getDateInGuest() {
        return dateInGuest;
    }

    public void setDateInGuest(Date dateInGuest) {
        this.dateInGuest = dateInGuest;
    }

    public int getRoomDayGuest() {
        return roomDayGuest;
    }

    public void setRoomDayGuest(int roomDayGuest) {
        this.roomDayGuest = roomDayGuest;
    }

    public int getRoomIdRoom() {
        return roomIdRoom;
    }

    public void setRoomIdRoom(int roomIdRoom) {
        this.roomIdRoom = roomIdRoom;
    }
}
