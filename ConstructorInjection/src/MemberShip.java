
public class MemberShip {

	private int membershipId, visitsPerYear;
	private String membershipType;
	private Customer customer;

	public int getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(int membershipId) {
		this.membershipId = membershipId;
	}

	public int getVisitsPerYear() {
		return visitsPerYear;
	}

	public void setVisitsPerYear(int visitsPerYear) {
		this.visitsPerYear = visitsPerYear;
	}

	public String getMemberShipType() {
		return membershipType;
	}

	public void setMemberShipType(String membershipType) {
		this.membershipType = membershipType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public MemberShip(int id, String type, int visits, Customer cust) {
		this.membershipId = id;
		this.membershipType = type;
		this.visitsPerYear = visits;
		this.customer = cust;
	}
	
	@Override
	public String toString() {
		return this.membershipId+" "+this.membershipType+" "+this.visitsPerYear+" "+this.customer;
	}
	
	
}
