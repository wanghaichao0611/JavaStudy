package cn.itcast.注册;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Information {
    private String 用户名;
    private String 密码;
    private String 邮箱;
    private int 电话;

    @Id
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

    @Basic
    @Column(name = "邮箱")
    public String get邮箱() {
        return 邮箱;
    }

    public void set邮箱(String 邮箱) {
        this.邮箱 = 邮箱;
    }

    @Basic
    @Column(name = "电话")
    public int get电话() {
        return 电话;
    }

    public void set电话(int 电话) {
        this.电话 = 电话;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Information that = (Information) o;
        return 电话 == that.电话 &&
                Objects.equals(用户名, that.用户名) &&
                Objects.equals(密码, that.密码) &&
                Objects.equals(邮箱, that.邮箱);
    }

    @Override
    public int hashCode() {
        return Objects.hash(用户名, 密码, 邮箱, 电话);
    }
}
