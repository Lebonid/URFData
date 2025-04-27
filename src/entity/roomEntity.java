package entity;

public class roomEntity {

    int idRoom;
    String typeRoom;
    int costRoom;
    int phoneRoom;
    int floorRoom;
    int staffId;

    public roomEntity(int idRoom, String typeRoom, int costRoom, int phoneRoom, int floorRoom, int staffId) {
        this.idRoom = idRoom;
        this.typeRoom = typeRoom;
        this.costRoom = costRoom;
        this.phoneRoom = phoneRoom;
        this.floorRoom = floorRoom;
        this.staffId = staffId;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public int getCostRoom() {
        return costRoom;
    }

    public void setCostRoom(int costRoom) {
        this.costRoom = costRoom;
    }

    public int getPhoneRoom() {
        return phoneRoom;
    }

    public void setPhoneRoom(int phoneRoom) {
        this.phoneRoom = phoneRoom;
    }

    public int getFloorRoom() {
        return floorRoom;
    }

    public void setFloorRoom(int floorRoom) {
        this.floorRoom = floorRoom;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
}
