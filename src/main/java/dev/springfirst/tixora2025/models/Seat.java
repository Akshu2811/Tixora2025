package dev.springfirst.tixora2025.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{


    private String SeatName;
    private int rowval;
    private int columnval;
    @ManyToOne
    private SeatType SeatType;

    public String getSeatName() {
        return SeatName;
    }

    public void setSeatName(String seatName) {
        SeatName = seatName;
    }

    public int getRowval() {
        return rowval;
    }

    public void setRowval(int rowval) {
        this.rowval = rowval;
    }

    public int getColumnval() {
        return columnval;
    }

    public void setColumnval(int columnval) {
        this.columnval = columnval;
    }

    public dev.springfirst.tixora2025.models.SeatType getSeatType() {
        return SeatType;
    }

    public void setSeatType(dev.springfirst.tixora2025.models.SeatType seatType) {
        SeatType = seatType;
    }
}
