package mn.stqa.pft.addressbook.tests;

import mn.stqa.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Boris", "C.", "Andreev", "644111, Russian Federation, Omsk, Lenina st., 2", "", "", "111-1111", "", "", "", "b@a.com", "", "", "", "", "", "1", "January", "1990", "test1"), true);
    }
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Andrey", "C.", "Borisov", "644111, Russian Federation, Omsk, Lenina st., 2", "", "", "111-1111", "", "", "", "b@a.com", "", "", "", "", "", "1", "January", "1990", null), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
  }

}
