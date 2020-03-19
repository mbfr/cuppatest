package org.forgerock.fraas;

import static org.assertj.core.api.Assertions.assertThat;
import static org.forgerock.cuppa.Cuppa.describe;
import static org.forgerock.cuppa.Cuppa.it;
import static org.forgerock.cuppa.Cuppa.when;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.models.V1PodList;
import java.io.IOException;
import org.forgerock.cuppa.Test;
import org.forgerock.cuppa.junit.CuppaRunner;
import org.forgerock.fraas.helpers.KubeClient;
import org.forgerock.fraas.helpers.KubeClientImpl;
import org.junit.runner.RunWith;

@Test
@RunWith(CuppaRunner.class)
public final class TestJavaCuppaTest {

  {
    describe("Checking pods", () -> {
      final KubeClient client;
      try {
        client = new KubeClientImpl();
      } catch (IOException e) {
        throw new TestFailure(e);
      }

      when("List pods", () -> {
        V1PodList list;
        try {
          list = client.listPods();
        } catch (ApiException e) {
          throw new TestFailure(e);
        }

        it("has a length of 0", () -> {
          assertThat(list.getItems().size()).isEqualTo(0);
        });
        it("has a length of 1", () -> {
          assertThat(list.getItems().size()).isEqualTo(1);
        });
      });
    });
  }
}
