package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;
import java.util.Calendar;

public class Controller {

    @FXML
    private JFXDatePicker dateAge;

    @FXML
    private Label showAhelabel;

    @FXML
    private JFXButton ClickButton;

    @FXML
    void initialize() {



        ClickButton.setOnAction(a->{

//            Calendar now=Calendar.getInstance();
//            int year=now.get(Calendar.YEAR);
//            int bdate=( dateAge.getValue().getYear());
//            int b=year-bdate;

            int b= (Calendar.getInstance().getWeekYear()) - (dateAge.getValue().getYear());

            showAhelabel.setText(Integer.toString(b));
        });
    }
}
