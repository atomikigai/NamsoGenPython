package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzalf {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final zzall zzf;
    public final String zzg;
    public final String zzh;
    public final zzalf zzi;
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private zzalf(String str, String str2, long j4, long j10, zzall zzallVar, String[] strArr, String str3, String str4, zzalf zzalfVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzallVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j4;
        this.zze = j10;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzalfVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }

    public static zzalf zzb(String str, long j4, long j10, zzall zzallVar, String[] strArr, String str2, String str3, zzalf zzalfVar) {
        return new zzalf(str, null, j4, j10, zzallVar, strArr, str2, str3, zzalfVar);
    }

    public static zzalf zzc(String str) {
        return new zzalf(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static SpannableStringBuilder zzi(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcr zzcrVar = new zzcr();
            zzcrVar.zzl(new SpannableStringBuilder());
            map.put(str, zzcrVar);
        }
        CharSequence charSequenceZzq = ((zzcr) map.get(str)).zzq();
        charSequenceZzq.getClass();
        return (SpannableStringBuilder) charSequenceZzq;
    }

    private final void zzj(TreeSet treeSet, boolean z4) {
        String str = this.zza;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z4 || zEquals || (zEquals2 && this.zzh != null)) {
            long j4 = this.zzd;
            if (j4 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j4));
            }
            long j10 = this.zze;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
        }
        if (this.zzm != null) {
            for (int i = 0; i < this.zzm.size(); i++) {
                zzalf zzalfVar = (zzalf) this.zzm.get(i);
                boolean z10 = true;
                if (!z4 && !zEquals) {
                    z10 = false;
                }
                zzalfVar.zzj(treeSet, z10);
            }
        }
    }

    private final void zzk(long j4, String str, List list) {
        String str2;
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (zzg(j4) && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < zza(); i++) {
            zzd(i).zzk(j4, str, list);
        }
    }

    private final void zzl(long j4, Map map, Map map2, String str, Map map3) {
        zzalf zzalfVar;
        zzall zzallVarZza;
        int i;
        int i10;
        Map map4 = map;
        if (zzg(j4)) {
            String str2 = !"".equals(this.zzg) ? this.zzg : str;
            Iterator it = this.zzl.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int iIntValue = this.zzk.containsKey(str3) ? ((Integer) this.zzk.get(str3)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    zzcr zzcrVar = (zzcr) map3.get(str3);
                    zzcrVar.getClass();
                    zzalj zzaljVar = (zzalj) map2.get(str2);
                    zzaljVar.getClass();
                    int i11 = zzaljVar.zzj;
                    zzall zzallVarZza2 = zzalk.zza(this.zzf, this.zzj, map4);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzcrVar.zzq();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzcrVar.zzl(spannableStringBuilder);
                    }
                    if (zzallVarZza2 != null) {
                        zzalf zzalfVar2 = this.zzi;
                        if (zzallVarZza2.zzh() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(zzallVarZza2.zzh()), iIntValue, iIntValue2, 33);
                        }
                        if (zzallVarZza2.zzI()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzallVarZza2.zzJ()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzallVarZza2.zzH()) {
                            zzcy.zzb(spannableStringBuilder, new ForegroundColorSpan(zzallVarZza2.zzd()), iIntValue, iIntValue2, 33);
                        }
                        if (zzallVarZza2.zzG()) {
                            zzcy.zzb(spannableStringBuilder, new BackgroundColorSpan(zzallVarZza2.zzc()), iIntValue, iIntValue2, 33);
                        }
                        if (zzallVarZza2.zzD() != null) {
                            zzcy.zzb(spannableStringBuilder, new TypefaceSpan(zzallVarZza2.zzD()), iIntValue, iIntValue2, 33);
                        }
                        if (zzallVarZza2.zzk() != null) {
                            zzale zzaleVarZzk = zzallVarZza2.zzk();
                            zzaleVarZzk.getClass();
                            int i12 = zzaleVarZzk.zza;
                            if (i12 == -1) {
                                i12 = (i11 == 2 || i11 == 1) ? 3 : 1;
                                i10 = 1;
                            } else {
                                i10 = zzaleVarZzk.zzb;
                            }
                            int i13 = zzaleVarZzk.zzc;
                            if (i13 == -2) {
                                i13 = 1;
                            }
                            zzcy.zzb(spannableStringBuilder, new zzcz(i12, i10, i13), iIntValue, iIntValue2, 33);
                        }
                        int iZzg = zzallVarZza2.zzg();
                        if (iZzg == 2) {
                            while (true) {
                                if (zzalfVar2 == null) {
                                    zzalfVar2 = null;
                                    break;
                                }
                                zzall zzallVarZza3 = zzalk.zza(zzalfVar2.zzf, zzalfVar2.zzj, map4);
                                if (zzallVarZza3 != null && zzallVarZza3.zzg() == 1) {
                                    break;
                                } else {
                                    zzalfVar2 = zzalfVar2.zzi;
                                }
                            }
                            if (zzalfVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzalfVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzalfVar = null;
                                        break;
                                    }
                                    zzalf zzalfVar3 = (zzalf) arrayDeque.pop();
                                    zzall zzallVarZza4 = zzalk.zza(zzalfVar3.zzf, zzalfVar3.zzj, map4);
                                    if (zzallVarZza4 != null && zzallVarZza4.zzg() == 3) {
                                        zzalfVar = zzalfVar3;
                                        break;
                                    }
                                    for (int iZza = zzalfVar3.zza() - 1; iZza >= 0; iZza--) {
                                        arrayDeque.push(zzalfVar3.zzd(iZza));
                                    }
                                }
                                if (zzalfVar != null) {
                                    if (zzalfVar.zza() != 1 || zzalfVar.zzd(0).zzb == null) {
                                        zzdt.zze("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str4 = zzalfVar.zzd(0).zzb;
                                        int i14 = zzen.zza;
                                        zzall zzallVarZza5 = zzalk.zza(zzalfVar.zzf, zzalfVar.zzj, map4);
                                        int iZzf = zzallVarZza5 != null ? zzallVarZza5.zzf() : -1;
                                        if (iZzf == -1 && (zzallVarZza = zzalk.zza(zzalfVar2.zzf, zzalfVar2.zzj, map4)) != null) {
                                            iZzf = zzallVarZza.zzf();
                                        }
                                        spannableStringBuilder.setSpan(new zzcx(str4, iZzf), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (iZzg == 3 || iZzg == 4) {
                            spannableStringBuilder.setSpan(new zzald(), iIntValue, iIntValue2, 33);
                        }
                        if (zzallVarZza2.zzF()) {
                            i = 33;
                            zzcy.zzb(spannableStringBuilder, new zzcw(), iIntValue, iIntValue2, 33);
                        } else {
                            i = 33;
                        }
                        int iZze = zzallVarZza2.zze();
                        if (iZze == 1) {
                            zzcy.zzb(spannableStringBuilder, new AbsoluteSizeSpan((int) zzallVarZza2.zza(), true), iIntValue, iIntValue2, i);
                        } else if (iZze == 2) {
                            zzcy.zzb(spannableStringBuilder, new RelativeSizeSpan(zzallVarZza2.zza()), iIntValue, iIntValue2, i);
                        } else if (iZze == 3) {
                            zzcy.zza(spannableStringBuilder, zzallVarZza2.zza() / 100.0f, iIntValue, iIntValue2, i);
                        }
                        if ("p".equals(this.zza)) {
                            if (zzallVarZza2.zzb() != Float.MAX_VALUE) {
                                zzcrVar.zzj((zzallVarZza2.zzb() * (-90.0f)) / 100.0f);
                            }
                            if (zzallVarZza2.zzj() != null) {
                                zzcrVar.zzm(zzallVarZza2.zzj());
                            }
                            if (zzallVarZza2.zzi() != null) {
                                zzcrVar.zzg(zzallVarZza2.zzi());
                            }
                        }
                        it = it;
                    }
                }
            }
            int i15 = 0;
            while (i15 < zza()) {
                zzd(i15).zzl(j4, map4, map2, str2, map3);
                i15++;
                map4 = map;
            }
        }
    }

    private final void zzm(long j4, boolean z4, String str, Map map) {
        this.zzk.clear();
        this.zzl.clear();
        if ("metadata".equals(this.zza)) {
            return;
        }
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        String str2 = str;
        if (this.zzc && z4) {
            SpannableStringBuilder spannableStringBuilderZzi = zzi(str2, map);
            String str3 = this.zzb;
            str3.getClass();
            spannableStringBuilderZzi.append((CharSequence) str3);
            return;
        }
        if ("br".equals(this.zza) && z4) {
            zzi(str2, map).append('\n');
            return;
        }
        if (zzg(j4)) {
            for (Map.Entry entry : map.entrySet()) {
                HashMap map2 = this.zzk;
                String str4 = (String) entry.getKey();
                CharSequence charSequenceZzq = ((zzcr) entry.getValue()).zzq();
                charSequenceZzq.getClass();
                map2.put(str4, Integer.valueOf(charSequenceZzq.length()));
            }
            boolean zEquals = "p".equals(this.zza);
            int i = 0;
            while (i < zza()) {
                zzd(i).zzm(j4, z4 || zEquals, str2, map);
                i++;
                j4 = j4;
                map = map;
            }
            Map map3 = map;
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderZzi2 = zzi(str2, map3);
                int length = spannableStringBuilderZzi2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderZzi2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderZzi2.charAt(length) != '\n') {
                    spannableStringBuilderZzi2.append('\n');
                }
            }
            for (Map.Entry entry2 : map3.entrySet()) {
                HashMap map4 = this.zzl;
                String str5 = (String) entry2.getKey();
                CharSequence charSequenceZzq2 = ((zzcr) entry2.getValue()).zzq();
                charSequenceZzq2.getClass();
                map4.put(str5, Integer.valueOf(charSequenceZzq2.length()));
            }
        }
    }

    public final int zza() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final zzalf zzd(int i) {
        List list = this.zzm;
        if (list != null) {
            return (zzalf) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List zze(long j4, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        zzk(j4, this.zzg, arrayList);
        TreeMap treeMap = new TreeMap();
        zzm(j4, false, this.zzg, treeMap);
        zzl(j4, map, map2, this.zzg, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                zzalj zzaljVar = (zzalj) map2.get(pair.first);
                zzaljVar.getClass();
                zzcr zzcrVar = new zzcr();
                zzcrVar.zzc(bitmapDecodeByteArray);
                zzcrVar.zzh(zzaljVar.zzb);
                zzcrVar.zzi(0);
                zzcrVar.zze(zzaljVar.zzc, 0);
                zzcrVar.zzf(zzaljVar.zze);
                zzcrVar.zzk(zzaljVar.zzf);
                zzcrVar.zzd(zzaljVar.zzg);
                zzcrVar.zzo(zzaljVar.zzj);
                arrayList2.add(zzcrVar.zzp());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzalj zzaljVar2 = (zzalj) map2.get(entry.getKey());
            zzaljVar2.getClass();
            zzcr zzcrVar2 = (zzcr) entry.getValue();
            CharSequence charSequenceZzq = zzcrVar2.zzq();
            charSequenceZzq.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceZzq;
            for (zzald zzaldVar : (zzald[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzald.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzaldVar), spannableStringBuilder.getSpanEnd(zzaldVar), (CharSequence) "");
            }
            int i10 = 0;
            while (i10 < spannableStringBuilder.length()) {
                int i11 = i10 + 1;
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
                i10 = i11;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i14 = 0;
            while (i14 < spannableStringBuilder.length() - 1) {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i14) == '\n' && spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
                i14 = i15;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i16 = 0;
            while (i16 < spannableStringBuilder.length() - 1) {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i16) == ' ' && spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
                i16 = i17;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzcrVar2.zze(zzaljVar2.zzc, zzaljVar2.zzd);
            zzcrVar2.zzf(zzaljVar2.zze);
            zzcrVar2.zzh(zzaljVar2.zzb);
            zzcrVar2.zzk(zzaljVar2.zzf);
            zzcrVar2.zzn(zzaljVar2.zzi, zzaljVar2.zzh);
            zzcrVar2.zzo(zzaljVar2.zzj);
            arrayList2.add(zzcrVar2.zzp());
        }
        return arrayList2;
    }

    public final void zzf(zzalf zzalfVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzalfVar);
    }

    public final boolean zzg(long j4) {
        long j10 = this.zzd;
        if (j10 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j10 = -9223372036854775807L;
        }
        if (j10 <= j4 && this.zze == -9223372036854775807L) {
            return true;
        }
        if (j10 != -9223372036854775807L || j4 >= this.zze) {
            return j10 <= j4 && j4 < this.zze;
        }
        return true;
    }

    public final long[] zzh() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        zzj(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }
}
