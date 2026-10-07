package z7;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzqu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gb.k f11424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l1 f11425d;
    public final CopyOnWriteArraySet e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11426f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicReference f11427r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f11428s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j1 f11429t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicLong f11430u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f11431v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s0 f11432w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11433x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final q3.e f11434y;

    public x1(a1 a1Var) {
        super(a1Var);
        this.e = new CopyOnWriteArraySet();
        this.f11428s = new Object();
        this.f11433x = true;
        this.f11434y = new q3.e(this);
        this.f11427r = new AtomicReference();
        this.f11429t = j1.f11214c;
        this.f11431v = -1L;
        this.f11430u = new AtomicLong(0L);
        this.f11432w = new s0(a1Var, 2);
    }

    public static /* bridge */ /* synthetic */ void x(x1 x1Var, j1 j1Var, j1 j1Var2) {
        i1 i1Var = i1.ANALYTICS_STORAGE;
        i1 i1Var2 = i1.AD_STORAGE;
        i1[] i1VarArr = {i1Var, i1Var2};
        boolean z4 = false;
        for (int i = 0; i < 2; i++) {
            i1 i1Var3 = i1VarArr[i];
            if (!j1Var2.f(i1Var3) && j1Var.f(i1Var3)) {
                z4 = true;
                break;
            }
        }
        boolean zG = j1Var.g(j1Var2, i1Var, i1Var2);
        if (z4 || zG) {
            ((a1) x1Var.f159a).j().j();
        }
    }

    public static void y(x1 x1Var, j1 j1Var, long j4, boolean z4, boolean z10) {
        int i = j1Var.f11216b;
        x1Var.c();
        x1Var.d();
        a1 a1Var = (a1) x1Var.f159a;
        q0 q0Var = a1Var.f11006s;
        i0 i0Var = a1Var.f11007t;
        a1.d(q0Var);
        j1 j1VarH = q0Var.h();
        if (j4 <= x1Var.f11431v && j1VarH.f11216b <= i) {
            a1.f(i0Var);
            i0Var.f11196w.c(j1Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        q0 q0Var2 = a1Var.f11006s;
        a1.d(q0Var2);
        q0Var2.c();
        if (!q0Var2.l(i)) {
            a1.f(i0Var);
            i0Var.f11196w.c(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = q0Var2.g().edit();
        editorEdit.putString("consent_settings", j1Var.e());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        x1Var.f11431v = j4;
        k2 k2VarN = a1Var.n();
        k2VarN.c();
        a1 a1Var2 = (a1) k2VarN.f159a;
        k2VarN.d();
        if (z4) {
            a1Var2.getClass();
            a1Var2.k().h();
        }
        if (k2VarN.k()) {
            k2VarN.p(new f2(k2VarN, k2VarN.m(false), 3));
        }
        if (z10) {
            a1Var.n().t(new AtomicReference());
        }
    }

    @Override // z7.m0
    public final boolean f() {
        return false;
    }

    public final void g(String str, String str2, Bundle bundle) {
        a1 a1Var = (a1) this.f159a;
        a1Var.f11012y.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.google.android.gms.common.internal.i0.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        z0 z0Var = a1Var.f11008u;
        a1.f(z0Var);
        z0Var.l(new o1(this, bundle2, 2));
    }

    public final void h() {
        a1 a1Var = (a1) this.f159a;
        if (!(a1Var.f11000a.getApplicationContext() instanceof Application) || this.f11424c == null) {
            return;
        }
        ((Application) a1Var.f11000a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f11424c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f1, code lost:
    
        if (r5 > 100) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0126, code lost:
    
        if (r6 > 100) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.String r14, java.lang.String r15, android.os.Bundle r16, boolean r17, boolean r18, long r19) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.x1.j(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void k(String str, String str2, Bundle bundle) {
        c();
        ((a1) this.f159a).f11012y.getClass();
        l(bundle, str, str2, System.currentTimeMillis());
    }

    public final void l(Bundle bundle, String str, String str2, long j4) {
        c();
        boolean z4 = true;
        if (this.f11425d != null && !d3.O(str2)) {
            z4 = false;
        }
        m(str, str2, j4, bundle, true, z4, true);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x02de  */
    /* JADX WARN: Code duplicated, block: B:122:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:124:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:127:0x0310  */
    /* JADX WARN: Code duplicated, block: B:128:0x0319  */
    /* JADX WARN: Code duplicated, block: B:131:0x032f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0386  */
    /* JADX WARN: Code duplicated, block: B:138:0x0398  */
    /* JADX WARN: Code duplicated, block: B:139:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:142:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:144:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:146:0x03da  */
    /* JADX WARN: Code duplicated, block: B:147:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:149:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:150:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:152:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:153:0x040f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0412  */
    /* JADX WARN: Code duplicated, block: B:156:0x0416  */
    /* JADX WARN: Code duplicated, block: B:161:0x042e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0436  */
    /* JADX WARN: Code duplicated, block: B:164:0x0439  */
    /* JADX WARN: Code duplicated, block: B:167:0x043f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0449  */
    /* JADX WARN: Code duplicated, block: B:171:0x048a  */
    /* JADX WARN: Code duplicated, block: B:173:0x049e  */
    /* JADX WARN: Code duplicated, block: B:176:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:179:0x04c9 A[LOOP:2: B:177:0x04c3->B:179:0x04c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:187:0x050d  */
    /* JADX WARN: Code duplicated, block: B:197:0x041c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x04df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01db  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x0211  */
    /* JADX WARN: Code duplicated, block: B:96:0x026a  */
    /* JADX WARN: Code duplicated, block: B:99:0x027c  */
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
    public final void m(String str, String str2, long j4, Bundle bundle, boolean z4, boolean z10, boolean z11) {
        q0 q0Var;
        i0 i0Var;
        d3 d3Var;
        x1 x1Var;
        d3 d3Var2;
        q3.e eVar;
        boolean z12;
        int iY;
        Bundle bundleH0;
        i0 i0Var2;
        long j10;
        ArrayList arrayList;
        boolean zB;
        x1 x1Var2;
        d3 d3Var3;
        long j11;
        long j12;
        ArrayList arrayList2;
        int size;
        int i;
        int i10;
        int i11;
        Bundle bundleG0;
        String str3;
        d3 d3Var4;
        Bundle bundle2;
        int i12;
        d0 d0VarK;
        byte[] bArrMarshall;
        boolean zK;
        Iterator it;
        String str4;
        ArrayList arrayList3;
        int i13;
        Object obj;
        Bundle[] bundleArr;
        String strG;
        int length;
        String str5 = str;
        com.google.android.gms.common.internal.i0.e(str5);
        com.google.android.gms.common.internal.i0.i(bundle);
        c();
        d();
        a1 a1Var = (a1) this.f159a;
        boolean zB2 = a1Var.b();
        g gVar = a1Var.f11005r;
        Context context = a1Var.f11000a;
        d2 d2Var = a1Var.f11013z;
        t2 t2Var = a1Var.f11009v;
        e0 e0Var = a1Var.f11011x;
        q0 q0Var2 = a1Var.f11006s;
        n7.b bVar = a1Var.f11012y;
        i0 i0Var3 = a1Var.f11007t;
        d3 d3Var5 = a1Var.f11010w;
        if (!zB2) {
            a1.f(i0Var3);
            i0Var3.f11197x.b("Event not sent since app measurement is disabled");
            return;
        }
        List list = a1Var.j().f11052t;
        if (list != null && !list.contains(str2)) {
            a1.f(i0Var3);
            i0Var3.f11197x.d(str2, "Dropping non-safelisted event. event name, origin", str5);
            return;
        }
        if (!this.f11426f) {
            this.f11426f = true;
            try {
                try {
                    (!a1Var.e ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e) {
                    a1.f(i0Var3);
                    i0Var3.f11193t.c(e, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                a1.f(i0Var3);
                i0Var3.f11196w.b("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            bVar.getClass();
            i0Var = i0Var3;
            d3Var = d3Var5;
            q0Var = q0Var2;
            t(System.currentTimeMillis(), string, "auto", "_lgclid");
            x1Var = this;
        } else {
            q0Var = q0Var2;
            i0Var = i0Var3;
            d3Var = d3Var5;
            x1Var = this;
        }
        if (!z4 || d3.f11082s[0].equals(str2)) {
            d3Var2 = d3Var;
        } else {
            a1.d(d3Var);
            a1.d(q0Var);
            d3Var2 = d3Var;
            d3Var2.q(bundle, q0Var.H.g());
        }
        q3.e eVar2 = x1Var.f11434y;
        if (!z11 && !"_iap".equals(str2)) {
            a1.d(d3Var2);
            int i14 = 2;
            if (d3Var2.J("event", str2)) {
                if (d3Var2.G("event", k1.f11229a, k1.f11230b, str2)) {
                    ((a1) d3Var2.f159a).getClass();
                    if (d3Var2.E(40, "event", str2)) {
                        i14 = 0;
                    }
                } else {
                    i14 = 13;
                }
            }
            if (i14 != 0) {
                a1.f(i0Var);
                i0Var.f11192s.c(e0Var.d(str2), "Invalid public event name. Event will not be logged (FE)");
                a1.d(d3Var2);
                String strJ = d3.j(str2, 40, true);
                int length2 = str2 != null ? str2.length() : 0;
                a1.d(d3Var2);
                d3.t(eVar2, null, i14, "_ev", strJ, length2);
                return;
            }
        }
        i0 i0Var4 = i0Var;
        a1.e(d2Var);
        b2 b2VarJ = d2Var.j(false);
        if (b2VarJ != null && !bundle.containsKey("_sc")) {
            b2VarJ.f11031d = true;
        }
        d3.p(b2VarJ, bundle, z4 && !z11);
        boolean zEquals = "am".equals(str5);
        boolean zO = d3.O(str2);
        if (z4) {
            eVar = eVar2;
            if (x1Var.f11425d != null && !zO) {
                if (!zEquals) {
                    a1.f(i0Var4);
                    i0Var4.f11197x.d(e0Var.d(str2), "Passing event to registered event handler (FE)", e0Var.b(bundle));
                    com.google.android.gms.common.internal.i0.i(x1Var.f11425d);
                    ((s5.j) x1Var.f11425d).n(bundle, str5, str2, j4);
                    return;
                }
                j4 = j4;
                z12 = true;
            }
            if (a1Var.c()) {
                a1.d(d3Var2);
                iY = d3Var2.Y(str2);
                if (iY != 0) {
                    a1.f(i0Var4);
                    i0Var4.f11192s.c(e0Var.d(str2), "Invalid event name. Event will not be logged (FE)");
                    a1.d(d3Var2);
                    String strJ2 = d3.j(str2, 40, true);
                    if (str2 != null) {
                        length = str2.length();
                    } else {
                        length = 0;
                    }
                    a1.d(d3Var2);
                    d3.t(eVar, null, iY, "_ev", strJ2, length);
                    return;
                }
                List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
                a1.d(d3Var2);
                bundleH0 = d3Var2.h0(str2, bundle, listUnmodifiableList, z11);
                com.google.android.gms.common.internal.i0.i(bundleH0);
                a1.e(d2Var);
                if (d2Var.j(false) == null && "_ae".equals(str2)) {
                    a1.e(t2Var);
                    s2 s2Var = t2Var.f11371f;
                    ((a1) s2Var.f11346d.f159a).f11012y.getClass();
                    j10 = 0;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    i0Var2 = i0Var4;
                    long j13 = jElapsedRealtime - s2Var.f11344b;
                    s2Var.f11344b = jElapsedRealtime;
                    if (j13 > 0) {
                        a1.d(d3Var2);
                        d3Var2.n(bundleH0, j13);
                    }
                } else {
                    i0Var2 = i0Var4;
                    j10 = 0;
                }
                zzos.zzc();
                if (gVar.l(null, z.f11454d0)) {
                    if ("auto".equals(str5) && "_ssr".equals(str2)) {
                        a1.d(d3Var2);
                        a1 a1Var2 = (a1) d3Var2.f159a;
                        String string2 = bundleH0.getString("_ffr");
                        int i15 = n7.g.f7312a;
                        if (string2 == null || string2.trim().isEmpty()) {
                            string2 = null;
                        } else if (string2 != null) {
                            string2 = string2.trim();
                        }
                        q0 q0Var3 = a1Var2.f11006s;
                        a1.d(q0Var3);
                        String strG2 = q0Var3.E.g();
                        if (string2 == strG2 || (string2 != null && string2.equals(strG2))) {
                            i0 i0Var5 = a1Var2.f11007t;
                            a1.f(i0Var5);
                            i0Var5.f11197x.b("Not logging duplicate session_start_with_rollout event");
                            return;
                        } else {
                            q0 q0Var4 = a1Var2.f11006s;
                            a1.d(q0Var4);
                            q0Var4.E.h(string2);
                        }
                    } else if ("_ae".equals(str2)) {
                        a1.d(d3Var2);
                        q0 q0Var5 = ((a1) d3Var2.f159a).f11006s;
                        a1.d(q0Var5);
                        strG = q0Var5.E.g();
                        if (!TextUtils.isEmpty(strG)) {
                            bundleH0.putString("_ffr", strG);
                        }
                    }
                }
                arrayList = new ArrayList();
                arrayList.add(bundleH0);
                if (gVar.l(null, z.f11492y0)) {
                    a1.e(t2Var);
                    t2Var.c();
                    zB = t2Var.f11370d;
                } else {
                    a1.d(q0Var);
                    zB = q0Var.B.b();
                }
                a1.d(q0Var);
                if (q0Var.f11316y.a() > j10) {
                    a1.d(q0Var);
                    if (q0Var.k(j4) || !zB) {
                        x1Var2 = this;
                        d3Var3 = d3Var2;
                        j11 = j10;
                    } else {
                        a1.f(i0Var2);
                        i0 i0Var6 = i0Var2;
                        i0Var6.f11198y.b("Current session is expired, remove the session number, ID, and engagement time");
                        bVar.getClass();
                        d3Var3 = d3Var2;
                        i0Var2 = i0Var6;
                        t(System.currentTimeMillis(), null, "auto", "_sid");
                        bVar.getClass();
                        t(System.currentTimeMillis(), null, "auto", "_sno");
                        bVar.getClass();
                        t(System.currentTimeMillis(), null, "auto", "_se");
                        x1Var2 = this;
                        a1.d(q0Var);
                        j11 = j10;
                        q0Var.f11317z.b(j11);
                    }
                } else {
                    x1Var2 = this;
                    d3Var3 = d3Var2;
                    j11 = j10;
                }
                if (bundleH0.getLong("extend_session", j11) == 1) {
                    a1.f(i0Var2);
                    i0Var2.f11198y.b("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    a1.e(t2Var);
                    j12 = j4;
                    t2Var.e.k(j12, true);
                } else {
                    j12 = j4;
                }
                arrayList2 = new ArrayList(bundleH0.keySet());
                Collections.sort(arrayList2);
                size = arrayList2.size();
                i = 0;
                while (i < size) {
                    str4 = (String) arrayList2.get(i);
                    if (str4 != null) {
                        a1.d(d3Var3);
                        obj = bundleH0.get(str4);
                        arrayList3 = arrayList2;
                        if (obj instanceof Bundle) {
                            i13 = size;
                            bundleArr = new Bundle[]{(Bundle) obj};
                        } else {
                            i13 = size;
                            if (obj instanceof Parcelable[]) {
                                Parcelable[] parcelableArr = (Parcelable[]) obj;
                                bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                            } else if (obj instanceof ArrayList) {
                                ArrayList arrayList4 = (ArrayList) obj;
                                bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                            } else {
                                bundleArr = null;
                            }
                        }
                        if (bundleArr != null) {
                            bundleH0.putParcelableArray(str4, bundleArr);
                        }
                    } else {
                        arrayList3 = arrayList2;
                        i13 = size;
                    }
                    i++;
                    arrayList2 = arrayList3;
                    size = i13;
                }
                i10 = 0;
                i11 = 0;
                while (i11 < arrayList.size()) {
                    bundleG0 = (Bundle) arrayList.get(i11);
                    if (i11 != 0) {
                        str3 = "_ep";
                    } else {
                        str3 = str2;
                    }
                    bundleG0.putString("_o", str5);
                    if (z10) {
                        a1.d(d3Var3);
                        d3Var4 = d3Var3;
                        bundleG0 = d3Var4.g0(bundleG0);
                    } else {
                        d3Var4 = d3Var3;
                    }
                    bundle2 = bundleG0;
                    String str6 = str5;
                    i12 = i10;
                    q qVar = new q(str3, new p(bundleG0), str6, j12);
                    k2 k2VarN = a1Var.n();
                    k2VarN.getClass();
                    a1 a1Var3 = (a1) k2VarN.f159a;
                    k2VarN.c();
                    k2VarN.d();
                    a1Var3.getClass();
                    d0VarK = a1Var3.k();
                    d0VarK.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    d.a(qVar, parcelObtain, i12);
                    bArrMarshall = parcelObtain.marshall();
                    parcelObtain.recycle();
                    if (bArrMarshall.length > 131072) {
                        i0 i0Var7 = ((a1) d0VarK.f159a).f11007t;
                        a1.f(i0Var7);
                        i0Var7.f11191r.b("Event is too long for local database. Sending event directly to service");
                        zK = i12;
                    } else {
                        zK = d0VarK.k(i12, bArrMarshall);
                    }
                    k2VarN.p(new f7.f(k2VarN, k2VarN.m(true), zK, qVar, 2));
                    if (!z12) {
                        it = x1Var2.e.iterator();
                        while (it.hasNext()) {
                            ((m1) it.next()).a(new Bundle(bundle2), str, str2, j4);
                        }
                    }
                    i11++;
                    j12 = j4;
                    i10 = i12;
                    d3Var3 = d3Var4;
                    str5 = str;
                }
                a1.e(d2Var);
                if (d2Var.j(i10) == null && "_ae".equals(str2)) {
                    a1.e(t2Var);
                    bVar.getClass();
                    t2Var.f11371f.a(SystemClock.elapsedRealtime(), true, true);
                    return;
                }
            }
        }
        eVar = eVar2;
        z12 = zEquals;
        if (a1Var.c()) {
            a1.d(d3Var2);
            iY = d3Var2.Y(str2);
            if (iY != 0) {
                a1.f(i0Var4);
                i0Var4.f11192s.c(e0Var.d(str2), "Invalid event name. Event will not be logged (FE)");
                a1.d(d3Var2);
                String strJ3 = d3.j(str2, 40, true);
                if (str2 != null) {
                    length = str2.length();
                } else {
                    length = 0;
                }
                a1.d(d3Var2);
                d3.t(eVar, null, iY, "_ev", strJ3, length);
                return;
            }
            List listUnmodifiableList2 = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
            a1.d(d3Var2);
            bundleH0 = d3Var2.h0(str2, bundle, listUnmodifiableList2, z11);
            com.google.android.gms.common.internal.i0.i(bundleH0);
            a1.e(d2Var);
            if (d2Var.j(false) == null) {
                i0Var2 = i0Var4;
                j10 = 0;
            } else {
                i0Var2 = i0Var4;
                j10 = 0;
            }
            zzos.zzc();
            if (gVar.l(null, z.f11454d0)) {
                if ("auto".equals(str5)) {
                    if ("_ae".equals(str2)) {
                        a1.d(d3Var2);
                        q0 q0Var6 = ((a1) d3Var2.f159a).f11006s;
                        a1.d(q0Var6);
                        strG = q0Var6.E.g();
                        if (!TextUtils.isEmpty(strG)) {
                            bundleH0.putString("_ffr", strG);
                        }
                    }
                } else if ("_ae".equals(str2)) {
                    a1.d(d3Var2);
                    q0 q0Var7 = ((a1) d3Var2.f159a).f11006s;
                    a1.d(q0Var7);
                    strG = q0Var7.E.g();
                    if (!TextUtils.isEmpty(strG)) {
                        bundleH0.putString("_ffr", strG);
                    }
                }
            }
            arrayList = new ArrayList();
            arrayList.add(bundleH0);
            if (gVar.l(null, z.f11492y0)) {
                a1.e(t2Var);
                t2Var.c();
                zB = t2Var.f11370d;
            } else {
                a1.d(q0Var);
                zB = q0Var.B.b();
            }
            a1.d(q0Var);
            if (q0Var.f11316y.a() > j10) {
                a1.d(q0Var);
                if (q0Var.k(j4)) {
                    x1Var2 = this;
                    d3Var3 = d3Var2;
                    j11 = j10;
                } else {
                    x1Var2 = this;
                    d3Var3 = d3Var2;
                    j11 = j10;
                }
            } else {
                x1Var2 = this;
                d3Var3 = d3Var2;
                j11 = j10;
            }
            if (bundleH0.getLong("extend_session", j11) == 1) {
                a1.f(i0Var2);
                i0Var2.f11198y.b("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                a1.e(t2Var);
                j12 = j4;
                t2Var.e.k(j12, true);
            } else {
                j12 = j4;
            }
            arrayList2 = new ArrayList(bundleH0.keySet());
            Collections.sort(arrayList2);
            size = arrayList2.size();
            i = 0;
            while (i < size) {
                str4 = (String) arrayList2.get(i);
                if (str4 != null) {
                    a1.d(d3Var3);
                    obj = bundleH0.get(str4);
                    arrayList3 = arrayList2;
                    if (obj instanceof Bundle) {
                        i13 = size;
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else {
                        i13 = size;
                        if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr2, parcelableArr2.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList5 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList5.toArray(new Bundle[arrayList5.size()]);
                        } else {
                            bundleArr = null;
                        }
                    }
                    if (bundleArr != null) {
                        bundleH0.putParcelableArray(str4, bundleArr);
                    }
                } else {
                    arrayList3 = arrayList2;
                    i13 = size;
                }
                i++;
                arrayList2 = arrayList3;
                size = i13;
            }
            i10 = 0;
            i11 = 0;
            while (i11 < arrayList.size()) {
                bundleG0 = (Bundle) arrayList.get(i11);
                if (i11 != 0) {
                    str3 = "_ep";
                } else {
                    str3 = str2;
                }
                bundleG0.putString("_o", str5);
                if (z10) {
                    a1.d(d3Var3);
                    d3Var4 = d3Var3;
                    bundleG0 = d3Var4.g0(bundleG0);
                } else {
                    d3Var4 = d3Var3;
                }
                bundle2 = bundleG0;
                String str7 = str5;
                i12 = i10;
                q qVar2 = new q(str3, new p(bundleG0), str7, j12);
                k2 k2VarN2 = a1Var.n();
                k2VarN2.getClass();
                a1 a1Var4 = (a1) k2VarN2.f159a;
                k2VarN2.c();
                k2VarN2.d();
                a1Var4.getClass();
                d0VarK = a1Var4.k();
                d0VarK.getClass();
                Parcel parcelObtain2 = Parcel.obtain();
                d.a(qVar2, parcelObtain2, i12);
                bArrMarshall = parcelObtain2.marshall();
                parcelObtain2.recycle();
                if (bArrMarshall.length > 131072) {
                    i0 i0Var8 = ((a1) d0VarK.f159a).f11007t;
                    a1.f(i0Var8);
                    i0Var8.f11191r.b("Event is too long for local database. Sending event directly to service");
                    zK = i12;
                } else {
                    zK = d0VarK.k(i12, bArrMarshall);
                }
                k2VarN2.p(new f7.f(k2VarN2, k2VarN2.m(true), zK, qVar2, 2));
                if (!z12) {
                    it = x1Var2.e.iterator();
                    while (it.hasNext()) {
                        ((m1) it.next()).a(new Bundle(bundle2), str, str2, j4);
                    }
                }
                i11++;
                j12 = j4;
                i10 = i12;
                d3Var3 = d3Var4;
                str5 = str;
            }
            a1.e(d2Var);
            if (d2Var.j(i10) == null) {
            }
        }
    }

    public final void n(long j4, boolean z4) {
        c();
        d();
        a1 a1Var = (a1) this.f159a;
        i0 i0Var = a1Var.f11007t;
        a1.f(i0Var);
        i0Var.f11197x.b("Resetting analytics data (FE)");
        t2 t2Var = a1Var.f11009v;
        a1.e(t2Var);
        t2Var.c();
        s2 s2Var = t2Var.f11371f;
        s2Var.f11345c.a();
        s2Var.f11343a = 0L;
        s2Var.f11344b = 0L;
        zzqu.zzc();
        g gVar = a1Var.f11005r;
        if (gVar.l(null, z.f11463j0)) {
            a1Var.j().j();
        }
        boolean zB = a1Var.b();
        q0 q0Var = a1Var.f11006s;
        a1.d(q0Var);
        a1 a1Var2 = (a1) q0Var.f159a;
        q0Var.e.b(j4);
        q0 q0Var2 = a1Var2.f11006s;
        g gVar2 = a1Var2.f11005r;
        a1.d(q0Var2);
        if (!TextUtils.isEmpty(q0Var2.E.g())) {
            q0Var.E.h(null);
        }
        zzph.zzc();
        y yVar = z.f11455e0;
        if (gVar2.l(null, yVar)) {
            q0Var.f11316y.b(0L);
        }
        q0Var.f11317z.b(0L);
        if (!gVar2.n()) {
            q0Var.j(!zB);
        }
        q0Var.F.h(null);
        q0Var.G.b(0L);
        q0Var.H.i(null);
        if (z4) {
            k2 k2VarN = a1Var.n();
            k2VarN.c();
            a1 a1Var3 = (a1) k2VarN.f159a;
            k2VarN.d();
            f3 f3VarM = k2VarN.m(false);
            a1Var3.getClass();
            a1Var3.k().h();
            k2VarN.p(new f2(k2VarN, f3VarM, 0));
        }
        zzph.zzc();
        if (gVar.l(null, yVar)) {
            a1.e(t2Var);
            t2Var.e.j();
        }
        this.f11433x = !zB;
    }

    public final void o(Bundle bundle, long j4) {
        a1 a1Var = (a1) this.f159a;
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11193t.b("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        k1.a(bundle2, "app_id", String.class, null);
        k1.a(bundle2, "origin", String.class, null);
        k1.a(bundle2, "name", String.class, null);
        k1.a(bundle2, "value", Object.class, null);
        k1.a(bundle2, "trigger_event_name", String.class, null);
        k1.a(bundle2, "trigger_timeout", Long.class, 0L);
        k1.a(bundle2, "timed_out_event_name", String.class, null);
        k1.a(bundle2, "timed_out_event_params", Bundle.class, null);
        k1.a(bundle2, "triggered_event_name", String.class, null);
        k1.a(bundle2, "triggered_event_params", Bundle.class, null);
        k1.a(bundle2, "time_to_live", Long.class, 0L);
        k1.a(bundle2, "expired_event_name", String.class, null);
        k1.a(bundle2, "expired_event_params", Bundle.class, null);
        com.google.android.gms.common.internal.i0.e(bundle2.getString("name"));
        com.google.android.gms.common.internal.i0.e(bundle2.getString("origin"));
        com.google.android.gms.common.internal.i0.i(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j4);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        d3 d3Var = a1Var.f11010w;
        d3 d3Var2 = a1Var.f11010w;
        e0 e0Var = a1Var.f11011x;
        i0 i0Var2 = a1Var.f11007t;
        a1.d(d3Var);
        if (d3Var.b0(string) != 0) {
            a1.f(i0Var2);
            i0Var2.f11190f.c(e0Var.f(string), "Invalid conditional user property name");
            return;
        }
        a1.d(d3Var2);
        if (d3Var2.X(obj, string) != 0) {
            a1.f(i0Var2);
            i0Var2.f11190f.d(e0Var.f(string), "Invalid conditional user property value", obj);
            return;
        }
        a1.d(d3Var2);
        Object objH = d3Var2.h(obj, string);
        if (objH == null) {
            a1.f(i0Var2);
            i0Var2.f11190f.d(e0Var.f(string), "Unable to normalize conditional user property value", obj);
            return;
        }
        k1.g(objH, bundle2);
        long j10 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j10 > 15552000000L || j10 < 1)) {
            a1.f(i0Var2);
            i0Var2.f11190f.d(e0Var.f(string), "Invalid conditional user property timeout", Long.valueOf(j10));
            return;
        }
        long j11 = bundle2.getLong("time_to_live");
        if (j11 > 15552000000L || j11 < 1) {
            a1.f(i0Var2);
            i0Var2.f11190f.d(e0Var.f(string), "Invalid conditional user property time to live", Long.valueOf(j11));
        } else {
            z0 z0Var = a1Var.f11008u;
            a1.f(z0Var);
            z0Var.l(new o1(this, bundle2, 1));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:48:0x00db
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void p(z7.j1 r13, long r14) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.x1.p(z7.j1, long):void");
    }

    public final void q(Bundle bundle, int i, long j4) {
        Object obj;
        String string;
        a1 a1Var = (a1) this.f159a;
        d();
        j1 j1Var = j1.f11214c;
        i1[] i1VarArrValues = i1.values();
        int length = i1VarArrValues.length;
        int i10 = 0;
        while (true) {
            obj = null;
            if (i10 >= length) {
                break;
            }
            i1 i1Var = i1VarArrValues[i10];
            if (bundle.containsKey(i1Var.f11202a) && (string = bundle.getString(i1Var.f11202a)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i10++;
        }
        if (obj != null) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11195v.c(obj, "Ignoring invalid consent setting");
            i0 i0Var2 = a1Var.f11007t;
            a1.f(i0Var2);
            i0Var2.f11195v.b("Valid consent values are 'granted', 'denied'");
        }
        p(j1.a(i, bundle), j4);
    }

    public final void r(j1 j1Var) {
        c();
        boolean z4 = (j1Var.f(i1.ANALYTICS_STORAGE) && j1Var.f(i1.AD_STORAGE)) || ((a1) this.f159a).n().k();
        a1 a1Var = (a1) this.f159a;
        z0 z0Var = a1Var.f11008u;
        a1.f(z0Var);
        z0Var.c();
        if (z4 != a1Var.O) {
            a1 a1Var2 = (a1) this.f159a;
            z0 z0Var2 = a1Var2.f11008u;
            a1.f(z0Var2);
            z0Var2.c();
            a1Var2.O = z4;
            q0 q0Var = ((a1) this.f159a).f11006s;
            a1.d(q0Var);
            q0Var.c();
            Boolean boolValueOf = q0Var.g().contains("measurement_enabled_from_api") ? Boolean.valueOf(q0Var.g().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z4 || boolValueOf == null || boolValueOf.booleanValue()) {
                u(Boolean.valueOf(z4), false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void s(String str, String str2, Object obj, boolean z4, long j4) {
        int iB0;
        int length;
        a1 a1Var = (a1) this.f159a;
        if (z4) {
            d3 d3Var = a1Var.f11010w;
            a1.d(d3Var);
            iB0 = d3Var.b0(str2);
        } else {
            d3 d3Var2 = a1Var.f11010w;
            a1.d(d3Var2);
            if (!d3Var2.J("user property", str2)) {
                iB0 = 6;
            } else if (d3Var2.G("user property", k1.i, null, str2)) {
                ((a1) d3Var2.f159a).getClass();
                if (d3Var2.E(24, "user property", str2)) {
                    iB0 = 0;
                } else {
                    iB0 = 6;
                }
            } else {
                iB0 = 15;
            }
        }
        q3.e eVar = this.f11434y;
        if (iB0 != 0) {
            a1.d(a1Var.f11010w);
            String strJ = d3.j(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            a1.d(a1Var.f11010w);
            d3.t(eVar, null, iB0, "_ev", strJ, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            z0 z0Var = a1Var.f11008u;
            a1.f(z0Var);
            z0Var.l(new d1(this, str3, str2, null, j4, 1));
            return;
        }
        d3 d3Var3 = a1Var.f11010w;
        d3 d3Var4 = a1Var.f11010w;
        a1.d(d3Var3);
        int iX = d3Var3.X(obj, str2);
        if (iX != 0) {
            a1.d(d3Var4);
            String strJ2 = d3.j(str2, 24, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            a1.d(d3Var4);
            d3.t(eVar, null, iX, "_ev", strJ2, length);
            return;
        }
        a1.d(d3Var4);
        Object objH = d3Var4.h(obj, str2);
        if (objH != null) {
            z0 z0Var2 = a1Var.f11008u;
            a1.f(z0Var2);
            z0Var2.l(new d1(this, str3, str2, objH, j4, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x005b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    public final void t(long j4, Object obj, String str, String str2) {
        Object obj2;
        String str3;
        boolean zK;
        Object objValueOf = obj;
        a1 a1Var = (a1) this.f159a;
        com.google.android.gms.common.internal.i0.e(str);
        com.google.android.gms.common.internal.i0.e(str2);
        c();
        d();
        if ("allow_personalized_ads".equals(str2)) {
            if (objValueOf instanceof String) {
                String str4 = (String) objValueOf;
                if (!TextUtils.isEmpty(str4)) {
                    long j10 = true != "false".equals(str4.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    objValueOf = Long.valueOf(j10);
                    q0 q0Var = a1Var.f11006s;
                    a1.d(q0Var);
                    q0Var.f11314w.h(j10 == 1 ? "true" : "false");
                } else if (objValueOf == null) {
                    q0 q0Var2 = a1Var.f11006s;
                    a1.d(q0Var2);
                    q0Var2.f11314w.h("unset");
                } else {
                    obj2 = objValueOf;
                    str3 = str2;
                }
            } else if (objValueOf == null) {
                q0 q0Var3 = a1Var.f11006s;
                a1.d(q0Var3);
                q0Var3.f11314w.h("unset");
            } else {
                obj2 = objValueOf;
                str3 = str2;
            }
            obj2 = objValueOf;
            str3 = "_npa";
        } else {
            obj2 = objValueOf;
            str3 = str2;
        }
        if (!a1Var.b()) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11198y.b("User property not set since app measurement is disabled");
            return;
        }
        if (a1Var.c()) {
            a3 a3Var = new a3(j4, obj2, str3, str);
            k2 k2VarN = a1Var.n();
            k2VarN.c();
            a1 a1Var2 = (a1) k2VarN.f159a;
            k2VarN.d();
            a1Var2.getClass();
            d0 d0VarK = a1Var2.k();
            d0VarK.getClass();
            Parcel parcelObtain = Parcel.obtain();
            d.b(a3Var, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                i0 i0Var2 = ((a1) d0VarK.f159a).f11007t;
                a1.f(i0Var2);
                i0Var2.f11191r.b("User property too long for local database. Sending directly to service");
                zK = false;
            } else {
                zK = d0VarK.k(1, bArrMarshall);
            }
            k2VarN.p(new f7.f(k2VarN, k2VarN.m(true), zK, a3Var, 1));
        }
    }

    public final void u(Boolean bool, boolean z4) {
        c();
        d();
        a1 a1Var = (a1) this.f159a;
        i0 i0Var = a1Var.f11007t;
        a1.f(i0Var);
        i0Var.f11197x.c(bool, "Setting app measurement enabled (FE)");
        q0 q0Var = a1Var.f11006s;
        a1.d(q0Var);
        q0Var.c();
        SharedPreferences.Editor editorEdit = q0Var.g().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z4) {
            q0 q0Var2 = a1Var.f11006s;
            a1.d(q0Var2);
            q0Var2.c();
            SharedPreferences.Editor editorEdit2 = q0Var2.g().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        z0 z0Var = a1Var.f11008u;
        a1.f(z0Var);
        z0Var.c();
        if (a1Var.O || !(bool == null || bool.booleanValue())) {
            v();
        }
    }

    public final void v() {
        c();
        a1 a1Var = (a1) this.f159a;
        q0 q0Var = a1Var.f11006s;
        i0 i0Var = a1Var.f11007t;
        n7.b bVar = a1Var.f11012y;
        a1.d(q0Var);
        String strG = q0Var.f11314w.g();
        if (strG != null) {
            if ("unset".equals(strG)) {
                bVar.getClass();
                t(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strG) ? 0L : 1L);
                bVar.getClass();
                t(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!a1Var.b() || !this.f11433x) {
            a1.f(i0Var);
            i0Var.f11197x.b("Updating Scion state (FE)");
            k2 k2VarN = a1Var.n();
            k2VarN.c();
            k2VarN.d();
            k2VarN.p(new f2(k2VarN, k2VarN.m(true), 2));
            return;
        }
        a1.f(i0Var);
        i0Var.f11197x.b("Recording app launch after enabling measurement for the first time (FE)");
        z();
        zzph.zzc();
        if (a1Var.f11005r.l(null, z.f11455e0)) {
            t2 t2Var = a1Var.f11009v;
            a1.e(t2Var);
            t2Var.e.j();
        }
        z0 z0Var = a1Var.f11008u;
        a1.f(z0Var);
        z0Var.l(new p1(this, 1));
    }

    public final String w() {
        return (String) this.f11427r.get();
    }

    public final void z() {
        c();
        d();
        a1 a1Var = (a1) this.f159a;
        boolean zC = a1Var.c();
        g gVar = a1Var.f11005r;
        if (zC) {
            if (gVar.l(null, z.Y)) {
                ((a1) gVar.f159a).getClass();
                Boolean boolK = gVar.k("google_analytics_deferred_deep_link_enabled");
                if (boolK != null && boolK.booleanValue()) {
                    i0 i0Var = a1Var.f11007t;
                    a1.f(i0Var);
                    i0Var.f11197x.b("Deferred Deep Link feature enabled.");
                    z0 z0Var = a1Var.f11008u;
                    a1.f(z0Var);
                    z0Var.l(new p1(this, 0));
                }
            }
            k2 k2VarN = a1Var.n();
            k2VarN.c();
            k2VarN.d();
            f3 f3VarM = k2VarN.m(true);
            ((a1) k2VarN.f159a).k().k(3, new byte[0]);
            k2VarN.p(new f2(k2VarN, f3VarM, 1));
            this.f11433x = false;
            q0 q0Var = a1Var.f11006s;
            a1.d(q0Var);
            q0Var.c();
            String string = q0Var.g().getString("previous_os_version", null);
            ((a1) q0Var.f159a).i().e();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = q0Var.g().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            a1Var.i().e();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            k("auto", "_ou", bundle);
        }
    }
}
