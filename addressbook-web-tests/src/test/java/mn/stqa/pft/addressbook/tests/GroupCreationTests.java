package mn.stqa.pft.addressbook.tests;

import mn.stqa.pft.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    GroupData group = new GroupData("test11", null, null);
    app.getGroupHelper().createGroup(group);
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1);


    Comparator<? super GroupData> byId = Comparator.comparingInt(GroupData::getId);
    group.setId(after.stream().max(byId).get().getId());
    before.add(group);
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
   }

}
