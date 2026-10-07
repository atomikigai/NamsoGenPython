package b8;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.a1;
import com.google.android.gms.common.api.internal.q0;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends zab {
    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i10) {
        switch (i) {
            case 3:
                zac.zab(parcel);
                break;
            case 4:
                zac.zab(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                zac.zab(parcel);
                break;
            case 7:
                zac.zab(parcel);
                break;
            case 8:
                h hVar = (h) zac.zaa(parcel, h.CREATOR);
                zac.zab(parcel);
                q0 q0Var = (q0) this;
                q0Var.f2142b.post(new a1(3, q0Var, hVar));
                break;
            case 9:
                zac.zab(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
