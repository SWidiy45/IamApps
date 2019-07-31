package com.apps.swidiy.semangatsiska;

import android.os.Parcel;
import android.os.Parcelable;

public class Posting implements Parcelable {
    private String title;
    private String description;
    public Posting(String title, String description){
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.description);
    }

    protected Posting(Parcel in) {
        this.title = in.readString();
        this.description = in.readString();
    }

    public static final Parcelable.Creator<Posting> CREATOR = new Parcelable.Creator<Posting>() {
        @Override
        public Posting createFromParcel(Parcel source) {
            return new Posting(source);
        }

        @Override
        public Posting[] newArray(int size) {
            return new Posting[size];
        }
    };
}