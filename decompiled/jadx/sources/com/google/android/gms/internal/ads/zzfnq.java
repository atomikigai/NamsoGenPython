package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfnq extends zzfnt {
    private static final zzfnq zzb = new zzfnq();

    private zzfnq() {
    }

    public static zzfnq zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfnt
    public final void zzb(boolean z4) {
        Iterator it = zzfnr.zza().zzc().iterator();
        while (it.hasNext()) {
            ((zzfna) it.next()).zzg().zzk(z4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfnt
    public final boolean zzc() {
        Iterator it = zzfnr.zza().zzb().iterator();
        while (it.hasNext()) {
            View viewZzf = ((zzfna) it.next()).zzf();
            if (viewZzf != null && viewZzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
