package z7;

import android.util.Log;
import com.google.android.gms.internal.measurement.zzek;
import com.google.android.gms.internal.measurement.zzem;
import com.google.android.gms.internal.measurement.zzer;
import com.google.android.gms.internal.measurement.zzet;
import com.google.android.gms.internal.measurement.zzey;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzlb;
import com.google.android.gms.internal.measurement.zzoy;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f11182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f11183d;
    public Long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f11184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11185g;
    public final /* synthetic */ b h;
    public final zzlb i;

    public h3(b bVar, String str, int i, zzlb zzlbVar, int i10) {
        this.f11185g = i10;
        this.h = bVar;
        this.f11180a = str;
        this.f11181b = i;
        this.i = zzlbVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:77:0x0101  */
    /* JADX WARN: Code duplicated, block: B:80:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0111  */
    public static Boolean c(BigDecimal bigDecimal, zzer zzerVar, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        int i;
        com.google.android.gms.common.internal.i0.i(zzerVar);
        if (zzerVar.zzg()) {
            if (zzerVar.zzm() != 1 && (zzerVar.zzm() != 5 ? zzerVar.zzh() : zzerVar.zzk() && zzerVar.zzj())) {
                int iZzm = zzerVar.zzm();
                try {
                    if (zzerVar.zzm() == 5) {
                        if (l0.L(zzerVar.zze()) && l0.L(zzerVar.zzd())) {
                            BigDecimal bigDecimal5 = new BigDecimal(zzerVar.zze());
                            bigDecimal4 = new BigDecimal(zzerVar.zzd());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                            if (iZzm == 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                                i = iZzm - 1;
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            if (i == 4 && bigDecimal3 != null) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                            }
                                        } else if (bigDecimal2 != null) {
                                            if (d10 != 0.0d) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) < 0);
                                            }
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                }
                            }
                        }
                    } else if (l0.L(zzerVar.zzc())) {
                        bigDecimal2 = new BigDecimal(zzerVar.zzc());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                        if (iZzm == 5) {
                            i = iZzm - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d10 != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        } else {
                            i = iZzm - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d10 != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, zzey zzeyVar, i0 i0Var) {
        List listZze;
        com.google.android.gms.common.internal.i0.i(zzeyVar);
        if (str != null && zzeyVar.zzi() && zzeyVar.zzj() != 1 && (zzeyVar.zzj() != 7 ? zzeyVar.zzh() : zzeyVar.zza() != 0)) {
            int iZzj = zzeyVar.zzj();
            boolean zZzf = zzeyVar.zzf();
            String strZzd = (zZzf || iZzj == 2 || iZzj == 7) ? zzeyVar.zzd() : zzeyVar.zzd().toUpperCase(Locale.ENGLISH);
            if (zzeyVar.zza() == 0) {
                listZze = null;
            } else {
                listZze = zzeyVar.zze();
                if (!zZzf) {
                    ArrayList arrayList = new ArrayList(listZze.size());
                    Iterator it = listZze.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listZze = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = iZzj == 2 ? strZzd : null;
            if (iZzj != 7 ? strZzd != null : listZze != null && !listZze.isEmpty()) {
                if (!zZzf && iZzj != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iZzj - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zZzf ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (i0Var != null) {
                                    i0Var.f11193t.c(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strZzd));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strZzd));
                    case 4:
                        return Boolean.valueOf(str.contains(strZzd));
                    case 5:
                        return Boolean.valueOf(str.equals(strZzd));
                    case 6:
                        if (listZze != null) {
                            return Boolean.valueOf(listZze.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    public static Boolean e(Boolean bool, boolean z4) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z4);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0289  */
    /* JADX WARN: Code duplicated, block: B:103:0x0293  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:112:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:116:0x02da  */
    /* JADX WARN: Code duplicated, block: B:118:0x02de  */
    /* JADX WARN: Code duplicated, block: B:121:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:127:0x031a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0324  */
    /* JADX WARN: Code duplicated, block: B:132:0x0328  */
    /* JADX WARN: Code duplicated, block: B:134:0x032e  */
    /* JADX WARN: Code duplicated, block: B:135:0x033e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0344  */
    /* JADX WARN: Code duplicated, block: B:139:0x034c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0356  */
    /* JADX WARN: Code duplicated, block: B:145:0x0365  */
    /* JADX WARN: Code duplicated, block: B:151:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:152:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:190:0x0358 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x03a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0388 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x036e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x036b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x03d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x02e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x02d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x017b  */
    /* JADX WARN: Code duplicated, block: B:62:0x018e  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b1 A[LOOP:1: B:60:0x0188->B:65:0x01b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:82:0x020a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0213  */
    /* JADX WARN: Code duplicated, block: B:87:0x021e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0256  */
    /* JADX WARN: Code duplicated, block: B:97:0x026a  */
    public boolean a(Long l2, Long l10, zzft zzftVar, long j4, n nVar, boolean z4) {
        HashSet hashSet;
        Iterator it;
        r.e eVar;
        Iterator it2;
        Iterator it3;
        boolean z10;
        Boolean bool;
        zzem zzemVar;
        boolean z11;
        String strZze;
        Object obj;
        String str;
        zzer zzerVarZzc;
        Boolean boolC;
        Boolean boolC2;
        Boolean boolC3;
        zzfx zzfxVar;
        Long lValueOf;
        Double dValueOf;
        zzem zzemVar2;
        Boolean boolC4;
        zzoy.zzc();
        b bVar = this.h;
        a1 a1Var = (a1) bVar.f159a;
        g gVar = a1Var.f11005r;
        y yVar = z.X;
        String str2 = this.f11180a;
        boolean zL = gVar.l(str2, yVar);
        zzek zzekVar = (zzek) this.i;
        long j10 = zzekVar.zzn() ? nVar.e : j4;
        i0 i0Var = a1Var.f11007t;
        a1.f(i0Var);
        boolean zIsLoggable = Log.isLoggable(i0Var.o(), 2);
        int i = this.f11181b;
        boolean z12 = false;
        if (zIsLoggable) {
            i0 i0Var2 = a1Var.f11007t;
            a1.f(i0Var2);
            i0Var2.f11198y.e("Evaluating filter. audience, filter, event", Integer.valueOf(i), zzekVar.zzp() ? Integer.valueOf(zzekVar.zzb()) : null, a1Var.f11011x.d(zzekVar.zzg()));
            i0 i0Var3 = a1Var.f11007t;
            a1.f(i0Var3);
            fd.b bVar2 = i0Var3.f11198y;
            l0 l0Var = bVar.f11411b.f11512r;
            z2.D(l0Var);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\nevent_filter {\n");
            if (zzekVar.zzp()) {
                l0.p(sb2, 0, "filter_id", Integer.valueOf(zzekVar.zzb()));
            }
            l0.p(sb2, 0, "event_name", ((a1) l0Var.f159a).f11011x.d(zzekVar.zzg()));
            String strN = l0.n(zzekVar.zzk(), zzekVar.zzm(), zzekVar.zzn());
            if (!strN.isEmpty()) {
                l0.p(sb2, 0, "filter_type", strN);
            }
            if (zzekVar.zzo()) {
                l0.q(sb2, 1, "event_count_filter", zzekVar.zzf());
            }
            if (zzekVar.zza() > 0) {
                sb2.append("  filters {\n");
                Iterator it4 = zzekVar.zzh().iterator();
                while (it4.hasNext()) {
                    l0Var.l(sb2, 2, (zzem) it4.next());
                }
            }
            l0.m(sb2, 1);
            sb2.append("}\n}\n");
            bVar2.c(sb2.toString(), "Filter definition");
        }
        if (!zzekVar.zzp() || zzekVar.zzb() > 256) {
            i0 i0Var4 = a1Var.f11007t;
            a1.f(i0Var4);
            i0Var4.f11193t.d(i0.k(str2), "Invalid event filter ID. appId, id", String.valueOf(zzekVar.zzp() ? Integer.valueOf(zzekVar.zzb()) : null));
            return false;
        }
        boolean z13 = zzekVar.zzk() || zzekVar.zzm() || zzekVar.zzn();
        if (z4 && !z13) {
            i0 i0Var5 = a1Var.f11007t;
            a1.f(i0Var5);
            i0Var5.f11198y.d(Integer.valueOf(i), "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", zzekVar.zzp() ? Integer.valueOf(zzekVar.zzb()) : null);
            return true;
        }
        String strZzh = zzftVar.zzh();
        if (zzekVar.zzo()) {
            try {
                boolC4 = c(new BigDecimal(j10), zzekVar.zzf(), 0.0d);
            } catch (NumberFormatException unused) {
                boolC4 = null;
            }
            if (boolC4 == null) {
                z10 = z12;
                bool = null;
            } else if (boolC4.booleanValue()) {
                hashSet = new HashSet();
                it = zzekVar.zzh().iterator();
                while (true) {
                    if (it.hasNext()) {
                        zzemVar2 = (zzem) it.next();
                        if (zzemVar2.zze().isEmpty()) {
                            i0 i0Var6 = a1Var.f11007t;
                            a1.f(i0Var6);
                            i0Var6.f11193t.c(a1Var.f11011x.d(strZzh), "null or empty param name in filter. event");
                        } else {
                            hashSet.add(zzemVar2.zze());
                        }
                    } else {
                        eVar = new r.e(0);
                        it2 = zzftVar.zzi().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                zzfxVar = (zzfx) it2.next();
                                if (!hashSet.contains(zzfxVar.zzg())) {
                                    if (zzfxVar.zzw()) {
                                        String strZzg = zzfxVar.zzg();
                                        if (zzfxVar.zzw()) {
                                            lValueOf = Long.valueOf(zzfxVar.zzd());
                                        } else {
                                            lValueOf = null;
                                        }
                                        eVar.put(strZzg, lValueOf);
                                    } else if (zzfxVar.zzu()) {
                                        String strZzg2 = zzfxVar.zzg();
                                        if (zzfxVar.zzu()) {
                                            dValueOf = Double.valueOf(zzfxVar.zza());
                                        } else {
                                            dValueOf = null;
                                        }
                                        eVar.put(strZzg2, dValueOf);
                                    } else if (zzfxVar.zzy()) {
                                        eVar.put(zzfxVar.zzg(), zzfxVar.zzh());
                                    } else {
                                        i0 i0Var7 = a1Var.f11007t;
                                        a1.f(i0Var7);
                                        i0Var7.f11193t.d(a1Var.f11011x.d(strZzh), "Unknown value for param. event, param", a1Var.f11011x.e(zzfxVar.zzg()));
                                    }
                                }
                            } else {
                                it3 = zzekVar.zzh().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        zzemVar = (zzem) it3.next();
                                        if (zzemVar.zzh() || !zzemVar.zzg()) {
                                            z11 = z12;
                                        } else {
                                            z11 = true;
                                        }
                                        strZze = zzemVar.zze();
                                        if (strZze.isEmpty()) {
                                            i0 i0Var8 = a1Var.f11007t;
                                            a1.f(i0Var8);
                                            i0Var8.f11193t.c(a1Var.f11011x.d(strZzh), "Event has empty param name. event");
                                        } else {
                                            obj = eVar.get(strZze);
                                            z10 = z12;
                                            if (obj instanceof Long) {
                                                if (zzemVar.zzi()) {
                                                    try {
                                                        boolC3 = c(new BigDecimal(((Long) obj).longValue()), zzemVar.zzc(), 0.0d);
                                                    } catch (NumberFormatException unused2) {
                                                        boolC3 = null;
                                                    }
                                                    if (boolC3 == null) {
                                                        if (boolC3.booleanValue() == z11) {
                                                            bool = Boolean.FALSE;
                                                        } else {
                                                            z12 = z10;
                                                        }
                                                    }
                                                } else {
                                                    i0 i0Var9 = a1Var.f11007t;
                                                    a1.f(i0Var9);
                                                    i0Var9.f11193t.d(a1Var.f11011x.d(strZzh), "No number filter for long param. event, param", a1Var.f11011x.e(strZze));
                                                }
                                                bool = null;
                                            } else if (obj instanceof Double) {
                                                if (zzemVar.zzi()) {
                                                    double dDoubleValue = ((Double) obj).doubleValue();
                                                    try {
                                                        boolC2 = c(new BigDecimal(dDoubleValue), zzemVar.zzc(), Math.ulp(dDoubleValue));
                                                    } catch (NumberFormatException unused3) {
                                                        boolC2 = null;
                                                    }
                                                    if (boolC2 == null) {
                                                        if (boolC2.booleanValue() == z11) {
                                                            bool = Boolean.FALSE;
                                                        } else {
                                                            z12 = z10;
                                                        }
                                                    }
                                                } else {
                                                    i0 i0Var10 = a1Var.f11007t;
                                                    a1.f(i0Var10);
                                                    i0Var10.f11193t.d(a1Var.f11011x.d(strZzh), "No number filter for double param. event, param", a1Var.f11011x.e(strZze));
                                                }
                                                bool = null;
                                            } else if (obj instanceof String) {
                                                if (zzemVar.zzk()) {
                                                    zzey zzeyVarZzd = zzemVar.zzd();
                                                    i0 i0Var11 = a1Var.f11007t;
                                                    a1.f(i0Var11);
                                                    boolC = d((String) obj, zzeyVarZzd, i0Var11);
                                                } else {
                                                    if (zzemVar.zzi()) {
                                                        str = (String) obj;
                                                        if (l0.L(str)) {
                                                            zzerVarZzc = zzemVar.zzc();
                                                            if (l0.L(str)) {
                                                                try {
                                                                    boolC = c(new BigDecimal(str), zzerVarZzc, 0.0d);
                                                                } catch (NumberFormatException unused4) {
                                                                    boolC = null;
                                                                }
                                                            } else {
                                                                boolC = null;
                                                            }
                                                        } else {
                                                            i0 i0Var12 = a1Var.f11007t;
                                                            a1.f(i0Var12);
                                                            i0Var12.f11193t.d(a1Var.f11011x.d(strZzh), "Invalid param value for number filter. event, param", a1Var.f11011x.e(strZze));
                                                        }
                                                    } else {
                                                        i0 i0Var13 = a1Var.f11007t;
                                                        a1.f(i0Var13);
                                                        i0Var13.f11193t.d(a1Var.f11011x.d(strZzh), "No filter for String param. event, param", a1Var.f11011x.e(strZze));
                                                    }
                                                    bool = null;
                                                }
                                                if (boolC == null) {
                                                    bool = null;
                                                } else if (boolC.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                } else {
                                                    z12 = z10;
                                                }
                                            } else if (obj == null) {
                                                i0 i0Var14 = a1Var.f11007t;
                                                a1.f(i0Var14);
                                                i0Var14.f11198y.d(a1Var.f11011x.d(strZzh), "Missing param for filter. event, param", a1Var.f11011x.e(strZze));
                                                bool = Boolean.FALSE;
                                            } else {
                                                i0 i0Var15 = a1Var.f11007t;
                                                a1.f(i0Var15);
                                                i0Var15.f11193t.d(a1Var.f11011x.d(strZzh), "Unknown param type. event, param", a1Var.f11011x.e(strZze));
                                                bool = null;
                                            }
                                        }
                                    } else {
                                        z10 = z12;
                                        bool = Boolean.TRUE;
                                    }
                                }
                            }
                        }
                    }
                    z10 = z12;
                    bool = null;
                }
            } else {
                bool = Boolean.FALSE;
                z10 = false;
            }
        } else {
            hashSet = new HashSet();
            it = zzekVar.zzh().iterator();
            while (true) {
                if (it.hasNext()) {
                    zzemVar2 = (zzem) it.next();
                    if (zzemVar2.zze().isEmpty()) {
                        i0 i0Var16 = a1Var.f11007t;
                        a1.f(i0Var16);
                        i0Var16.f11193t.c(a1Var.f11011x.d(strZzh), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(zzemVar2.zze());
                    }
                } else {
                    eVar = new r.e(0);
                    it2 = zzftVar.zzi().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            zzfxVar = (zzfx) it2.next();
                            if (!hashSet.contains(zzfxVar.zzg())) {
                                if (zzfxVar.zzw()) {
                                    String strZzg3 = zzfxVar.zzg();
                                    if (zzfxVar.zzw()) {
                                        lValueOf = Long.valueOf(zzfxVar.zzd());
                                    } else {
                                        lValueOf = null;
                                    }
                                    eVar.put(strZzg3, lValueOf);
                                } else if (zzfxVar.zzu()) {
                                    String strZzg4 = zzfxVar.zzg();
                                    if (zzfxVar.zzu()) {
                                        dValueOf = Double.valueOf(zzfxVar.zza());
                                    } else {
                                        dValueOf = null;
                                    }
                                    eVar.put(strZzg4, dValueOf);
                                } else if (zzfxVar.zzy()) {
                                    eVar.put(zzfxVar.zzg(), zzfxVar.zzh());
                                } else {
                                    i0 i0Var17 = a1Var.f11007t;
                                    a1.f(i0Var17);
                                    i0Var17.f11193t.d(a1Var.f11011x.d(strZzh), "Unknown value for param. event, param", a1Var.f11011x.e(zzfxVar.zzg()));
                                }
                            }
                        } else {
                            it3 = zzekVar.zzh().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    zzemVar = (zzem) it3.next();
                                    if (zzemVar.zzh()) {
                                        z11 = z12;
                                    } else {
                                        z11 = z12;
                                    }
                                    strZze = zzemVar.zze();
                                    if (strZze.isEmpty()) {
                                        i0 i0Var18 = a1Var.f11007t;
                                        a1.f(i0Var18);
                                        i0Var18.f11193t.c(a1Var.f11011x.d(strZzh), "Event has empty param name. event");
                                    } else {
                                        obj = eVar.get(strZze);
                                        z10 = z12;
                                        if (obj instanceof Long) {
                                            if (zzemVar.zzi()) {
                                                i0 i0Var19 = a1Var.f11007t;
                                                a1.f(i0Var19);
                                                i0Var19.f11193t.d(a1Var.f11011x.d(strZzh), "No number filter for long param. event, param", a1Var.f11011x.e(strZze));
                                            } else {
                                                boolC3 = c(new BigDecimal(((Long) obj).longValue()), zzemVar.zzc(), 0.0d);
                                                if (boolC3 == null) {
                                                    if (boolC3.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                    } else {
                                                        z12 = z10;
                                                    }
                                                }
                                            }
                                            bool = null;
                                        } else if (obj instanceof Double) {
                                            if (zzemVar.zzi()) {
                                                i0 i0Var110 = a1Var.f11007t;
                                                a1.f(i0Var110);
                                                i0Var110.f11193t.d(a1Var.f11011x.d(strZzh), "No number filter for double param. event, param", a1Var.f11011x.e(strZze));
                                            } else {
                                                double dDoubleValue2 = ((Double) obj).doubleValue();
                                                boolC2 = c(new BigDecimal(dDoubleValue2), zzemVar.zzc(), Math.ulp(dDoubleValue2));
                                                if (boolC2 == null) {
                                                    if (boolC2.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                    } else {
                                                        z12 = z10;
                                                    }
                                                }
                                            }
                                            bool = null;
                                        } else if (obj instanceof String) {
                                            if (zzemVar.zzk()) {
                                                zzey zzeyVarZzd2 = zzemVar.zzd();
                                                i0 i0Var111 = a1Var.f11007t;
                                                a1.f(i0Var111);
                                                boolC = d((String) obj, zzeyVarZzd2, i0Var111);
                                            } else {
                                                if (zzemVar.zzi()) {
                                                    str = (String) obj;
                                                    if (l0.L(str)) {
                                                        zzerVarZzc = zzemVar.zzc();
                                                        if (l0.L(str)) {
                                                            boolC = null;
                                                        } else {
                                                            boolC = c(new BigDecimal(str), zzerVarZzc, 0.0d);
                                                        }
                                                    } else {
                                                        i0 i0Var112 = a1Var.f11007t;
                                                        a1.f(i0Var112);
                                                        i0Var112.f11193t.d(a1Var.f11011x.d(strZzh), "Invalid param value for number filter. event, param", a1Var.f11011x.e(strZze));
                                                    }
                                                } else {
                                                    i0 i0Var113 = a1Var.f11007t;
                                                    a1.f(i0Var113);
                                                    i0Var113.f11193t.d(a1Var.f11011x.d(strZzh), "No filter for String param. event, param", a1Var.f11011x.e(strZze));
                                                }
                                                bool = null;
                                            }
                                            if (boolC == null) {
                                                bool = null;
                                            } else if (boolC.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                            } else {
                                                z12 = z10;
                                            }
                                        } else if (obj == null) {
                                            i0 i0Var114 = a1Var.f11007t;
                                            a1.f(i0Var114);
                                            i0Var114.f11198y.d(a1Var.f11011x.d(strZzh), "Missing param for filter. event, param", a1Var.f11011x.e(strZze));
                                            bool = Boolean.FALSE;
                                        } else {
                                            i0 i0Var115 = a1Var.f11007t;
                                            a1.f(i0Var115);
                                            i0Var115.f11193t.d(a1Var.f11011x.d(strZzh), "Unknown param type. event, param", a1Var.f11011x.e(strZze));
                                            bool = null;
                                        }
                                    }
                                } else {
                                    z10 = z12;
                                    bool = Boolean.TRUE;
                                }
                            }
                        }
                    }
                }
                z10 = z12;
                bool = null;
            }
        }
        i0 i0Var20 = a1Var.f11007t;
        a1.f(i0Var20);
        i0Var20.f11198y.c(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return z10;
        }
        Boolean bool2 = Boolean.TRUE;
        this.f11182c = bool2;
        if (bool.booleanValue()) {
            this.f11183d = bool2;
            if (z13 && zzftVar.zzu()) {
                Long lValueOf2 = Long.valueOf(zzftVar.zzd());
                if (zzekVar.zzm()) {
                    if (zL && zzekVar.zzo()) {
                        lValueOf2 = l2;
                    }
                    this.f11184f = lValueOf2;
                } else {
                    if (zL && zzekVar.zzo()) {
                        lValueOf2 = l10;
                    }
                    this.e = lValueOf2;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean b(Long l2, Long l10, zzgm zzgmVar, boolean z4) {
        zzoy.zzc();
        a1 a1Var = (a1) this.h.f159a;
        boolean zL = a1Var.f11005r.l(this.f11180a, z.V);
        zzet zzetVar = (zzet) this.i;
        boolean zZzg = zzetVar.zzg();
        boolean zZzh = zzetVar.zzh();
        boolean zZzi = zzetVar.zzi();
        Object[] objArr = zZzg || zZzh || zZzi;
        Boolean boolE = null;
        boolC = null;
        Boolean boolC = null;
        Boolean boolC2 = null;
        boolE = null;
        boolE = null;
        boolE = null;
        Boolean boolC3 = null;
        boolE = null;
        if (z4 && objArr != true) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11198y.d(Integer.valueOf(this.f11181b), "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", zzetVar.zzj() ? Integer.valueOf(zzetVar.zza()) : null);
            return true;
        }
        zzem zzemVarZzb = zzetVar.zzb();
        boolean zZzg2 = zzemVarZzb.zzg();
        if (zzgmVar.zzr()) {
            if (zzemVarZzb.zzi()) {
                try {
                    boolC2 = c(new BigDecimal(zzgmVar.zzb()), zzemVarZzb.zzc(), 0.0d);
                } catch (NumberFormatException unused) {
                }
                boolE = e(boolC2, zZzg2);
            } else {
                i0 i0Var2 = a1Var.f11007t;
                a1.f(i0Var2);
                i0Var2.f11193t.c(a1Var.f11011x.f(zzgmVar.zzf()), "No number filter for long property. property");
            }
        } else if (zzgmVar.zzq()) {
            if (zzemVarZzb.zzi()) {
                double dZza = zzgmVar.zza();
                try {
                    boolC = c(new BigDecimal(dZza), zzemVarZzb.zzc(), Math.ulp(dZza));
                } catch (NumberFormatException unused2) {
                }
                boolE = e(boolC, zZzg2);
            } else {
                i0 i0Var3 = a1Var.f11007t;
                a1.f(i0Var3);
                i0Var3.f11193t.c(a1Var.f11011x.f(zzgmVar.zzf()), "No number filter for double property. property");
            }
        } else if (!zzgmVar.zzt()) {
            i0 i0Var4 = a1Var.f11007t;
            a1.f(i0Var4);
            i0Var4.f11193t.c(a1Var.f11011x.f(zzgmVar.zzf()), "User property has no value, property");
        } else if (zzemVarZzb.zzk()) {
            String strZzg = zzgmVar.zzg();
            zzey zzeyVarZzd = zzemVarZzb.zzd();
            i0 i0Var5 = a1Var.f11007t;
            a1.f(i0Var5);
            boolE = e(d(strZzg, zzeyVarZzd, i0Var5), zZzg2);
        } else if (!zzemVarZzb.zzi()) {
            i0 i0Var6 = a1Var.f11007t;
            a1.f(i0Var6);
            i0Var6.f11193t.c(a1Var.f11011x.f(zzgmVar.zzf()), "No string or number filter defined. property");
        } else if (l0.L(zzgmVar.zzg())) {
            String strZzg2 = zzgmVar.zzg();
            zzer zzerVarZzc = zzemVarZzb.zzc();
            if (l0.L(strZzg2)) {
                try {
                    boolC3 = c(new BigDecimal(strZzg2), zzerVarZzc, 0.0d);
                } catch (NumberFormatException unused3) {
                }
            }
            boolE = e(boolC3, zZzg2);
        } else {
            i0 i0Var7 = a1Var.f11007t;
            a1.f(i0Var7);
            i0Var7.f11193t.d(a1Var.f11011x.f(zzgmVar.zzf()), "Invalid user property value for Numeric number filter. property, value", zzgmVar.zzg());
        }
        i0 i0Var8 = a1Var.f11007t;
        a1.f(i0Var8);
        i0Var8.f11198y.c(boolE == null ? "null" : boolE, "Property filter result");
        if (boolE == null) {
            return false;
        }
        this.f11182c = Boolean.TRUE;
        if (!zZzi || boolE.booleanValue()) {
            if (!z4 || zzetVar.zzg()) {
                this.f11183d = boolE;
            }
            if (boolE.booleanValue() && objArr != false && zzgmVar.zzs()) {
                long jZzc = zzgmVar.zzc();
                if (l2 != null) {
                    jZzc = l2.longValue();
                }
                if (zL && zzetVar.zzg() && !zzetVar.zzh() && l10 != null) {
                    jZzc = l10.longValue();
                }
                if (zzetVar.zzh()) {
                    this.f11184f = Long.valueOf(jZzc);
                } else {
                    this.e = Long.valueOf(jZzc);
                }
            }
        }
        return true;
    }
}
