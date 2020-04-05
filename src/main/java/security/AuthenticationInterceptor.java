package security;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import util.PushBulletApiUtil;

import java.io.IOException;

public class AuthenticationInterceptor implements Interceptor {

    private String apiToken;

    public AuthenticationInterceptor(String apiToken) {
        this.apiToken = apiToken;
    }

    public Response intercept(Chain chain) throws IOException {
        Request.Builder newRequestBuilder = chain.request().newBuilder();
        newRequestBuilder.addHeader(PushBulletApiUtil.AUTH_HEADER, apiToken);
        Request newRequest = newRequestBuilder.build();
        return chain.proceed(newRequest);
    }
}
