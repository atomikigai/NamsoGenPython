package com.google.android.gms.internal.ads;

import i6.h;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzazy {
    private final zzazn zza;
    private final int zzb;
    private final int zzc;

    public zzazy(int i, int i10, int i11) {
        this.zzb = i;
        i10 = (i10 > 64 || i10 < 0) ? 64 : i10;
        if (i11 <= 0) {
            this.zzc = 1;
        } else {
            this.zzc = i11;
        }
        this.zza = new zzazw(i10);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    public final String zza(ArrayList arrayList, ArrayList arrayList2) {
        Collections.sort(arrayList2, new zzazx(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i = 0; i < arrayList2.size(); i++) {
            String[] strArrSplit = Normalizer.normalize((CharSequence) arrayList.get(((zzazm) arrayList2.get(i)).zze()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (strArrSplit.length != 0) {
                for (String str : strArrSplit) {
                    if (str.contains("'")) {
                        StringBuilder sb2 = new StringBuilder(str);
                        int i10 = 1;
                        boolean z4 = false;
                        while (true) {
                            int i11 = i10 + 2;
                            if (i11 > sb2.length()) {
                                break;
                            }
                            if (sb2.charAt(i10) == '\'') {
                                if (sb2.charAt(i10 - 1) != ' ') {
                                    int i12 = i10 + 1;
                                    if ((sb2.charAt(i12) == 's' || sb2.charAt(i12) == 'S') && (i11 == sb2.length() || sb2.charAt(i11) == ' ')) {
                                        sb2.insert(i10, ' ');
                                        i10 = i11;
                                    } else {
                                        sb2.setCharAt(i10, ' ');
                                    }
                                } else {
                                    sb2.setCharAt(i10, ' ');
                                }
                                z4 = true;
                            }
                            i10++;
                        }
                        String string = z4 ? sb2.toString() : null;
                        if (string != null) {
                            str = string;
                        }
                    }
                    String[] strArrZzb = zzazr.zzb(str, true);
                    if (strArrZzb.length >= this.zzc) {
                        for (int i13 = 0; i13 < strArrZzb.length; i13++) {
                            String strConcat = "";
                            for (int i14 = 0; i14 < this.zzc; i14++) {
                                int i15 = i13 + i14;
                                if (i15 >= strArrZzb.length) {
                                    break;
                                }
                                if (i14 > 0) {
                                    strConcat = strConcat.concat(" ");
                                }
                                strConcat = strConcat.concat(String.valueOf(strArrZzb[i15]));
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= this.zzb) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.zzb) {
                            break loop0;
                        }
                    }
                }
            }
        }
        zzazp zzazpVar = new zzazp();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzazpVar.zzb.write(this.zza.zzb((String) it.next()));
            } catch (IOException e) {
                h.e("Error while writing hash to byteStream", e);
            }
        }
        return zzazpVar.toString();
    }
}
