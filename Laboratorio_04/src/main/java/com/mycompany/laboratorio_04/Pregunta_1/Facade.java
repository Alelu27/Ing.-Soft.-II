package com.mycompany.laboratorio_04;

public class Facade {
    private PortafolioSystem s1; //private: para q' nadie más lo instancie en otras partes
    private TaxSystem s2;
    private ReportSystem s3;

    public Facade() {
        this.s1 = new PortafolioSystem();
        this.s2 = new TaxSystem();
        this.s3 = new ReportSystem();
    }
    
    public void runComande(){
        System.out.println("=== SE ESTA CORRIENDO EL FACADE ===");
        s1.getFinancialData();
        s2.calculateTaxes();
        s3.generateReport();
    }
    
}
