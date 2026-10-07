package z7;

import com.google.android.gms.internal.measurement.zzek;
import com.google.android.gms.internal.measurement.zzet;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfq;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzoy;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzgi f11145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BitSet f11146d;
    public final BitSet e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r.e f11147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r.e f11148g;
    public final /* synthetic */ b h;

    public g3(b bVar, String str) {
        this.h = bVar;
        this.f11143a = str;
        this.f11144b = true;
        this.f11146d = new BitSet();
        this.e = new BitSet();
        this.f11147f = new r.e(0);
        this.f11148g = new r.e(0);
    }

    public final zzfp a(int i) {
        ArrayList arrayList;
        List list;
        zzfo zzfoVarZzb = zzfp.zzb();
        zzfoVarZzb.zza(i);
        zzfoVarZzb.zzc(this.f11144b);
        zzgi zzgiVar = this.f11145c;
        if (zzgiVar != null) {
            zzfoVarZzb.zzd(zzgiVar);
        }
        zzgh zzghVarZze = zzgi.zze();
        zzghVarZze.zzb(l0.F(this.f11146d));
        zzghVarZze.zzd(l0.F(this.e));
        r.e eVar = this.f11147f;
        if (eVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(eVar.f8100c);
            for (Integer num : (r.b) eVar.keySet()) {
                int iIntValue = num.intValue();
                Long l2 = (Long) eVar.get(num);
                if (l2 != null) {
                    zzfq zzfqVarZzc = zzfr.zzc();
                    zzfqVarZzc.zzb(iIntValue);
                    zzfqVarZzc.zza(l2.longValue());
                    arrayList2.add((zzfr) zzfqVarZzc.zzaD());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzghVarZze.zza(arrayList);
        }
        r.e eVar2 = this.f11148g;
        if (eVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(eVar2.f8100c);
            for (Integer num2 : (r.b) eVar2.keySet()) {
                zzgj zzgjVarZzd = zzgk.zzd();
                zzgjVarZzd.zzb(num2.intValue());
                List list2 = (List) eVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzgjVarZzd.zza(list2);
                }
                arrayList3.add((zzgk) zzgjVarZzd.zzaD());
            }
            list = arrayList3;
        }
        zzghVarZze.zzc(list);
        zzfoVarZzb.zzb(zzghVarZze);
        return (zzfp) zzfoVarZzb.zzaD();
    }

    public final void b(h3 h3Var) {
        int iZzb;
        boolean z4;
        boolean zZzo;
        a1 a1Var = (a1) this.h.f159a;
        switch (h3Var.f11185g) {
            case 0:
                iZzb = ((zzek) h3Var.i).zzb();
                break;
            default:
                iZzb = ((zzet) h3Var.i).zza();
                break;
        }
        if (h3Var.f11182c != null) {
            this.e.set(iZzb, true);
        }
        Boolean bool = h3Var.f11183d;
        if (bool != null) {
            this.f11146d.set(iZzb, bool.booleanValue());
        }
        if (h3Var.e != null) {
            Integer numValueOf = Integer.valueOf(iZzb);
            r.e eVar = this.f11147f;
            Long l2 = (Long) eVar.get(numValueOf);
            long jLongValue = h3Var.e.longValue() / 1000;
            if (l2 == null || jLongValue > l2.longValue()) {
                eVar.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (h3Var.f11184f != null) {
            Integer numValueOf2 = Integer.valueOf(iZzb);
            r.e eVar2 = this.f11148g;
            List arrayList = (List) eVar2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                eVar2.put(numValueOf2, arrayList);
            }
            switch (h3Var.f11185g) {
                case 0:
                    z4 = false;
                    break;
                default:
                    z4 = true;
                    break;
            }
            if (z4) {
                arrayList.clear();
            }
            zzoy.zzc();
            g gVar = a1Var.f11005r;
            y yVar = z.X;
            String str = this.f11143a;
            if (gVar.l(str, yVar)) {
                switch (h3Var.f11185g) {
                    case 0:
                        zZzo = ((zzek) h3Var.i).zzo();
                        break;
                    default:
                        zZzo = false;
                        break;
                }
                if (zZzo) {
                    arrayList.clear();
                }
            }
            zzoy.zzc();
            if (!a1Var.f11005r.l(str, yVar)) {
                arrayList.add(Long.valueOf(h3Var.f11184f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(h3Var.f11184f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public g3(b bVar, String str, zzgi zzgiVar, BitSet bitSet, BitSet bitSet2, r.e eVar, r.e eVar2) {
        this.h = bVar;
        this.f11143a = str;
        this.f11146d = bitSet;
        this.e = bitSet2;
        this.f11147f = eVar;
        this.f11148g = new r.e(0);
        for (Integer num : (r.b) eVar2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) eVar2.get(num));
            this.f11148g.put(num, arrayList);
        }
        this.f11144b = false;
        this.f11145c = zzgiVar;
    }
}
