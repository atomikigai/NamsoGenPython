package z7;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11136a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11139d;
    public final Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f11140f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f11141r;

    public g0(i0 i0Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f11141r = i0Var;
        this.f11137b = i;
        this.f11138c = str;
        this.f11139d = obj;
        this.e = obj2;
        this.f11140f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11136a) {
            case 0:
                q0 q0Var = ((a1) ((i0) this.f11141r).f159a).f11006s;
                a1.d(q0Var);
                if (!q0Var.f11115b) {
                    Log.println(6, ((i0) this.f11141r).o(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                i0 i0Var = (i0) this.f11141r;
                if (i0Var.f11188c == 0) {
                    g gVar = ((a1) i0Var.f159a).f11005r;
                    if (gVar.f11135d == null) {
                        synchronized (gVar) {
                            try {
                                if (gVar.f11135d == null) {
                                    ApplicationInfo applicationInfo = ((a1) gVar.f159a).f11000a.getApplicationInfo();
                                    String strA = n7.f.a();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        gVar.f11135d = Boolean.valueOf(str != null && str.equals(strA));
                                    }
                                    if (gVar.f11135d == null) {
                                        gVar.f11135d = Boolean.TRUE;
                                        i0 i0Var2 = ((a1) gVar.f159a).f11007t;
                                        a1.f(i0Var2);
                                        i0Var2.f11190f.b("My process not in the list of running processes");
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (gVar.f11135d.booleanValue()) {
                        i0 i0Var3 = (i0) this.f11141r;
                        ((a1) i0Var3.f159a).getClass();
                        i0Var3.f11188c = 'C';
                    } else {
                        i0 i0Var4 = (i0) this.f11141r;
                        ((a1) i0Var4.f159a).getClass();
                        i0Var4.f11188c = 'c';
                    }
                    break;
                }
                i0 i0Var5 = (i0) this.f11141r;
                if (i0Var5.f11189d < 0) {
                    ((a1) i0Var5.f159a).f11005r.g();
                    i0Var5.f11189d = 79000L;
                }
                char cCharAt = "01VDIWEA?".charAt(this.f11137b);
                i0 i0Var6 = (i0) this.f11141r;
                char c10 = i0Var6.f11188c;
                long j4 = i0Var6.f11189d;
                String strL = i0.l(true, this.f11138c, this.f11139d, this.e, this.f11140f);
                StringBuilder sb2 = new StringBuilder("2");
                sb2.append(cCharAt);
                sb2.append(c10);
                sb2.append(j4);
                String strM = q1.a.m(sb2, ":", strL);
                if (strM.length() > 1024) {
                    strM = this.f11138c.substring(0, 1024);
                }
                kb.d dVar = q0Var.f11307d;
                if (dVar != null) {
                    String str2 = (String) dVar.f6154d;
                    String str3 = (String) dVar.f6153c;
                    q0 q0Var2 = (q0) dVar.e;
                    q0Var2.c();
                    if (((q0) dVar.e).g().getLong((String) dVar.f6152b, 0L) == 0) {
                        dVar.d();
                    }
                    if (strM == null) {
                        strM = "";
                    }
                    long j10 = q0Var2.g().getLong(str3, 0L);
                    if (j10 <= 0) {
                        SharedPreferences.Editor editorEdit = q0Var2.g().edit();
                        editorEdit.putString(str2, strM);
                        editorEdit.putLong(str3, 1L);
                        editorEdit.apply();
                        return;
                    }
                    d3 d3Var = ((a1) q0Var2.f159a).f11010w;
                    a1.d(d3Var);
                    long jNextLong = d3Var.l().nextLong() & Long.MAX_VALUE;
                    long j11 = j10 + 1;
                    long j12 = Long.MAX_VALUE / j11;
                    SharedPreferences.Editor editorEdit2 = q0Var2.g().edit();
                    if (jNextLong < j12) {
                        editorEdit2.putString(str2, strM);
                    }
                    editorEdit2.putLong(str3, j11);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((j0) this.f11139d).b(this.f11138c, this.f11137b, (Throwable) this.e, (byte[]) this.f11140f, (Map) this.f11141r);
                return;
        }
    }

    public /* synthetic */ g0(String str, j0 j0Var, int i, IOException iOException, byte[] bArr, Map map) {
        com.google.android.gms.common.internal.i0.i(j0Var);
        this.f11139d = j0Var;
        this.f11137b = i;
        this.e = iOException;
        this.f11140f = bArr;
        this.f11138c = str;
        this.f11141r = map;
    }
}
