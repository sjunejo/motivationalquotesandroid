package in.sadrudd.motivationalquotes.api;

import android.util.Log;

import in.sadrudd.motivationalquotes.models.Quote;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static in.sadrudd.motivationalquotes.constants.LogConstants.API_TAG;
/**
 * Convenience class for calling the quotes API.
 * Created by sjunjo on 26/06/2016.
 */
public class QuotesAPIHandler {

    private static final String BASE_URL = "https://andruxnet-random-famous-quotes.p.mashape.com";
    private static final String CATEGORY_FAMOUS = "famous";

    private QuotesAPIEndpointInterface quotesAPIService;

    public QuotesAPIHandler(){
        setupAPICallingMechanism();
    }

    private void setupAPICallingMechanism(){
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new QuotesAPIInterceptor());
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .client(httpClient.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        quotesAPIService = retrofit.create(
                QuotesAPIEndpointInterface.class);
    }

    public void getFamousQuote(){
        Call<Quote> call = quotesAPIService.getQuote(CATEGORY_FAMOUS);
        call.enqueue(new Callback<Quote>() {
            @Override
            public void onResponse(Call<Quote> call, Response<Quote> response) {
                Log.d(API_TAG, "Retrieved response");
                int statusCode = response.code();
                Log.d(API_TAG, "" + statusCode);
                // TODO some validation with status code
                Quote quote = response.body();
                Log.d(API_TAG, quote.toString());
            }

            @Override
            public void onFailure(Call<Quote> call, Throwable t) {
                Log.d(API_TAG, t.toString());

            }
        });
    }

}
