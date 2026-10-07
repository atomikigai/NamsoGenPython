package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzv extends zzz {
    final /* synthetic */ zzw zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzv(zzw zzwVar, zzab zzabVar, CharSequence charSequence) {
        super(zzabVar, charSequence);
        this.zza = zzwVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzz
    public final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzz
    public final int zzd(int i) {
        CharSequence charSequence = ((zzz) this).zzb;
        int length = charSequence.length();
        zzu.zzb(i, length, "index");
        while (i < length) {
            zzw zzwVar = this.zza;
            if (zzwVar.zza.zza(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
