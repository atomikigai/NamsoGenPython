package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import q1.a;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzqw implements zzcm {
    private static final zzqw zza = new zzqw();
    private static final zzof zzb = zzof.zzb(new zzod() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqt
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzod
        public final Object zza(zzbn zzbnVar) {
            return zzrl.zzb((zzni) zzbnVar);
        }
    }, zzni.class, zzcd.class);

    public static void zzd() throws GeneralSecurityException {
        zzcq.zzh(zza);
        zznq.zza().zze(zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcm
    public final Class zza() {
        return zzcd.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcm
    public final Class zzb() {
        return zzcd.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcm
    public final /* bridge */ /* synthetic */ Object zzc(zzcl zzclVar) throws GeneralSecurityException {
        Iterator it = zzclVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzch zzchVar : (List) it.next()) {
                if (zzchVar.zzb() instanceof zzqr) {
                    zzqr zzqrVar = (zzqr) zzchVar.zzb();
                    zzzo zzzoVarZzb = zzzo.zzb(zzchVar.zzg());
                    if (!zzzoVarZzb.equals(zzqrVar.zzc())) {
                        String strValueOf = String.valueOf(zzqrVar.zzb());
                        String string = zzqrVar.zzc().toString();
                        throw new GeneralSecurityException(a.m(b.e("Mac Key with parameters ", strValueOf, " has wrong output prefix (", string, ") instead of ("), zzzoVarZzb.toString(), ")"));
                    }
                }
            }
        }
        return new zzqv(zzclVar, null);
    }
}
