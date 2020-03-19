package org.forgerock.fraas.helpers;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1PodList;
import io.kubernetes.client.util.Config;
import java.io.IOException;

public class KubeClientImpl implements KubeClient {

  private final ApiClient client;
  private final CoreV1Api api;

  public KubeClientImpl() throws IOException {
    client = Config.defaultClient();
    Configuration.setDefaultApiClient(client);

    api = new CoreV1Api();
  }

  public V1PodList listPods() throws io.kubernetes.client.ApiException {
    return api.listPodForAllNamespaces(null, null, null, null, null, null, null, null);
  }
}
