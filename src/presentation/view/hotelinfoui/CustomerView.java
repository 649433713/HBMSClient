package presentation.view.hotelinfoui;

import javax.swing.JPanel;

public class CustomerView extends JPanel{

	private static final long serialVersionUID = 1L;
	HotelInfoViewControlerService controler;

	public CustomerView(HotelInfoViewControlerService controler) {
		this.controler = controler;
	}
	public void getHotelList() {
		controler.showHotelList("0001");
	}
	
	public void getHotelInfo() {
		controler.showHotelInfo("0001");
	}
}
