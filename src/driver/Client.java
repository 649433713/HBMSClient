package driver;

import businesslogic.hotelInfobl.HotelHotelManagerImpl;
import businesslogic.hotelInfobl.HotelTransferImpl;

import java.rmi.RemoteException;

import businesslogic.hotelInfobl.HotelCustomerImpl;
import businesslogic.hotelInfobl.HotelWebManagerImpl;
import businesslogicservice.hotelinfoblservice.HotelHotelManagerService;
import businesslogicservice.hotelinfoblservice.HotelTransferService;
import businesslogicservice.hotelinfoblservice.HotelCustomerService;
import businesslogicservice.hotelinfoblservice.HotelWebManagerService;
import rmi.ClientRunner;

/**
 * 驱动的总测试入口
 * @author wangfan
 *
 */
public class Client {
	public static void main(String[] args)
	{
		ClientRunner cr = new ClientRunner();
		
		HotelTransferService hotelTransferImpl = new HotelTransferImpl();
		HotelHotelManagerService hotelStaffImpl = new HotelHotelManagerImpl(0001);
		HotelCustomerService hotelUserImpl = null;
		try {
			hotelUserImpl = new HotelCustomerImpl();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		HotelWebManagerService hotelWebManagerImpl = new HotelWebManagerImpl();
		HotelInfoBLService_Driver hotelInfoBLService_Driver = new HotelInfoBLService_Driver();
		hotelInfoBLService_Driver.drive(hotelTransferImpl,hotelStaffImpl, hotelUserImpl,hotelWebManagerImpl);
		
	
	}
}
