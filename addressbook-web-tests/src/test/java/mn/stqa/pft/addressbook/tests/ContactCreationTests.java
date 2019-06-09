package mn.stqa.pft.addressbook.tests;

import mn.stqa.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() throws Exception {
    app.initContactCreation();
    app.fillContactForm(new ContactData("Boris", "C.", "Andreev", "644111, Russian Federation, Omsk, Lenina st., 2", "", "", "111-1111", "", "", "", "b@a.com", "", "", "", "", "", "1", "January", "1990"));
    app.submitContactCreation();
    app.goToHomePage();
  }


}
