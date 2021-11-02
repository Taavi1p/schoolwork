import java.time.*;

public class garaaz {
    private Auto[] autod;


    public garaaz(Auto[] autod, int mahutavus) {
        this.autod = new Auto[mahutavus];

    }



    public Lisa_auto(Auto car) {
        for (int i = 0; i < autod.length; i++) {
            if (autod[i] == null) {
                autod[i] = car;
                return;
            }
        }
    }

    public void eemaldaAuto(Auto car){
        for (int i = 0; i < autod.length; i++) {
            if (autod[i].getAutonumber().equals(car.getAutonumber())) {
                autod[i] = null;
                return;
            }
        }
    }

    public void kuva_margi_järgi(String mark) {
        for (int i = 0; i < autod.length; i++) {
            if (autod[i].getMark().equalsIgnoreCase(mark)) {
                System.out.println(autod[i].auto_andmed());
            }
        }
    }

    public void kuva_värvi_järgi(String värv) {
        for (int i = 0; i < autod.length; i++) {
            if (autod[i].getVärv().equalsIgnoreCase(värv)) {
                System.out.println(autod[i].auto_andmed());
            }
        }
    }

    private boolean isEmpty() {
        for (Auto auto : autod) {
            if (auto != null) {
                return false;
            }
        }
        return true;
    }

    public void kuva_kiiruse_järgi(String kiirus) {

        if(isEmpty()) {
            return;
        }
        Auto kiirem = findFirst();
        for (int i = 0; i < autod.length; i++) {
            if (kiirem.getTippkiirus() < autod[i].getTippkiirus()) {
                kiirem = autod[i];
            }
        }
    }

    private Auto findFirst() {
        for (Auto auto: autod) {
            if (auto != null) {
                return auto;
            }
        }
        return null;
    }

}
