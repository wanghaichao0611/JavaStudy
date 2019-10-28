package 抢红包;

import java.io.Serializable;
import java.util.Date;

public class RedPacket implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * userId
     */
    private Long userId;

    /**
     * amount
     */
    private Double amount;

    /**
     * sendDate
     */
    private Date sendDate;

    /**
     * total
     */
    private Integer total;

    /**
     * unitAmount
     */
    private Double unitAmount;

    /**
     * stock
     */
    private Integer stock;

    /**
     * version
     */
    private Integer version;

    /**
     * note
     */
    private String note;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Double getUnitAmount() {
        return unitAmount;
    }

    public void setUnitAmount(Double unitAmount) {
        this.unitAmount = unitAmount;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}