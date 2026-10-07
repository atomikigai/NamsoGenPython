package e7;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;
import com.google.android.gms.internal.p000authapi.zbc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends com.google.android.gms.common.api.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3485a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, int i) {
        super(x6.b.f10299b, oVar);
        this.f3485a = i;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ s createFailedResult(Status status) {
        int i = this.f3485a;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void doExecute(com.google.android.gms.common.api.b bVar) throws RemoteException {
        switch (this.f3485a) {
            case 0:
                e eVar = (e) bVar;
                k kVar = (k) eVar.getService();
                f fVar = new f(this, 0);
                GoogleSignInOptions googleSignInOptions = eVar.f3482a;
                Parcel parcelZba = kVar.zba();
                zbc.zbd(parcelZba, fVar);
                zbc.zbc(parcelZba, googleSignInOptions);
                kVar.zbb(102, parcelZba);
                break;
            default:
                e eVar2 = (e) bVar;
                k kVar2 = (k) eVar2.getService();
                f fVar2 = new f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = eVar2.f3482a;
                Parcel parcelZba2 = kVar2.zba();
                zbc.zbd(parcelZba2, fVar2);
                zbc.zbc(parcelZba2, googleSignInOptions2);
                kVar2.zbb(103, parcelZba2);
                break;
        }
    }
}
