package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzzt implements zzcf {
    public static final /* synthetic */ int zza = 0;

    static {
        zzfxk.zza(new zzfxg() { // from class: com.google.android.gms.internal.ads.zzzs
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                int i = zzzt.zza;
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    if (objInvoke != null) {
                        return (zzcf) objInvoke;
                    }
                    throw null;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
        });
    }

    private zzzt() {
        throw null;
    }

    public /* synthetic */ zzzt(zzzz zzzzVar) {
    }
}
