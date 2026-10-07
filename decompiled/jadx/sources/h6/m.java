package h6;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzdvj;
import com.google.android.gms.internal.ads.zzdvk;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5032d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f5033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f5034g;

    public m() {
        this.f5031c = new Object();
        this.f5032d = "";
        this.e = "";
        this.f5029a = false;
        this.f5030b = false;
        this.f5033f = "";
    }

    public static final void a(m mVar, g2.a aVar) throws Throwable {
        Object objM;
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) mVar.f5032d;
        y1.a aVar2 = (y1.a) mVar.f5031c;
        y1.u uVar = aVar2.f10399g;
        y1.u uVar2 = y1.u.f10513c;
        if (uVar == uVar2) {
            jd.d.o(aVar, "PRAGMA journal_mode = WAL");
        } else {
            jd.d.o(aVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (aVar2.f10399g == uVar2) {
            jd.d.o(aVar, "PRAGMA synchronous = NORMAL");
        } else {
            jd.d.o(aVar, "PRAGMA synchronous = FULL");
        }
        b(aVar);
        g2.c cVarR = aVar.R("PRAGMA user_version");
        try {
            cVarR.O();
            int i = (int) cVarR.getLong(0);
            a.a.b(cVarR, null);
            int i10 = gVar.f765a;
            if (i != i10) {
                jd.d.o(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        mVar.d(aVar);
                    } else {
                        mVar.e(aVar, i, i10);
                    }
                    jd.d.o(aVar, "PRAGMA user_version = " + i10);
                    objM = ub.k.f9073a;
                } catch (Throwable th) {
                    objM = r7.g.m(th);
                }
                if (!(objM instanceof ub.g)) {
                    jd.d.o(aVar, "END TRANSACTION");
                }
                Throwable thA = ub.h.a(objM);
                if (thA != null) {
                    jd.d.o(aVar, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            mVar.f(aVar);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                a.a.b(cVarR, th2);
                throw th3;
            }
        }
    }

    public static void b(g2.a aVar) {
        g2.c cVarR = aVar.R("PRAGMA busy_timeout");
        try {
            cVarR.O();
            long j4 = cVarR.getLong(0);
            a.a.b(cVarR, null);
            if (j4 < 3000) {
                jd.d.o(aVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a.a.b(cVarR, th);
                throw th2;
            }
        }
    }

    public static void k(Context context, String str, boolean z4, boolean z10) {
        if (context instanceof Activity) {
            r0.f5068l.post(new l(context, str, z4, z10));
        } else {
            i6.h.f("Can not create dialog without Activity Context");
        }
    }

    public static final String p(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", d6.p.C.f2979c.w(context, str2));
        new x(context);
        v vVarA = x.a(0, str, map, null);
        try {
            return (String) vVarA.get(((Integer) e6.t.f3437d.f3440c.zza(zzbcn.zzeN)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            i6.h.e("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e);
            vVarA.cancel(true);
            return null;
        } catch (TimeoutException e4) {
            i6.h.e("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e4);
            vVarA.cancel(true);
            return null;
        } catch (Exception e10) {
            i6.h.e("Error retrieving a response from: ".concat(String.valueOf(str)), e10);
            return null;
        }
    }

    public h2.e c() {
        a4.b bVar;
        a2.b bVar2 = (a2.b) this.f5033f;
        b2.b bVar3 = bVar2 instanceof b2.b ? (b2.b) bVar2 : null;
        if (bVar3 == null || (bVar = bVar3.f1350a) == null) {
            return null;
        }
        return (h2.e) bVar.f113b;
    }

    public void d(g2.a aVar) {
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f5032d;
        jc.i.e(aVar, "connection");
        g2.c cVarR = aVar.R("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z4 = false;
            if (cVarR.O() && cVarR.getLong(0) == 0) {
                z4 = true;
            }
            a.a.b(cVarR, null);
            gVar.a(aVar);
            if (!z4) {
                y1.w wVarV = gVar.v(aVar);
                if (!wVarV.f10523a) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + wVarV.f10524b).toString());
                }
            }
            jd.d.o(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            jd.d.o(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) gVar.f766b) + "')");
            gVar.r(aVar);
            Iterator it = ((List) this.e).iterator();
            while (it.hasNext()) {
                ((y1.t) it.next()).getClass();
                if (aVar instanceof b2.a) {
                    jc.i.e(((b2.a) aVar).f1349a, "db");
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a.a.b(cVarR, th);
                throw th2;
            }
        }
    }

    public void e(g2.a aVar, int i, int i10) {
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f5032d;
        jc.i.e(aVar, "connection");
        y1.a aVar2 = (y1.a) this.f5031c;
        List<c2.a> listJ = p3.a.j(aVar2.f10397d, i, i10);
        if (listJ != null) {
            gVar.u(aVar);
            for (c2.a aVar3 : listJ) {
                aVar3.getClass();
                if (!(aVar instanceof b2.a)) {
                    throw new ub.e("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
                }
                aVar3.a(((b2.a) aVar).f1349a);
            }
            y1.w wVarV = gVar.v(aVar);
            if (!wVarV.f10523a) {
                throw new IllegalStateException(("Migration didn't properly handle: " + wVarV.f10524b).toString());
            }
            gVar.t(aVar);
            jd.d.o(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            jd.d.o(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) gVar.f766b) + "')");
            return;
        }
        if (p3.a.m(aVar2, i, i10)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i10 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (aVar2.f10409s) {
            g2.c cVarR = aVar.R("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                wb.c cVar = new wb.c(10);
                while (cVarR.O()) {
                    String strF = cVarR.F(0);
                    if (!pc.o.e0(strF, "sqlite_", false) && !strF.equals("android_metadata")) {
                        cVar.add(new ub.f(strF, Boolean.valueOf(jc.i.a(cVarR.F(1), "view"))));
                    }
                }
                wb.c cVarC = jd.d.c(cVar);
                a.a.b(cVarR, null);
                ListIterator listIterator = cVarC.listIterator(0);
                while (true) {
                    wb.a aVar4 = (wb.a) listIterator;
                    if (!aVar4.hasNext()) {
                        break;
                    }
                    ub.f fVar = (ub.f) aVar4.next();
                    String str = (String) fVar.f9065a;
                    if (((Boolean) fVar.f9066b).booleanValue()) {
                        jd.d.o(aVar, "DROP VIEW IF EXISTS " + str);
                    } else {
                        jd.d.o(aVar, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    a.a.b(cVarR, th);
                    throw th2;
                }
            }
        } else {
            gVar.c(aVar);
        }
        Iterator it = ((List) this.e).iterator();
        while (it.hasNext()) {
            ((y1.t) it.next()).getClass();
            if (aVar instanceof b2.a) {
                jc.i.e(((b2.a) aVar).f1349a, "db");
            }
        }
        gVar.a(aVar);
    }

    public void f(g2.a aVar) throws Throwable {
        Object objM;
        jc.i.e(aVar, "connection");
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f5032d;
        g2.c cVarR = aVar.R("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z4 = cVarR.O() && cVarR.getLong(0) != 0;
            a.a.b(cVarR, null);
            if (z4) {
                g2.c cVarR2 = aVar.R("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strF = cVarR2.O() ? cVarR2.F(0) : null;
                    a.a.b(cVarR2, null);
                    if (!((String) gVar.f766b).equals(strF) && !((String) gVar.f767c).equals(strF)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) gVar.f766b) + ", found: " + strF).toString());
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        a.a.b(cVarR2, th);
                        throw th2;
                    }
                }
            } else {
                jd.d.o(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    y1.w wVarV = gVar.v(aVar);
                    if (!wVarV.f10523a) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + wVarV.f10524b).toString());
                    }
                    gVar.t(aVar);
                    jd.d.o(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    jd.d.o(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) gVar.f766b) + "')");
                    objM = ub.k.f9073a;
                    if (!(objM instanceof ub.g)) {
                        jd.d.o(aVar, "END TRANSACTION");
                    }
                    Throwable thA = ub.h.a(objM);
                    if (thA != null) {
                        jd.d.o(aVar, "ROLLBACK TRANSACTION");
                        throw thA;
                    }
                } catch (Throwable th3) {
                    objM = r7.g.m(th3);
                }
            }
            gVar.s(aVar);
            for (y1.t tVar : (List) this.e) {
                tVar.getClass();
                if (aVar instanceof b2.a) {
                    tVar.a(((b2.a) aVar).f1349a);
                }
            }
            this.f5029a = true;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                a.a.b(cVarR, th4);
                throw th5;
            }
        }
    }

    public void g(Context context) {
        zzdvk zzdvkVar;
        if (!((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zziO)).booleanValue() || (zzdvkVar = (zzdvk) this.f5034g) == null) {
            return;
        }
        zzdvkVar.zzh(new k(this, context), zzdvj.DEBUG_MENU);
    }

    public void h(Context context, String str, String str2) {
        r0 r0Var = d6.p.C.f2979c;
        r0.q(context, q(context, (String) e6.t.f3437d.f3440c.zza(zzbcn.zzeJ), str, str2));
    }

    public void i(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = q(context, (String) e6.t.f3437d.f3440c.zza(zzbcn.zzeM), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        r0 r0Var = d6.p.C.f2979c;
        r0.j(context, str, builderBuildUpon.build().toString());
    }

    public void j(boolean z4) {
        synchronized (this.f5031c) {
            try {
                this.f5030b = z4;
                if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zziO)).booleanValue()) {
                    ((n0) d6.p.C.f2982g.zzi()).r(z4);
                    zzdvk zzdvkVar = (zzdvk) this.f5034g;
                    if (zzdvkVar != null) {
                        zzdvkVar.zzl(z4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean l(Context context, String str, String str2) {
        zzbce zzbceVar = zzbcn.zzeL;
        e6.t tVar = e6.t.f3437d;
        String strP = p(context, q(context, (String) tVar.f3440c.zza(zzbceVar), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strP)) {
            i6.h.b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strP.trim()).optString("debug_mode"));
            j(zEquals);
            if (((Boolean) tVar.f3440c.zza(zzbcn.zziO)).booleanValue()) {
                m0 m0VarZzi = d6.p.C.f2982g.zzi();
                if (true != zEquals) {
                    str = "";
                }
                ((n0) m0VarZzi).q(str);
            }
            return zEquals;
        } catch (JSONException e) {
            i6.h.h("Fail to get debug mode response json.", e);
            return false;
        }
    }

    public boolean m() {
        boolean z4;
        synchronized (this.f5031c) {
            z4 = this.f5030b;
        }
        return z4;
    }

    public boolean n() {
        boolean z4;
        synchronized (this.f5031c) {
            z4 = this.f5029a;
        }
        return z4;
    }

    public boolean o(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !n()) {
            return false;
        }
        i6.h.b("Sending troubleshooting signals to the server.");
        i(context, str, str2, str3);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006d A[Catch: all -> 0x0034, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0015, B:7:0x001b, B:12:0x003d, B:14:0x0045, B:16:0x0056, B:19:0x0068, B:11:0x0036, B:20:0x006d, B:21:0x0071), top: B:26:0x000b, inners: #1, #2 }] */
    public Uri q(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f5031c) {
            if (TextUtils.isEmpty((String) this.f5032d)) {
                r0 r0Var = d6.p.C.f2979c;
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    n7.c.f(fileInputStreamOpenFileInput, byteArrayOutputStream, true);
                    str5 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                } catch (IOException unused) {
                    i6.h.b("Error reading from internal storage.");
                    str5 = "";
                }
                this.f5032d = str5;
                if (TextUtils.isEmpty(str5)) {
                    r0 r0Var2 = d6.p.C.f2979c;
                    String string = UUID.randomUUID().toString();
                    this.f5032d = string;
                    try {
                        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStreamOpenFileOutput.write(string.getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e) {
                        i6.h.e("Error writing to file in internal storage.", e);
                    }
                    str4 = (String) this.f5032d;
                } else {
                    str4 = (String) this.f5032d;
                }
            } else {
                str4 = (String) this.f5032d;
            }
            throw th;
        }
        builderBuildUpon.appendQueryParameter("linkedDeviceId", str4);
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }

    public m(y1.a aVar, androidx.emoji2.text.g gVar) {
        int i;
        a2.h hVar;
        y1.u uVar = aVar.f10399g;
        h2.d dVar = aVar.f10396c;
        String str = aVar.f10395b;
        this.f5031c = aVar;
        this.f5032d = gVar;
        Object obj = aVar.e;
        this.e = obj == null ? vb.q.f9297a : obj;
        g2.b bVar = aVar.f10410t;
        if (bVar != null) {
            if (str == null) {
                hVar = new a2.h(new s5.j(this, bVar));
            } else {
                s5.j jVar = new s5.j(this, bVar);
                int iOrdinal = uVar.ordinal();
                if (iOrdinal == 1) {
                    i = 1;
                } else {
                    if (iOrdinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + uVar + '\'').toString());
                    }
                    i = 4;
                }
                int iOrdinal2 = uVar.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + uVar + '\'').toString());
                }
                hVar = new a2.h(jVar, str, i);
            }
            this.f5033f = hVar;
        } else {
            if (dVar == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
            Context context = aVar.f10394a;
            jc.i.e(context, "context");
            this.f5033f = new b2.b(new a4.b(dVar.n(new com.bumptech.glide.manager.q(context, str, new y1.q(this, gVar.f765a), false))));
        }
        boolean z4 = uVar == y1.u.f10513c;
        h2.e eVarC = c();
        if (eVarC != null) {
            eVarC.setWriteAheadLoggingEnabled(z4);
        }
    }

    public m(y1.a aVar, h3.c cVar) {
        y1.u uVar = aVar.f10399g;
        this.f5031c = aVar;
        this.f5032d = new y1.p(-1, "", "");
        List list = aVar.e;
        vb.q qVar = vb.q.f9297a;
        this.e = list == null ? qVar : list;
        ArrayList arrayListG0 = vb.i.g0(list == null ? qVar : list, new y1.r(new h3.c(this, 6)));
        Context context = aVar.f10394a;
        String str = aVar.f10395b;
        h2.d dVar = aVar.f10396c;
        q3.e eVar = aVar.f10397d;
        boolean z4 = aVar.f10398f;
        Executor executor = aVar.h;
        Executor executor2 = aVar.i;
        Intent intent = aVar.f10400j;
        boolean z10 = aVar.f10401k;
        boolean z11 = aVar.f10402l;
        Set set = aVar.f10403m;
        String str2 = aVar.f10404n;
        File file = aVar.f10405o;
        Callable callable = aVar.f10406p;
        List list2 = aVar.f10407q;
        List list3 = aVar.f10408r;
        boolean z12 = aVar.f10409s;
        g2.b bVar = aVar.f10410t;
        yb.i iVar = aVar.f10411u;
        jc.i.e(context, "context");
        jc.i.e(eVar, "migrationContainer");
        jc.i.e(executor, "queryExecutor");
        jc.i.e(executor2, "transactionExecutor");
        jc.i.e(list2, "typeConverters");
        jc.i.e(list3, "autoMigrationSpecs");
        this.f5033f = new b2.b(new a4.b((h2.e) cVar.invoke(new y1.a(context, str, dVar, eVar, arrayListG0, z4, uVar, executor, executor2, intent, z10, z11, set, str2, file, callable, list2, list3, z12, bVar, iVar))));
        boolean z13 = uVar == y1.u.f10513c;
        h2.e eVarC = c();
        if (eVarC != null) {
            eVarC.setWriteAheadLoggingEnabled(z13);
        }
    }
}
