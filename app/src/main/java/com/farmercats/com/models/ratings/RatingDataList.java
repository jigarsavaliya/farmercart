package com.farmercats.com.models.ratings;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RatingDataList implements Parcelable {

    @SerializedName("reviews_id")
    @Expose
    private Integer reviewsId;
    @SerializedName("products_id")
    @Expose
    private Integer productsId;
    @SerializedName("customers_id")
    @Expose
    private Integer customersId;
    @SerializedName("customers_name")
    @Expose
    private String customersName;
    @SerializedName("reviews_rating")
    @Expose
    private Integer reviewsRating;
    @SerializedName("created_at")
    @Expose
    private Object createdAt;
    @SerializedName("updated_at")
    @Expose
    private Object updatedAt;
    @SerializedName("reviews_status")
    @Expose
    private Integer reviewsStatus;
    @SerializedName("reviews_read")
    @Expose
    private Integer reviewsRead;
    @SerializedName("vendors_id")
    @Expose
    private Integer vendorsId;
    @SerializedName("image")
    @Expose
    private String image;

    protected RatingDataList(Parcel in) {
        if (in.readByte() == 0) {
            reviewsId = null;
        } else {
            reviewsId = in.readInt();
        }
        if (in.readByte() == 0) {
            productsId = null;
        } else {
            productsId = in.readInt();
        }
        if (in.readByte() == 0) {
            customersId = null;
        } else {
            customersId = in.readInt();
        }
        customersName = in.readString();
        if (in.readByte() == 0) {
            reviewsRating = null;
        } else {
            reviewsRating = in.readInt();
        }
        if (in.readByte() == 0) {
            reviewsStatus = null;
        } else {
            reviewsStatus = in.readInt();
        }
        if (in.readByte() == 0) {
            reviewsRead = null;
        } else {
            reviewsRead = in.readInt();
        }
        if (in.readByte() == 0) {
            vendorsId = null;
        } else {
            vendorsId = in.readInt();
        }
        image = in.readString();
    }

    public static final Creator<RatingDataList> CREATOR = new Creator<RatingDataList>() {
        @Override
        public RatingDataList createFromParcel(Parcel in) {
            return new RatingDataList(in);
        }

        @Override
        public RatingDataList[] newArray(int size) {
            return new RatingDataList[size];
        }
    };

    public Integer getReviewsId() {
        return reviewsId;
    }

    public void setReviewsId(Integer reviewsId) {
        this.reviewsId = reviewsId;
    }

    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    public Integer getCustomersId() {
        return customersId;
    }

    public void setCustomersId(Integer customersId) {
        this.customersId = customersId;
    }

    public String getCustomersName() {
        return customersName;
    }

    public void setCustomersName(String customersName) {
        this.customersName = customersName;
    }

    public Integer getReviewsRating() {
        return reviewsRating;
    }

    public void setReviewsRating(Integer reviewsRating) {
        this.reviewsRating = reviewsRating;
    }

    public Object getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Object createdAt) {
        this.createdAt = createdAt;
    }

    public Object getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Object updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getReviewsStatus() {
        return reviewsStatus;
    }

    public void setReviewsStatus(Integer reviewsStatus) {
        this.reviewsStatus = reviewsStatus;
    }

    public Integer getReviewsRead() {
        return reviewsRead;
    }

    public void setReviewsRead(Integer reviewsRead) {
        this.reviewsRead = reviewsRead;
    }

    public Integer getVendorsId() {
        return vendorsId;
    }

    public void setVendorsId(Integer vendorsId) {
        this.vendorsId = vendorsId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (reviewsId == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(reviewsId);
        }
        if (productsId == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(productsId);
        }
        if (customersId == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(customersId);
        }
        dest.writeString(customersName);
        if (reviewsRating == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(reviewsRating);
        }
        if (reviewsStatus == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(reviewsStatus);
        }
        if (reviewsRead == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(reviewsRead);
        }
        if (vendorsId == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(vendorsId);
        }
        dest.writeString(image);
    }
}
