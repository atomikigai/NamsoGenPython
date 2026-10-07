package pb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.q;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends View.BaseSavedState {
    public static final Parcelable.ClassLoaderCreator<g> CREATOR = new q(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f7845a;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel);
        this.f7845a = parcel.readBundle(classLoader);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.f7845a);
    }
}
