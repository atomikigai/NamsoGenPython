package com.google.android.gms.internal.measurement;

import da.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzat implements Iterable, zzap {
    private final String zza;

    public zzat(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzat) {
            return this.zza.equals(((zzat) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzas(this);
    }

    public final String toString() {
        return v.i("\"", this.zza, "\"");
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02ac A[PHI: r10
      0x02ac: PHI (r10v6 boolean) = (r10v12 boolean), (r10v13 boolean), (r10v16 boolean) binds: [B:100:0x0298, B:101:0x029a, B:103:0x02aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbU(String str, zzg zzgVar, List list) {
        String str2;
        int i;
        zzat zzatVar;
        int i10;
        int i11;
        boolean zIsEmpty;
        zzg zzgVar2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                throw new IllegalArgumentException(v.h(str, " is not a String function"));
            }
        }
        String strZzi = "undefined";
        z = false;
        boolean z4 = false;
        switch (str.hashCode()) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    zzh.zzh("hasOwnProperty", 1, list);
                    String str3 = this.zza;
                    zzap zzapVarZzb = zzgVar.zzb((zzap) list.get(0));
                    if ("length".equals(zzapVarZzb.zzi())) {
                        return zzap.zzk;
                    }
                    double dDoubleValue = zzapVarZzb.zzh().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str3.length()) ? zzap.zzl : zzap.zzk;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1776922004:
                if (str.equals("toString")) {
                    zzh.zzh("toString", 0, list);
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    zzh.zzh("toLocaleLowerCase", 0, list);
                    return new zzat(this.zza.toLowerCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -1361633751:
                if (str.equals("charAt")) {
                    zzh.zzj("charAt", 1, list);
                    int iZza = list.isEmpty() ? 0 : (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
                    String str4 = this.zza;
                    return (iZza < 0 || iZza >= str4.length()) ? zzap.zzm : new zzat(String.valueOf(str4.charAt(iZza)));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                zzatVar = this;
                if (str.equals("concat")) {
                    if (!list.isEmpty()) {
                        StringBuilder sb2 = new StringBuilder(zzatVar.zza);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            sb2.append(zzgVar.zzb((zzap) list.get(i12)).zzi());
                        }
                        return new zzat(sb2.toString());
                    }
                    return zzatVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    zzh.zzh("toLowerCase", 0, list);
                    return new zzat(this.zza.toLowerCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case -906336856:
                if (str.equals("search")) {
                    zzh.zzj("search", 1, list);
                    Matcher matcher = Pattern.compile(list.isEmpty() ? "undefined" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(this.zza);
                    return matcher.find() ? new zzah(Double.valueOf(matcher.start())) : new zzah(Double.valueOf(-1.0d));
                }
                throw new IllegalArgumentException("Command not supported");
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    zzh.zzh("toLocaleUpperCase", 0, list);
                    return new zzat(this.zza.toUpperCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    zzh.zzj("lastIndexOf", 2, list);
                    String str5 = this.zza;
                    String strZzi2 = list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined";
                    double dDoubleValue2 = list.size() < 2 ? Double.NaN : zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue();
                    return new zzah(Double.valueOf(str5.lastIndexOf(strZzi2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : zzh.zza(dDoubleValue2)))));
                }
                throw new IllegalArgumentException("Command not supported");
            case -399551817:
                if (str.equals("toUpperCase")) {
                    zzh.zzh("toUpperCase", 0, list);
                    return new zzat(this.zza.toUpperCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3568674:
                if (str.equals(str2)) {
                    zzh.zzh("toUpperCase", 0, list);
                    return new zzat(this.zza.trim());
                }
                throw new IllegalArgumentException("Command not supported");
            case 103668165:
                if (str.equals("match")) {
                    zzh.zzj("match", 1, list);
                    Matcher matcher2 = Pattern.compile(list.size() <= 0 ? "" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(this.zza);
                    return matcher2.find() ? new zzae(Arrays.asList(new zzat(matcher2.group()))) : zzap.zzg;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    zzh.zzj("slice", 2, list);
                    String str6 = this.zza;
                    double dZza = zzh.zza(!list.isEmpty() ? zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue() : 0.0d);
                    double dMax = dZza < 0.0d ? Math.max(((double) str6.length()) + dZza, 0.0d) : Math.min(dZza, str6.length());
                    double dZza2 = zzh.zza(list.size() > 1 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : str6.length());
                    int i13 = (int) dMax;
                    return new zzat(str6.substring(i13, Math.max(0, ((int) (dZza2 < 0.0d ? Math.max(((double) str6.length()) + dZza2, 0.0d) : Math.min(dZza2, str6.length()))) - i13) + i13));
                }
                throw new IllegalArgumentException("Command not supported");
            case 109648666:
                if (str.equals("split")) {
                    zzh.zzj("split", 2, list);
                    String str7 = this.zza;
                    if (str7.length() == 0) {
                        return new zzae(Arrays.asList(this));
                    }
                    ArrayList arrayList = new ArrayList();
                    if (list.isEmpty()) {
                        arrayList.add(this);
                    } else {
                        String strZzi3 = zzgVar.zzb((zzap) list.get(0)).zzi();
                        long jZzd = list.size() > 1 ? zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) : 2147483647L;
                        if (jZzd == 0) {
                            return new zzae();
                        }
                        String[] strArrSplit = str7.split(Pattern.quote(strZzi3), ((int) jZzd) + 1);
                        int length = strArrSplit.length;
                        if (!strZzi3.isEmpty() || length <= 0) {
                            i11 = zIsEmpty;
                            z4 = zIsEmpty;
                            i10 = length;
                            i11 = z4;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i10 = length - 1;
                            if (!strArrSplit[i10].isEmpty()) {
                                i11 = zIsEmpty;
                                z4 = zIsEmpty;
                                i10 = length;
                                i11 = z4;
                            }
                        }
                        i11 = zIsEmpty;
                        z4 = zIsEmpty;
                        if (length > jZzd) {
                            i10--;
                        }
                        while (i11 < i10) {
                            arrayList.add(new zzat(strArrSplit[i11]));
                            i11++;
                        }
                    }
                    return new zzae(arrayList);
                }
                throw new IllegalArgumentException("Command not supported");
            case 530542161:
                if (str.equals("substring")) {
                    zzh.zzj("substring", 2, list);
                    String str8 = this.zza;
                    int iZza2 = !list.isEmpty() ? (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue()) : 0;
                    int iZza3 = list.size() > 1 ? (int) zzh.zza(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) : str8.length();
                    int iMin = Math.min(Math.max(iZza2, 0), str8.length());
                    int iMin2 = Math.min(Math.max(iZza3, 0), str8.length());
                    return new zzat(str8.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                }
                throw new IllegalArgumentException("Command not supported");
            case 1094496948:
                zzatVar = this;
                if (str.equals("replace")) {
                    zzh.zzj("replace", 2, list);
                    zzap zzapVarZza = zzap.zzf;
                    if (!list.isEmpty()) {
                        strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                        if (list.size() > 1) {
                            zzapVarZza = zzgVar.zzb((zzap) list.get(1));
                        }
                    }
                    String str9 = strZzi;
                    String str10 = zzatVar.zza;
                    int iIndexOf = str10.indexOf(str9);
                    if (iIndexOf >= 0) {
                        if (zzapVarZza instanceof zzai) {
                            zzapVarZza = ((zzai) zzapVarZza).zza(zzgVar, Arrays.asList(new zzat(str9), new zzah(Double.valueOf(iIndexOf)), zzatVar));
                        }
                        return new zzat(v.u(str10.substring(0, iIndexOf), zzapVarZza.zzi(), str10.substring(str9.length() + iIndexOf)));
                    }
                    return zzatVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    zzh.zzj("indexOf", 2, list);
                    String str11 = this.zza;
                    if (list.size() <= 0) {
                        zzgVar2 = zzgVar;
                    } else {
                        zzgVar2 = zzgVar;
                        strZzi = zzgVar2.zzb((zzap) list.get(0)).zzi();
                    }
                    return new zzah(Double.valueOf(str11.indexOf(strZzi, (int) zzh.zza(list.size() < 2 ? 0.0d : zzgVar2.zzb((zzap) list.get(1)).zzh().doubleValue()))));
                }
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzar(this);
    }
}
