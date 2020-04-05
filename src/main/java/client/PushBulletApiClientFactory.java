package client;

import client.impl.PushBulletApiClientImpl;

/**
 * Factory for build API clients
 */
public class PushBulletApiClientFactory {

    private final String apiToken;

    private PushBulletApiClientFactory(String apiToken) {
        this.apiToken = apiToken;
    }

    public static PushBulletApiClientFactory newInstance(String apiToken) {
        return new PushBulletApiClientFactory(apiToken);
    }

    /**
     * Simplest API client
     *
     * @return client
     */
    public PushBulletApiClient newRestClient() {
        return new PushBulletApiClientImpl(apiToken);
    }
}
