package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzpc extends RuntimeException {
    public zzpc(String str) {
        super(str);
    }

    public static Object zza(zzpb zzpbVar) {
        try {
            return zzpbVar.zza();
        } catch (Exception e) {
            throw new zzpc(e);
        }
    }

    public zzpc(String str, Throwable th) {
        super("Creating a protokey serialization failed", th);
    }

    public zzpc(Throwable th) {
        super(th);
    }
}
