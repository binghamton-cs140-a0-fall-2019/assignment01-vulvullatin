package assignment01;
/**
 * SORRY: I did not have time for the javadocs
 * @author CS 140
 *
 */
public class StreetUSAddress {
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String stateAbbreviation;
	private String zipCode;
  
	public StreetUSAddress(String address1, 
			String address2, String cty, 
			String state, String zip) {
      //TODO use the parameters to set the values of 
      //the fields above
		this.addressLine1 = address1;
		this.addressLine2 = address2;
		this.city = cty;
		this.stateAbbreviation = state;
		this.zipCode = zip;
	}
	/**
	 * 
	 * @return
	 */
	public String getAddressLine1() {
    // TODO return the appropriate String
		return addressLine1;
	}
	/**
	 * 
	 * @return
	 */
	public String getAddressLine2() {
    // TODO return the appropriate String
		return addressLine2;
	}
	/**
	 * 
	 * @return
	 */
	public String getCity() {
    // TODO return the appropriate String
		return city;
	}
	/**
	 * 
	 * @return
	 */
	public String getStateAbbreviation() {
    // TODO return the appropriate String
		return stateAbbreviation;
	}
	/**
	 * 
	 * @return
	 */	
	public String getZipCode() {
    // TODO return the appropriate String
		return zipCode;
	}
	@Override
	public String toString() {
		if(addressLine2.trim().length() > 0) {
			return String.format("%s\n%s\n%s, %s %s", addressLine1, 
					addressLine2, city, stateAbbreviation, zipCode);
		} else {
			return String.format("%s\n%s, %s %s", addressLine1, 
					city, stateAbbreviation, zipCode);
		}
	}
}
