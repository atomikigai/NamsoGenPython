package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbbe extends PushbackInputStream {
    final /* synthetic */ zzbbf zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbbe(zzbbf zzbbfVar, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.zza = zzbbfVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        zzbbh.zze(this.zza.zzc);
        super.close();
    }
}
