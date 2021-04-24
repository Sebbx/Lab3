package sample;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {
    public TextField txtLicznik1, txtLicznik2, txtLicznik3, txtWagaNorm, txtWagaNierdz, txtCenaNorm, txtCenaNierdz;

    public void OnTxtAction(ActionEvent actionEvent)
    {
        double gestoscStali = 750;
        double gestoscStaliNierdzewnej = 786;

        double cenaStali = 0;
        double cenaStaliNierdz = 0;

        float promien = Float.parseFloat(txtLicznik1.getText());
        float wysokosc = Float.parseFloat(txtLicznik2.getText());
        float gruboscBlachy = Float.parseFloat(txtLicznik3.getText());

        double poleCalkowiteWalca = 2 * Math.PI * (promien * promien) + 2 * Math.PI * promien * wysokosc;

        double dlugosciBokowBlachy = Math.sqrt(poleCalkowiteWalca);

        double objetoscBlachy = dlugosciBokowBlachy * dlugosciBokowBlachy * gruboscBlachy;

        double wagaBlachyZeStali = objetoscBlachy * gestoscStali;
        double wagaBlachyZeStaliNierdzewnej = objetoscBlachy * gestoscStaliNierdzewnej;

        wagaBlachyZeStali = wagaBlachyZeStali / 1000;
        wagaBlachyZeStaliNierdzewnej = wagaBlachyZeStaliNierdzewnej / 1000;

        cenaStali = wagaBlachyZeStali * 2.90;
        cenaStaliNierdz = wagaBlachyZeStaliNierdzewnej * 5.90;

        txtWagaNorm.setText(String.valueOf(wagaBlachyZeStali));
        txtWagaNierdz.setText(String.valueOf(wagaBlachyZeStaliNierdzewnej));

        txtCenaNorm.setText(String.valueOf(cenaStali));
        txtCenaNierdz.setText(String.valueOf(cenaStaliNierdz));









    }

}
