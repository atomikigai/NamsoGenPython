package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import jd.d;
import vb.h;
import vb.k;
import vb.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzde implements zzdd {
    public static final zzde zza = new zzde();

    private zzde() {
    }

    private static final List zzc(Object obj) {
        if (obj instanceof byte[]) {
            return h.R((byte[]) obj);
        }
        int i = 0;
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length = sArr.length;
            if (length != 0) {
                if (length == 1) {
                    return d.D(Short.valueOf(sArr[0]));
                }
                ArrayList arrayList = new ArrayList(sArr.length);
                int length2 = sArr.length;
                while (i < length2) {
                    arrayList.add(Short.valueOf(sArr[i]));
                    i++;
                }
                return arrayList;
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            if (length3 != 0) {
                return length3 != 1 ? h.U(iArr) : d.D(Integer.valueOf(iArr[0]));
            }
        } else {
            if (obj instanceof long[]) {
                return h.S((long[]) obj);
            }
            if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                int length4 = fArr.length;
                if (length4 != 0) {
                    if (length4 == 1) {
                        return d.D(Float.valueOf(fArr[0]));
                    }
                    ArrayList arrayList2 = new ArrayList(fArr.length);
                    int length5 = fArr.length;
                    while (i < length5) {
                        arrayList2.add(Float.valueOf(fArr[i]));
                        i++;
                    }
                    return arrayList2;
                }
            } else {
                if (!(obj instanceof double[])) {
                    return null;
                }
                double[] dArr = (double[]) obj;
                int length6 = dArr.length;
                if (length6 != 0) {
                    if (length6 == 1) {
                        return d.D(Double.valueOf(dArr[0]));
                    }
                    ArrayList arrayList3 = new ArrayList(dArr.length);
                    int length7 = dArr.length;
                    while (i < length7) {
                        arrayList3.add(Double.valueOf(dArr[i]));
                        i++;
                    }
                    return arrayList3;
                }
            }
        }
        return q.f9297a;
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i, zzcj zzcjVar, zzpq... zzpqVarArr) throws zzae {
        if (zzpqVarArr.length != 2) {
            throw new zzae(4, 3, null);
        }
        Object objZza = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzae(4, 5, null);
        }
        Object objZza2 = zzcjVar.zzc().zza(zzpqVarArr[1]);
        if (true != Objects.nonNull(objZza2)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            throw new zzae(4, 5, null);
        }
        zzcjVar.zzc().zzf(i, zzb(objZza, objZza2));
    }

    public final Object zzb(Object obj, Object obj2) throws zzae {
        List listZzc = zzc(obj);
        List listZzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (listZzc2 != null) {
                ArrayList arrayList = new ArrayList(k.U(listZzc2));
                Iterator it = listZzc2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (listZzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(k.U(listZzc));
            Iterator it2 = listZzc.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        }
        if (listZzc == null || listZzc2 == null) {
            throw new zzae(4, 5, null);
        }
        zzdc.zza(this, listZzc.size(), listZzc2.size());
        int size = listZzc.size();
        Double[] dArr = new Double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = Double.valueOf(Math.pow(((Number) listZzc.get(i)).doubleValue(), ((Number) listZzc2.get(i)).doubleValue()));
        }
        return dArr;
    }
}
