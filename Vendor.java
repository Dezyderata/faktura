public class Vendor{

	private String companyName;
	private String address;
	private String NIP;
	private String bankAccount;

	public Vendor(String companyName, String address, String NIP, String bankAccount){
		this.companyName = companyName;
		this.address = address;
		this.NIP = NIP;
		this.bankAccount = bankAccount;
	}
	public String getCompanyName(){
		return companyName;
	}
	public String getAddress(){
		return address;
	}
	public String getNIP(){
		return NIP;
	}
	public String getBankAccount(){
		return bankAccount;
	}
	public void printVendor(){
		System.out.println("====SPRZEDAWCA====");
		System.out.println(companyName + "\n" +address+"\nNIP: "+NIP+"\nKonto bankowe: "+ bankAccount);
		System.out.println("==================");
	}
	@Override
	public String toString(){
		return "Customer[companyName = "+ companyName +", address = " + address + ", NIP = " +NIP+ ", bankAccount = " +bankAccount+ "]";
	}

}
