package team7.freshlist.demogp.requests;

import retrofit2.Call;
import retrofit2.http.GET;
import team7.freshlist.demogp.requests.response.Api;
import team7.freshlist.demogp.requests.response.Value;

public interface UserApi {

    @GET("api/users")
    Call<Api> getUserdata(

    );




}
