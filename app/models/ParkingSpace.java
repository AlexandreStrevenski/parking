package models;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.avaje.ebean.Model;

/**
 * Created by alexandre on 03/04/17.
 */
@Entity
@Table(name = "ParkingSpace")
public class ParkingSpace extends Model {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idParkingSpace;

    @ManyToOne
    @JoinColumn(name = "id_neighbour")
    private Neighbour neighbour;

    @Column(name = "location")
    private String location;

    @Column(name = "available")
    private Boolean available;

    @Column(name = "from_date")
    private LocalDate fromDate;

    @Column(name = "to_date")
    private LocalDate toDate;

    public Long getIdParkingSpace() {
        return idParkingSpace;
    }

    public void setIdParkingSpace(Long idParkingSpace) {
        this.idParkingSpace = idParkingSpace;
    }

    public Neighbour getNeighbour() {
        return neighbour;
    }

    public void setNeighbour(Neighbour neighbour) {
        this.neighbour = neighbour;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }
}
