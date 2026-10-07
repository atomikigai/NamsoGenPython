package e6;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayd;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f3 extends zzayd implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r6.a f3306a;

    public f3(r6.a aVar) {
        super("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        this.f3306a = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) {
        if (i != 1) {
            return false;
        }
        zze();
        parcel2.writeNoException();
        return true;
    }

    @Override // e6.w1
    public final void zze() {
        r6.a aVar = this.f3306a;
        if (aVar != null) {
            aVar.onAdMetadataChanged();
        }
    }
}
