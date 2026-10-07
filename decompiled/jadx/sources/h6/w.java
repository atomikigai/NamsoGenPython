package h6;

import com.google.android.gms.internal.ads.zzapl;
import com.google.android.gms.internal.ads.zzapp;
import com.google.android.gms.internal.ads.zzapv;
import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzcao;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends zzapp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzcao f5089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i6.g f5090b;

    public w(String str, zzcao zzcaoVar) {
        super(0, str, new e7.i(zzcaoVar, 21));
        this.f5089a = zzcaoVar;
        i6.g gVar = new i6.g();
        this.f5090b = gVar;
        if (i6.g.c()) {
            Object obj = null;
            gVar.d("onNetworkRequest", new a3.j(str, "GET", obj, obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final zzapv zzh(zzapl zzaplVar) {
        return zzapv.zzb(zzaplVar, zzaqm.zzb(zzaplVar));
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final void zzo(Object obj) {
        zzapl zzaplVar = (zzapl) obj;
        Map map = zzaplVar.zzc;
        int i = zzaplVar.zza;
        i6.g gVar = this.f5090b;
        gVar.getClass();
        if (i6.g.c()) {
            gVar.d("onNetworkResponse", new ea.j(i, map));
            if (i < 200 || i >= 300) {
                gVar.d("onNetworkRequestError", new i6.e(null, 0));
            }
        }
        byte[] bArr = zzaplVar.zzb;
        if (i6.g.c() && bArr != null) {
            gVar.d("onNetworkResponseBody", new a4.b(bArr, 16));
        }
        this.f5089a.zzc(zzaplVar);
    }
}
