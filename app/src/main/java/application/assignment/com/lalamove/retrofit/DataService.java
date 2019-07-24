package application.assignment.com.lalamove.retrofit;

import application.assignment.com.lalamove.data.DeliveryAddress;
import retrofit2.Call;
import retrofit2.http.GET;

public interface DataService {

    @GET("/deliveries")
    Call<DeliveryAddress> getDeliveryAddress();
}

