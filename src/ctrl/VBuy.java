package ctrl;

import java.net.URL;
import java.util.ResourceBundle;

import dao.BuyylistDao;
import dao.IDao;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class VBuy implements Initializable{

    @FXML
    private ListView<?> listview;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void initialize(URL location, ResourceBundle resources) {
					IDao dao = null;
					try {
						dao = new BuyylistDao();
						listview.getItems().clear();
						listview.getItems().addAll(dao.selectAll());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
	}

}