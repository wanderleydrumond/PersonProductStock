package model;

import java.util.Date;

public class Employee {
    private Integer code;
    private String name;
    private Double salary;
    private Date admition;

    public Employee() {
        System.out.println("Constructor executed");
        setName("N/D");
        setSalary(800.);
        setAdmition(new Date());
        Double cod = Math.random();
        Integer nCod = (int) (cod * 10000);
        setCode(nCod);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getAdmition() {
        return admition;
    }

    public void setAdmition(Date admition) {
        this.admition = admition;
    }

    public Double calcSalary() {
        if (getSalary() < 2000)
            return getSalary() * .91;
        else if (getSalary() < 3800)
            return getSalary() * .79;
        else
            return getSalary() * 72;
    }
}