package h6;

import android.content.Context;
import android.os.Message;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzftd;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends zzftd {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            d6.p.C.f2982g.zzw(e, "AdMobHandler.handleMessage");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftd
    public final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th) {
            d6.p pVar = d6.p.C;
            r0 r0Var = pVar.f2979c;
            Context contextZzd = pVar.f2982g.zzd();
            if (contextZzd != null) {
                try {
                    if (((Boolean) zzbew.zzb.zze()).booleanValue()) {
                        n7.c.a(contextZzd, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }
}
