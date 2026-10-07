package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzalh implements zzamc {
    private static final zzaln zza = new zzalf();
    private final zzaln zzb;

    public zzalh() {
        zzaln zzalnVar;
        zzakf zzakfVarZza = zzakf.zza();
        try {
            zzalnVar = (zzaln) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzalnVar = zza;
        }
        zzalg zzalgVar = new zzalg(zzakfVarZza, zzalnVar);
        byte[] bArr = zzakq.zzd;
        this.zzb = zzalgVar;
    }

    private static boolean zzb(zzalm zzalmVar) {
        return zzalmVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final zzamb zza(Class cls) {
        zzamd.zzr(cls);
        zzalm zzalmVarZzb = this.zzb.zzb(cls);
        if (zzalmVarZzb.zzb()) {
            return zzakk.class.isAssignableFrom(cls) ? zzalt.zzc(zzamd.zzn(), zzaka.zzb(), zzalmVarZzb.zza()) : zzalt.zzc(zzamd.zzm(), zzaka.zza(), zzalmVarZzb.zza());
        }
        if (zzakk.class.isAssignableFrom(cls)) {
            return zzb(zzalmVarZzb) ? zzals.zzl(cls, zzalmVarZzb, zzalv.zzb(), zzald.zze(), zzamd.zzn(), zzaka.zzb(), zzall.zzb()) : zzals.zzl(cls, zzalmVarZzb, zzalv.zzb(), zzald.zze(), zzamd.zzn(), null, zzall.zzb());
        }
        return zzb(zzalmVarZzb) ? zzals.zzl(cls, zzalmVarZzb, zzalv.zza(), zzald.zzd(), zzamd.zzm(), zzaka.zza(), zzall.zza()) : zzals.zzl(cls, zzalmVarZzb, zzalv.zza(), zzald.zzd(), zzamd.zzm(), null, zzall.zza());
    }
}
