package model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import ctsproject.TravelAgency;

public class VarunTourTest {

	public static void main(String[] args) throws IOException, SQLException {
		TravelAgency vtr=new TravelAgency();
		List list=vtr.generatePackageCost("D:\\VarshTourPackageDetails.txt");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
