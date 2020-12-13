package org.nearbyshops.enduserappnew.API;




import org.nearbyshops.enduserappnew.Model.ModelBilling.RazorPayOrder;
import org.nearbyshops.enduserappnew.Model.ModelUtility.PaymentConfig;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

/**
 * Created by sumeet on 13/8/17.
 */

public interface RazorPayService {


    @GET("/api/RazorPay/CreateOrder/{Amount}")
    Call<RazorPayOrder> createOrder(@Path("Amount") double amount);


    @GET ("/api/RazorPay/GetPaymentConfig")
    Call<PaymentConfig> getPaymentConfig(
            @Header("Authorization") String headers
    );

}
