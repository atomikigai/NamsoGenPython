package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import java.util.Objects;
import r1.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeex {
    private b zza;
    private final Context zzb;

    public zzeex(Context context) {
        this.zzb = context;
    }

    public final m9.a zza() {
        try {
            r1.a aVarA = b.a(this.zzb);
            this.zza = aVarA;
            return aVarA == null ? zzgei.zzg(new IllegalStateException("MeasurementManagerFutures is null")) : aVarA.d();
        } catch (Exception e) {
            return zzgei.zzg(e);
        }
    }

    public final m9.a zzb(Uri uri, InputEvent inputEvent) {
        try {
            b bVar = this.zza;
            Objects.requireNonNull(bVar);
            return bVar.b(uri, inputEvent);
        } catch (Exception e) {
            return zzgei.zzg(e);
        }
    }
}
