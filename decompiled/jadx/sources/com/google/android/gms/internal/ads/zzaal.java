package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaal extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzaaj zzd;
    private boolean zze;

    public /* synthetic */ zzaal(zzaaj zzaajVar, SurfaceTexture surfaceTexture, boolean z4, zzaak zzaakVar) {
        super(surfaceTexture);
        this.zzd = zzaajVar;
        this.zza = z4;
    }

    public static zzaal zza(Context context, boolean z4) {
        boolean z10 = true;
        if (z4 && !zzb(context)) {
            z10 = false;
        }
        zzdb.zzf(z10);
        return new zzaaj().zza(z4 ? zzb : 0);
    }

    public static synchronized boolean zzb(Context context) {
        int i;
        try {
            if (!zzc) {
                if (zzdk.zzb(context)) {
                    i = zzdk.zzc() ? 1 : 2;
                } else {
                    i = 0;
                }
                zzb = i;
                zzc = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzb != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            try {
                if (!this.zze) {
                    this.zzd.zzb();
                    this.zze = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
