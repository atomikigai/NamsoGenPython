package androidx.activity.result;

import a7.n;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new n(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentSender f402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f405d;

    public h(IntentSender intentSender, Intent intent, int i, int i10) {
        i.e(intentSender, "intentSender");
        this.f402a = intentSender;
        this.f403b = intent;
        this.f404c = i;
        this.f405d = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "dest");
        parcel.writeParcelable(this.f402a, i);
        parcel.writeParcelable(this.f403b, i);
        parcel.writeInt(this.f404c);
        parcel.writeInt(this.f405d);
    }
}
