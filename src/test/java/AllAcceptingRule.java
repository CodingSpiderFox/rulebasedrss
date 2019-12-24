import org.codingspiderfox.rulebasedrssproxy.entities.FeedEntry;
import org.codingspiderfox.rulebasedrssproxy.service.FilterRule;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;

public class AllAcceptingRule extends FilterRule {

  @Condition
  public boolean when(@Fact("feedEntry")FeedEntry feedEntry) {
    return true;
  }

  @Action
  public void then() {
    return;
  }
}
