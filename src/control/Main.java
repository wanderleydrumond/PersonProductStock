package control;

import model.Employee;
import model.Person;
import model.Product;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java first one");

        Person person = new Person();
        person.read("Anna", 36, 'F');
        System.out.println("Person: " + person.print());
        //================================================
        Locale locale = new Locale("pt", "pt");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

        Product product = new Product();
        product.setName("Shirt");
        product.setPrice(54.);
        product.setStock(97);

        System.out.println("Product: " + product.getName() + "\nPrice: " + numberFormat.format(product.getPrice()) +
                "\nQuantity available: " + product.getStock() + "\nTotal: " + numberFormat.format(product.calcTotal()));
        System.out.println("-------------------------------------------------------------\n\n");

        Employee employee1 = new Employee();
        employee1.setName("Hal Jordan");
        employee1.setSalary(3500.);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(2015, 8 - 1, 20);

        employee1.setAdmition(gregorianCalendar.getTime());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Name: " + employee1.getName() + "\nCode: " + employee1.getCode() +
                "\nSalary: " + employee1.getSalary() + "\nAdmition date: " + simpleDateFormat.format(employee1.getAdmition()) +
                "\nLiquid salary: " + numberFormat.format(employee1.calcSalary()));
    }
}