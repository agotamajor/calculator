package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller<i> {
    double szam = 0d;
    int op = 0;
    int opp = 0;
    int p = 0;
    int e = -1;
    int r = 0;

    @FXML
    private Button egy;

    @FXML
    private Button ketto;

    @FXML
    private Button harom;

    @FXML
    private Button negy;

    @FXML
    private Button ot;

    @FXML
    private Button hat;

    @FXML
    private Button het;

    @FXML
    private Button nyolc;

    @FXML
    private Button kilenc;

    @FXML
    private Button nulla;

    @FXML
    private Button pont;

    @FXML
    private Button egyenlo;

    @FXML
    private Button minusz;

    @FXML
    private Button plusz;

    @FXML
    private Button szorzas;

    @FXML
    private Button osztas;

    @FXML
    private Button torol;

    @FXML
    private Button torles;

    @FXML
    private Button negyzet;

    @FXML
    private Button gyok;

    @FXML
    private Label keperny;

    @FXML
    private Label er;

    @FXML
    public  void nulla() {
        if (e == 1) {
            keperny.setText("");
            e=0;
        }
        keperny.setText(keperny.getText() + "0");
        r=1;
    }

    @FXML
    public void egy() {
        if (e == 1) {
            keperny.setText("");
            e=0;
        }
        keperny.setText(keperny.getText() + "1");
        r=1;
    }

    @FXML
    public void ketto() {
        if (e == 1) {
            keperny.setText("");
            e=0;
        }
        keperny.setText(keperny.getText() + "2");
        r=1;
    }

    @FXML
    public void harom() {
        if (e == 1) {
            keperny.setText("");
            e=0;
        }
        keperny.setText(keperny.getText() + "3");
        r=1;
    }

    @FXML
    public void negy() {
        if (e == 1) {
            keperny.setText("");
            e=0;
        }
        keperny.setText(keperny.getText() + "4");
        r=1;
    }

    @FXML
    public void ot() {
        if (e == 1) {
            keperny.setText("");
            e=0;
        }
        keperny.setText(keperny.getText() + "5");
        r=1;
    }

    @FXML
    public void hat() {
        if (e == 1) {
            keperny.setText("");
            e=0;
        }
        keperny.setText(keperny.getText() + "6");
        r=1;
    }

    @FXML
    public void het() {
        if (e == 1) {
            keperny.setText("");
            e=0;
        }
        keperny.setText(keperny.getText() + "7");
        r=1;
    }

    @FXML
    public void nyolc() {
        if (e == 1) {
            keperny.setText("");
            e=0;
        }
        keperny.setText(keperny.getText() + "8");
        r=1;
    }

    @FXML
    public void kilenc() {
        if (e == 1) {
            keperny.setText("");
            e=0;
        }
        keperny.setText(keperny.getText() + "9");
        r=1;
    }

    @FXML
    public void pont() {
        if (e == 1) {
            keperny.setText("");
            e=0;
        }
        if (p==0) {
            p++;
            keperny.setText(keperny.getText() + ".");
        }
    }

    @FXML
    public void torleso() {
        keperny.setText("");
        er.setText("");
        p=0;
        szam=0;
        r=0;
    }

    @FXML
    public void torol() {
        if (keperny.getText().length() != 0) {
            String s=keperny.getText();
            if (s.charAt(s.length() - 1) == '.') {
                p=0;
            }
            keperny.setText(keperny.getText().substring(0, keperny.getText().length() - 1 ));
        }
        if (keperny.getText().length()==0){
            r=0;
        }
    }

    @FXML
    public void plusz() {
        double s=0;
        if (opp==1 && r==1){
            s=Math.sqrt(Double.valueOf(keperny.getText()));
        }else {
            if (opp==0 && r==1) {
                s = Double.valueOf(keperny.getText());
            }
        }
        switch (op) {
            case 0:
                szam = s;
                break;
            case 1:
                szam = Math.sqrt(szam);
                break;
            case 3:
                if (keperny.getText() != "0") {
                    szam = szam/s;
                    p=0;
                    keperny.setText("");
                }
                break;
            case 4:
                szam=szam*s;
                break;
            case 5:
                szam=szam-s;
                break;
            case 6:
                szam=szam+s;
                break;
        }
        keperny.setText("");
        p=0;
        op=6;
        opp=0;
        r=0;
        er.setText(""+szam);
    }

    @FXML
    public void minusz() {
        double s=0;
        if (opp==1 && r==1){
            s=Math.sqrt(Double.valueOf(keperny.getText()));
        }else {
            if (opp==0 && r==1) {
                s = Double.valueOf(keperny.getText());
            }
        }
        switch (op) {
            case 0:
                szam = s;
                break;
            case 1:
                szam = Math.sqrt(szam);
                break;
            case 3:
                if (keperny.getText() != "0") {
                    szam = szam/s;
                    p=0;
                    keperny.setText("");
                }
                break;
            case 4:
                szam=szam*s;
                break;
            case 5:
                szam=szam-s;
                break;
            case 6:
                szam=szam+s;
                break;
        }
        keperny.setText("");
        p=0;
        op=5;
        opp=0;
        r=0;
        er.setText(""+szam);
    }

    @FXML
    public void szorzas() {
        double s=0;
        if (opp==1 && r==1){
            s=Math.sqrt(Double.valueOf(keperny.getText()));
        }else {
            if (opp==0 && r==1) {
                s = Double.valueOf(keperny.getText());
            }
        }
        switch (op) {
            case 0:
                szam = s;
                break;
            case 1:
                szam = Math.sqrt(szam);
                break;
            case 3:
                if (keperny.getText() != "0") {
                    szam = szam/s;
                    p=0;
                    keperny.setText("");
                }
                break;
            case 4:
                szam=szam*s;
                break;
            case 5:
                szam=szam-s;
                break;
            case 6:
                szam=szam+s;
                break;
        }
        keperny.setText("");
        p=0;
        op=4;
        opp=0;
        r=0;
        er.setText(""+szam);
    }

    @FXML
    public void osztas() {
        double s=0;
        if (opp==1 && r==1){
            s=Math.sqrt(Double.valueOf(keperny.getText()));
        }else {
            if (opp==0 && r==1) {
                s = Double.valueOf(keperny.getText());
            }
        }
        switch (op) {
            case 0:
                szam = s;
                break;
            case 1:
                szam = Math.sqrt(szam);
                break;
            case 3:
                if (keperny.getText() != "0") {
                    szam = szam/s;
                    p=0;
                    keperny.setText("");
                }
                break;
            case 4:
                szam=szam*s;
                break;
            case 5:
                szam=szam-s;
                break;
            case 6:
                szam=szam+s;
                break;
        }
        keperny.setText("");
        op=3;
        opp=0;
        r=0;
        er.setText(""+szam);
    }

    @FXML
    public void negyzet() {
        double s=0;
        if (opp==1 && r==1){
            s=Math.sqrt(Double.valueOf(keperny.getText()));
        }else {
            if (opp==0 && r==1) {
                s = Double.valueOf(keperny.getText());
            }
        }
        switch (op) {
            case 0:
                szam = s;
                break;
            case 1:
                szam = Math.sqrt(szam);
                break;
            case 3:
                if (keperny.getText() != "0") {
                    szam = szam/s;
                    p=0;
                    keperny.setText("");
                }
                break;
            case 4:
                szam=szam*s;
                break;
            case 5:
                szam=szam-s;
                break;
            case 6:
                szam=szam+s;
                break;
        }
        szam = szam*szam;
        keperny.setText("");
        p=-1;
        op=-1;
        opp=-1;
        r=0;
        er.setText(""+szam);
    }

    @FXML
    public void egyenlo() {
        double s=0;
        if (opp==1 && r==1){
            s=Math.sqrt(Double.valueOf(keperny.getText()));
        }else {
            if (opp==0 && r==1) {
                s = Double.valueOf(keperny.getText());
            }
        }
        switch (op) {
            case 0:
                szam = s;
                break;
            case 3:
                if (keperny.getText() != "0") {
                    szam = szam/s;
                    p=0;
                    keperny.setText("");
                }
                break;
            case 4:
                szam=szam*s;
                break;
            case 5:
                szam=szam-s;
                break;
            case 6:
                szam=szam+s;
                break;
        }
        op=0;
        opp=0;
        p=0;
        keperny.setText(String.valueOf(szam));
        e=1;
        szam=0d;
        r=0;
        er.setText("");
    }

    @FXML
    public void gyok() {
        if (e == 1) {
            keperny.setText("");
            e=0;
        }
        opp=1;
    }


}
