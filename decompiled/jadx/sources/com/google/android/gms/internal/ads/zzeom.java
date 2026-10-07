package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import e6.q3;
import h6.n0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeom implements zzevz {
    private final zzevz zza;
    private final zzffo zzb;
    private final Context zzc;
    private final zzbzz zzd;

    public zzeom(zzeqp zzeqpVar, zzffo zzffoVar, Context context, zzbzz zzbzzVar) {
        this.zza = zzeqpVar;
        this.zzb = zzffoVar;
        this.zzc = context;
        this.zzd = zzbzzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return zzgei.zzm(this.zza.zzb(), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzeol
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return this.zza.zzc((zzewi) obj);
            }
        }, zzcaj.zzf);
    }

    public final /* synthetic */ zzeon zzc(zzewi zzewiVar) {
        String str;
        boolean z4;
        String strO;
        int i;
        float f10;
        float f11;
        int i10;
        DisplayMetrics displayMetrics;
        q3 q3Var = this.zzb.zze;
        q3[] q3VarArr = q3Var.f3411r;
        if (q3VarArr == null) {
            str = q3Var.f3406a;
            z4 = q3Var.f3413t;
        } else {
            String str2 = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            for (q3 q3Var2 : q3VarArr) {
                boolean z13 = q3Var2.f3413t;
                if (!z13 && !z11) {
                    str2 = q3Var2.f3406a;
                    z11 = true;
                }
                if (z13) {
                    if (!z12) {
                        z10 = true;
                    }
                    z12 = true;
                }
                if (z11 && z12) {
                    break;
                }
            }
            str = str2;
            z4 = z10;
        }
        Resources resources = this.zzc.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            strO = null;
            i = 0;
            f10 = 0.0f;
            f11 = 0.0f;
            i10 = 0;
        } else {
            zzbzz zzbzzVar = this.zzd;
            float f12 = displayMetrics.density;
            int i11 = displayMetrics.widthPixels;
            int i12 = displayMetrics.heightPixels;
            strO = ((n0) zzbzzVar.zzi()).o();
            f10 = 0.0f;
            i10 = i11;
            i = i12;
            f11 = f12;
        }
        StringBuilder sb2 = new StringBuilder();
        q3[] q3VarArr2 = q3Var.f3411r;
        if (q3VarArr2 != null) {
            int i13 = 0;
            boolean z14 = false;
            while (true) {
                float f13 = f10;
                if (i13 >= q3VarArr2.length) {
                    break;
                }
                q3 q3Var3 = q3VarArr2[i13];
                if (q3Var3.f3413t) {
                    z14 = true;
                } else {
                    if (sb2.length() != 0) {
                        sb2.append("|");
                    }
                    int i14 = q3Var3.e;
                    if (i14 == -1) {
                        i14 = f11 != f13 ? (int) (q3Var3.f3410f / f11) : -1;
                    }
                    sb2.append(i14);
                    sb2.append("x");
                    int i15 = q3Var3.f3407b;
                    if (i15 == -2) {
                        i15 = f11 != f13 ? (int) (q3Var3.f3408c / f11) : -2;
                    }
                    sb2.append(i15);
                }
                i13++;
                f10 = f13;
            }
            if (z14) {
                if (sb2.length() != 0) {
                    sb2.insert(0, "|");
                }
                sb2.insert(0, "320x50");
            }
        }
        return new zzeon(q3Var, str, z4, sb2.toString(), f11, i10, i, strO, this.zzb.zzq);
    }
}
