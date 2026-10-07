package e6;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayd;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends zzayd implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f3385a;

    public p(a aVar) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.f3385a = aVar;
    }

    @Override // e6.w
    public final void zzb() {
        this.f3385a.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) {
        if (i != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
