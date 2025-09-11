package com.mycompany.laboratorio_04;

public class Laboratorio_04 {

    public static void main(String[] args) {
        // Sin Facade
        PortafolioSystem s1 = new PortafolioSystem();
        TaxSystem s2 = new TaxSystem();
        ReportSystem s3 = new ReportSystem();
       
        /*
        System.out.println("===================================");
        s1.getFinancialData();
        s2.calculateTaxes();
        s3.generateReport();
        System.out.println("===================================");
        */
        
        Facade test = new Facade();
        test.runComande();
    }
}
