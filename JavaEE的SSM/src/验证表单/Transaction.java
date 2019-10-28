package 验证表单;

import com.sun.istack.internal.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

public class Transaction {
    //产品编号
    @NotNull
    private Long productId;
    //用户编号
    @NotNull
    private Long userId;
    //交易日期
    @Future
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @NotNull
    private Date date;
    //价格
    @NotNull //不能为空
    @DecimalMin(value = "0.1")
    private Double price;
    //数量
    @Min(1)//最小值为1
    @Max(100)
    @NotNull
    private Integer quantity;
    //交易金额
    @NotNull
    @DecimalMax("50000.00")
    @DecimalMin("1.00")
    private Double amount;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    //备注
    @Size(min = 0,max =256)
    private String note;
}
