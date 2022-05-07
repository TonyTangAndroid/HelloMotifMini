package motif.inject;

import static com.google.common.truth.Truth.assertThat;

import motif.ScopeFactory;
import org.junit.Test;

public class InjectScopeTest {

  @Test
  public void testIt() {
    InjectScope injectScope = ScopeFactory.create(InjectScope.class);
    assertThat(injectScope.context()).isNotNull();
  }
}
