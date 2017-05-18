package models;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.avaje.ebean.Model;


@Entity
@Table(name = "Borrow")
public class Borrow extends Model {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_borrow")
    private Long idBorrow;

    @ManyToOne
    private Neighbour neighbour;

    @ManyToOne
    private ParkingSpace parkingSpace;

    @Temporal(TemporalType.DATE)
    @Column(name = "from_date")
    private LocalDate fromDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "to_date")
    private LocalDate toDate;

    public Borrow() {}

    public Long getIdBorrow() {
        return idBorrow;
    }

    public void setIdBorrow(Long idBorrow) {
        this.idBorrow = idBorrow;
    }

    public Neighbour getNeighbour() {
        return neighbour;
    }

    public void setNeighbour(Neighbour neighbour) {
        this.neighbour = neighbour;
    }

    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
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
