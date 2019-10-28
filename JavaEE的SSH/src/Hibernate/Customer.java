package Hibernate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Customer {
    private Integer id;
    private String name;
    private Integer age;
    private  String sex;
    private  String city;

    @Id
    @Column(name = "id")
    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id=id;
    }

    @Basic
    @Column(name = "name")
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge()
    {
        return age;
    }
    public  void setAge(Integer age)
    {
        this.age=age;
    }

    @Basic
    @Column(name = "sex")
    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex=sex;
    }

    @Basic
    @Column(name = "city")
    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city=city;
    }

    public String toString()
    {
        return "Customer[id="+id+",name="+name+",age="+age+",sex="+sex+",city="+city+"]";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) &&
                Objects.equals(name, customer.name) &&
                Objects.equals(age, customer.age) &&
                Objects.equals(sex, customer.sex) &&
                Objects.equals(city, customer.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, sex, city);
    }
}
