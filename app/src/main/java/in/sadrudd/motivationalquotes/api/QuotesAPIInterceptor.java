package in.sadrudd.motivationalquotes.api;

import java.io.IOException;

import in.sadrudd.motivationalquotes.constants.APIKeysConstants;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by sjunjo on 26/06/2016.
 */
public class QuotesAPIInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        request = request.newBuilder()
                .addHeader("X-Mashape-Key", APIKeysConstants.ANDRUXNET_PRIVATE_KEY)
                .build();
        return chain.proceed(request);
    }
}
