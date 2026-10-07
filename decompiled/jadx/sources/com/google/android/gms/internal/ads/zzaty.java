package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaty implements Runnable {
    private zzaty() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzaua.zzd = MessageDigest.getInstance("MD5");
            countDownLatch = zzaua.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzaua.zzb;
        } catch (Throwable th) {
            zzaua.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ zzaty(zzatz zzatzVar) {
    }
}
