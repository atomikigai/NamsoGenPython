package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzjr implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzabg, zzpn, zzwu, zztp, zzhu, zzhp {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzjv zza;

    public /* synthetic */ zzjr(zzjv zzjvVar, zzju zzjuVar) {
        this.zza = zzjvVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i10) {
        zzjv.zzK(this.zza, surfaceTexture);
        this.zza.zzaa(i, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.zza.zzad(null);
        this.zza.zzaa(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i10) {
        this.zza.zzaa(i, i10);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i10, int i11) {
        this.zza.zzaa(i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzaa(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zza(Exception exc) {
        this.zza.zzq.zzv(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzb(String str, long j4, long j10) {
        this.zza.zzq.zzw(str, j4, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzc(String str) {
        this.zza.zzq.zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzd(zzhx zzhxVar) {
        this.zza.zzq.zzy(zzhxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zze(zzhx zzhxVar) {
        this.zza.zzq.zzz(zzhxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzf(zzad zzadVar, zzhy zzhyVar) {
        this.zza.zzq.zzA(zzadVar, zzhyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzg(long j4) {
        this.zza.zzq.zzB(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzh(Exception exc) {
        this.zza.zzq.zzC(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzi(zzpo zzpoVar) {
        this.zza.zzq.zzD(zzpoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzj(zzpo zzpoVar) {
        this.zza.zzq.zzE(zzpoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzk(int i, long j4, long j10) {
        this.zza.zzq.zzF(i, j4, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzl(int i, long j4) {
        this.zza.zzq.zzG(i, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzm(Object obj, long j4) {
        this.zza.zzq.zzH(obj, j4);
        zzjv zzjvVar = this.zza;
        if (zzjvVar.zzF == obj) {
            zzds zzdsVar = zzjvVar.zzl;
            zzdsVar.zzd(26, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjq
                @Override // com.google.android.gms.internal.ads.zzdp
                public final void zza(Object obj2) {
                }
            });
            zzdsVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzn(final boolean z4) {
        zzjv zzjvVar = this.zza;
        if (zzjvVar.zzM == z4) {
            return;
        }
        zzjvVar.zzM = z4;
        zzds zzdsVar = this.zza.zzl;
        zzdsVar.zzd(23, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjo
            @Override // com.google.android.gms.internal.ads.zzdp
            public final void zza(Object obj) {
                ((zzbm) obj).zzn(z4);
            }
        });
        zzdsVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzo(Exception exc) {
        this.zza.zzq.zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzp(String str, long j4, long j10) {
        this.zza.zzq.zzK(str, j4, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzq(String str) {
        this.zza.zzq.zzL(str);
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzr(zzhx zzhxVar) {
        this.zza.zzq.zzM(zzhxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzs(zzhx zzhxVar) {
        this.zza.zzq.zzN(zzhxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzt(long j4, int i) {
        this.zza.zzq.zzO(j4, i);
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzu(zzad zzadVar, zzhy zzhyVar) {
        this.zza.zzq.zzP(zzadVar, zzhyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzv(final zzci zzciVar) {
        zzds zzdsVar = this.zza.zzl;
        zzdsVar.zzd(25, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjp
            @Override // com.google.android.gms.internal.ads.zzdp
            public final void zza(Object obj) {
                ((zzbm) obj).zzr(zzciVar);
            }
        });
        zzdsVar.zzc();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}
