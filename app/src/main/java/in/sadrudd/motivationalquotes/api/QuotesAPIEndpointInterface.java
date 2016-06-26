package in.sadrudd.motivationalquotes.api;

import in.sadrudd.motivationalquotes.models.Quote;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by sjunjo on 26/06/2016.
 */
public interface QuotesAPIEndpointInterface {

    @Headers({"Content-Type: application/x-www-form-urlencoded","Accept: application/json"})
    @GET("/")
    Call<Quote> getQuote(@Query("cat") String category);

}
