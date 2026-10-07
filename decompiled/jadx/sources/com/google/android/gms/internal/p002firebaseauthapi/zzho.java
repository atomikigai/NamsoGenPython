package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzho extends zznf {
    final /* synthetic */ zzhp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzho(zzhp zzhpVar, Class cls) {
        super(cls);
        this.zza = zzhpVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ zzalp zza(zzalp zzalpVar) throws GeneralSecurityException {
        zzxt zzxtVarZzb = zzxu.zzb();
        zzxtVarZzb.zzb(0);
        byte[] bArrZzb = zzor.zzb(32);
        zzxtVarZzb.zza(zzajf.zzn(bArrZzb, 0, bArrZzb.length));
        return (zzxu) zzxtVarZzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* synthetic */ zzalp zzb(zzajf zzajfVar) throws zzaks {
        return zzxx.zzd(zzajfVar, zzajx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", zzhr.zzd(zzhq.zza));
        map.put("XCHACHA20_POLY1305_RAW", zzhr.zzd(zzhq.zzc));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ void zzd(zzalp zzalpVar) throws GeneralSecurityException {
    }
}
