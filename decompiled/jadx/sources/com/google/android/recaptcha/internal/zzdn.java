package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import jd.d;
import mc.b;
import mc.e;
import pc.a;
import vb.i;
import vb.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdn implements zzdd {
    public static final zzdn zza = new zzdn();

    private zzdn() {
    }

    private final Object zzb(Object obj, Object obj2) throws ArithmeticException, zzae {
        boolean z4 = obj instanceof Byte;
        if (z4 && (obj2 instanceof Byte)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z10 = obj instanceof Short;
        if (z10 && (obj2 instanceof Short)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z11 = obj instanceof Integer;
        if (z11 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z12 = obj instanceof Long;
        if (z12 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() % ((Number) obj2).longValue());
        }
        boolean z13 = obj instanceof Float;
        if (z13 && (obj2 instanceof Float)) {
            return Float.valueOf(((Number) obj).floatValue() % ((Number) obj2).floatValue());
        }
        boolean z14 = obj instanceof Double;
        if (z14 && (obj2 instanceof Double)) {
            return Double.valueOf(((Number) obj).doubleValue() % ((Number) obj2).doubleValue());
        }
        int i = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(a.f7846a);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i] % ((Number) obj2).intValue())));
                    i++;
                }
                return new String(i.k0(arrayList), a.f7846a);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i] % ((Number) obj2).intValue()));
                    i++;
                }
                return i.m0(arrayList2);
            }
        }
        if (z4 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b10 : bArr) {
                arrayList3.add(Integer.valueOf(b10 % ((Number) obj).intValue()));
            }
            return arrayList3.toArray(new Integer[0]);
        }
        if (z10 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s10 : sArr) {
                arrayList4.add(Integer.valueOf(s10 % ((Number) obj).intValue()));
            }
            return arrayList4.toArray(new Integer[0]);
        }
        if (z11 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i10 : iArr) {
                arrayList5.add(Integer.valueOf(i10 % ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z12 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j4 : jArr) {
                arrayList6.add(Long.valueOf(j4 % ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        if (z13 && (obj2 instanceof float[])) {
            float[] fArr = (float[]) obj2;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            for (float f10 : fArr) {
                arrayList7.add(Float.valueOf(f10 % ((Number) obj).floatValue()));
            }
            return arrayList7.toArray(new Float[0]);
        }
        if (z14 && (obj2 instanceof double[])) {
            double[] dArr = (double[]) obj2;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            for (double d10 : dArr) {
                arrayList8.add(Double.valueOf(d10 % ((Number) obj).doubleValue()));
            }
            return arrayList8.toArray(new Double[0]);
        }
        boolean z15 = obj instanceof byte[];
        if (z15 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList9 = new ArrayList(bArr2.length);
            for (byte b11 : bArr2) {
                arrayList9.add(Integer.valueOf(b11 % ((Number) obj2).intValue()));
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z16 = obj instanceof short[];
        if (z16 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList10 = new ArrayList(sArr2.length);
            for (short s11 : sArr2) {
                arrayList10.add(Integer.valueOf(s11 % ((Number) obj2).intValue()));
            }
            return arrayList10.toArray(new Integer[0]);
        }
        boolean z17 = obj instanceof int[];
        if (z17 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            int length3 = iArr2.length;
            ArrayList arrayList11 = new ArrayList(length3);
            while (i < length3) {
                arrayList11.add(Integer.valueOf(iArr2[i] % ((Number) obj2).intValue()));
                i++;
            }
            return i.m0(arrayList11);
        }
        boolean z18 = obj instanceof long[];
        if (z18 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList12 = new ArrayList(jArr2.length);
            for (long j10 : jArr2) {
                arrayList12.add(Long.valueOf(j10 % ((Number) obj2).longValue()));
            }
            return arrayList12.toArray(new Long[0]);
        }
        boolean z19 = obj instanceof float[];
        if (z19 && (obj2 instanceof Float)) {
            float[] fArr2 = (float[]) obj;
            ArrayList arrayList13 = new ArrayList(fArr2.length);
            for (float f11 : fArr2) {
                arrayList13.add(Float.valueOf(f11 % ((Number) obj2).floatValue()));
            }
            return arrayList13.toArray(new Float[0]);
        }
        boolean z20 = obj instanceof double[];
        if (z20 && (obj2 instanceof Double)) {
            double[] dArr2 = (double[]) obj;
            ArrayList arrayList14 = new ArrayList(dArr2.length);
            for (double d11 : dArr2) {
                arrayList14.add(Double.valueOf(d11 % ((Number) obj2).doubleValue()));
            }
            return arrayList14.toArray(new Double[0]);
        }
        if (z15 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length4 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzdc.zza(this, length4, bArr4.length);
            e eVarL = d.L(0, length4);
            ArrayList arrayList15 = new ArrayList(k.U(eVarL));
            Iterator it = eVarL.iterator();
            while (true) {
                b bVar = (b) it;
                if (!bVar.f7105d) {
                    return arrayList15.toArray(new Integer[0]);
                }
                int iNextInt = bVar.nextInt();
                arrayList15.add(Integer.valueOf(bArr3[iNextInt] % bArr4[iNextInt]));
            }
        } else if (z16 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length5 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzdc.zza(this, length5, sArr4.length);
            e eVarL2 = d.L(0, length5);
            ArrayList arrayList16 = new ArrayList(k.U(eVarL2));
            Iterator it2 = eVarL2.iterator();
            while (true) {
                b bVar2 = (b) it2;
                if (!bVar2.f7105d) {
                    return arrayList16.toArray(new Integer[0]);
                }
                int iNextInt2 = bVar2.nextInt();
                arrayList16.add(Integer.valueOf(sArr3[iNextInt2] % sArr4[iNextInt2]));
            }
        } else if (z17 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length6 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzdc.zza(this, length6, iArr4.length);
            e eVarL3 = d.L(0, length6);
            ArrayList arrayList17 = new ArrayList(k.U(eVarL3));
            Iterator it3 = eVarL3.iterator();
            while (true) {
                b bVar3 = (b) it3;
                if (!bVar3.f7105d) {
                    return arrayList17.toArray(new Integer[0]);
                }
                int iNextInt3 = bVar3.nextInt();
                arrayList17.add(Integer.valueOf(iArr3[iNextInt3] % iArr4[iNextInt3]));
            }
        } else if (z18 && (obj2 instanceof long[])) {
            long[] jArr3 = (long[]) obj;
            int length7 = jArr3.length;
            long[] jArr4 = (long[]) obj2;
            zzdc.zza(this, length7, jArr4.length);
            e eVarL4 = d.L(0, length7);
            ArrayList arrayList18 = new ArrayList(k.U(eVarL4));
            Iterator it4 = eVarL4.iterator();
            while (true) {
                b bVar4 = (b) it4;
                if (!bVar4.f7105d) {
                    return arrayList18.toArray(new Long[0]);
                }
                int iNextInt4 = bVar4.nextInt();
                arrayList18.add(Long.valueOf(jArr3[iNextInt4] % jArr4[iNextInt4]));
            }
        } else if (z19 && (obj2 instanceof float[])) {
            float[] fArr3 = (float[]) obj;
            int length8 = fArr3.length;
            float[] fArr4 = (float[]) obj2;
            zzdc.zza(this, length8, fArr4.length);
            e eVarL5 = d.L(0, length8);
            ArrayList arrayList19 = new ArrayList(k.U(eVarL5));
            Iterator it5 = eVarL5.iterator();
            while (true) {
                b bVar5 = (b) it5;
                if (!bVar5.f7105d) {
                    return arrayList19.toArray(new Float[0]);
                }
                int iNextInt5 = bVar5.nextInt();
                arrayList19.add(Float.valueOf(fArr3[iNextInt5] % fArr4[iNextInt5]));
            }
        } else {
            if (!z20 || !(obj2 instanceof double[])) {
                throw new zzae(4, 5, null);
            }
            double[] dArr3 = (double[]) obj;
            int length9 = dArr3.length;
            double[] dArr4 = (double[]) obj2;
            zzdc.zza(this, length9, dArr4.length);
            e eVarL6 = d.L(0, length9);
            ArrayList arrayList20 = new ArrayList(k.U(eVarL6));
            Iterator it6 = eVarL6.iterator();
            while (true) {
                b bVar6 = (b) it6;
                if (!bVar6.f7105d) {
                    return arrayList20.toArray(new Double[0]);
                }
                int iNextInt6 = bVar6.nextInt();
                arrayList20.add(Double.valueOf(dArr3[iNextInt6] % dArr4[iNextInt6]));
            }
        }
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
        try {
            zzcjVar.zzc().zzf(i, zzb(objZza, objZza2));
        } catch (ArithmeticException e) {
            throw new zzae(4, 6, e);
        }
    }
}
