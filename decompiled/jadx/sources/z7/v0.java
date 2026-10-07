package z7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzeh;
import com.google.android.gms.internal.measurement.zzei;
import com.google.android.gms.internal.measurement.zzej;
import com.google.android.gms.internal.measurement.zzek;
import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzem;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzet;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfj;
import com.google.android.gms.internal.measurement.zzgr;
import com.google.android.gms.internal.measurement.zzgt;
import com.google.android.gms.internal.measurement.zzll;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends w2 implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r.e f11396d;
    public final r.e e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r.e f11397f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r.e f11398r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r.e f11399s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r.e f11400t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final u0 f11401u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v1.d f11402v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r.e f11403w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final r.e f11404x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final r.e f11405y;

    public v0(z2 z2Var) {
        super(z2Var);
        this.f11396d = new r.e(0);
        this.e = new r.e(0);
        this.f11397f = new r.e(0);
        this.f11398r = new r.e(0);
        this.f11399s = new r.e(0);
        this.f11403w = new r.e(0);
        this.f11404x = new r.e(0);
        this.f11405y = new r.e(0);
        this.f11400t = new r.e(0);
        this.f11401u = new u0(this);
        this.f11402v = new v1.d(this);
    }

    public static final r.e l(zzff zzffVar) {
        r.e eVar = new r.e(0);
        if (zzffVar != null) {
            for (zzfj zzfjVar : zzffVar.zzp()) {
                eVar.put(zzfjVar.zzb(), zzfjVar.zzc());
            }
        }
        return eVar;
    }

    @Override // z7.f
    public final String a(String str, String str2) {
        c();
        j(str);
        Map map = (Map) this.f11396d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final zzff g(String str, byte[] bArr) {
        a1 a1Var = (a1) this.f159a;
        if (bArr == null) {
            return zzff.zzg();
        }
        try {
            zzff zzffVar = (zzff) ((zzfe) l0.B(zzff.zze(), bArr)).zzaD();
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11198y.d(zzffVar.zzu() ? Long.valueOf(zzffVar.zzc()) : null, "Parsed config. version, gmp_app_id", zzffVar.zzt() ? zzffVar.zzh() : null);
            return zzffVar;
        } catch (zzll e) {
            i0 i0Var2 = a1Var.f11007t;
            a1.f(i0Var2);
            i0Var2.f11193t.d(i0.k(str), "Unable to merge remote config. appId", e);
            return zzff.zzg();
        } catch (RuntimeException e4) {
            i0 i0Var3 = a1Var.f11007t;
            a1.f(i0Var3);
            i0Var3.f11193t.d(i0.k(str), "Unable to merge remote config. appId", e4);
            return zzff.zzg();
        }
    }

    public final void h(String str, zzfe zzfeVar) {
        a1 a1Var = (a1) this.f159a;
        HashSet hashSet = new HashSet();
        r.e eVar = new r.e(0);
        r.e eVar2 = new r.e(0);
        r.e eVar3 = new r.e(0);
        Iterator it = zzfeVar.zzg().iterator();
        while (it.hasNext()) {
            hashSet.add(((zzfb) it.next()).zzb());
        }
        for (int i = 0; i < zzfeVar.zza(); i++) {
            zzfc zzfcVar = (zzfc) zzfeVar.zzb(i).zzbB();
            if (zzfcVar.zzc().isEmpty()) {
                i0 i0Var = a1Var.f11007t;
                a1.f(i0Var);
                i0Var.f11193t.b("EventConfig contained null event name");
            } else {
                String strZzc = zzfcVar.zzc();
                String strF = k1.f(zzfcVar.zzc(), k1.f11229a, k1.f11231c);
                if (!TextUtils.isEmpty(strF)) {
                    zzfcVar.zzb(strF);
                    zzfeVar.zzd(i, zzfcVar);
                }
                if (zzfcVar.zzf() && zzfcVar.zzd()) {
                    eVar.put(strZzc, Boolean.TRUE);
                }
                if (zzfcVar.zzg() && zzfcVar.zze()) {
                    eVar2.put(zzfcVar.zzc(), Boolean.TRUE);
                }
                if (zzfcVar.zzh()) {
                    if (zzfcVar.zza() < 2 || zzfcVar.zza() > 65535) {
                        i0 i0Var2 = a1Var.f11007t;
                        a1.f(i0Var2);
                        i0Var2.f11193t.d(zzfcVar.zzc(), "Invalid sampling rate. Event name, sample rate", Integer.valueOf(zzfcVar.zza()));
                    } else {
                        eVar3.put(zzfcVar.zzc(), Integer.valueOf(zzfcVar.zza()));
                    }
                }
            }
        }
        this.e.put(str, hashSet);
        this.f11397f.put(str, eVar);
        this.f11398r.put(str, eVar2);
        this.f11400t.put(str, eVar3);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:37:0x0117  */
    /* JADX WARN: Code duplicated, block: B:45:? A[SYNTHETIC] */
    public final void j(String str) {
        Throwable th;
        Cursor cursorQuery;
        q5.d dVar;
        r.e eVar;
        r.e eVar2;
        r.e eVar3;
        r.e eVar4;
        d();
        c();
        com.google.android.gms.common.internal.i0.e(str);
        r.e eVar5 = this.f11399s;
        if (eVar5.get(str) == null) {
            j jVar = this.f11411b.f11509c;
            z2.D(jVar);
            a1 a1Var = (a1) jVar.f159a;
            com.google.android.gms.common.internal.i0.e(str);
            jVar.c();
            jVar.d();
            Cursor cursor = null;
            try {
                cursorQuery = jVar.v().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            byte[] blob = cursorQuery.getBlob(0);
                            String string = cursorQuery.getString(1);
                            String string2 = cursorQuery.getString(2);
                            if (cursorQuery.moveToNext()) {
                                i0 i0Var = a1Var.f11007t;
                                a1.f(i0Var);
                                i0Var.f11190f.c(i0.k(str), "Got multiple records for app config, expected one. appId");
                            }
                            if (blob != null) {
                                dVar = new q5.d(blob, string, string2);
                                cursorQuery.close();
                            }
                            eVar = this.f11405y;
                            eVar2 = this.f11404x;
                            eVar3 = this.f11403w;
                            eVar4 = this.f11396d;
                            if (dVar != null) {
                                zzfe zzfeVar = (zzfe) g(str, (byte[]) dVar.f8039a).zzbB();
                                h(str, zzfeVar);
                                eVar4.put(str, l((zzff) zzfeVar.zzaD()));
                                eVar5.put(str, (zzff) zzfeVar.zzaD());
                                k(str, (zzff) zzfeVar.zzaD());
                                eVar3.put(str, zzfeVar.zze());
                                eVar2.put(str, (String) dVar.f8040b);
                                eVar.put(str, (String) dVar.f8041c);
                                return;
                            }
                            eVar4.put(str, null);
                            this.f11397f.put(str, null);
                            this.e.put(str, null);
                            this.f11398r.put(str, null);
                            eVar5.put(str, null);
                            eVar3.put(str, null);
                            eVar2.put(str, null);
                            eVar.put(str, null);
                            this.f11400t.put(str, null);
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        i0 i0Var2 = a1Var.f11007t;
                        a1.f(i0Var2);
                        i0Var2.f11190f.d(i0.k(str), "Error querying remote config. appId", e);
                        if (cursorQuery != null) {
                        }
                        dVar = null;
                        eVar = this.f11405y;
                        eVar2 = this.f11404x;
                        eVar3 = this.f11403w;
                        eVar4 = this.f11396d;
                        if (dVar != null) {
                            zzfe zzfeVar2 = (zzfe) g(str, (byte[]) dVar.f8039a).zzbB();
                            h(str, zzfeVar2);
                            eVar4.put(str, l((zzff) zzfeVar2.zzaD()));
                            eVar5.put(str, (zzff) zzfeVar2.zzaD());
                            k(str, (zzff) zzfeVar2.zzaD());
                            eVar3.put(str, zzfeVar2.zze());
                            eVar2.put(str, (String) dVar.f8040b);
                            eVar.put(str, (String) dVar.f8041c);
                            return;
                        }
                        eVar4.put(str, null);
                        this.f11397f.put(str, null);
                        this.e.put(str, null);
                        this.f11398r.put(str, null);
                        eVar5.put(str, null);
                        eVar3.put(str, null);
                        eVar2.put(str, null);
                        eVar.put(str, null);
                        this.f11400t.put(str, null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            } catch (SQLiteException e4) {
                e = e4;
                cursorQuery = null;
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
            cursorQuery.close();
            dVar = null;
            eVar = this.f11405y;
            eVar2 = this.f11404x;
            eVar3 = this.f11403w;
            eVar4 = this.f11396d;
            if (dVar != null) {
                zzfe zzfeVar3 = (zzfe) g(str, (byte[]) dVar.f8039a).zzbB();
                h(str, zzfeVar3);
                eVar4.put(str, l((zzff) zzfeVar3.zzaD()));
                eVar5.put(str, (zzff) zzfeVar3.zzaD());
                k(str, (zzff) zzfeVar3.zzaD());
                eVar3.put(str, zzfeVar3.zze());
                eVar2.put(str, (String) dVar.f8040b);
                eVar.put(str, (String) dVar.f8041c);
                return;
            }
            eVar4.put(str, null);
            this.f11397f.put(str, null);
            this.e.put(str, null);
            this.f11398r.put(str, null);
            eVar5.put(str, null);
            eVar3.put(str, null);
            eVar2.put(str, null);
            eVar.put(str, null);
            this.f11400t.put(str, null);
        }
    }

    public final void k(String str, zzff zzffVar) {
        a1 a1Var = (a1) this.f159a;
        int iZza = zzffVar.zza();
        u0 u0Var = this.f11401u;
        if (iZza == 0) {
            u0Var.remove(str);
            return;
        }
        i0 i0Var = a1Var.f11007t;
        i0 i0Var2 = a1Var.f11007t;
        a1.f(i0Var);
        i0Var.f11198y.c(Integer.valueOf(zzffVar.zza()), "EES programs found");
        zzgt zzgtVar = (zzgt) zzffVar.zzo().get(0);
        try {
            zzc zzcVar = new zzc();
            zzcVar.zzd("internal.remoteConfig", new t0(this, str, 1));
            zzcVar.zzd("internal.appMetadata", new t0(this, str, 2));
            zzcVar.zzd("internal.logger", new d6.m(this, 6));
            zzcVar.zzc(zzgtVar);
            u0Var.put(str, zzcVar);
            a1.f(i0Var2);
            i0Var2.f11198y.d(str, "EES program loaded for appId, activities", Integer.valueOf(zzgtVar.zza().zza()));
            for (zzgr zzgrVar : zzgtVar.zza().zzd()) {
                a1.f(i0Var2);
                i0Var2.f11198y.c(zzgrVar.zzb(), "EES program activity");
            }
        } catch (zzd unused) {
            a1.f(i0Var2);
            i0Var2.f11190f.c(str, "Failed to load EES program. appId");
        }
    }

    public final int m(String str, String str2) {
        Integer num;
        c();
        j(str);
        Map map = (Map) this.f11400t.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final zzff n(String str) {
        d();
        c();
        com.google.android.gms.common.internal.i0.e(str);
        j(str);
        return (zzff) this.f11399s.get(str);
    }

    public final boolean o(String str) {
        c();
        zzff zzffVarN = n(str);
        if (zzffVarN == null) {
            return false;
        }
        return zzffVarN.zzs();
    }

    public final boolean p(String str, String str2) {
        Boolean bool;
        c();
        j(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f11398r.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean q(String str, String str2) {
        Boolean bool;
        c();
        j(str);
        if ("1".equals(a(str, "measurement.upload.blacklist_internal")) && d3.O(str2)) {
            return true;
        }
        if ("1".equals(a(str, "measurement.upload.blacklist_public")) && d3.P(str2)) {
            return true;
        }
        Map map = (Map) this.f11397f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void r(String str, String str2, String str3, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        byte[] bArrZzbx;
        int i;
        int i10;
        boolean z4;
        d();
        c();
        com.google.android.gms.common.internal.i0.e(str);
        zzfe zzfeVar = (zzfe) g(str, bArr).zzbB();
        h(str, zzfeVar);
        k(str, (zzff) zzfeVar.zzaD());
        zzff zzffVar = (zzff) zzfeVar.zzaD();
        r.e eVar = this.f11399s;
        eVar.put(str, zzffVar);
        this.f11403w.put(str, zzfeVar.zze());
        this.f11404x.put(str, str2);
        this.f11405y.put(str, str3);
        this.f11396d.put(str, l((zzff) zzfeVar.zzaD()));
        z2 z2Var = this.f11411b;
        j jVar = z2Var.f11509c;
        z2.D(jVar);
        ArrayList arrayList = new ArrayList(zzfeVar.zzf());
        a1 a1Var = (a1) jVar.f159a;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            zzeh zzehVar = (zzeh) ((zzei) arrayList.get(i11)).zzbB();
            if (zzehVar.zza() != 0) {
                int i12 = 0;
                while (i12 < zzehVar.zza()) {
                    zzej zzejVar = (zzej) zzehVar.zze(i12).zzbB();
                    zzej zzejVar2 = (zzej) zzejVar.clone();
                    z2 z2Var2 = z2Var;
                    String strF = k1.f(zzejVar.zze(), k1.f11229a, k1.f11231c);
                    if (strF != null) {
                        zzejVar2.zzb(strF);
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int i13 = 0;
                    while (i13 < zzejVar.zza()) {
                        zzem zzemVarZzd = zzejVar.zzd(i13);
                        boolean z10 = z4;
                        zzej zzejVar3 = zzejVar;
                        String strF2 = k1.f(zzemVarZzd.zze(), k1.e, k1.f11233f);
                        if (strF2 != null) {
                            zzel zzelVar = (zzel) zzemVarZzd.zzbB();
                            zzelVar.zza(strF2);
                            zzejVar2.zzc(i13, (zzem) zzelVar.zzaD());
                            z4 = true;
                        } else {
                            z4 = z10;
                        }
                        i13++;
                        zzejVar = zzejVar3;
                    }
                    if (z4) {
                        zzehVar.zzc(i12, zzejVar2);
                        arrayList.set(i11, (zzei) zzehVar.zzaD());
                    }
                    i12++;
                    z2Var = z2Var2;
                }
            }
            z2 z2Var3 = z2Var;
            if (zzehVar.zzb() != 0) {
                for (int i14 = 0; i14 < zzehVar.zzb(); i14++) {
                    zzet zzetVarZzf = zzehVar.zzf(i14);
                    String strF3 = k1.f(zzetVarZzf.zze(), k1.i, k1.f11235j);
                    if (strF3 != null) {
                        zzes zzesVar = (zzes) zzetVarZzf.zzbB();
                        zzesVar.zza(strF3);
                        zzehVar.zzd(i14, zzesVar);
                        arrayList.set(i11, (zzei) zzehVar.zzaD());
                    }
                }
            }
            i11++;
            zzfeVar = zzfeVar;
            eVar = eVar;
            z2Var = z2Var3;
        }
        zzfe zzfeVar2 = zzfeVar;
        r.e eVar2 = eVar;
        z2 z2Var4 = z2Var;
        jVar.d();
        jVar.c();
        com.google.android.gms.common.internal.i0.e(str);
        SQLiteDatabase sQLiteDatabaseV = jVar.v();
        sQLiteDatabaseV.beginTransaction();
        try {
            jVar.d();
            jVar.c();
            com.google.android.gms.common.internal.i0.e(str);
            SQLiteDatabase sQLiteDatabaseV2 = jVar.v();
            sQLiteDatabaseV2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseV2.delete("event_filters", "app_id=?", new String[]{str});
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                int i16 = i15 + 1;
                zzei zzeiVar = (zzei) arrayList.get(i15);
                jVar.d();
                jVar.c();
                com.google.android.gms.common.internal.i0.e(str);
                com.google.android.gms.common.internal.i0.i(zzeiVar);
                if (zzeiVar.zzk()) {
                    int iZza = zzeiVar.zza();
                    Iterator it = zzeiVar.zzg().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator it2 = zzeiVar.zzh().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    Iterator it3 = zzeiVar.zzg().iterator();
                                    while (true) {
                                        boolean zHasNext = it3.hasNext();
                                        Iterator it4 = it3;
                                        String str4 = "filter_id";
                                        sQLiteDatabase = sQLiteDatabaseV;
                                        i = size;
                                        String str5 = "app_id";
                                        if (!zHasNext) {
                                            i10 = i16;
                                            Iterator it5 = zzeiVar.zzh().iterator();
                                            while (it5.hasNext()) {
                                                zzet zzetVar = (zzet) it5.next();
                                                jVar.d();
                                                jVar.c();
                                                com.google.android.gms.common.internal.i0.e(str);
                                                com.google.android.gms.common.internal.i0.i(zzetVar);
                                                if (zzetVar.zze().isEmpty()) {
                                                    i0 i0Var = a1Var.f11007t;
                                                    a1.f(i0Var);
                                                    i0Var.f11193t.e("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", i0.k(str), Integer.valueOf(iZza), String.valueOf(zzetVar.zzj() ? Integer.valueOf(zzetVar.zza()) : null));
                                                } else {
                                                    byte[] bArrZzbx2 = zzetVar.zzbx();
                                                    Iterator it6 = it5;
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put(str5, str);
                                                    String str6 = str5;
                                                    contentValues.put("audience_id", Integer.valueOf(iZza));
                                                    contentValues.put(str4, zzetVar.zzj() ? Integer.valueOf(zzetVar.zza()) : null);
                                                    String str7 = str4;
                                                    contentValues.put("property_name", zzetVar.zze());
                                                    contentValues.put("session_scoped", zzetVar.zzk() ? Boolean.valueOf(zzetVar.zzi()) : null);
                                                    contentValues.put("data", bArrZzbx2);
                                                    try {
                                                        if (jVar.v().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                            i0 i0Var2 = a1Var.f11007t;
                                                            a1.f(i0Var2);
                                                            i0Var2.f11190f.c(i0.k(str), "Failed to insert property filter (got -1). appId");
                                                        } else {
                                                            it5 = it6;
                                                            str5 = str6;
                                                            str4 = str7;
                                                        }
                                                    } catch (SQLiteException e) {
                                                        i0 i0Var3 = a1Var.f11007t;
                                                        a1.f(i0Var3);
                                                        i0Var3.f11190f.d(i0.k(str), "Error storing property filter. appId", e);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        try {
                                            zzek zzekVar = (zzek) it4.next();
                                            jVar.d();
                                            jVar.c();
                                            com.google.android.gms.common.internal.i0.e(str);
                                            com.google.android.gms.common.internal.i0.i(zzekVar);
                                            if (zzekVar.zzg().isEmpty()) {
                                                i0 i0Var4 = a1Var.f11007t;
                                                a1.f(i0Var4);
                                                i0Var4.f11193t.e("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", i0.k(str), Integer.valueOf(iZza), String.valueOf(zzekVar.zzp() ? Integer.valueOf(zzekVar.zzb()) : null));
                                                i10 = i16;
                                            } else {
                                                zzei zzeiVar2 = zzeiVar;
                                                byte[] bArrZzbx3 = zzekVar.zzbx();
                                                i10 = i16;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("app_id", str);
                                                contentValues2.put("audience_id", Integer.valueOf(iZza));
                                                contentValues2.put("filter_id", zzekVar.zzp() ? Integer.valueOf(zzekVar.zzb()) : null);
                                                contentValues2.put("event_name", zzekVar.zzg());
                                                contentValues2.put("session_scoped", zzekVar.zzq() ? Boolean.valueOf(zzekVar.zzn()) : null);
                                                contentValues2.put("data", bArrZzbx3);
                                                try {
                                                    if (jVar.v().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        i0 i0Var5 = a1Var.f11007t;
                                                        a1.f(i0Var5);
                                                        i0Var5.f11190f.c(i0.k(str), "Failed to insert event filter (got -1). appId");
                                                    }
                                                    it3 = it4;
                                                    sQLiteDatabaseV = sQLiteDatabase;
                                                    size = i;
                                                    zzeiVar = zzeiVar2;
                                                    i16 = i10;
                                                } catch (SQLiteException e4) {
                                                    i0 i0Var6 = a1Var.f11007t;
                                                    a1.f(i0Var6);
                                                    i0Var6.f11190f.d(i0.k(str), "Error storing event filter. appId", e4);
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabase.endTransaction();
                                            throw th;
                                        }
                                        jVar.d();
                                        jVar.c();
                                        com.google.android.gms.common.internal.i0.e(str);
                                        SQLiteDatabase sQLiteDatabaseV3 = jVar.v();
                                        sQLiteDatabaseV3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iZza)});
                                        sQLiteDatabaseV3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iZza)});
                                        break;
                                    }
                                    sQLiteDatabaseV = sQLiteDatabase;
                                    size = i;
                                    i15 = i10;
                                    break;
                                }
                                if (!((zzet) it2.next()).zzj()) {
                                    i0 i0Var7 = a1Var.f11007t;
                                    a1.f(i0Var7);
                                    i0Var7.f11193t.d(i0.k(str), "Property filter with no ID. Audience definition ignored. appId, audienceId", Integer.valueOf(iZza));
                                }
                            }
                        } else if (!((zzek) it.next()).zzp()) {
                            i0 i0Var8 = a1Var.f11007t;
                            a1.f(i0Var8);
                            i0Var8.f11193t.d(i0.k(str), "Event filter with no ID. Audience definition ignored. appId, audienceId", Integer.valueOf(iZza));
                        }
                    }
                } else {
                    i0 i0Var9 = a1Var.f11007t;
                    a1.f(i0Var9);
                    i0Var9.f11193t.c(i0.k(str), "Audience with no ID. appId");
                }
                i15 = i16;
            }
            sQLiteDatabase = sQLiteDatabaseV;
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            int i17 = 0;
            while (i17 < size2) {
                Object obj = arrayList.get(i17);
                i17++;
                zzei zzeiVar3 = (zzei) obj;
                arrayList2.add(zzeiVar3.zzk() ? Integer.valueOf(zzeiVar3.zza()) : null);
            }
            com.google.android.gms.common.internal.i0.e(str);
            jVar.d();
            jVar.c();
            SQLiteDatabase sQLiteDatabaseV4 = jVar.v();
            try {
                long jQ = jVar.q("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, a1Var.f11005r.f(str, z.F)));
                if (jQ > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i18 = 0;
                    while (true) {
                        if (i18 >= arrayList2.size()) {
                            sQLiteDatabaseV4.delete("audience_filter_values", "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in " + ("(" + TextUtils.join(",", arrayList3) + ")") + " order by rowid desc limit -1 offset ?)", new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i18);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i18++;
                    }
                }
            } catch (SQLiteException e10) {
                i0 i0Var10 = a1Var.f11007t;
                a1.f(i0Var10);
                i0Var10.f11190f.d(i0.k(str), "Database error querying filters. appId", e10);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                zzfeVar2.zzc();
                bArrZzbx = ((zzff) zzfeVar2.zzaD()).zzbx();
            } catch (RuntimeException e11) {
                i0 i0Var11 = ((a1) this.f159a).f11007t;
                a1.f(i0Var11);
                i0Var11.f11193t.d(i0.k(str), "Unable to serialize reduced-size config. Storing full config instead. appId", e11);
                bArrZzbx = bArr;
            }
            j jVar2 = z2Var4.f11509c;
            z2.D(jVar2);
            a1 a1Var2 = (a1) jVar2.f159a;
            com.google.android.gms.common.internal.i0.e(str);
            jVar2.c();
            jVar2.d();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrZzbx);
            contentValues3.put("config_last_modified_time", str2);
            contentValues3.put("e_tag", str3);
            try {
                if (jVar2.v().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    i0 i0Var12 = a1Var2.f11007t;
                    a1.f(i0Var12);
                    i0Var12.f11190f.c(i0.k(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e12) {
                i0 i0Var13 = a1Var2.f11007t;
                a1.f(i0Var13);
                i0Var13.f11190f.d(i0.k(str), "Error storing remote config. appId", e12);
            }
            eVar2.put(str, (zzff) zzfeVar2.zzaD());
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabaseV;
        }
    }

    @Override // z7.w2
    public final void f() {
    }
}
