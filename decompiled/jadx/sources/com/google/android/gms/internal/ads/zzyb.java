package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzyb extends zzyg implements zzlp {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgaz zzc = zzgaz.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzxb
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i = zzyb.zzb;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });
    public final Context zza;
    private final Object zzd;
    private final boolean zze;
    private zzxp zzf;
    private zzxt zzg;
    private zzg zzh;
    private final zzwx zzi;

    public zzyb(Context context) {
        zzwx zzwxVar = new zzwx();
        zzxp zzxpVarZzd = zzxp.zzd(context);
        this.zzd = new Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzi = zzwxVar;
        this.zzf = zzxpVarZzd;
        this.zzh = zzg.zza;
        boolean z4 = false;
        if (context != null && zzen.zzM(context)) {
            z4 = true;
        }
        this.zze = z4;
        if (!z4 && context != null && zzen.zza >= 32) {
            this.zzg = zzxt.zza(context);
        }
        if (this.zzf.zzM && context == null) {
            zzdt.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static /* bridge */ /* synthetic */ int zzb(int i, int i10) {
        return (i == 0 || i != i10) ? Integer.bitCount(i & i10) : f.API_PRIORITY_OTHER;
    }

    public static int zzc(zzad zzadVar, String str, boolean z4) {
        if (!TextUtils.isEmpty(str) && str.equals(zzadVar.zzd)) {
            return 4;
        }
        String strZzh = zzh(str);
        String strZzh2 = zzh(zzadVar.zzd);
        if (strZzh2 == null || strZzh == null) {
            return (z4 && strZzh2 == null) ? 1 : 0;
        }
        if (strZzh2.startsWith(strZzh) || strZzh.startsWith(strZzh2)) {
            return 3;
        }
        int i = zzen.zza;
        return strZzh2.split("-", 2)[0].equals(strZzh.split("-", 2)[0]) ? 2 : 0;
    }

    public static String zzh(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0045 A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #0 {all -> 0x0054, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x000e, B:10:0x0013, B:36:0x0056, B:38:0x005b, B:40:0x005f, B:42:0x0065, B:44:0x006b, B:46:0x0073, B:13:0x001a, B:27:0x0045, B:29:0x0049, B:31:0x004d, B:50:0x007f), top: B:54:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0049 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x000e, B:10:0x0013, B:36:0x0056, B:38:0x005b, B:40:0x005f, B:42:0x0065, B:44:0x006b, B:46:0x0073, B:13:0x001a, B:27:0x0045, B:29:0x0049, B:31:0x004d, B:50:0x007f), top: B:54:0x0003 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static /* synthetic */ boolean zzm(zzyb zzybVar, zzad zzadVar) {
        boolean z4;
        zzxt zzxtVar;
        zzxt zzxtVar2;
        synchronized (zzybVar.zzd) {
            try {
                z4 = true;
                if (zzybVar.zzf.zzM && !zzybVar.zze && zzadVar.zzC > 2) {
                    String str = zzadVar.zzo;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -2123537834:
                                if (str.equals("audio/eac3-joc")) {
                                    if (zzen.zza >= 32 && (zzxtVar = zzybVar.zzg) != null && zzxtVar.zzg()) {
                                    }
                                }
                                break;
                            case 187078296:
                                if (str.equals("audio/ac3")) {
                                    if (zzen.zza >= 32) {
                                    }
                                }
                                break;
                            case 187078297:
                                if (str.equals("audio/ac4")) {
                                    if (zzen.zza >= 32) {
                                    }
                                }
                                break;
                            case 1504578661:
                                if (str.equals("audio/eac3")) {
                                    if (zzen.zza >= 32) {
                                    }
                                }
                                break;
                        }
                    }
                    if (zzen.zza < 32 || (zzxtVar2 = zzybVar.zzg) == null || !zzxtVar2.zzg() || !zzxtVar2.zze() || !zzybVar.zzg.zzf() || !zzybVar.zzg.zzd(zzybVar.zzh, zzadVar)) {
                        z4 = false;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    private static void zzt(zzwr zzwrVar, zzcb zzcbVar, Map map) {
        for (int i = 0; i < zzwrVar.zzb; i++) {
            if (((zzbx) zzcbVar.zzA.get(zzwrVar.zzb(i))) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu() {
        boolean z4;
        zzxt zzxtVar;
        synchronized (this.zzd) {
            try {
                z4 = false;
                if (this.zzf.zzM && !this.zze && zzen.zza >= 32 && (zzxtVar = this.zzg) != null && zzxtVar.zzg()) {
                    z4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            zzs();
        }
    }

    private static final Pair zzv(int i, zzyf zzyfVar, int[][][] iArr, zzxv zzxvVar, Comparator comparator) {
        RandomAccess randomAccessZzo;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 2; i10++) {
            if (i == zzyfVar.zzc(i10)) {
                zzwr zzwrVarZzd = zzyfVar.zzd(i10);
                for (int i11 = 0; i11 < zzwrVarZzd.zzb; i11++) {
                    zzbw zzbwVarZzb = zzwrVarZzd.zzb(i11);
                    List listZza = zzxvVar.zza(i10, zzbwVarZzb, iArr[i10][i11]);
                    boolean[] zArr = new boolean[zzbwVarZzb.zza];
                    int i12 = 0;
                    while (i12 < zzbwVarZzb.zza) {
                        int i13 = i12 + 1;
                        zzxw zzxwVar = (zzxw) listZza.get(i12);
                        int iZzb = zzxwVar.zzb();
                        if (!zArr[i12] && iZzb != 0) {
                            if (iZzb == 1) {
                                randomAccessZzo = zzfzo.zzo(zzxwVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzxwVar);
                                for (int i14 = i13; i14 < zzbwVarZzb.zza; i14++) {
                                    zzxw zzxwVar2 = (zzxw) listZza.get(i14);
                                    if (zzxwVar2.zzb() == 2 && zzxwVar.zzc(zzxwVar2)) {
                                        arrayList2.add(zzxwVar2);
                                        zArr[i14] = true;
                                    }
                                }
                                randomAccessZzo = arrayList2;
                            }
                            arrayList.add(randomAccessZzo);
                        }
                        i12 = i13;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i15 = 0; i15 < list.size(); i15++) {
            iArr2[i15] = ((zzxw) list.get(i15)).zzc;
        }
        zzxw zzxwVar3 = (zzxw) list.get(0);
        return Pair.create(new zzyc(zzxwVar3.zzb, iArr2, 0), Integer.valueOf(zzxwVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zza(zzln zzlnVar) {
        synchronized (this.zzd) {
            boolean z4 = this.zzf.zzQ;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzyg
    public final Pair zzd(zzyf zzyfVar, int[][][] iArr, final int[] iArr2, zzur zzurVar, zzbv zzbvVar) throws zzig {
        final zzxp zzxpVar;
        int i;
        final boolean z4;
        final String str;
        int[] iArr3;
        int length;
        zzxt zzxtVar;
        synchronized (this.zzd) {
            try {
                zzxpVar = this.zzf;
                if (zzxpVar.zzM && zzen.zza >= 32 && (zzxtVar = this.zzg) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    zzdb.zzb(looperMyLooper);
                    zzxtVar.zzb(this, looperMyLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i10 = 2;
        zzyc[] zzycVarArr = new zzyc[2];
        Pair pairZzv = zzv(2, zzyfVar, iArr, new zzxv() { // from class: com.google.android.gms.internal.ads.zzxh
            /* JADX WARN: Code duplicated, block: B:23:0x0042  */
            @Override // com.google.android.gms.internal.ads.zzxv
            public final List zza(int i11, zzbw zzbwVar, int[] iArr4) {
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                Point point;
                zzbw zzbwVar2 = zzbwVar;
                int i17 = zzyb.zzb;
                zzxp zzxpVar2 = zzxpVar;
                int i18 = iArr2[i11];
                int i19 = zzxpVar2.zzi;
                int i20 = zzxpVar2.zzj;
                boolean z10 = zzxpVar2.zzk;
                int i21 = f.API_PRIORITY_OTHER;
                if (i19 == Integer.MAX_VALUE) {
                    i12 = -1;
                    i21 = f.API_PRIORITY_OTHER;
                } else if (i20 == Integer.MAX_VALUE) {
                    i12 = -1;
                } else {
                    int i22 = Integer.MAX_VALUE;
                    for (int i23 = 0; i23 < zzbwVar2.zza; i23++) {
                        zzad zzadVarZzb = zzbwVar2.zzb(i23);
                        int i24 = zzadVarZzb.zzu;
                        if (i24 > 0 && (i14 = zzadVarZzb.zzv) > 0) {
                            if (!z10) {
                                i15 = i19;
                                i16 = i20;
                            } else if ((i24 > i14) != (i19 > i20)) {
                                i16 = i19;
                                i15 = i20;
                            } else {
                                i15 = i19;
                                i16 = i20;
                            }
                            int i25 = i24 * i16;
                            int i26 = i14 * i15;
                            if (i25 >= i26) {
                                int i27 = zzen.zza;
                                point = new Point(i15, ((i26 + i24) - 1) / i24);
                            } else {
                                int i28 = zzen.zza;
                                point = new Point(((i25 + i14) - 1) / i14, i16);
                            }
                            int i29 = zzadVarZzb.zzu;
                            int i30 = zzadVarZzb.zzv;
                            int i31 = i29 * i30;
                            if (i29 >= ((int) (point.x * 0.98f)) && i30 >= ((int) (point.y * 0.98f)) && i31 < i22) {
                                i22 = i31;
                            }
                        }
                    }
                    i12 = -1;
                    i21 = i22;
                }
                zzfzl zzfzlVar = new zzfzl();
                int i32 = 0;
                while (i32 < zzbwVar2.zza) {
                    int iZza = zzbwVar2.zzb(i32).zza();
                    if (i21 != Integer.MAX_VALUE) {
                        i13 = i12;
                        boolean z11 = iZza != i13 && iZza <= i21;
                        zzfzlVar.zzf(new zzxz(i11, zzbwVar2, i32, zzxpVar2, iArr4[i32], i18, z11));
                        i32++;
                        zzbwVar2 = zzbwVar;
                        i12 = i13;
                    } else {
                        i13 = i12;
                    }
                    zzfzlVar.zzf(new zzxz(i11, zzbwVar2, i32, zzxpVar2, iArr4[i32], i18, z11));
                    i32++;
                    zzbwVar2 = zzbwVar;
                    i12 = i13;
                }
                return zzfzlVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxi
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                return zzfzd.zzj().zzc((zzxz) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxx
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxz.zzd((zzxz) obj3, (zzxz) obj4);
                    }
                }), (zzxz) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxx
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxz.zzd((zzxz) obj3, (zzxz) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzxx
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxz.zzd((zzxz) obj3, (zzxz) obj4);
                    }
                }).zzb(list.size(), list2.size()).zzc((zzxz) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxy
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxz.zza((zzxz) obj3, (zzxz) obj4);
                    }
                }), (zzxz) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxy
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxz.zza((zzxz) obj3, (zzxz) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzxy
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxz.zza((zzxz) obj3, (zzxz) obj4);
                    }
                }).zza();
            }
        });
        int i11 = 4;
        Pair pairZzv2 = pairZzv == null ? zzv(4, zzyfVar, iArr, new zzxv() { // from class: com.google.android.gms.internal.ads.zzxd
            @Override // com.google.android.gms.internal.ads.zzxv
            public final List zza(int i12, zzbw zzbwVar, int[] iArr4) {
                int i13 = zzyb.zzb;
                zzfzl zzfzlVar = new zzfzl();
                for (int i14 = 0; i14 < zzbwVar.zza; i14++) {
                    zzfzlVar.zzf(new zzxm(i12, zzbwVar, i14, zzxpVar, iArr4[i14]));
                }
                return zzfzlVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxe
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzxm) ((List) obj).get(0)).compareTo((zzxm) ((List) obj2).get(0));
            }
        }) : null;
        int i12 = 0;
        if (pairZzv2 != null) {
            zzycVarArr[((Integer) pairZzv2.second).intValue()] = (zzyc) pairZzv2.first;
        } else if (pairZzv != null) {
            zzycVarArr[((Integer) pairZzv.second).intValue()] = (zzyc) pairZzv.first;
        }
        int i13 = 0;
        while (true) {
            i = 1;
            if (i13 >= 2) {
                z4 = false;
                break;
            }
            if (zzyfVar.zzc(i13) == 2 && zzyfVar.zzd(i13).zzb > 0) {
                z4 = true;
                break;
            }
            i13++;
        }
        Pair pairZzv3 = zzv(1, zzyfVar, iArr, new zzxv() { // from class: com.google.android.gms.internal.ads.zzxf
            @Override // com.google.android.gms.internal.ads.zzxv
            public final List zza(int i14, zzbw zzbwVar, int[] iArr4) {
                final zzyb zzybVar = this.zza;
                zzfwr zzfwrVar = new zzfwr() { // from class: com.google.android.gms.internal.ads.zzxc
                    @Override // com.google.android.gms.internal.ads.zzfwr
                    public final boolean zza(Object obj) {
                        return zzyb.zzm(zzybVar, (zzad) obj);
                    }
                };
                int i15 = iArr2[i14];
                zzfzl zzfzlVar = new zzfzl();
                for (int i16 = 0; i16 < zzbwVar.zza; i16++) {
                    zzfzlVar.zzf(new zzxl(i14, zzbwVar, i16, zzxpVar, iArr4[i16], z4, zzfwrVar, i15));
                }
                return zzfzlVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxg
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzxl) Collections.max((List) obj)).zza((zzxl) Collections.max((List) obj2));
            }
        });
        if (pairZzv3 != null) {
            zzycVarArr[((Integer) pairZzv3.second).intValue()] = (zzyc) pairZzv3.first;
        }
        if (pairZzv3 == null) {
            str = null;
        } else {
            Object obj = pairZzv3.first;
            str = ((zzyc) obj).zza.zzb(((zzyc) obj).zzb[0]).zzd;
        }
        int i14 = 3;
        Pair pairZzv4 = zzv(3, zzyfVar, iArr, new zzxv() { // from class: com.google.android.gms.internal.ads.zzxj
            @Override // com.google.android.gms.internal.ads.zzxv
            public final List zza(int i15, zzbw zzbwVar, int[] iArr4) {
                int i16 = zzyb.zzb;
                zzfzl zzfzlVar = new zzfzl();
                for (int i17 = 0; i17 < zzbwVar.zza; i17++) {
                    zzfzlVar.zzf(new zzxu(i15, zzbwVar, i17, zzxpVar, iArr4[i17], str));
                }
                return zzfzlVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxk
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((zzxu) ((List) obj2).get(0)).zza((zzxu) ((List) obj3).get(0));
            }
        });
        if (pairZzv4 != null) {
            zzycVarArr[((Integer) pairZzv4.second).intValue()] = (zzyc) pairZzv4.first;
        }
        int i15 = 0;
        while (i15 < i10) {
            int iZzc = zzyfVar.zzc(i15);
            if (iZzc != i10 && iZzc != i && iZzc != i14 && iZzc != i11) {
                zzwr zzwrVarZzd = zzyfVar.zzd(i15);
                int[][] iArr4 = iArr[i15];
                int i16 = i12;
                int i17 = i16;
                zzbw zzbwVar = null;
                zzxn zzxnVar = null;
                while (i16 < zzwrVarZzd.zzb) {
                    zzbw zzbwVarZzb = zzwrVarZzd.zzb(i16);
                    int[] iArr5 = iArr4[i16];
                    zzxn zzxnVar2 = zzxnVar;
                    for (int i18 = i12; i18 < zzbwVarZzb.zza; i18++) {
                        if (zzlo.zza(iArr5[i18], zzxpVar.zzN)) {
                            zzxn zzxnVar3 = new zzxn(zzbwVarZzb.zzb(i18), iArr5[i18]);
                            if (zzxnVar2 == null || zzxnVar3.compareTo(zzxnVar2) > 0) {
                                zzbwVar = zzbwVarZzb;
                                zzxnVar2 = zzxnVar3;
                                i17 = i18;
                            }
                        }
                    }
                    i16++;
                    zzxnVar = zzxnVar2;
                    i12 = 0;
                }
                zzycVarArr[i15] = zzbwVar == null ? null : new zzyc(zzbwVar, new int[]{i17}, 0);
            }
            i15++;
            i10 = 2;
            i11 = 4;
            i = 1;
            i12 = 0;
            i14 = 3;
        }
        HashMap map = new HashMap();
        int i19 = 2;
        for (int i20 = 0; i20 < 2; i20++) {
            zzt(zzyfVar.zzd(i20), zzxpVar, map);
        }
        zzt(zzyfVar.zze(), zzxpVar, map);
        for (int i21 = 0; i21 < 2; i21++) {
            if (((zzbx) map.get(Integer.valueOf(zzyfVar.zzc(i21)))) != null) {
                throw null;
            }
        }
        int i22 = 0;
        while (i22 < i19) {
            zzwr zzwrVarZzd2 = zzyfVar.zzd(i22);
            if (zzxpVar.zzg(i22, zzwrVarZzd2)) {
                if (zzxpVar.zze(i22, zzwrVarZzd2) != null) {
                    throw null;
                }
                zzycVarArr[i22] = null;
            }
            i22++;
            i19 = 2;
        }
        int i23 = 0;
        while (i23 < i19) {
            int iZzc2 = zzyfVar.zzc(i23);
            if (zzxpVar.zzf(i23) || zzxpVar.zzB.contains(Integer.valueOf(iZzc2))) {
                zzycVarArr[i23] = null;
            }
            i23++;
            i19 = 2;
        }
        zzwx zzwxVar = this.zzi;
        zzyr zzyrVarZzq = zzq();
        zzfzo zzfzoVarZzf = zzwy.zzf(zzycVarArr);
        int i24 = 2;
        zzyd[] zzydVarArr = new zzyd[2];
        int i25 = 0;
        while (i25 < i24) {
            zzyc zzycVar = zzycVarArr[i25];
            if (zzycVar != null && (length = (iArr3 = zzycVar.zzb).length) != 0) {
                zzydVarArr[i25] = length == 1 ? new zzye(zzycVar.zza, iArr3[0], 0, 0, null) : zzwxVar.zza(zzycVar.zza, iArr3, 0, zzyrVarZzq, (zzfzo) zzfzoVarZzf.get(i25));
            }
            i25++;
            i24 = 2;
        }
        zzlr[] zzlrVarArr = new zzlr[i24];
        for (int i26 = 0; i26 < i24; i26++) {
            zzlrVarArr[i26] = (zzxpVar.zzf(i26) || zzxpVar.zzB.contains(Integer.valueOf(zzyfVar.zzc(i26))) || (zzyfVar.zzc(i26) != -2 && zzydVarArr[i26] == null)) ? null : zzlr.zza;
        }
        return Pair.create(zzlrVarArr, zzydVarArr);
    }

    public final zzxp zzf() {
        zzxp zzxpVar;
        synchronized (this.zzd) {
            zzxpVar = this.zzf;
        }
        return zzxpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final void zzj() {
        zzxt zzxtVar;
        synchronized (this.zzd) {
            try {
                if (zzen.zza >= 32 && (zzxtVar = this.zzg) != null) {
                    zzxtVar.zzc();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final void zzk(zzg zzgVar) {
        boolean zEquals;
        synchronized (this.zzd) {
            zEquals = this.zzh.equals(zzgVar);
            this.zzh = zzgVar;
        }
        if (zEquals) {
            return;
        }
        zzu();
    }

    public final void zzl(zzxo zzxoVar) {
        boolean zEquals;
        zzxp zzxpVar = new zzxp(zzxoVar);
        synchronized (this.zzd) {
            zEquals = this.zzf.equals(zzxpVar);
            this.zzf = zzxpVar;
        }
        if (zEquals) {
            return;
        }
        if (zzxpVar.zzM && this.zza == null) {
            zzdt.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final boolean zzn() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final zzlp zze() {
        return this;
    }
}
