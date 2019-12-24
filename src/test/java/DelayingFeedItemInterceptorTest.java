import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import org.codingspiderfox.rulebasedrssproxy.entities.FeedEntry;
import org.codingspiderfox.rulebasedrssproxy.service.DelayingFeedItemInterceptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class DelayingFeedItemInterceptorTest {

  @Autowired
  DelayingFeedItemInterceptor underTest;

  @Test
  public void intercepts() {
    List<FeedEntry> entries = underTest.intercept(Arrays.asList(new FeedEntry()), new Properties());
  }
}
