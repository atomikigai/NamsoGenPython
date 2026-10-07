package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzara extends zzhfi implements Closeable {
    static {
        zzhfp.zzb(zzara.class);
    }

    public zzara(zzhfj zzhfjVar, zzaqz zzaqzVar) throws IOException {
        zze(zzhfjVar, zzhfjVar.zzc(), zzaqzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final String toString() {
        String string = this.zzc.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 7);
        sb2.append("model(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfi, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
