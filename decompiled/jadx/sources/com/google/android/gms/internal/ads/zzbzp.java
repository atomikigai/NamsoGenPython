package com.google.android.gms.internal.ads;

import android.content.Context;
import b6.b;
import g7.g;
import i6.h;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbzp implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcao zzb;

    public zzbzp(zzbzq zzbzqVar, Context context, zzcao zzcaoVar) {
        this.zza = context;
        this.zzb = zzcaoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(b.a(this.zza));
        } catch (g | IOException | IllegalStateException e) {
            this.zzb.zzd(e);
            h.e("Exception while getting advertising Id info", e);
        }
    }
}
