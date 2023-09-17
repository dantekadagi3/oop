package invoice;
import java.text.DecimalFormat;
public class Assignment1 {

	public static void main(String[] args) {
		 String myName = "Dante Kadagi";
	        String date = "28/04/2020";
	        String regNo = "C026-01-0920/2022";
	        String CN = "0100100100";
	        int Q1 = 4, Q2 = 10, Q3 = 9, Q4 = 10;
	        String iTem1 = "Pencil", iTem2 = "Duster", iTem3 = "Pens", iTem4 = "crayon";
	        int UA = 20, UB = 50, UC = 30, UD = 80;
	        double AA = 80.00, AB = 500.00, AC = 270.00, AD = 800.00;
	        double SBT = AA + AB + AC + AD;
	        double VAT = SBT * 0.16;
	        double TA = SBT + VAT;
	        DecimalFormat df = new DecimalFormat("0.00");
	        System.out.println("***********************Adamson Computers Ltd**************************");
	        System.out.println("#99 ACS Building Gilmore Ave. New Mla.. Quezon City * Tel. No:123-4567");
	        System.out.println("                 VAT REG. TIN 098-765-4321-0000                       ");
	        System.out.println("                          SALES INVOICE                               \n\n");
	        System.out.println("Sold to:" + myName + "\t\t\t\t" + "Date:" + date + "");
	        System.out.println("Address:" + regNo + "\t\t\t\t\t" + "Contact Number:" + CN + "\n\n");
	        System.out.println("===============================================================================");
	        System.out.println("Qty     |     Item Description  \t |    Unit Price         |Amount           ");
	        System.out.println("===============================================================================");
	        System.out.println(Q1 + "\t" + "|\t" + iTem1 + "\t\t\t" + " |\t" + UA + "\t\t" + " |" + df.format(AA));
	        System.out.println("-------------------------------------------------------------------------------");
	        System.out.println(Q2 + "\t" + "|\t" + iTem2 + "\t\t\t" + " |\t" + UB + "\t\t" + " |" + df.format(AB));
	        System.out.println("-------------------------------------------------------------------------------");
	        System.out.println(Q3 + "\t" + "|\t" + iTem3 + "\t\t\t" + " |\t" + UC + "\t\t" + " |" + df.format(AC));
	        System.out.println("-------------------------------------------------------------------------------");
	        System.out.println(Q4 + "\t" + "|\t" + iTem4 + "\t\t\t" + " |\t" + UD + "\t\t" + " |" + df.format(AD));
	        System.out.println("===============================================================================");
	        System.out.println("                                         |Sub Total              |" + df.format(SBT));
	        System.out.println("                                         ======================================");
	        System.out.println("                                         |VAT(16%)               |" + df.format(VAT));
	        System.out.println("                                         ======================================");
	        System.out.println("                                         |Total Amount           |" + df.format(TA));
	        System.out.println("                                         ======================================");

	}

}
