package da;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.api.internal.h0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import fa.d0;
import fa.e0;
import fa.i0;
import fa.j0;
import fa.m0;
import fa.r1;
import fa.s0;
import fa.s1;
import fa.t0;
import fa.t1;
import fa.u0;
import fa.v0;
import fa.w0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final i f3124r = new i(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f3126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aa.c f3127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bd.v f3128d;
    public final a3.j e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z f3129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ia.b f3130g;
    public final a h;
    public final ea.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final aa.b f3131j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ba.a f3132k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f3133l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bd.v f3134m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u f3135n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TaskCompletionSource f3136o = new TaskCompletionSource();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TaskCompletionSource f3137p = new TaskCompletionSource();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TaskCompletionSource f3138q = new TaskCompletionSource();

    public p(Context context, a3.j jVar, z zVar, h0 h0Var, ia.b bVar, aa.c cVar, a aVar, bd.v vVar, ea.c cVar2, bd.v vVar2, aa.b bVar2, ba.a aVar2, l lVar) {
        new AtomicBoolean(false);
        this.f3125a = context;
        this.e = jVar;
        this.f3129f = zVar;
        this.f3126b = h0Var;
        this.f3130g = bVar;
        this.f3127c = cVar;
        this.h = aVar;
        this.f3128d = vVar;
        this.i = cVar2;
        this.f3131j = bVar2;
        this.f3132k = aVar2;
        this.f3133l = lVar;
        this.f3134m = vVar2;
    }

    public static void a(p pVar, String str) {
        Integer num;
        pVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strB = u3.b.b("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strB, null);
        }
        Locale locale = Locale.US;
        z zVar = pVar.f3129f;
        a aVar = pVar.h;
        u0 u0Var = new u0(zVar.f3173c, aVar.f3086f, aVar.f3087g, zVar.b().f3095a, v.b(aVar.f3085d != null ? 4 : 1), aVar.h);
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        w0 w0Var = new w0(h.h());
        Context context = pVar.f3125a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        g gVar = g.f3103a;
        String str4 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str4)) {
            g gVar2 = (g) g.f3104b.get(str4.toLowerCase(locale));
            if (gVar2 != null) {
                gVar = gVar2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int iOrdinal = gVar.ordinal();
        String str5 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jB = h.b(context);
        boolean zG = h.g();
        int iD = h.d();
        String str6 = Build.MANUFACTURER;
        String str7 = Build.PRODUCT;
        pVar.f3131j.d(str, jCurrentTimeMillis, new t0(u0Var, w0Var, new v0(iOrdinal, iAvailableProcessors, jB, blockCount, zG, iD)));
        ea.c cVar = pVar.i;
        ((ea.a) cVar.f3510b).c();
        cVar.f3510b = ea.c.f3508c;
        if (str != null) {
            cVar.f3510b = new ea.k(((ia.b) cVar.f3509a).b(str, "userlog"));
        }
        pVar.f3133l.b(str);
        bd.v vVar = pVar.f3134m;
        t tVar = (t) vVar.f1682c;
        Charset charset = s1.f3842a;
        fa.w wVar = new fa.w();
        wVar.f3865a = "18.4.3";
        a aVar2 = tVar.f3158c;
        String str8 = aVar2.f3082a;
        if (str8 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        wVar.f3866b = str8;
        z zVar2 = tVar.f3157b;
        String str9 = zVar2.b().f3095a;
        if (str9 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        wVar.f3867c = str9;
        wVar.f3868d = zVar2.b().f3096b;
        String str10 = aVar2.f3086f;
        if (str10 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        wVar.f3869f = str10;
        String str11 = aVar2.f3087g;
        if (str11 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        wVar.f3870g = str11;
        wVar.h = 4;
        b9.j jVar = new b9.j();
        jVar.f1473f = Boolean.FALSE;
        jVar.f1472d = Long.valueOf(jCurrentTimeMillis);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        jVar.f1470b = str;
        String str12 = t.f3155g;
        if (str12 == null) {
            throw new NullPointerException("Null generator");
        }
        jVar.f1469a = str12;
        String str13 = zVar2.f3173c;
        if (str13 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str14 = zVar2.b().f3095a;
        aa.c cVar2 = aVar2.h;
        if (((a5.g) cVar2.f264c) == null) {
            cVar2.f264c = new a5.g(cVar2);
        }
        a5.g gVar3 = (a5.g) cVar2.f264c;
        String str15 = gVar3.f199a;
        if (gVar3 == null) {
            cVar2.f264c = new a5.g(cVar2);
        }
        jVar.f1474g = new e0(str13, str10, str11, str14, str15, ((a5.g) cVar2.f264c).f200b);
        gb.r rVar = new gb.r();
        rVar.f4495c = 3;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        rVar.f4493a = str2;
        if (str3 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        rVar.f4496d = str3;
        rVar.f4494b = Boolean.valueOf(h.h());
        jVar.i = rVar.b();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str4) && (num = (Integer) t.f3154f.get(str4.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jB2 = h.b(tVar.f3156a);
        long blockSize = ((long) statFs2.getBlockSize()) * ((long) statFs2.getBlockCount());
        boolean zG2 = h.g();
        int iD2 = h.d();
        c3.j jVar2 = new c3.j();
        jVar2.f1759a = Integer.valueOf(iIntValue);
        if (str5 == null) {
            throw new NullPointerException("Null model");
        }
        jVar2.f1760b = str5;
        jVar2.f1761c = Integer.valueOf(iAvailableProcessors2);
        jVar2.f1762d = Long.valueOf(jB2);
        jVar2.e = Long.valueOf(blockSize);
        jVar2.f1763f = Boolean.valueOf(zG2);
        jVar2.f1764g = Integer.valueOf(iD2);
        if (str6 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        jVar2.h = str6;
        if (str7 == null) {
            throw new NullPointerException("Null modelClass");
        }
        jVar2.i = str7;
        jVar.f1475j = jVar2.b();
        jVar.f1477l = 3;
        wVar.i = jVar.b();
        fa.x xVarB = wVar.b();
        ia.b bVar = ((ia.a) vVar.f1681b).f5242b;
        r1 r1Var = xVarB.f3879j;
        if (r1Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str16 = ((d0) r1Var).f3709b;
        try {
            ia.a.f5240g.getClass();
            ia.a.f(bVar.b(str16, "report"), ga.c.f4427a.f(xVarB));
            File fileB = bVar.b(str16, "start-time");
            long j4 = ((d0) r1Var).f3711d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileB), ia.a.e);
            try {
                outputStreamWriter.write("");
                fileB.setLastModified(j4 * 1000);
                outputStreamWriter.close();
            } catch (Throwable th) {
                try {
                    outputStreamWriter.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e) {
            String strB2 = u3.b.b("Could not persist report for session ", str16);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strB2, e);
            }
        }
    }

    public static Task b(p pVar) {
        Task taskCall;
        pVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : ia.b.e(pVar.f3130g.f5246b.listFiles(f3124r))) {
            try {
                long j4 = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    taskCall = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new o(pVar, j4));
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0040 A[LOOP:0: B:15:0x0038->B:17:0x0040, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[SYNTHETIC] */
    public static String e() throws IOException {
        InputStream resourceAsStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i;
        ClassLoader classLoader = p.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
            if (resourceAsStream == null) {
                Log.i("FirebaseCrashlytics", "No version control information found", null);
            }
            if (resourceAsStream == null) {
                return null;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info", null);
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            bArr = new byte[1024];
            while (true) {
                i = resourceAsStream.read(bArr);
                if (i != -1) {
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        }
        resourceAsStream = null;
        if (resourceAsStream == null) {
            return null;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Read version control info", null);
        }
        byteArrayOutputStream = new ByteArrayOutputStream();
        bArr = new byte[1024];
        while (true) {
            i = resourceAsStream.read(bArr);
            if (i != -1) {
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0498  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
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
    public final void c(boolean z4, c3.j jVar) throws Throwable {
        bd.v vVar;
        int i;
        boolean z10;
        Object obj;
        String strSubstring;
        boolean z11;
        ApplicationExitInfo next;
        String string;
        t1 t1Var;
        aa.b bVar = this.f3131j;
        bd.v vVar2 = this.f3134m;
        ArrayList arrayList = new ArrayList(((ia.a) vVar2.f1681b).c());
        ?? r10 = 0;
        r10 = 0;
        r10 = 0;
        r10 = 0;
        if (arrayList.size() <= z4) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str = (String) arrayList.get(z4 ? 1 : 0);
        if (jVar.h().f6130b.f6127b) {
            ia.b bVar2 = this.f3130g;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f3125a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    ea.c cVar = new ea.c(bVar2);
                    cVar.f3510b = ea.c.f3508c;
                    if (str != null) {
                        cVar.f3510b = new ea.k(bVar2.b(str, "userlog"));
                    }
                    a3.j jVar2 = this.e;
                    ea.d dVar = new ea.d(bVar2);
                    bd.v vVar3 = new bd.v(str, bVar2, jVar2);
                    ((ea.b) ((AtomicMarkableReference) ((com.bumptech.glide.manager.q) vVar3.e).f1933b).getReference()).b(dVar.b(str, false));
                    ((ea.b) ((AtomicMarkableReference) ((com.bumptech.glide.manager.q) vVar3.f1684f).f1933b).getReference()).b(dVar.b(str, true));
                    ((AtomicMarkableReference) vVar3.f1685g).set(dVar.c(str), false);
                    ia.a aVar = (ia.a) vVar2.f1681b;
                    long jLastModified = aVar.f5242b.b(str, "start-time").lastModified();
                    Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                            if (next.getTimestamp() < jLastModified) {
                            }
                        }
                        next = null;
                        break;
                    } while (next.getReason() != 6);
                    if (next == null) {
                        String strB = u3.b.b("No relevant ApplicationExitInfo occurred during session: ", str);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strB, null);
                        }
                        vVar = vVar2;
                    } else {
                        t tVar = (t) vVar2.f1682c;
                        try {
                            InputStream traceInputStream = next.getTraceInputStream();
                            if (traceInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[8192];
                                while (true) {
                                    int i11 = traceInputStream.read(bArr);
                                    InputStream inputStream = traceInputStream;
                                    if (i11 == -1) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i11);
                                    traceInputStream = inputStream;
                                    string = null;
                                }
                                string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                            } else {
                                string = null;
                            }
                        } catch (IOException e) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + next.toString() + " Error: " + e, null);
                        }
                        c3.j jVar3 = new c3.j();
                        jVar3.f1762d = Integer.valueOf(next.getImportance());
                        String processName = next.getProcessName();
                        if (processName == null) {
                            throw new NullPointerException("Null processName");
                        }
                        jVar3.f1760b = processName;
                        jVar3.f1761c = Integer.valueOf(next.getReason());
                        jVar3.f1764g = Long.valueOf(next.getTimestamp());
                        jVar3.f1759a = Integer.valueOf(next.getPid());
                        jVar3.e = Long.valueOf(next.getPss());
                        jVar3.f1763f = Long.valueOf(next.getRss());
                        jVar3.h = string;
                        fa.y yVarA = jVar3.a();
                        int i12 = tVar.f3156a.getResources().getConfiguration().orientation;
                        bd.u uVar = new bd.u(1);
                        uVar.f1676b = "anr";
                        long j4 = yVarA.f3887g;
                        uVar.f1677c = Long.valueOf(j4);
                        a aVar2 = tVar.f3158c;
                        if (!tVar.e.h().f6130b.f6128c || aVar2.f3084c.size() <= 0) {
                            vVar = vVar2;
                            t1Var = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = aVar2.f3084c;
                            int size = arrayList3.size();
                            int i13 = 0;
                            while (i13 < size) {
                                Object obj2 = arrayList3.get(i13);
                                int i14 = i13 + 1;
                                int i15 = size;
                                e eVar = (e) obj2;
                                String str2 = eVar.f3098a;
                                if (str2 == null) {
                                    throw new NullPointerException("Null libraryName");
                                }
                                ArrayList arrayList4 = arrayList3;
                                String str3 = eVar.f3099b;
                                if (str3 == null) {
                                    throw new NullPointerException("Null arch");
                                }
                                String str4 = eVar.f3100c;
                                if (str4 == null) {
                                    throw new NullPointerException("Null buildId");
                                }
                                arrayList2.add(new fa.z(str3, str2, str4));
                                i13 = i14;
                                size = i15;
                                arrayList3 = arrayList4;
                                vVar2 = vVar2;
                            }
                            vVar = vVar2;
                            t1Var = new t1(arrayList2);
                        }
                        c3.j jVar4 = new c3.j();
                        jVar4.f1762d = Integer.valueOf(yVarA.f3885d);
                        String str5 = yVarA.f3883b;
                        if (str5 == null) {
                            throw new NullPointerException("Null processName");
                        }
                        jVar4.f1760b = str5;
                        jVar4.f1761c = Integer.valueOf(yVarA.f3884c);
                        jVar4.f1764g = Long.valueOf(j4);
                        jVar4.f1759a = Integer.valueOf(yVarA.f3882a);
                        jVar4.e = Long.valueOf(yVarA.e);
                        jVar4.f1763f = Long.valueOf(yVarA.f3886f);
                        jVar4.h = yVarA.h;
                        jVar4.i = t1Var;
                        fa.y yVarA2 = jVar4.a();
                        uVar.f1678d = new i0(new j0(null, null, yVarA2, new m0("0", "0", 0L), tVar.a()), null, null, Boolean.valueOf(yVarA2.f3885d != 100), i12);
                        uVar.e = tVar.b(i12);
                        fa.h0 h0VarB = uVar.b();
                        String strB2 = u3.b.b("Persisting anr for session ", str);
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", strB2, null);
                        }
                        aVar.d(bd.v.a(h0VarB, cVar, vVar3), str, true);
                    }
                    i = 2;
                } else {
                    vVar = vVar2;
                    String strB3 = u3.b.b("No ApplicationExitInfo available. Session: ", str);
                    i = 2;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        r10 = 0;
                        Log.v("FirebaseCrashlytics", strB3, null);
                    }
                }
                r10 = 0;
            } else {
                vVar = vVar2;
                i = 2;
                String strF = v.f(i10, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strF, null);
                }
            }
        } else {
            vVar = vVar2;
            i = 2;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
            }
        }
        if (bVar.c(str)) {
            String strB4 = u3.b.b("Finalizing native report for session ", str);
            if (Log.isLoggable("FirebaseCrashlytics", i)) {
                Log.v("FirebaseCrashlytics", strB4, r10);
            }
            bVar.a(str).getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str, r10);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str, r10);
            Log.w("FirebaseCrashlytics", "No native core present", r10);
        }
        if (z4 != 0) {
            z10 = false;
            obj = (String) arrayList.get(0);
        } else {
            z10 = false;
            this.f3133l.b(r10);
            obj = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        ia.a aVar3 = (ia.a) vVar.f1681b;
        ia.b bVar3 = aVar3.f5242b;
        bVar3.getClass();
        File file = bVar3.f5245a;
        ia.b.a(new File(file, ".com.google.firebase.crashlytics"));
        ia.b.a(new File(file, ".com.google.firebase.crashlytics-ndk"));
        if (Build.VERSION.SDK_INT >= 28) {
            ia.b.a(new File(file, ".com.google.firebase.crashlytics.files.v1"));
        }
        NavigableSet<String> navigableSetC = aVar3.c();
        if (obj != null) {
            navigableSetC.remove(obj);
        }
        if (navigableSetC.size() > 8) {
            while (navigableSetC.size() > 8) {
                String str6 = (String) navigableSetC.last();
                String strB5 = u3.b.b("Removing session over cap: ", str6);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", strB5, null);
                }
                ia.b.d(new File(bVar3.f5247c, str6));
                navigableSetC.remove(str6);
            }
        }
        for (String str7 : navigableSetC) {
            String strB6 = u3.b.b("Finalizing report for session ", str7);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strB6, null);
            }
            ga.c cVar2 = ia.a.f5240g;
            i iVar = ia.a.i;
            File file2 = new File(bVar3.f5247c, str7);
            file2.mkdirs();
            List<File> listE = ia.b.e(file2.listFiles(iVar));
            if (listE.isEmpty()) {
                String strI = v.i("Session ", str7, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strI, null);
                }
            } else {
                Collections.sort(listE);
                ArrayList arrayList5 = new ArrayList();
                boolean z12 = z10;
                for (File file3 : listE) {
                    try {
                        String strE = ia.a.e(file3);
                        cVar2.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(strE));
                            try {
                                fa.h0 h0VarE = ga.c.e(jsonReader);
                                jsonReader.close();
                                arrayList5.add(h0VarE);
                                if (z12) {
                                    z11 = true;
                                } else {
                                    String name = file3.getName();
                                    if (name.startsWith("event") && name.endsWith("_")) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                }
                                z12 = z11;
                            } catch (Throwable th) {
                                try {
                                    jsonReader.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IllegalStateException e4) {
                            throw new IOException(e4);
                        }
                    } catch (IOException e10) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file3, e10);
                    }
                }
                if (arrayList5.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str7, null);
                } else {
                    String strC = new ea.d(bVar3).c(str7);
                    k kVar = aVar3.f5244d.f3114b;
                    synchronized (kVar) {
                        if (Objects.equals(kVar.f3111b, str7)) {
                            strSubstring = kVar.f3112c;
                        } else {
                            ia.b bVar4 = kVar.f3110a;
                            i iVar2 = k.f3109d;
                            File file4 = new File(bVar4.f5247c, str7);
                            file4.mkdirs();
                            List listE2 = ia.b.e(file4.listFiles(iVar2));
                            if (listE2.isEmpty()) {
                                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
                                strSubstring = null;
                            } else {
                                strSubstring = ((File) Collections.min(listE2, k.e)).getName().substring(4);
                            }
                        }
                    }
                    File fileB = bVar3.b(str7, "report");
                    try {
                        String strE2 = ia.a.e(fileB);
                        cVar2.getClass();
                        fa.x xVarH = ga.c.h(strE2);
                        fa.w wVarA = xVarH.a();
                        r1 r1Var = xVarH.f3879j;
                        if (r1Var != null) {
                            b9.j jVarA = r1Var.a();
                            jVarA.e = Long.valueOf(jCurrentTimeMillis);
                            jVarA.f1473f = Boolean.valueOf(z12);
                            if (strC != null) {
                                jVarA.h = new s0(strC);
                            }
                            wVarA.i = jVarA.b();
                        }
                        fa.x xVarB = wVarA.b();
                        fa.w wVarA2 = xVarB.a();
                        wVarA2.e = strSubstring;
                        r1 r1Var2 = xVarB.f3879j;
                        if (r1Var2 != null) {
                            b9.j jVarA2 = r1Var2.a();
                            jVarA2.f1471c = strSubstring;
                            wVarA2.i = jVarA2.b();
                        }
                        fa.x xVarB2 = wVarA2.b();
                        t1 t1Var2 = new t1(arrayList5);
                        r1 r1Var3 = xVarB2.f3879j;
                        if (r1Var3 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        fa.w wVarA3 = xVarB2.a();
                        b9.j jVarA3 = r1Var3.a();
                        jVarA3.f1476k = t1Var2;
                        wVarA3.i = jVarA3.b();
                        fa.x xVarB3 = wVarA3.b();
                        r1 r1Var4 = xVarB3.f3879j;
                        if (r1Var4 != null) {
                            String str8 = "appQualitySessionId: " + strSubstring;
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    try {
                                        Log.d("FirebaseCrashlytics", str8, null);
                                    } catch (IOException e11) {
                                        e = e11;
                                        Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileB, e);
                                    }
                                }
                                ia.a.f(z12 ? new File(bVar3.e, ((d0) r1Var4).f3709b) : new File(bVar3.f5248d, ((d0) r1Var4).f3709b), ga.c.f4427a.f(xVarB3));
                            } catch (IOException e12) {
                                e = e12;
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileB, e);
                            }
                        }
                        e = e11;
                    } catch (IOException e13) {
                        e = e13;
                    }
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileB, e);
                }
                ia.b.d(new File(bVar3.f5247c, str7));
                z10 = false;
            }
            ia.b.d(new File(bVar3.f5247c, str7));
            z10 = false;
        }
        t2.m mVar = aVar3.f5243c.h().f6129a;
        ArrayList arrayListB = aVar3.b();
        int size2 = arrayListB.size();
        if (size2 <= 4) {
            return;
        }
        Iterator it2 = arrayListB.subList(4, size2).iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    public final boolean d(c3.j jVar) throws Throwable {
        if (!Boolean.TRUE.equals(((ThreadLocal) this.e.f110d).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        u uVar = this.f3135n;
        if (uVar != null && uVar.e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            c(true, jVar);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final void f() {
        try {
            String strE = e();
            if (strE != null) {
                try {
                    this.f3128d.o(strE);
                } catch (IllegalArgumentException e) {
                    Context context = this.f3125a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e4) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e4);
        }
    }

    public final Task g(Task task) {
        Task task2;
        Task task3;
        TaskCompletionSource taskCompletionSource = this.f3136o;
        ia.b bVar = ((ia.a) this.f3134m.f1681b).f5242b;
        if (ia.b.e(bVar.f5248d.listFiles()).isEmpty() && ia.b.e(bVar.e.listFiles()).isEmpty() && ia.b.e(bVar.f5249f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        aa.d dVar = aa.d.f265a;
        dVar.c("Crash reports are available to be sent.");
        h0 h0Var = this.f3126b;
        if (h0Var.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            dVar.b("Automatic data collection is disabled.");
            dVar.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (h0Var.f2116c) {
                task2 = ((TaskCompletionSource) h0Var.f2117d).getTask();
            }
            Task taskOnSuccessTask = task2.onSuccessTask(new z9.c());
            dVar.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.f3137p.getTask();
            ExecutorService executorService = c0.f3097a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            b0 b0Var = new b0(taskCompletionSource2, 1);
            taskOnSuccessTask.continueWith(b0Var);
            task4.continueWith(b0Var);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new aa.c(this, task, 18, false));
    }
}
