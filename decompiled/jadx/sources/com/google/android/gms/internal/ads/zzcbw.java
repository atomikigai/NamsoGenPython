package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzcbw {
    private static final AtomicInteger zza = new AtomicInteger(0);
    private static final AtomicInteger zzb = new AtomicInteger(0);

    public static AtomicInteger zzD() {
        return zza;
    }

    public static AtomicInteger zzE() {
        return zzb;
    }

    public static int zzs() {
        return zza.get();
    }

    public static int zzu() {
        return zzb.get();
    }

    public abstract long zzA();

    public abstract long zzB();

    public abstract Integer zzC();

    public abstract void zzF(Uri[] uriArr, String str);

    public abstract void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z4);

    public abstract void zzH();

    public abstract void zzI(long j4);

    public abstract void zzJ(int i);

    public abstract void zzK(int i);

    public abstract void zzL(zzcbv zzcbvVar);

    public abstract void zzM(int i);

    public abstract void zzN(int i);

    public abstract void zzO(boolean z4);

    public abstract void zzP(Integer num);

    public abstract void zzQ(boolean z4);

    public abstract void zzR(int i);

    public abstract void zzS(Surface surface, boolean z4) throws IOException;

    public abstract void zzT(float f10, boolean z4) throws IOException;

    public abstract void zzU();

    public abstract boolean zzV();

    public abstract int zzr();

    public abstract int zzt();

    public abstract long zzv();

    public abstract long zzw();

    public abstract long zzx();

    public abstract long zzy();

    public abstract long zzz();
}
