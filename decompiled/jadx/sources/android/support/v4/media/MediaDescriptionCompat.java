package android.support.v4.media;

import a7.n;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new n(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f294d;
    public final Bitmap e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f295f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Bundle f296r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Uri f297s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f298t;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f291a = str;
        this.f292b = charSequence;
        this.f293c = charSequence2;
        this.f294d = charSequence3;
        this.e = bitmap;
        this.f295f = uri;
        this.f296r = bundle;
        this.f297s = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f292b) + ", " + ((Object) this.f293c) + ", " + ((Object) this.f294d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Object objBuild = this.f298t;
        if (objBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f291a);
            builder.setTitle(this.f292b);
            builder.setSubtitle(this.f293c);
            builder.setDescription(this.f294d);
            builder.setIconBitmap(this.e);
            builder.setIconUri(this.f295f);
            builder.setExtras(this.f296r);
            builder.setMediaUri(this.f297s);
            objBuild = builder.build();
            this.f298t = objBuild;
        }
        ((MediaDescription) objBuild).writeToParcel(parcel, i);
    }
}
