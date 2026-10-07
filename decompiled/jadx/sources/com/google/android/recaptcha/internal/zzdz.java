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
public final class zzdz implements zzdd {
    public static final zzdz zza = new zzdz();

    private zzdz() {
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
        boolean z4 = obj instanceof Byte;
        if (z4 && (obj2 instanceof Byte)) {
            return Byte.valueOf((byte) (((Number) obj).byteValue() ^ ((Number) obj2).byteValue()));
        }
        boolean z10 = obj instanceof Short;
        if (z10 && (obj2 instanceof Short)) {
            return Short.valueOf((short) (((Number) obj).shortValue() ^ ((Number) obj2).shortValue()));
        }
        boolean z11 = obj instanceof Integer;
        if (z11 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() ^ ((Number) obj2).intValue());
        }
        boolean z12 = obj instanceof Long;
        if (z12 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj2).longValue() ^ ((Number) obj).longValue());
        }
        int i = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(a.f7846a);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i] ^ ((Number) obj2).byteValue())));
                    i++;
                }
                return i.k0(arrayList);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i] ^ ((Number) obj2).intValue()));
                    i++;
                }
                return i.m0(arrayList2);
            }
        }
        if (z4 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b10 : bArr) {
                arrayList3.add(Byte.valueOf((byte) (b10 ^ ((Number) obj).byteValue())));
            }
            return arrayList3.toArray(new Byte[0]);
        }
        if (z10 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s10 : sArr) {
                arrayList4.add(Short.valueOf((short) (s10 ^ ((Number) obj).shortValue())));
            }
            return arrayList4.toArray(new Short[0]);
        }
        if (z11 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i10 : iArr) {
                arrayList5.add(Integer.valueOf(i10 ^ ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z12 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j4 : jArr) {
                arrayList6.add(Long.valueOf(j4 ^ ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        boolean z13 = obj instanceof byte[];
        if (z13 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList7 = new ArrayList(bArr2.length);
            for (byte b11 : bArr2) {
                arrayList7.add(Byte.valueOf((byte) (b11 ^ ((Number) obj2).byteValue())));
            }
            return arrayList7.toArray(new Byte[0]);
        }
        boolean z14 = obj instanceof short[];
        if (z14 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList8 = new ArrayList(sArr2.length);
            for (short s11 : sArr2) {
                arrayList8.add(Short.valueOf((short) (s11 ^ ((Number) obj2).shortValue())));
            }
            return arrayList8.toArray(new Short[0]);
        }
        boolean z15 = obj instanceof int[];
        if (z15 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            ArrayList arrayList9 = new ArrayList(iArr2.length);
            for (int i11 : iArr2) {
                arrayList9.add(Integer.valueOf(i11 ^ ((Number) obj2).intValue()));
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z16 = obj instanceof long[];
        if (z16 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList10 = new ArrayList(jArr2.length);
            for (long j10 : jArr2) {
                arrayList10.add(Long.valueOf(j10 ^ ((Number) obj2).longValue()));
            }
            return arrayList10.toArray(new Long[0]);
        }
        if (z13 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length3 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzdc.zza(this, length3, bArr4.length);
            e eVarL = d.L(0, length3);
            ArrayList arrayList11 = new ArrayList(k.U(eVarL));
            Iterator it = eVarL.iterator();
            while (true) {
                b bVar = (b) it;
                if (!bVar.f7105d) {
                    return arrayList11.toArray(new Byte[0]);
                }
                int iNextInt = bVar.nextInt();
                arrayList11.add(Byte.valueOf((byte) (bArr4[iNextInt] ^ bArr3[iNextInt])));
            }
        } else if (z14 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length4 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzdc.zza(this, length4, sArr4.length);
            e eVarL2 = d.L(0, length4);
            ArrayList arrayList12 = new ArrayList(k.U(eVarL2));
            Iterator it2 = eVarL2.iterator();
            while (true) {
                b bVar2 = (b) it2;
                if (!bVar2.f7105d) {
                    return arrayList12.toArray(new Short[0]);
                }
                int iNextInt2 = bVar2.nextInt();
                arrayList12.add(Short.valueOf((short) (sArr4[iNextInt2] ^ sArr3[iNextInt2])));
            }
        } else if (z15 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length5 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzdc.zza(this, length5, iArr4.length);
            e eVarL3 = d.L(0, length5);
            ArrayList arrayList13 = new ArrayList(k.U(eVarL3));
            Iterator it3 = eVarL3.iterator();
            while (true) {
                b bVar3 = (b) it3;
                if (!bVar3.f7105d) {
                    return arrayList13.toArray(new Integer[0]);
                }
                int iNextInt3 = bVar3.nextInt();
                arrayList13.add(Integer.valueOf(iArr4[iNextInt3] ^ iArr3[iNextInt3]));
            }
        } else {
            if (!z16 || !(obj2 instanceof long[])) {
                throw new zzae(4, 5, null);
            }
            long[] jArr3 = (long[]) obj;
            int length6 = jArr3.length;
            long[] jArr4 = (long[]) obj2;
            zzdc.zza(this, length6, jArr4.length);
            e eVarL4 = d.L(0, length6);
            ArrayList arrayList14 = new ArrayList(k.U(eVarL4));
            Iterator it4 = eVarL4.iterator();
            while (true) {
                b bVar4 = (b) it4;
                if (!bVar4.f7105d) {
                    return arrayList14.toArray(new Long[0]);
                }
                int iNextInt4 = bVar4.nextInt();
                arrayList14.add(Long.valueOf(jArr3[iNextInt4] ^ jArr4[iNextInt4]));
            }
        }
    }
}
