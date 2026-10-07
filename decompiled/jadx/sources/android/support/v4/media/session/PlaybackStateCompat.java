package android.support.v4.media.session;

import a7.n;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new n(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f313d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f314f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CharSequence f315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f317t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f318u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Bundle f319v;

    /* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharSequence f321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bundle f323d;

        public CustomAction(Parcel parcel) {
            this.f320a = parcel.readString();
            this.f321b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f322c = parcel.readInt();
            this.f323d = parcel.readBundle(a.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f321b) + ", mIcon=" + this.f322c + ", mExtras=" + this.f323d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f320a);
            TextUtils.writeToParcel(this.f321b, parcel, i);
            parcel.writeInt(this.f322c);
            parcel.writeBundle(this.f323d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f310a = parcel.readInt();
        this.f311b = parcel.readLong();
        this.f313d = parcel.readFloat();
        this.f316s = parcel.readLong();
        this.f312c = parcel.readLong();
        this.e = parcel.readLong();
        this.f315r = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f317t = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f318u = parcel.readLong();
        this.f319v = parcel.readBundle(a.class.getClassLoader());
        this.f314f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f310a);
        sb2.append(", position=");
        sb2.append(this.f311b);
        sb2.append(", buffered position=");
        sb2.append(this.f312c);
        sb2.append(", speed=");
        sb2.append(this.f313d);
        sb2.append(", updated=");
        sb2.append(this.f316s);
        sb2.append(", actions=");
        sb2.append(this.e);
        sb2.append(", error code=");
        sb2.append(this.f314f);
        sb2.append(", error message=");
        sb2.append(this.f315r);
        sb2.append(", custom actions=");
        sb2.append(this.f317t);
        sb2.append(", active item id=");
        return q1.a.l(sb2, this.f318u, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f310a);
        parcel.writeLong(this.f311b);
        parcel.writeFloat(this.f313d);
        parcel.writeLong(this.f316s);
        parcel.writeLong(this.f312c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.f315r, parcel, i);
        parcel.writeTypedList(this.f317t);
        parcel.writeLong(this.f318u);
        parcel.writeBundle(this.f319v);
        parcel.writeInt(this.f314f);
    }
}
