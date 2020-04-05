package client.impl;

import client.PushBulletApiClient;
import client.PushBulletApiService;
import model.Device;
import model.GeneralResponse;
import model.PushRequest;
import model.PushResponse;

import java.util.List;

import static client.ApiServiceGenerator.createService;
import static client.ApiServiceGenerator.executeSync;

public class PushBulletApiClientImpl implements PushBulletApiClient {
    private final PushBulletApiService pushBulletApiService;

    public PushBulletApiClientImpl(String apiToken) {
        pushBulletApiService = createService(PushBulletApiService.class, apiToken);
    }

    public List<Device> getDevices() {
        GeneralResponse generalResponse = executeSync(pushBulletApiService.getDevices());
        return generalResponse.getDevices();
    }

    public PushResponse pushMessage(PushRequest pushRequest) {
        return executeSync(pushBulletApiService.pushMessage(pushRequest));
    }
}
