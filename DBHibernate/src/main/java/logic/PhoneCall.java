package logic;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="phonecall")
public class PhoneCall implements Serializable {
    private Date dt;
    private String phone_id;
    private String description;

    @Id
    @Column(name="dt")
    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    @Id
    @Column(name="phone_id")
    public String getPhone_id() {
        return phone_id;
    }

    public void setPhone_id(String phone_id) {
        this.phone_id = phone_id;
    }


    @Column(name="description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
