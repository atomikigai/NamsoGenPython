package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzxp extends zzcb {
    public final boolean zzC;
    public final boolean zzD;
    public final boolean zzE;
    public final boolean zzF;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    private final SparseArray zzR;
    private final SparseBooleanArray zzS;

    static {
        new zzxp(new zzxo());
        Integer.toString(zzbbs.zzq.zzf, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public static zzxp zzd(Context context) {
        return new zzxp(new zzxo(context));
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzxp.class == obj.getClass()) {
            zzxp zzxpVar = (zzxp) obj;
            if (super.equals(zzxpVar) && this.zzC == zzxpVar.zzC && this.zzE == zzxpVar.zzE && this.zzG == zzxpVar.zzG && this.zzL == zzxpVar.zzL && this.zzM == zzxpVar.zzM && this.zzN == zzxpVar.zzN && this.zzP == zzxpVar.zzP) {
                SparseBooleanArray sparseBooleanArray = this.zzS;
                SparseBooleanArray sparseBooleanArray2 = zzxpVar.zzS;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = this.zzR;
                    SparseArray sparseArray2 = zzxpVar.zzR;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        for (int i10 = 0; i10 < size2; i10++) {
                            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray.valueAt(i10);
                                Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        zzwr zzwrVar = (zzwr) entry.getKey();
                                        if (!map2.containsKey(zzwrVar) || !Objects.equals(entry.getValue(), map2.get(zzwrVar))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzC ? 1 : 0)) * 961) + (this.zzE ? 1 : 0)) * 961) + (this.zzG ? 1 : 0)) * 28629151) + (this.zzL ? 1 : 0)) * 31) + (this.zzM ? 1 : 0)) * 31) + (this.zzN ? 1 : 0)) * 961) + (this.zzP ? 1 : 0)) * 31;
    }

    public final zzxo zzc() {
        return new zzxo(this, null);
    }

    @Deprecated
    public final zzxq zze(int i, zzwr zzwrVar) {
        Map map = (Map) this.zzR.get(i);
        if (map != null) {
            return (zzxq) map.get(zzwrVar);
        }
        return null;
    }

    public final boolean zzf(int i) {
        return this.zzS.get(i);
    }

    @Deprecated
    public final boolean zzg(int i, zzwr zzwrVar) {
        Map map = (Map) this.zzR.get(i);
        return map != null && map.containsKey(zzwrVar);
    }

    private zzxp(zzxo zzxoVar) {
        super(zzxoVar);
        this.zzC = zzxoVar.zza;
        this.zzD = false;
        this.zzE = zzxoVar.zzb;
        this.zzF = false;
        this.zzG = zzxoVar.zzc;
        this.zzH = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzL = zzxoVar.zzd;
        this.zzM = zzxoVar.zze;
        this.zzN = zzxoVar.zzf;
        this.zzO = false;
        this.zzP = zzxoVar.zzg;
        this.zzQ = false;
        this.zzR = zzxoVar.zzh;
        this.zzS = zzxoVar.zzi;
    }
}
