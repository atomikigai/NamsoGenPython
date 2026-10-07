package c9;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import androidx.fragment.app.q;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends x0.b {
    public static final Parcelable.Creator<e> CREATOR = new q(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1814c;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1814c = parcel.readInt();
    }

    @Override // x0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1814c);
    }

    public e(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f1814c = sideSheetBehavior.h;
    }
}
