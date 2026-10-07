package com.google.android.gms.internal.ads;

import g6.i;
import i6.h;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbji implements zzbjr {
    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfk zzcfkVar = (zzcfk) obj;
        if (zzcfkVar.zzJ() != null) {
            zzcfkVar.zzJ().zza();
        }
        i iVarZzL = zzcfkVar.zzL();
        if (iVarZzL != null) {
            iVarZzL.zzb();
            return;
        }
        i iVarZzM = zzcfkVar.zzM();
        if (iVarZzM != null) {
            iVarZzM.zzb();
        } else {
            h.g("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
