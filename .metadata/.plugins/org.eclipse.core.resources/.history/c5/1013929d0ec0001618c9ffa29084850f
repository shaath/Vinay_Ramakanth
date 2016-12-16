package day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import day11.OrgMaster;

public class HybridScript 
{
	@Test
	public void Hybrid() throws IOException
	{
		String res=null;
	    OrgMaster om=new OrgMaster();
		String xlpath="F:\\Vinay_Ramakanth_Chandra\\SeleniumProject\\src\\testdata\\Hybrid.xlsx";
		String xlout="F:\\Vinay_Ramakanth_Chandra\\SeleniumProject\\src\\results\\HybridRes1.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		XSSFSheet ws2=wb.getSheet("empreg");
		
		int TcRc=ws.getLastRowNum();
		int TsRc=ws1.getLastRowNum();
		int EmpRc=ws2.getLastRowNum();
		
		//Tc Sheet
		for (int i = 1; i <= TcRc; i++) 
		{
			ws.getRow(i).createCell(3);
			String exe=ws.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("Y")) 
			{
				String TcId=ws.getRow(i).getCell(0).getStringCellValue();
				//TestSteps
				for (int j = 0; j <= TsRc; j++) 
				{
					String TsTcId=ws1.getRow(j).getCell(0).getStringCellValue();
					
					if (TcId.equalsIgnoreCase(TsTcId))
					{
						String key=ws1.getRow(j).getCell(3).getStringCellValue();
						
						switch (key)
						{
						case "Launch":
							res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
							break;
						case "login":	
							res=om.org_Login("Admin", "admin");
							break;
						case "logout":	
							res=om.org_Logout();
							om.org_Close();
							break;
						case "Empreg":
							for (int k = 1; k <= EmpRc; k++)
							{
								String f=ws2.getRow(k).getCell(0).getStringCellValue();
								String l=ws2.getRow(k).getCell(1).getStringCellValue();
								res=om.org_Empreg(f, l);
								ws2.getRow(k).createCell(2).setCellValue(res);
							}
							
							break;
						case "Usereg":	
							res=om.org_Userreg("QEdge Tech", "QEdge1234", "QEdge1234", "QEdge1234");
							break;
						case "Ulogin":
							res=om.org_Login("QEdge1234", "QEdge1234");
							break;
						default:
							System.out.println("Select a proper keyword");
							break;
						}
						//Result updation in test steps sheet
						ws1.getRow(j).createCell(4).setCellValue(res);
						//Result updation in test case sheet
						if (!ws.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							ws.getRow(i).getCell(3).setCellValue(res);
						}
						
					}
				}
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
			
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
	}

}
