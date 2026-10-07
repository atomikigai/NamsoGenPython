package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public interface zzfsz {
    ExecutorService zza(int i);

    ExecutorService zzb(ThreadFactory threadFactory, int i);

    ExecutorService zzc(int i, ThreadFactory threadFactory, int i10);
}
