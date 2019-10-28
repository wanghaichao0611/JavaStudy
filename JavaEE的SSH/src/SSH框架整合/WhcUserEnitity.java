package SSH框架整合;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "whc_user", schema = "ssh整合", catalog = "")
public class WhcUserEnitity {
    private int 编号;
    private String 用户名;
    private String 密码;

    @Id
    @Column(name = "编号")
    public int get编号() {
        return 编号;
    }

    public void set编号(int 编号) {
        this.编号 = 编号;
    }

    @Basic
    @Column(name = "用户名")
    public String get用户名() {
        return 用户名;
    }

    public void set用户名(String 用户名) {
        this.用户名 = 用户名;
    }

    @Basic
    @Column(name = "密码")
    public String get密码() {
        return 密码;
    }

    public void set密码(String 密码) {
        this.密码 = 密码;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WhcUserEnitity that = (WhcUserEnitity) o;
        return 编号 == that.编号 &&
                Objects.equals(用户名, that.用户名) &&
                Objects.equals(密码, that.密码);
    }

    @Override
    public int hashCode() {
        return Objects.hash(编号, 用户名, 密码);
    }
}
