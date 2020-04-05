package client;

import model.Device;
import model.PushRequest;
import model.PushResponse;

import java.util.List;

/**
 * Simple api client for Push Bullet
 */
public interface PushBulletApiClient {

    /**
     * Gets devices connected with PB account
     *
     * @return devices
     */
    List<Device> getDevices();

    /**
     * Push message to all devices
     *
     * @param pushRequest request
     * @return response
     */
    PushResponse pushMessage(PushRequest pushRequest);
}
