package cn.liubiao.pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(generator = "pid")
    @GenericGenerator(name = "pid", strategy = "native")
    private int pid;// 商品ID
    @Column(length = 100)
    private String pname;// 商品名称
    private double price;// 商品价格

    public Product() {

    }

    public Product(String pname, double price) {

        this.pname = pname;
        this.price = price;

    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
