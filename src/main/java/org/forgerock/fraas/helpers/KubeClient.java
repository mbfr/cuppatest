package org.forgerock.fraas.helpers;

import io.kubernetes.client.models.V1PodList;

public interface KubeClient {

  V1PodList listPods() throws io.kubernetes.client.ApiException;

}
