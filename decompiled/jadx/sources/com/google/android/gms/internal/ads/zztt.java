package com.google.android.gms.internal.ads;

import android.net.Uri;
import da.v;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zztt implements zzvh {
    private final zzacw zza;
    private zzacr zzb;
    private zzacs zzc;

    public zztt(zzacw zzacwVar) {
        this.zza = zzacwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvh
    public final int zza(zzadn zzadnVar) throws IOException {
        zzacr zzacrVar = this.zzb;
        zzacrVar.getClass();
        zzacs zzacsVar = this.zzc;
        zzacsVar.getClass();
        return zzacrVar.zzb(zzacsVar, zzadnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvh
    public final long zzb() {
        zzacs zzacsVar = this.zzc;
        if (zzacsVar != null) {
            return zzacsVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzvh
    public final void zzc() {
        zzacr zzacrVar = this.zzb;
        if (zzacrVar != null && (zzacrVar instanceof zzahw)) {
            ((zzahw) zzacrVar).zza();
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // com.google.android.gms.internal.ads.zzvh
    public final void zzd(zzn zznVar, Uri uri, Map map, long j4, long j10, zzacu zzacuVar) throws IOException {
        zzacg zzacgVar = new zzacg(zznVar, j4, j10);
        this.zzc = zzacgVar;
        if (this.zzb != null) {
            return;
        }
        zzacr[] zzacrVarArrZza = this.zza.zza(uri, map);
        int length = zzacrVarArrZza.length;
        zzfzl zzfzlVarZzi = zzfzo.zzi(length);
        if (length == 1) {
            this.zzb = zzacrVarArrZza[0];
        } else {
            for (zzacr zzacrVar : zzacrVarArrZza) {
                try {
                    if (zzacrVar.zzi(zzacgVar)) {
                        this.zzb = zzacrVar;
                        zzdb.zzf(true);
                        zzacgVar.zzj();
                        break;
                    } else {
                        zzfzlVarZzi.zzh(zzacrVar.zzd());
                        boolean z4 = this.zzb != null || zzacgVar.zzf() == j4;
                        zzdb.zzf(z4);
                        zzacgVar.zzj();
                    }
                } catch (EOFException unused) {
                    if (this.zzb != null || zzacgVar.zzf() == j4) {
                    }
                } catch (Throwable th) {
                    zzdb.zzf(this.zzb != null || zzacgVar.zzf() == j4);
                    zzacgVar.zzj();
                    throw th;
                }
                zzdb.zzf(z4);
                zzacgVar.zzj();
            }
            if (this.zzb == null) {
                Iterator it = zzgae.zzb(zzfzo.zzm(zzacrVarArrZza), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzts
                    @Override // com.google.android.gms.internal.ads.zzfwh
                    public final Object apply(Object obj) {
                        zzacr zzacrVar2 = (zzacr) obj;
                        zzacrVar2.zzc();
                        return zzacrVar2.getClass().getSimpleName();
                    }
                }).iterator();
                StringBuilder sb2 = new StringBuilder();
                zzfwi.zzc(sb2, it, ", ");
                throw new zzws(v.i("None of the available extractors (", sb2.toString(), ") could read the stream."), uri, zzfzlVarZzi.zzi());
            }
        }
        this.zzb.zze(zzacuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvh
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzvh
    public final void zzf(long j4, long j10) {
        zzacr zzacrVar = this.zzb;
        zzacrVar.getClass();
        zzacrVar.zzf(j4, j10);
    }
}
