package src;

public interface IPlatform {
    
    void inUse(double amount);               // inUse och notInUse istället. ÄNDRA OM LITE SÅ ATT DET PASSAR :) (Enligt TA: Open och Closed)
    void notInUse();
    boolean isInUse();

}
