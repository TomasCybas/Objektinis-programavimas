package paskaitos.classes_and_objects.objektinis2;

public class Trupmena {
    private int sveikaDalis;
    private int skaitiklis;
    private int vardiklis;

    public int getSveikaDalis() {
        return sveikaDalis;
    }

    public void setSveikaDalis(int sveikaDalis) {
        this.sveikaDalis = sveikaDalis;
    }

    public int getSkaitiklis() {
        return skaitiklis;
    }

    public void setSkaitiklis(int skaitiklis) {
        this.skaitiklis = skaitiklis;
    }

    public int getVardiklis() {
        return vardiklis;
    }

    public void setVardiklis(int vardiklis) {
        this.vardiklis = vardiklis;
    }

    public Trupmena(int sveikaDalis, int skaitiklis, int vardiklis) {
        this.sveikaDalis = sveikaDalis;
        this.skaitiklis = skaitiklis;
        this.vardiklis = vardiklis;
    }

    public Trupmena(int skaitiklis, int vardiklis) {
        this.skaitiklis = skaitiklis;
        this.vardiklis = vardiklis;
    }

    public String toString(){
        if(this.sveikaDalis != 0){
            return sveikaDalis + " " + skaitiklis + "/" + vardiklis;
        }
        return skaitiklis + "/" + vardiklis;
    }

    /**
     * Prideti prie trupmenos sveikaja dali
     * @param sveikaDalis
     */
    public void prideti (int sveikaDalis){
        this.sveikaDalis+= sveikaDalis;
    }

    /**
     * Prideti prie trupmenos paprastaja trupmena
     * @param skaitiklis
     * @param vardiklis
     */
    public void prideti (int skaitiklis, int vardiklis){
        int bv = vardiklis * this.vardiklis;
        this.skaitiklis = (this.skaitiklis * vardiklis)+(skaitiklis * this.vardiklis);
        this.vardiklis = bv;
        this.prastinti();
    }

    public void prideti (Trupmena x){
        this.prideti(x.getSveikaDalis());
        this.prideti(x.getSkaitiklis(), x.getVardiklis());
    }
    public void prastinti(){

    }
    public Double toDouble(){
        return this.sveikaDalis + (double)this.skaitiklis/this.vardiklis;
    }
}
