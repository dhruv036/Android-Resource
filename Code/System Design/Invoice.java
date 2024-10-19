// import System;

public class Invoice{

    Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculatePrice(){
        return (marker.price * this.quantity);
    }

    // public void printInvoice(){
    //     System.out.println(String.format("Item:- %s",marker.brand));
    // }

    // public void saveToDB(){
    //     //  Save the data into DB
    // }

    public static void main(String[] arg){
        Invoice invoice = new Invoice(new Marker("Green",2,"Camlin"),8);
        System.out.println(invoice.calculatePrice());
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        invoicePrinter.print();
        InvoiceDao dao = new DatabaseInvoiceDao();
        dao.save(invoice);
    }
}

class InvoicePrinter{
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice){
        this.invoice = invoice;
    }

    public void print(){
        System.out.println(String.format("Item:- %s",invoice.marker.brand));   
    }
}

interface InvoiceDao{
    public void save(Invoice invoice);
}


class DatabaseInvoiceDao implements InvoiceDao{

    @Override
    public void save(Invoice invoice){
        System.out.println(String.format("Saving into DB: %s", invoice.marker.brand));
    }

}

class FileInvoiceDao implements InvoiceDao{

    @Override
    public void save(Invoice invoice){
        System.out.println(String.format("Savinf File: %s", invoice.marker.brand));
    }
}


class Marker{
     String color;
     int price;
     String brand;

     public Marker(String color, int price, String brand){
        this.color = color;
        this.price = price;
        this.brand = brand;
     }
}