package e7;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.zbb;
import com.google.android.gms.internal.p000authapi.zbc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends zbb implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f3484b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        this.f3483a = i;
        this.f3484b = gVar;
    }

    @Override // e7.j
    public void o(Status status) {
        switch (this.f3483a) {
            case 1:
                this.f3484b.setResult(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i10) {
        switch (i) {
            case 101:
                zbc.zbb(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                zbc(status);
                break;
            case 103:
                Status status2 = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                o(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // e7.j
    public void zbc(Status status) {
        switch (this.f3483a) {
            case 0:
                this.f3484b.setResult(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
