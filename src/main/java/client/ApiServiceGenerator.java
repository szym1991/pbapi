package client;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import security.AuthenticationInterceptor;
import util.PushBulletApiUtil;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ApiServiceGenerator {

    private static final OkHttpClient sharedClient;

    static {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequestsPerHost(500);
        dispatcher.setMaxRequests(500);
        sharedClient = new OkHttpClient.Builder()
                .dispatcher(dispatcher)
                .pingInterval(20, TimeUnit.SECONDS)
                .build();
    }

    public static <S> S createService(Class<S> serviceClass, String apiToken) {
        ObjectMapper mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
                .baseUrl(PushBulletApiUtil.API_BASE_URL)
                .addConverterFactory(JacksonConverterFactory.create(mapper));

        AuthenticationInterceptor interceptor = new AuthenticationInterceptor(apiToken);
        OkHttpClient adaptedClient = sharedClient.newBuilder().addInterceptor(interceptor).build();
        retrofitBuilder.client(adaptedClient);

        Retrofit retrofit = retrofitBuilder.build();
        return retrofit.create(serviceClass);
    }

    /**
     * Returns RuntimeException if something was wrong
     * TODO: make own error response
     */
    public static <T> T executeSync(Call<T> call) {
        try {
            Response<T> response = call.execute();
            if (response.isSuccessful()) {
                return response.body();
            } else {
                throw new RuntimeException(response.errorBody().string());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
