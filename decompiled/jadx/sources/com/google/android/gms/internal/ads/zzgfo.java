package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgfo {
    private final OutputStream zza;

    private zzgfo(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzgfo zzb(OutputStream outputStream) {
        return new zzgfo(outputStream);
    }

    public final void zza(zzgum zzgumVar) throws IOException {
        try {
            zzgumVar.zzaU(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
