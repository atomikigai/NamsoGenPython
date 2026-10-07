package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.internal.i0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaal implements zzafe {
    final /* synthetic */ zzahn zza;
    final /* synthetic */ zzags zzb;
    final /* synthetic */ zzadx zzc;
    final /* synthetic */ zzahb zzd;
    final /* synthetic */ zzafd zze;
    final /* synthetic */ zzabz zzf;

    public zzaal(zzabz zzabzVar, zzahn zzahnVar, zzags zzagsVar, zzadx zzadxVar, zzahb zzahbVar, zzafd zzafdVar) {
        this.zzf = zzabzVar;
        this.zza = zzahnVar;
        this.zzb = zzagsVar;
        this.zzc = zzadxVar;
        this.zzd = zzahbVar;
        this.zze = zzafdVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zze.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zzb(Object obj) {
        zzaho zzahoVar = (zzaho) obj;
        if (this.zza.zzn("EMAIL")) {
            this.zzb.zzg(null);
        } else {
            zzahn zzahnVar = this.zza;
            if (zzahnVar.zzk() != null) {
                this.zzb.zzg(zzahnVar.zzk());
            }
        }
        if (this.zza.zzn("DISPLAY_NAME")) {
            this.zzb.zzf(null);
        } else {
            zzahn zzahnVar2 = this.zza;
            if (zzahnVar2.zzj() != null) {
                this.zzb.zzf(zzahnVar2.zzj());
            }
        }
        if (this.zza.zzn("PHOTO_URL")) {
            this.zzb.zzj(null);
        } else {
            zzahn zzahnVar3 = this.zza;
            if (zzahnVar3.zzm() != null) {
                this.zzb.zzj(zzahnVar3.zzm());
            }
        }
        if (!TextUtils.isEmpty(this.zza.zzl())) {
            zzags zzagsVar = this.zzb;
            byte[] bytes = "redacted".getBytes();
            zzagsVar.zzi(bytes != null ? Base64.encodeToString(bytes, 0) : null);
        }
        List listZzf = zzahoVar.zzf();
        if (listZzf == null) {
            listZzf = new ArrayList();
        }
        this.zzb.zzk(listZzf);
        zzadx zzadxVar = this.zzc;
        zzahb zzahbVar = this.zzd;
        i0.i(zzahbVar);
        String strZzd = zzahoVar.zzd();
        String strZze = zzahoVar.zze();
        if (!TextUtils.isEmpty(strZzd) && !TextUtils.isEmpty(strZze)) {
            zzahbVar = new zzahb(strZze, strZzd, Long.valueOf(zzahoVar.zzb()), zzahbVar.zzg());
        }
        zzadxVar.zzk(zzahbVar, this.zzb);
    }
}
