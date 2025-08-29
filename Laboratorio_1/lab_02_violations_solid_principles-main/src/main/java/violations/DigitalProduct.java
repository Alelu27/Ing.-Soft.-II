package violations;

import solutions.Downloadable;

public class DigitalProduct extends Product implements Downloadable{

    private String downloadUrl;
    private long fileSize;
    
    public DigitalProduct(String name, double basePrice, String downloadUrl, long fileSize) {
        super(name, basePrice); // Los productos digitales no tienen peso
        this.downloadUrl = downloadUrl;
        this.fileSize = fileSize;
    }

    @Override
    public double calculatePrice() {
        return basePrice; // Sin impuestos físicos
    }

    @Override
    public String getDownloadUrl(){
        return downloadUrl;
    }
    
    @Override
    public long getFileSize(){
        return fileSize;
    }
}
