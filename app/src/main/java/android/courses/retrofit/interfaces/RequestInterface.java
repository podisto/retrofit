package android.courses.retrofit.interfaces;

import android.courses.retrofit.models.JSONResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Podisto on 14/05/2016.
 */
public interface RequestInterface {

    @GET("/android/jsonandroid")
    Call<JSONResponse> getJSON();
}
