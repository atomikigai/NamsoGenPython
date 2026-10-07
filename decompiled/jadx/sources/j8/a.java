package j8;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import androidx.fragment.app.q;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import x0.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new q(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5705d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5706f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f5707r;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5704c = parcel.readInt();
        this.f5705d = parcel.readInt();
        this.e = parcel.readInt() == 1;
        this.f5706f = parcel.readInt() == 1;
        this.f5707r = parcel.readInt() == 1;
    }

    @Override // x0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f5704c);
        parcel.writeInt(this.f5705d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f5706f ? 1 : 0);
        parcel.writeInt(this.f5707r ? 1 : 0);
    }

    public a(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f5704c = bottomSheetBehavior.L;
        this.f5705d = bottomSheetBehavior.e;
        this.e = bottomSheetBehavior.f2342b;
        this.f5706f = bottomSheetBehavior.I;
        this.f5707r = bottomSheetBehavior.J;
    }
}
