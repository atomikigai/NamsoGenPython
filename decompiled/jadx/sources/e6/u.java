package e6;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzaye;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends zzayd implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5.k f3454a;

    public u(w5.k kVar) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.f3454a = kVar;
    }

    @Override // e6.e1
    public final void zzc() {
        w5.k kVar = this.f3454a;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override // e6.e1
    public final void zzd(h2 h2Var) {
        w5.k kVar = this.f3454a;
        if (kVar != null) {
            kVar.b(h2Var.g());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) {
        if (i == 1) {
            h2 h2Var = (h2) zzaye.zza(parcel, h2.CREATOR);
            zzaye.zzc(parcel);
            zzd(h2Var);
        } else if (i == 2) {
            zzf();
        } else if (i == 3) {
            zzc();
        } else if (i != 4 && i != 5) {
            return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // e6.e1
    public final void zzf() {
        w5.k kVar = this.f3454a;
        if (kVar != null) {
            kVar.c();
        }
    }

    @Override // e6.e1
    public final void zzb() {
    }

    @Override // e6.e1
    public final void zze() {
    }
}
