package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzx extends zzz {
    final /* synthetic */ zzl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzx(zzy zzyVar, zzab zzabVar, CharSequence charSequence, zzl zzlVar) {
        super(zzabVar, charSequence);
        this.zza = zzlVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzz
    public final int zzc(int i) {
        return ((zzo) this.zza).zza.end();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzz
    public final int zzd(int i) {
        if (((zzo) this.zza).zza.find(i)) {
            return ((zzo) this.zza).zza.start();
        }
        return -1;
    }
}
