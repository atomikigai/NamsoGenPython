package com.google.android.recaptcha.internal;

import android.content.Context;
import com.bumptech.glide.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;
import jc.i;
import rc.a0;
import rc.b0;
import vb.p;
import vb.w;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbm implements zzbh {
    public static final zzbi zza = new zzbi(null);
    private static Timer zzb;
    private final zzbn zzc;
    private final a0 zzd;
    private final zzaz zze;

    public zzbm(Context context, zzbn zzbnVar, a0 a0Var) {
        this.zzc = zzbnVar;
        this.zzd = a0Var;
        zzaz zzazVar = null;
        try {
            zzaz zzazVar2 = zzaz.zzc;
            zzazVar2 = zzazVar2 == null ? new zzaz(context, null) : zzazVar2;
            zzaz.zzc = zzazVar2;
            zzazVar = zzazVar2;
        } catch (Exception unused) {
        }
        this.zze = zzazVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        ArrayList arrayList;
        zzaz zzazVar;
        zzaz zzazVar2 = this.zze;
        if (zzazVar2 != null) {
            List listZzd = zzazVar2.zzd();
            i.e(listZzd, "<this>");
            int i = 0;
            if (listZzd instanceof RandomAccess) {
                int size = listZzd.size();
                arrayList = new ArrayList((size / 20) + (size % 20 == 0 ? 0 : 1));
                for (int i10 = 0; i10 >= 0 && i10 < size; i10 += 20) {
                    int i11 = size - i10;
                    if (20 <= i11) {
                        i11 = 20;
                    }
                    ArrayList arrayList2 = new ArrayList(i11);
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(listZzd.get(i12 + i10));
                    }
                    arrayList.add(arrayList2);
                }
            } else {
                arrayList = new ArrayList();
                Iterator it = listZzd.iterator();
                i.e(it, "iterator");
                Iterator itT = !it.hasNext() ? p.f9296a : d.t(new w(it, null));
                while (itT.hasNext()) {
                    arrayList.add((List) itT.next());
                }
            }
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj = arrayList.get(i);
                i++;
                zznh zznhVarZzi = zzni.zzi();
                ArrayList arrayList3 = new ArrayList();
                for (zzba zzbaVar : (List) obj) {
                    try {
                        zzpd zzpdVarZzk = zzpd.zzk(zzfy.zzg().zzj(zzbaVar.zzc()));
                        int iZzJ = zzpdVarZzk.zzJ();
                        int i13 = iZzJ - 1;
                        if (iZzJ == 0) {
                            throw null;
                        }
                        if (i13 == 0) {
                            zznhVarZzi.zzp(zzpdVarZzk.zzf());
                        } else if (i13 == 1) {
                            zznhVarZzi.zzq(zzpdVarZzk.zzg());
                        }
                        arrayList3.add(zzbaVar);
                    } catch (Exception unused) {
                        zzaz zzazVar3 = this.zze;
                        if (zzazVar3 != null) {
                            zzazVar3.zzf(zzbaVar);
                        }
                    }
                }
                if (zznhVarZzi.zze() + zznhVarZzi.zzd() != 0) {
                    if (this.zzc.zza(((zzni) zznhVarZzi.zzj()).zzd()) && (zzazVar = this.zze) != null) {
                        zzazVar.zza(arrayList3);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zzb == null) {
            Timer timer = new Timer();
            zzb = timer;
            timer.schedule(new zzbj(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzbh
    public final void zza(zzpd zzpdVar) {
        b0.q(this.zzd, null, new zzbl(this, zzpdVar, null), 3);
        zzh();
    }
}
