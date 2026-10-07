package s2;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends View.BaseSavedState {
    public static final Parcelable.Creator<m> CREATOR = new q(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Parcelable f8364c;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f8362a);
        parcel.writeInt(this.f8363b);
        parcel.writeParcelable(this.f8364c, i);
    }
}
