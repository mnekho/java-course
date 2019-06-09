package mn.stqa.pft.addressbook;

public class ContactData {
  private final String firstname;
  private final String middlename;
  private final String lastname;
  private final String address;
  private final String title;
  private final String company;
  private final String home_phone;
  private final String mobile_phone;
  private final String work_phone;
  private final String fax;
  private final String email;
  private final String email2;
  private final String email3;
  private final String address2;
  private final String phone2;
  private final String notes;
  private final String day;
  private final String month;
  private final String year;

  public ContactData(String firstname, String middlename, String lastname, String address, String title, String company, String home_phone, String mobile_phone, String work_phone, String fax, String email, String email2, String email3, String address2, String phone2, String notes, String day, String month, String year) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
    this.address = address;
    this.title = title;
    this.company = company;
    this.home_phone = home_phone;
    this.mobile_phone = mobile_phone;
    this.work_phone = work_phone;
    this.fax = fax;
    this.email = email;
    this.email2 = email2;
    this.email3 = email3;
    this.address2 = address2;
    this.phone2 = phone2;
    this.notes = notes;
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getAddress() {
    return address;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getHome_phone() {
    return home_phone;
  }

  public String getMobile_phone() {
    return mobile_phone;
  }

  public String getWork_phone() {
    return work_phone;
  }

  public String getFax() {
    return fax;
  }

  public String getEmail() {
    return email;
  }

  public String getEmail2() {
    return email2;
  }

  public String getEmail3() {
    return email3;
  }

  public String getAddress2() {
    return address2;
  }

  public String getPhone2() {
    return phone2;
  }

  public String getNotes() {
    return notes;
  }

  public String getDay() {
    return day;
  }

  public String getMonth() {
    return month;
  }

  public String getYear() {
    return year;
  }
}
