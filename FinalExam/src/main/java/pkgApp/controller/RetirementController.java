package pkgApp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;
import pkgCore.Retirement;

public class RetirementController implements Initializable {
	@FXML
	private TextField YearsToWorkField;
	@FXML
	private TextField TopAnnualReturnField;
	@FXML
	private TextField YearsRetiredField;
	@FXML
	private TextField BottomAnnualReturnField;
	@FXML
	private TextField RequiredIncomeField;
	@FXML
	private TextField MonthlySSIField;
	@FXML
	private Label MonthlySavings;
	@FXML
	private Label TotalSavings;

	private RetirementApp mainApp = null;

	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	@FXML
	public void btnClear(ActionEvent event) {
		System.out.println("Clear pressed");

		YearsToWorkField.clear();
		TopAnnualReturnField.clear();
		YearsRetiredField.clear();
		BottomAnnualReturnField.clear();
		RequiredIncomeField.clear();
		MonthlySSIField.clear();
	}

	@FXML
	public void btnCalculate(ActionEvent event) {
		Retirement r = new Retirement(Integer.parseInt((YearsToWorkField.getText())),
				Double.parseDouble(TopAnnualReturnField.getText()), Integer.parseInt((YearsRetiredField.getText())),
				Double.parseDouble(BottomAnnualReturnField.getText()),
				Double.parseDouble(RequiredIncomeField.getText()), Double.parseDouble(MonthlySSIField.getText()));
		MonthlySavings.setText(Double.toString(r.AmountToSave()));
		TotalSavings.setText(Double.toString(r.TotalAmountSaved()));
	}

}
