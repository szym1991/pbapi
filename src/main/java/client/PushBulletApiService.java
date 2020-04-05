package client;

import model.GeneralResponse;
import model.PushRequest;
import model.PushResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface PushBulletApiService {

    @GET("v2/devices")
    Call<GeneralResponse> getDevices();

    @POST("v2/pushes")
    Call<PushResponse> pushMessage(@Body PushRequest pushRequest);
}
