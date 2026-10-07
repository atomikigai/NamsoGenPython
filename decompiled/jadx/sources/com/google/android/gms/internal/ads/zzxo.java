package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzxo extends zzca {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    @Deprecated
    public zzxo() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        zzx();
    }

    private final void zzx() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    public final zzxo zzp(int i, boolean z4) {
        if (this.zzi.get(i) == z4) {
            return this;
        }
        if (z4) {
            this.zzi.put(i, true);
            return this;
        }
        this.zzi.delete(i);
        return this;
    }

    public zzxo(Context context) {
        zze(context);
        Point pointZzw = zzen.zzw(context);
        zzf(pointZzw.x, pointZzw.y, true);
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        zzx();
    }

    public /* synthetic */ zzxo(zzxp zzxpVar, zzya zzyaVar) {
        super(zzxpVar);
        this.zza = zzxpVar.zzC;
        this.zzb = zzxpVar.zzE;
        this.zzc = zzxpVar.zzG;
        this.zzd = zzxpVar.zzL;
        this.zze = zzxpVar.zzM;
        this.zzf = zzxpVar.zzN;
        this.zzg = zzxpVar.zzP;
        SparseArray sparseArray = zzxpVar.zzR;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.zzh = sparseArray2;
        this.zzi = zzxpVar.zzS.clone();
    }
}
