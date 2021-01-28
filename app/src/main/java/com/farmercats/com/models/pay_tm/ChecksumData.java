package com.farmercats.com.models.pay_tm;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChecksumData {

@SerializedName("CHECKSUMHASH")
@Expose
private String cHECKSUMHASH;

    @SerializedName("ORDER_ID")
    @Expose
    private String order_id;
@SerializedName("payt_STATUS")
@Expose
private String paytSTATUS;

public String getCHECKSUMHASH() {
return cHECKSUMHASH;
}

public void setCHECKSUMHASH(String cHECKSUMHASH) {
this.cHECKSUMHASH = cHECKSUMHASH;
}

public String getPaytSTATUS() {
return paytSTATUS;
}

public void setPaytSTATUS(String paytSTATUS) {
this.paytSTATUS = paytSTATUS;
}

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
}