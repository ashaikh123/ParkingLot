package model;

public class BaseModel {
    private long id;
    //Some common attributes across all entities like created at,updatedat created by ect can be added

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
