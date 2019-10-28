package 抢红包;

import java.io.Serializable;
import java.util.Date;

public class UserRedPacket implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * redPacketId
     */
    private Long redPacketId;

    /**
     * userId
     */
    private Long userId;

    /**
     * amount
     */
    private Double amount;

    /**
     * grabTime
     */
    private Date grabTime;

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

    public Long getRedPacketId() {
        return redPacketId;
    }

    public void setRedPacketId(Long redPacketId) {
        this.redPacketId = redPacketId;
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

    public Date getGrabTime() {
        return grabTime;
    }

    public void setGrabTime(Date grabTime) {
        this.grabTime = grabTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}