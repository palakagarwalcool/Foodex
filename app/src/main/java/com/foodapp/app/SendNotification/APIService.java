package com.foodapp.app.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAASx9jBdc:APA91bE5jI_1ADCrdtUZPxTg4gOGmmqBuXozInTrzDKcjggIssJ66Cf0qCuc3bBHsqxGQ-xr8ZgMtIqPYkIkHLO8V78Pe_BblCNUHSeD2H_-EXILnsJAyipErrnlHasSk-cadoPcasIR"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
