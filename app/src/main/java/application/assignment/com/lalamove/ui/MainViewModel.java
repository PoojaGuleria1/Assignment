package application.assignment.com.lalamove.ui;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import application.assignment.com.lalamove.data.DeliveryAddress;

public class MainViewModel extends ViewModel {
    private MutableLiveData<DeliveryAddress> deliveryAddressLiveData = new MutableLiveData<>();

    public void getDeliveryAddress(){

    }

}
