package com.example.pilihsekolah;

import android.os.Parcel;
import android.os.Parcelable;

public class sekolah implements Parcelable {
    private String name;
    private String details;
    private int photo;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getDetails() {
        return details;
    }

    void setDetails(String details) {
        this.details = details;
    }

    int getPhoto() {
        return photo;
    }

    void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.details);
        dest.writeInt(this.photo);
    }

    public sekolah() {
    }

    protected sekolah(Parcel in) {
        this.name = in.readString();
        this.details = in.readString();
        this.photo = in.readInt();
    }

    public static final Creator<sekolah> CREATOR = new Creator<sekolah>() {
        @Override
        public sekolah createFromParcel(Parcel source) {
            return new sekolah(source);
        }

        @Override
        public sekolah[] newArray(int size) {
            return new sekolah[size];
        }
    };
}
