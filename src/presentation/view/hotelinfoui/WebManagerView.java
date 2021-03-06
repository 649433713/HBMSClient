package presentation.view.hotelinfoui;

import javax.swing.JPanel;

import VO.HotelVO;

public class WebManagerView extends JPanel{

	private static final long serialVersionUID = 1L;
	HotelInfoViewControlerService controler;

	public WebManagerView(HotelInfoViewControlerService controler) {
		this.controler = controler;
	}
	public void getHotelList() {
		controler.showHotelList("0001");
	}
	
	public void getHotelInfo() {
		controler.showHotelInfo("0001");
	}
	
	public void addHotel() {
		controler.addHotel(new HotelVO());
	}
	
	public void modifyHotel() {
		controler.modifyHotel(new HotelVO());
	}
	
	public void deleteHotel() {
		controler.deleteHotel("0001");
	}
}
