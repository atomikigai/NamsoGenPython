package z7;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzem;
import com.google.android.gms.internal.measurement.zzer;
import com.google.android.gms.internal.measurement.zzet;
import com.google.android.gms.internal.measurement.zzey;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzkn;
import com.google.android.gms.internal.measurement.zzkx;
import com.google.android.gms.internal.measurement.zzmh;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends w2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11247d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(z2 z2Var, int i) {
        super(z2Var);
        this.f11247d = i;
    }

    public static zzmh B(zzkx zzkxVar, byte[] bArr) {
        zzkn zzknVarZza = zzkn.zza();
        return zzknVarZza != null ? zzkxVar.zzaz(bArr, zzknVarZza) : zzkxVar.zzay(bArr);
    }

    public static ArrayList F(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j4 = 0;
            for (int i10 = 0; i10 < 64; i10++) {
                int i11 = (i * 64) + i10;
                if (i11 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i11)) {
                    j4 |= 1 << i10;
                }
            }
            arrayList.add(Long.valueOf(j4));
        }
        return arrayList;
    }

    public static HashMap G(Bundle bundle, boolean z4) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z10 = obj instanceof Parcelable[];
            if (z10 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z4) {
                    ArrayList arrayList = new ArrayList();
                    if (z10) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(G((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(G((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(G((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static boolean J(int i, List list) {
        if (i < list.size() * 64) {
            return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static boolean L(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void g(zzfs zzfsVar, String str, Long l2) {
        List listZzp = zzfsVar.zzp();
        int i = 0;
        while (true) {
            if (i >= listZzp.size()) {
                i = -1;
                break;
            } else if (str.equals(((zzfx) listZzp.get(i)).zzg())) {
                break;
            } else {
                i++;
            }
        }
        zzfw zzfwVarZze = zzfx.zze();
        zzfwVarZze.zzj(str);
        if (l2 != null) {
            zzfwVarZze.zzi(l2.longValue());
        }
        if (i >= 0) {
            zzfsVar.zzj(i, zzfwVarZze);
        } else {
            zzfsVar.zze(zzfwVarZze);
        }
    }

    public static final zzfx h(zzft zzftVar, String str) {
        for (zzfx zzfxVar : zzftVar.zzi()) {
            if (zzfxVar.zzg().equals(str)) {
                return zzfxVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable j(zzft zzftVar, String str) {
        zzfx zzfxVarH = h(zzftVar, str);
        if (zzfxVarH == null) {
            return null;
        }
        if (zzfxVarH.zzy()) {
            return zzfxVarH.zzh();
        }
        if (zzfxVarH.zzw()) {
            return Long.valueOf(zzfxVarH.zzd());
        }
        if (zzfxVarH.zzu()) {
            return Double.valueOf(zzfxVarH.zza());
        }
        if (zzfxVarH.zzc() <= 0) {
            return null;
        }
        List<zzfx> listZzi = zzfxVarH.zzi();
        ArrayList arrayList = new ArrayList();
        for (zzfx zzfxVar : listZzi) {
            if (zzfxVar != null) {
                Bundle bundle = new Bundle();
                for (zzfx zzfxVar2 : zzfxVar.zzi()) {
                    if (zzfxVar2.zzy()) {
                        bundle.putString(zzfxVar2.zzg(), zzfxVar2.zzh());
                    } else if (zzfxVar2.zzw()) {
                        bundle.putLong(zzfxVar2.zzg(), zzfxVar2.zzd());
                    } else if (zzfxVar2.zzu()) {
                        bundle.putDouble(zzfxVar2.zzg(), zzfxVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void m(StringBuilder sb2, int i) {
        for (int i10 = 0; i10 < i; i10++) {
            sb2.append("  ");
        }
    }

    public static final String n(boolean z4, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        if (z4) {
            sb2.append("Dynamic ");
        }
        if (z10) {
            sb2.append("Sequence ");
        }
        if (z11) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    public static final void o(StringBuilder sb2, String str, zzgi zzgiVar) {
        if (zzgiVar == null) {
            return;
        }
        m(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzgiVar.zzb() != 0) {
            m(sb2, 4);
            sb2.append("results: ");
            int i = 0;
            for (Long l2 : zzgiVar.zzi()) {
                int i10 = i + 1;
                if (i != 0) {
                    sb2.append(", ");
                }
                sb2.append(l2);
                i = i10;
            }
            sb2.append('\n');
        }
        if (zzgiVar.zzd() != 0) {
            m(sb2, 4);
            sb2.append("status: ");
            int i11 = 0;
            for (Long l10 : zzgiVar.zzk()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (zzgiVar.zza() != 0) {
            m(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i13 = 0;
            for (zzfr zzfrVar : zzgiVar.zzh()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzfrVar.zzh() ? Integer.valueOf(zzfrVar.zza()) : null);
                sb2.append(":");
                sb2.append(zzfrVar.zzg() ? Long.valueOf(zzfrVar.zzb()) : null);
                i13 = i14;
            }
            sb2.append("}\n");
        }
        if (zzgiVar.zzc() != 0) {
            m(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i15 = 0;
            for (zzgk zzgkVar : zzgiVar.zzj()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzgkVar.zzi() ? Integer.valueOf(zzgkVar.zzb()) : null);
                sb2.append(": [");
                Iterator it = zzgkVar.zzf().iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i17 = i18;
                }
                sb2.append("]");
                i15 = i16;
            }
            sb2.append("}\n");
        }
        m(sb2, 3);
        sb2.append("}\n");
    }

    public static final void p(StringBuilder sb2, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m(sb2, i + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void q(StringBuilder sb2, int i, String str, zzer zzerVar) {
        String str2;
        if (zzerVar == null) {
            return;
        }
        m(sb2, i);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzerVar.zzg()) {
            int iZzm = zzerVar.zzm();
            if (iZzm == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iZzm == 2) {
                str2 = "LESS_THAN";
            } else if (iZzm != 3) {
                str2 = iZzm != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            p(sb2, i, "comparison_type", str2);
        }
        if (zzerVar.zzi()) {
            p(sb2, i, "match_as_float", Boolean.valueOf(zzerVar.zzf()));
        }
        if (zzerVar.zzh()) {
            p(sb2, i, "comparison_value", zzerVar.zzc());
        }
        if (zzerVar.zzk()) {
            p(sb2, i, "min_comparison_value", zzerVar.zze());
        }
        if (zzerVar.zzj()) {
            p(sb2, i, "max_comparison_value", zzerVar.zzd());
        }
        m(sb2, i);
        sb2.append("}\n");
    }

    public static int r(zzgc zzgcVar, String str) {
        for (int i = 0; i < zzgcVar.zzb(); i++) {
            if (str.equals(zzgcVar.zzap(i).zzf())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle x(Map map, boolean z4) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z4) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(x((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static q z(zzaa zzaaVar) {
        Object obj;
        Bundle bundleX = x(zzaaVar.zze(), true);
        String string = (!bundleX.containsKey("_o") || (obj = bundleX.get("_o")) == null) ? "app" : obj.toString();
        String strF = k1.f(zzaaVar.zzd(), k1.f11229a, k1.f11231c);
        if (strF == null) {
            strF = zzaaVar.zzd();
        }
        return new q(strF, new p(bundleX), string, zzaaVar.zza());
    }

    public zzft A(m mVar) {
        zzfs zzfsVarZze = zzft.zze();
        zzfsVarZze.zzl(mVar.e);
        p pVar = mVar.f11255f;
        for (String str : pVar.f11292a.keySet()) {
            zzfw zzfwVarZze = zzfx.zze();
            zzfwVarZze.zzj(str);
            Object obj = pVar.f11292a.get(str);
            com.google.android.gms.common.internal.i0.i(obj);
            H(zzfwVarZze, obj);
            zzfsVarZze.zze(zzfwVarZze);
        }
        return (zzft) zzfsVarZze.zzaD();
    }

    public String C(zzgb zzgbVar) {
        a1 a1Var = (a1) this.f159a;
        if (zzgbVar == null) {
            return "";
        }
        StringBuilder sbB = u.e.b("\nbatch {\n");
        for (zzgd zzgdVar : zzgbVar.zzd()) {
            if (zzgdVar != null) {
                m(sbB, 1);
                sbB.append("bundle {\n");
                if (zzgdVar.zzbl()) {
                    p(sbB, 1, "protocol_version", Integer.valueOf(zzgdVar.zzd()));
                }
                zzqu.zzc();
                g gVar = a1Var.f11005r;
                e0 e0Var = a1Var.f11011x;
                if (gVar.l(zzgdVar.zzy(), z.k0) && zzgdVar.zzbo()) {
                    p(sbB, 1, "session_stitching_token", zzgdVar.zzL());
                }
                p(sbB, 1, "platform", zzgdVar.zzJ());
                if (zzgdVar.zzbh()) {
                    p(sbB, 1, "gmp_version", Long.valueOf(zzgdVar.zzm()));
                }
                if (zzgdVar.zzbt()) {
                    p(sbB, 1, "uploading_gmp_version", Long.valueOf(zzgdVar.zzs()));
                }
                if (zzgdVar.zzbf()) {
                    p(sbB, 1, "dynamite_version", Long.valueOf(zzgdVar.zzj()));
                }
                if (zzgdVar.zzbc()) {
                    p(sbB, 1, "config_version", Long.valueOf(zzgdVar.zzh()));
                }
                p(sbB, 1, "gmp_app_id", zzgdVar.zzG());
                p(sbB, 1, "admob_app_id", zzgdVar.zzx());
                p(sbB, 1, "app_id", zzgdVar.zzy());
                p(sbB, 1, "app_version", zzgdVar.zzB());
                if (zzgdVar.zzba()) {
                    p(sbB, 1, "app_version_major", Integer.valueOf(zzgdVar.zza()));
                }
                p(sbB, 1, "firebase_instance_id", zzgdVar.zzF());
                if (zzgdVar.zzbe()) {
                    p(sbB, 1, "dev_cert_hash", Long.valueOf(zzgdVar.zzi()));
                }
                p(sbB, 1, "app_store", zzgdVar.zzA());
                if (zzgdVar.zzbs()) {
                    p(sbB, 1, "upload_timestamp_millis", Long.valueOf(zzgdVar.zzr()));
                }
                if (zzgdVar.zzbp()) {
                    p(sbB, 1, "start_timestamp_millis", Long.valueOf(zzgdVar.zzp()));
                }
                if (zzgdVar.zzbg()) {
                    p(sbB, 1, "end_timestamp_millis", Long.valueOf(zzgdVar.zzk()));
                }
                if (zzgdVar.zzbk()) {
                    p(sbB, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgdVar.zzo()));
                }
                if (zzgdVar.zzbj()) {
                    p(sbB, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgdVar.zzn()));
                }
                p(sbB, 1, "app_instance_id", zzgdVar.zzz());
                p(sbB, 1, "resettable_device_id", zzgdVar.zzK());
                p(sbB, 1, "ds_id", zzgdVar.zzE());
                if (zzgdVar.zzbi()) {
                    p(sbB, 1, "limited_ad_tracking", Boolean.valueOf(zzgdVar.zzaY()));
                }
                p(sbB, 1, "os_version", zzgdVar.zzI());
                p(sbB, 1, "device_model", zzgdVar.zzD());
                p(sbB, 1, "user_default_language", zzgdVar.zzM());
                if (zzgdVar.zzbr()) {
                    p(sbB, 1, "time_zone_offset_minutes", Integer.valueOf(zzgdVar.zzf()));
                }
                if (zzgdVar.zzbb()) {
                    p(sbB, 1, "bundle_sequential_index", Integer.valueOf(zzgdVar.zzb()));
                }
                if (zzgdVar.zzbn()) {
                    p(sbB, 1, "service_upload", Boolean.valueOf(zzgdVar.zzaZ()));
                }
                p(sbB, 1, "health_monitor", zzgdVar.zzH());
                if (zzgdVar.zzbm()) {
                    p(sbB, 1, "retry_counter", Integer.valueOf(zzgdVar.zze()));
                }
                if (zzgdVar.zzbd()) {
                    p(sbB, 1, "consent_signals", zzgdVar.zzC());
                }
                zzpz.zzc();
                if (a1Var.f11005r.l(null, z.f11488w0) && zzgdVar.zzbq()) {
                    p(sbB, 1, "target_os_version", Long.valueOf(zzgdVar.zzq()));
                }
                List<zzgm> listZzP = zzgdVar.zzP();
                if (listZzP != null) {
                    for (zzgm zzgmVar : listZzP) {
                        if (zzgmVar != null) {
                            m(sbB, 2);
                            sbB.append("user_property {\n");
                            p(sbB, 2, "set_timestamp_millis", zzgmVar.zzs() ? Long.valueOf(zzgmVar.zzc()) : null);
                            p(sbB, 2, "name", e0Var.f(zzgmVar.zzf()));
                            p(sbB, 2, "string_value", zzgmVar.zzg());
                            p(sbB, 2, "int_value", zzgmVar.zzr() ? Long.valueOf(zzgmVar.zzb()) : null);
                            p(sbB, 2, "double_value", zzgmVar.zzq() ? Double.valueOf(zzgmVar.zza()) : null);
                            m(sbB, 2);
                            sbB.append("}\n");
                        }
                    }
                }
                List<zzfp> listZzN = zzgdVar.zzN();
                if (listZzN != null) {
                    for (zzfp zzfpVar : listZzN) {
                        if (zzfpVar != null) {
                            m(sbB, 2);
                            sbB.append("audience_membership {\n");
                            if (zzfpVar.zzk()) {
                                p(sbB, 2, "audience_id", Integer.valueOf(zzfpVar.zza()));
                            }
                            if (zzfpVar.zzm()) {
                                p(sbB, 2, "new_audience", Boolean.valueOf(zzfpVar.zzj()));
                            }
                            o(sbB, "current_data", zzfpVar.zzd());
                            if (zzfpVar.zzn()) {
                                o(sbB, "previous_data", zzfpVar.zze());
                            }
                            m(sbB, 2);
                            sbB.append("}\n");
                        }
                    }
                }
                List<zzft> listZzO = zzgdVar.zzO();
                if (listZzO != null) {
                    for (zzft zzftVar : listZzO) {
                        if (zzftVar != null) {
                            m(sbB, 2);
                            sbB.append("event {\n");
                            p(sbB, 2, "name", e0Var.d(zzftVar.zzh()));
                            if (zzftVar.zzu()) {
                                p(sbB, 2, "timestamp_millis", Long.valueOf(zzftVar.zzd()));
                            }
                            if (zzftVar.zzt()) {
                                p(sbB, 2, "previous_timestamp_millis", Long.valueOf(zzftVar.zzc()));
                            }
                            if (zzftVar.zzs()) {
                                p(sbB, 2, "count", Integer.valueOf(zzftVar.zza()));
                            }
                            if (zzftVar.zzb() != 0) {
                                k(sbB, 2, zzftVar.zzi());
                            }
                            m(sbB, 2);
                            sbB.append("}\n");
                        }
                    }
                }
                m(sbB, 1);
                sbB.append("}\n");
            }
        }
        sbB.append("}\n");
        return sbB.toString();
    }

    public String D(zzet zzetVar) {
        StringBuilder sbB = u.e.b("\nproperty_filter {\n");
        if (zzetVar.zzj()) {
            p(sbB, 0, "filter_id", Integer.valueOf(zzetVar.zza()));
        }
        p(sbB, 0, "property_name", ((a1) this.f159a).f11011x.f(zzetVar.zze()));
        String strN = n(zzetVar.zzg(), zzetVar.zzh(), zzetVar.zzi());
        if (!strN.isEmpty()) {
            p(sbB, 0, "filter_type", strN);
        }
        l(sbB, 1, zzetVar.zzb());
        sbB.append("}\n");
        return sbB.toString();
    }

    public List E(List list, List list2) {
        int i;
        a1 a1Var = (a1) this.f159a;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                i0 i0Var = a1Var.f11007t;
                a1.f(i0Var);
                i0Var.f11193t.c(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    i0 i0Var2 = a1Var.f11007t;
                    a1.f(i0Var2);
                    i0Var2.f11193t.d(num, "Ignoring bit index greater than bitSet size", Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i10 = size2;
            i = size;
            size = i10;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public void H(zzfw zzfwVar, Object obj) {
        zzfwVar.zzg();
        zzfwVar.zze();
        zzfwVar.zzd();
        zzfwVar.zzf();
        if (obj instanceof String) {
            zzfwVar.zzk((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzfwVar.zzi(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzfwVar.zzh(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            i0 i0Var = ((a1) this.f159a).f11007t;
            a1.f(i0Var);
            i0Var.f11190f.c(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                zzfw zzfwVarZze = zzfx.zze();
                for (String str : bundle.keySet()) {
                    zzfw zzfwVarZze2 = zzfx.zze();
                    zzfwVarZze2.zzj(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zzfwVarZze2.zzi(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zzfwVarZze2.zzk((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zzfwVarZze2.zzh(((Double) obj2).doubleValue());
                    }
                    zzfwVarZze.zzc(zzfwVarZze2);
                }
                if (zzfwVarZze.zza() > 0) {
                    arrayList.add((zzfx) zzfwVarZze.zzaD());
                }
            }
        }
        zzfwVar.zzb(arrayList);
    }

    public void I(zzgl zzglVar, Object obj) {
        com.google.android.gms.common.internal.i0.i(obj);
        zzglVar.zzc();
        zzglVar.zzb();
        zzglVar.zza();
        if (obj instanceof String) {
            zzglVar.zzh((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzglVar.zze(((Long) obj).longValue());
        } else {
            if (obj instanceof Double) {
                zzglVar.zzd(((Double) obj).doubleValue());
                return;
            }
            i0 i0Var = ((a1) this.f159a).f11007t;
            a1.f(i0Var);
            i0Var.f11190f.c(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public boolean K(long j4, long j10) {
        if (j4 == 0 || j10 <= 0) {
            return true;
        }
        ((a1) this.f159a).f11012y.getClass();
        return Math.abs(System.currentTimeMillis() - j4) > j10;
    }

    public byte[] M(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            i0 i0Var = ((a1) this.f159a).f11007t;
            a1.f(i0Var);
            i0Var.f11190f.c(e, "Failed to gzip content");
            throw e;
        }
    }

    @Override // z7.w2
    public final void f() {
        int i = this.f11247d;
    }

    public void k(StringBuilder sb2, int i, List list) {
        if (list == null) {
            return;
        }
        int i10 = i + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfx zzfxVar = (zzfx) it.next();
            if (zzfxVar != null) {
                m(sb2, i10);
                sb2.append("param {\n");
                p(sb2, i10, "name", zzfxVar.zzx() ? ((a1) this.f159a).f11011x.e(zzfxVar.zzg()) : null);
                p(sb2, i10, "string_value", zzfxVar.zzy() ? zzfxVar.zzh() : null);
                p(sb2, i10, "int_value", zzfxVar.zzw() ? Long.valueOf(zzfxVar.zzd()) : null);
                p(sb2, i10, "double_value", zzfxVar.zzu() ? Double.valueOf(zzfxVar.zza()) : null);
                if (zzfxVar.zzc() > 0) {
                    k(sb2, i10, zzfxVar.zzi());
                }
                m(sb2, i10);
                sb2.append("}\n");
            }
        }
    }

    public void l(StringBuilder sb2, int i, zzem zzemVar) {
        String str;
        if (zzemVar == null) {
            return;
        }
        m(sb2, i);
        sb2.append("filter {\n");
        if (zzemVar.zzh()) {
            p(sb2, i, "complement", Boolean.valueOf(zzemVar.zzg()));
        }
        if (zzemVar.zzj()) {
            p(sb2, i, "param_name", ((a1) this.f159a).f11011x.e(zzemVar.zze()));
        }
        if (zzemVar.zzk()) {
            int i10 = i + 1;
            zzey zzeyVarZzd = zzemVar.zzd();
            if (zzeyVarZzd != null) {
                m(sb2, i10);
                sb2.append("string_filter {\n");
                if (zzeyVarZzd.zzi()) {
                    switch (zzeyVarZzd.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    p(sb2, i10, "match_type", str);
                }
                if (zzeyVarZzd.zzh()) {
                    p(sb2, i10, "expression", zzeyVarZzd.zzd());
                }
                if (zzeyVarZzd.zzg()) {
                    p(sb2, i10, "case_sensitive", Boolean.valueOf(zzeyVarZzd.zzf()));
                }
                if (zzeyVarZzd.zza() > 0) {
                    m(sb2, i + 2);
                    sb2.append("expression_list {\n");
                    for (String str2 : zzeyVarZzd.zze()) {
                        m(sb2, i + 3);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                m(sb2, i10);
                sb2.append("}\n");
            }
        }
        if (zzemVar.zzi()) {
            q(sb2, i + 1, "number_filter", zzemVar.zzc());
        }
        m(sb2, i);
        sb2.append("}\n");
    }

    public boolean s() {
        d();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((a1) this.f159a).f11000a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public long w(byte[] bArr) {
        com.google.android.gms.common.internal.i0.i(bArr);
        a1 a1Var = (a1) this.f159a;
        d3 d3Var = a1Var.f11010w;
        a1.d(d3Var);
        d3Var.c();
        MessageDigest messageDigestK = d3.k();
        if (messageDigestK != null) {
            return d3.d0(messageDigestK.digest(bArr));
        }
        i0 i0Var = a1Var.f11007t;
        a1.f(i0Var);
        i0Var.f11190f.b("Failed to get MD5");
        return 0L;
    }

    public Parcelable y(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (h7.b unused) {
            i0 i0Var = ((a1) this.f159a).f11007t;
            a1.f(i0Var);
            i0Var.f11190f.b("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    private final void t() {
    }

    private final void u() {
    }

    private final void v() {
    }
}
