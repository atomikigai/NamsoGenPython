package s5;

import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.api.internal.h0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import da.a0;
import da.b0;
import da.c0;
import da.p;
import da.r;
import da.u;
import da.v;
import da.z;
import h6.o0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import lb.q;
import x9.m;
import x9.o;
import x9.s;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements g, ya.a, x9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8433a;

    public /* synthetic */ e(int i) {
        this.f8433a = i;
    }

    public static /* bridge */ /* synthetic */ TopicsManager c(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return TopicsManager.class;
    }

    @Override // s5.g
    public Object apply(Object obj) {
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorRawQuery.moveToNext()) {
                a2.l lVarA = l5.i.a();
                lVarA.K(cursorRawQuery.getString(1));
                lVarA.f45d = v5.a.b(cursorRawQuery.getInt(2));
                String string = cursorRawQuery.getString(3);
                lVarA.f44c = string == null ? null : Base64.decode(string, 0);
                arrayList.add(lVarA.h());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0368  */
    /* JADX WARN: Code duplicated, block: B:105:0x036e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0391 A[LOOP:3: B:108:0x038f->B:109:0x0391, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:113:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:115:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:116:0x03be  */
    /* JADX WARN: Code duplicated, block: B:122:0x0456  */
    /* JADX WARN: Code duplicated, block: B:124:0x045d  */
    /* JADX WARN: Code duplicated, block: B:141:0x04de  */
    /* JADX WARN: Code duplicated, block: B:144:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:146:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:147:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:175:0x0610  */
    /* JADX WARN: Code duplicated, block: B:177:0x0619  */
    /* JADX WARN: Code duplicated, block: B:189:0x0642  */
    /* JADX WARN: Code duplicated, block: B:194:0x0696  */
    /* JADX WARN: Code duplicated, block: B:214:0x0478 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x037d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0273  */
    /* JADX WARN: Code duplicated, block: B:83:0x027d  */
    /* JADX WARN: Code duplicated, block: B:85:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:91:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:94:0x0309  */
    /* JADX WARN: Code duplicated, block: B:96:0x0345  */
    /* JADX WARN: Code duplicated, block: B:98:0x034d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0356  */
    @Override // x9.e
    public Object d(s sVar) {
        Boolean boolValueOf;
        h0 h0Var;
        int i;
        Throwable th;
        String strB;
        int size;
        int i10;
        da.a aVarA;
        String str;
        ExecutorService executorServiceA;
        String str2;
        String str3;
        String strC;
        b9.e eVar;
        e7.i iVar;
        ib.c cVar;
        String strI;
        a0 a0Var;
        int iE;
        String string;
        String[] strArr;
        ArrayList arrayList;
        int i11;
        StringBuilder sb2;
        int size2;
        int i12;
        String string2;
        String str4;
        String strI2;
        int i13;
        c3.j jVar;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        int i14;
        int i15;
        ka.b bVarD;
        h0 h0Var2;
        ExecutorService executorService;
        Task taskOnSuccessTask;
        Context context;
        boolean z4;
        String str5;
        String str6;
        c3.j jVar2;
        boolean z10;
        boolean zExists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        ka.b bVarD2;
        String str7;
        String string3;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f8433a) {
            case 13:
                return (ScheduledExecutorService) ExecutorsRegistrar.f2719a.get();
            case 14:
                return (ScheduledExecutorService) ExecutorsRegistrar.f2721c.get();
            case 15:
                return (ScheduledExecutorService) ExecutorsRegistrar.f2720b.get();
            case 16:
                m mVar = ExecutorsRegistrar.f2719a;
                return y9.l.f10666a;
            case 17:
                int i16 = CrashlyticsRegistrar.f2723a;
                n9.g gVar = (n9.g) sVar.a(n9.g.class);
                o oVarG = sVar.g(aa.b.class);
                o oVarG2 = sVar.g(r9.b.class);
                za.d dVar = (za.d) sVar.a(za.d.class);
                lb.l lVar = (lb.l) sVar.a(lb.l.class);
                gVar.a();
                Context context2 = gVar.f7359a;
                String packageName = context2.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 18.4.3 for " + packageName, null);
                ia.b bVar = new ia.b(context2);
                h0 h0Var3 = new h0();
                h0Var3.f2116c = new Object();
                h0Var3.f2117d = new TaskCompletionSource();
                h0Var3.f2114a = false;
                h0Var3.f2118f = new TaskCompletionSource();
                gVar.a();
                Context context3 = gVar.f7359a;
                h0Var3.f2115b = gVar;
                SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.firebase.crashlytics", 0);
                if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
                    h0Var3.f2114a = false;
                    boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
                } else {
                    boolValueOf = null;
                }
                if (boolValueOf == null) {
                    try {
                        PackageManager packageManager = context3.getPackageManager();
                        boolValueOf2 = (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context3.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_crashlytics_collection_enabled")) ? Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled")) : null;
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
                    }
                    if (boolValueOf2 == null) {
                        h0Var3.f2114a = false;
                        boolValueOf3 = null;
                    } else {
                        h0Var3.f2114a = true;
                        boolValueOf3 = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
                    }
                    boolValueOf = boolValueOf3;
                }
                h0Var3.e = boolValueOf;
                synchronized (h0Var3.f2116c) {
                    try {
                        if (h0Var3.a()) {
                            ((TaskCompletionSource) h0Var3.f2117d).trySetResult(null);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                z zVar = new z(context2, packageName, dVar, h0Var3);
                aa.b bVar2 = new aa.b(oVarG);
                androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(oVarG2);
                ExecutorService executorServiceA2 = da.h.a("Crashlytics Exception Handler");
                da.l lVar2 = new da.l(h0Var3, bVar);
                lVar.getClass();
                mb.c cVar2 = mb.c.f7093a;
                mb.d dVar2 = mb.d.f7095a;
                mb.a aVarA2 = mb.c.a(dVar2);
                if (aVarA2.f7084b != null) {
                    Log.d("SessionsDependencies", "Subscriber " + dVar2 + " already registered.");
                } else {
                    aVarA2.f7084b = lVar2;
                    aVarA2.f7083a.d(null);
                }
                Log.d("FirebaseSessions", "Registering Sessions SDK subscriber with name: " + dVar2 + ", data collection enabled: " + h0Var3.a());
                q qVar = lVar.f6926c.f6950f;
                if (qVar != null) {
                    if (qVar == null) {
                        jc.i.i("currentSession");
                        throw null;
                    }
                    lVar2.a(new mb.e(qVar.f6938a));
                }
                da.s sVar2 = new da.s(gVar, zVar, bVar2, h0Var3, new z9.a(fVar), new z9.a(fVar), bVar, executorServiceA2, lVar2);
                h0 h0Var4 = h0Var3;
                gVar.a();
                String str8 = gVar.f7361c.f7367b;
                int iE2 = da.h.e(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (iE2 == 0) {
                    iE2 = da.h.e(context2, "com.crashlytics.android.build_id", "string");
                }
                String string4 = iE2 != 0 ? context2.getResources().getString(iE2) : null;
                ArrayList arrayList2 = new ArrayList();
                int iE3 = da.h.e(context2, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int iE4 = da.h.e(context2, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int iE5 = da.h.e(context2, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                try {
                    if (iE3 == 0 || iE4 == 0 || iE5 == 0) {
                        h0Var = h0Var4;
                        String str9 = String.format("Could not find resources: %d %d %d", Integer.valueOf(iE3), Integer.valueOf(iE4), Integer.valueOf(iE5));
                        i = 3;
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            th = null;
                            Log.d("FirebaseCrashlytics", str9, null);
                        }
                        strB = u3.b.b("Mapping file ID is: ", string4);
                        if (Log.isLoggable("FirebaseCrashlytics", i)) {
                            Log.d("FirebaseCrashlytics", strB, th);
                        }
                        size = arrayList2.size();
                        i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            da.e eVar2 = (da.e) obj;
                            String str10 = eVar2.f3098a;
                            String str11 = eVar2.f3099b;
                            String str12 = eVar2.f3100c;
                            int i17 = size;
                            StringBuilder sbE = u3.b.e("Build id for ", str10, " on ", str11, ": ");
                            sbE.append(str12);
                            string3 = sbE.toString();
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", string3, null);
                            }
                            size = i17;
                        }
                        aVarA = da.a.a(context2, zVar, str8, string4, arrayList2, new aa.c(context2, 0));
                        str = "Installer package name is: " + aVarA.f3085d;
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", str, null);
                        }
                        executorServiceA = da.h.a("com.google.firebase.crashlytics.startup");
                        str2 = aVarA.f3086f;
                        str3 = aVarA.f3087g;
                        strC = zVar.c();
                        eVar = new b9.e(12);
                        iVar = new e7.i(eVar, 24);
                        cVar = new ib.c(bVar);
                        Locale locale = Locale.US;
                        strI = v.i("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str8, "/settings");
                        a0Var = new a0();
                        if (strI != null) {
                            throw new IllegalArgumentException("url must not be null.");
                        }
                        a0Var.f3089a = strI;
                        String str13 = Build.MANUFACTURER;
                        String str14 = z.h;
                        String strU = v.u(str13.replaceAll(str14, ""), "/", Build.MODEL.replaceAll(str14, ""));
                        String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str14, "");
                        String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str14, "");
                        iE = da.h.e(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
                        if (iE == 0) {
                            iE = da.h.e(context2, "com.crashlytics.android.build_id", "string");
                        }
                        if (iE != 0) {
                            string = context2.getResources().getString(iE);
                        } else {
                            string = null;
                        }
                        strArr = new String[]{string, str8, str3, str2};
                        arrayList = new ArrayList();
                        i11 = 0;
                        while (i11 < 4) {
                            str7 = strArr[i11];
                            int i18 = i11;
                            if (str7 != null) {
                                arrayList.add(str7.replace("-", "").toLowerCase(Locale.US));
                            }
                            i11 = i18 + 1;
                        }
                        Collections.sort(arrayList);
                        sb2 = new StringBuilder();
                        i12 = 0;
                        for (size2 = arrayList.size(); i12 < size2; size2 = size2) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            sb2.append((String) obj2);
                        }
                        string2 = sb2.toString();
                        if (string2.length() > 0) {
                            strI2 = da.h.i(string2);
                            str4 = strC;
                        } else {
                            str4 = strC;
                            strI2 = null;
                        }
                        if (str4 != null) {
                            i13 = 4;
                        } else {
                            i13 = 1;
                        }
                        ka.d dVar3 = new ka.d(str8, strU, strReplaceAll, strReplaceAll2, zVar, strI2, str3, str2, v.b(i13));
                        jVar = new c3.j();
                        AtomicReference atomicReference3 = new AtomicReference();
                        jVar.h = atomicReference3;
                        jVar.i = new AtomicReference(new TaskCompletionSource());
                        jVar.f1759a = context2;
                        jVar.f1760b = dVar3;
                        jVar.f1762d = eVar;
                        jVar.f1761c = iVar;
                        jVar.e = cVar;
                        jVar.f1763f = a0Var;
                        jVar.f1764g = h0Var;
                        atomicReference3.set(wa.d.b(eVar));
                        atomicReference = (AtomicReference) jVar.i;
                        atomicReference2 = (AtomicReference) jVar.h;
                        i14 = 0;
                        i15 = 19;
                        if (((Context) jVar.f1759a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((ka.d) jVar.f1760b).f6138f) || (bVarD2 = jVar.d(1)) == null) {
                            bVarD = jVar.d(3);
                            if (bVarD != null) {
                                atomicReference2.set(bVarD);
                                ((TaskCompletionSource) atomicReference.get()).trySetResult(bVarD);
                            }
                            h0Var2 = (h0) jVar.f1764g;
                            Task task = ((TaskCompletionSource) h0Var2.f2118f).getTask();
                            synchronized (h0Var2.f2116c) {
                                Task task2 = ((TaskCompletionSource) h0Var2.f2117d).getTask();
                                break;
                            }
                            ExecutorService executorService2 = c0.f3097a;
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            b0 b0Var = new b0(taskCompletionSource, i14);
                            executorService = executorServiceA;
                            task.continueWith(executorService, b0Var);
                            task2.continueWith(executorService, b0Var);
                            taskOnSuccessTask = taskCompletionSource.getTask().onSuccessTask(executorService, new a4.b(jVar, i15));
                        } else {
                            atomicReference2.set(bVarD2);
                            ((TaskCompletionSource) atomicReference.get()).trySetResult(bVarD2);
                            taskOnSuccessTask = Tasks.forResult(null);
                            executorService = executorServiceA;
                        }
                        taskOnSuccessTask.continueWith(executorService, new r7.j());
                        a3.j jVar3 = sVar2.f3151m;
                        ia.b bVar3 = sVar2.i;
                        context = sVar2.f3142a;
                        if (context != null || (resources = context.getResources()) == null) {
                            z4 = true;
                        } else {
                            int iE6 = da.h.e(context, "com.crashlytics.RequireBuildId", "bool");
                            if (iE6 > 0) {
                                z4 = resources.getBoolean(iE6);
                            } else {
                                int iE7 = da.h.e(context, "com.crashlytics.RequireBuildId", "string");
                                if (iE7 > 0) {
                                    z4 = Boolean.parseBoolean(context.getString(iE7));
                                } else {
                                    z4 = true;
                                }
                            }
                        }
                        str5 = r24.f3083b;
                        if (z4) {
                            str6 = "FirebaseCrashlytics";
                            if (TextUtils.isEmpty(str5)) {
                                Log.e(str6, ".");
                                Log.e(str6, ".     |  | ");
                                Log.e(str6, ".     |  |");
                                Log.e(str6, ".     |  |");
                                Log.e(str6, ".   \\ |  | /");
                                Log.e(str6, ".    \\    /");
                                Log.e(str6, ".     \\  /");
                                Log.e(str6, ".      \\/");
                                Log.e(str6, ".");
                                Log.e(str6, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                                Log.e(str6, ".");
                                Log.e(str6, ".      /\\");
                                Log.e(str6, ".     /  \\");
                                Log.e(str6, ".    /    \\");
                                Log.e(str6, ".   / |  | \\");
                                Log.e(str6, ".     |  |");
                                Log.e(str6, ".     |  |");
                                Log.e(str6, ".     |  |");
                                Log.e(str6, ".");
                                throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                            }
                        } else {
                            str6 = "FirebaseCrashlytics";
                            if (Log.isLoggable(str6, 2)) {
                                Log.v(str6, "Configured not to require a build ID.", null);
                            }
                        }
                        new da.f(sVar2.h);
                        String str15 = da.f.f3102b;
                        try {
                            sVar2.f3146f = new aa.c(i15, "crash_marker", bVar3);
                            sVar2.e = new aa.c(i15, "initialization_marker", bVar3);
                            bd.v vVar = new bd.v(str15, bVar3, jVar3);
                            ea.c cVar3 = new ea.c(bVar3);
                            try {
                                try {
                                    jVar2 = jVar;
                                    try {
                                        sVar2.f3147g = new p(sVar2.f3142a, sVar2.f3151m, sVar2.h, sVar2.f3143b, sVar2.i, sVar2.f3146f, aVarA, vVar, cVar3, bd.v.f(sVar2.f3142a, sVar2.h, sVar2.i, aVarA, cVar3, vVar, new o0(new la.a[]{new wa.d()}), jVar, sVar2.f3144c, sVar2.f3152n), sVar2.f3153o, sVar2.f3149k, sVar2.f3152n);
                                        aa.c cVar4 = sVar2.e;
                                        ia.b bVar4 = (ia.b) cVar4.f264c;
                                        String str16 = (String) cVar4.f263b;
                                        bVar4.getClass();
                                        zExists = new File(bVar4.f5246b, str16).exists();
                                        try {
                                            Boolean.TRUE.equals((Boolean) c0.a(jVar3.d(new r(sVar2, 1))));
                                        } catch (Exception unused) {
                                        }
                                        p pVar = sVar2.f3147g;
                                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                                        z10 = false;
                                        try {
                                            pVar.e.d(new d6.g(pVar, str15, 2, z10));
                                            u uVar = new u(new ib.c(pVar, 13), jVar2, defaultUncaughtExceptionHandler, pVar.f3131j);
                                            pVar.f3135n = uVar;
                                            Thread.setDefaultUncaughtExceptionHandler(uVar);
                                            if (!zExists && (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || ((activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting()))) {
                                                if (Log.isLoggable(str6, 3)) {
                                                    Log.d(str6, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                                                }
                                                sVar2.b(jVar2);
                                            } else {
                                                if (Log.isLoggable(str6, 3)) {
                                                    Log.d(str6, "Successfully configured exception handler.", null);
                                                }
                                                z10 = true;
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            Log.e(str6, "Crashlytics was not started due to an exception during initialization", e);
                                            sVar2.f3147g = null;
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        z10 = false;
                                        Log.e(str6, "Crashlytics was not started due to an exception during initialization", e);
                                        sVar2.f3147g = null;
                                        Tasks.call(executorService, new z9.b(z10, sVar2, jVar2));
                                        return new z9.c();
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    jVar2 = jVar;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                jVar2 = jVar;
                            }
                            break;
                        } catch (Exception e13) {
                            e = e13;
                            jVar2 = jVar;
                            z10 = false;
                        }
                        Tasks.call(executorService, new z9.b(z10, sVar2, jVar2));
                        return new z9.c();
                    }
                    String[] stringArray = context2.getResources().getStringArray(iE3);
                    String[] stringArray2 = context2.getResources().getStringArray(iE4);
                    String[] stringArray3 = context2.getResources().getStringArray(iE5);
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i19 = 0;
                        while (i19 < stringArray3.length) {
                            int i20 = i19;
                            arrayList2.add(new da.e(stringArray[i19], stringArray2[i20], stringArray3[i20]));
                            i19 = i20 + 1;
                            h0Var4 = h0Var4;
                        }
                        h0Var = h0Var4;
                    } else {
                        h0Var = h0Var4;
                        String str17 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", str17, null);
                        }
                    }
                    i = 3;
                    aVarA = da.a.a(context2, zVar, str8, string4, arrayList2, new aa.c(context2, 0));
                    str = "Installer package name is: " + aVarA.f3085d;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str, null);
                    }
                    executorServiceA = da.h.a("com.google.firebase.crashlytics.startup");
                    str2 = aVarA.f3086f;
                    str3 = aVarA.f3087g;
                    strC = zVar.c();
                    eVar = new b9.e(12);
                    iVar = new e7.i(eVar, 24);
                    cVar = new ib.c(bVar);
                    Locale locale2 = Locale.US;
                    strI = v.i("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str8, "/settings");
                    a0Var = new a0();
                    if (strI != null) {
                        throw new IllegalArgumentException("url must not be null.");
                    }
                    a0Var.f3089a = strI;
                    String str18 = Build.MANUFACTURER;
                    String str19 = z.h;
                    String strU2 = v.u(str18.replaceAll(str19, ""), "/", Build.MODEL.replaceAll(str19, ""));
                    String strReplaceAll3 = Build.VERSION.INCREMENTAL.replaceAll(str19, "");
                    String strReplaceAll4 = Build.VERSION.RELEASE.replaceAll(str19, "");
                    iE = da.h.e(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (iE == 0) {
                        iE = da.h.e(context2, "com.crashlytics.android.build_id", "string");
                    }
                    if (iE != 0) {
                        string = context2.getResources().getString(iE);
                    } else {
                        string = null;
                    }
                    strArr = new String[]{string, str8, str3, str2};
                    arrayList = new ArrayList();
                    i11 = 0;
                    while (i11 < 4) {
                        str7 = strArr[i11];
                        int i110 = i11;
                        if (str7 != null) {
                            arrayList.add(str7.replace("-", "").toLowerCase(Locale.US));
                        }
                        i11 = i110 + 1;
                    }
                    Collections.sort(arrayList);
                    sb2 = new StringBuilder();
                    i12 = 0;
                    while (i12 < size2) {
                        Object obj3 = arrayList.get(i12);
                        i12++;
                        sb2.append((String) obj3);
                    }
                    string2 = sb2.toString();
                    if (string2.length() > 0) {
                        strI2 = da.h.i(string2);
                        str4 = strC;
                    } else {
                        str4 = strC;
                        strI2 = null;
                    }
                    if (str4 != null) {
                        i13 = 4;
                    } else {
                        i13 = 1;
                    }
                    ka.d dVar4 = new ka.d(str8, strU2, strReplaceAll3, strReplaceAll4, zVar, strI2, str3, str2, v.b(i13));
                    jVar = new c3.j();
                    AtomicReference atomicReference4 = new AtomicReference();
                    jVar.h = atomicReference4;
                    jVar.i = new AtomicReference(new TaskCompletionSource());
                    jVar.f1759a = context2;
                    jVar.f1760b = dVar4;
                    jVar.f1762d = eVar;
                    jVar.f1761c = iVar;
                    jVar.e = cVar;
                    jVar.f1763f = a0Var;
                    jVar.f1764g = h0Var;
                    atomicReference4.set(wa.d.b(eVar));
                    atomicReference = (AtomicReference) jVar.i;
                    atomicReference2 = (AtomicReference) jVar.h;
                    i14 = 0;
                    i15 = 19;
                    if (((Context) jVar.f1759a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((ka.d) jVar.f1760b).f6138f)) {
                        bVarD = jVar.d(3);
                        if (bVarD != null) {
                            atomicReference2.set(bVarD);
                            ((TaskCompletionSource) atomicReference.get()).trySetResult(bVarD);
                        }
                        h0Var2 = (h0) jVar.f1764g;
                        Task task3 = ((TaskCompletionSource) h0Var2.f2118f).getTask();
                        synchronized (h0Var2.f2116c) {
                            Task task4 = ((TaskCompletionSource) h0Var2.f2117d).getTask();
                            ExecutorService executorService3 = c0.f3097a;
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            b0 b0Var2 = new b0(taskCompletionSource2, i14);
                            executorService = executorServiceA;
                            task3.continueWith(executorService, b0Var2);
                            task4.continueWith(executorService, b0Var2);
                            taskOnSuccessTask = taskCompletionSource2.getTask().onSuccessTask(executorService, new a4.b(jVar, i15));
                        }
                    } else {
                        bVarD = jVar.d(3);
                        if (bVarD != null) {
                            atomicReference2.set(bVarD);
                            ((TaskCompletionSource) atomicReference.get()).trySetResult(bVarD);
                        }
                        h0Var2 = (h0) jVar.f1764g;
                        Task task5 = ((TaskCompletionSource) h0Var2.f2118f).getTask();
                        synchronized (h0Var2.f2116c) {
                            Task task6 = ((TaskCompletionSource) h0Var2.f2117d).getTask();
                            ExecutorService executorService4 = c0.f3097a;
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            b0 b0Var3 = new b0(taskCompletionSource3, i14);
                            executorService = executorServiceA;
                            task5.continueWith(executorService, b0Var3);
                            task6.continueWith(executorService, b0Var3);
                            taskOnSuccessTask = taskCompletionSource3.getTask().onSuccessTask(executorService, new a4.b(jVar, i15));
                        }
                    }
                    taskOnSuccessTask.continueWith(executorService, new r7.j());
                    a3.j jVar4 = sVar2.f3151m;
                    ia.b bVar5 = sVar2.i;
                    context = sVar2.f3142a;
                    if (context != null) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    str5 = r24.f3083b;
                    if (z4) {
                        str6 = "FirebaseCrashlytics";
                        if (Log.isLoggable(str6, 2)) {
                            Log.v(str6, "Configured not to require a build ID.", null);
                        }
                    } else {
                        str6 = "FirebaseCrashlytics";
                        if (TextUtils.isEmpty(str5)) {
                            Log.e(str6, ".");
                            Log.e(str6, ".     |  | ");
                            Log.e(str6, ".     |  |");
                            Log.e(str6, ".     |  |");
                            Log.e(str6, ".   \\ |  | /");
                            Log.e(str6, ".    \\    /");
                            Log.e(str6, ".     \\  /");
                            Log.e(str6, ".      \\/");
                            Log.e(str6, ".");
                            Log.e(str6, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                            Log.e(str6, ".");
                            Log.e(str6, ".      /\\");
                            Log.e(str6, ".     /  \\");
                            Log.e(str6, ".    /    \\");
                            Log.e(str6, ".   / |  | \\");
                            Log.e(str6, ".     |  |");
                            Log.e(str6, ".     |  |");
                            Log.e(str6, ".     |  |");
                            Log.e(str6, ".");
                            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                        }
                    }
                    new da.f(sVar2.h);
                    String str110 = da.f.f3102b;
                    sVar2.f3146f = new aa.c(i15, "crash_marker", bVar5);
                    sVar2.e = new aa.c(i15, "initialization_marker", bVar5);
                    bd.v vVar2 = new bd.v(str110, bVar5, jVar4);
                    ea.c cVar5 = new ea.c(bVar5);
                    jVar2 = jVar;
                    sVar2.f3147g = new p(sVar2.f3142a, sVar2.f3151m, sVar2.h, sVar2.f3143b, sVar2.i, sVar2.f3146f, aVarA, vVar2, cVar5, bd.v.f(sVar2.f3142a, sVar2.h, sVar2.i, aVarA, cVar5, vVar2, new o0(new la.a[]{new wa.d()}), jVar, sVar2.f3144c, sVar2.f3152n), sVar2.f3153o, sVar2.f3149k, sVar2.f3152n);
                    aa.c cVar6 = sVar2.e;
                    ia.b bVar6 = (ia.b) cVar6.f264c;
                    String str111 = (String) cVar6.f263b;
                    bVar6.getClass();
                    zExists = new File(bVar6.f5246b, str111).exists();
                    Boolean.TRUE.equals((Boolean) c0.a(jVar4.d(new r(sVar2, 1))));
                    p pVar2 = sVar2.f3147g;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                    z10 = false;
                    pVar2.e.d(new d6.g(pVar2, str110, 2, z10));
                    u uVar2 = new u(new ib.c(pVar2, 13), jVar2, defaultUncaughtExceptionHandler2, pVar2.f3131j);
                    pVar2.f3135n = uVar2;
                    Thread.setDefaultUncaughtExceptionHandler(uVar2);
                    if (!zExists) {
                        if (Log.isLoggable(str6, 3)) {
                            Log.d(str6, "Successfully configured exception handler.", null);
                        }
                        z10 = true;
                    } else {
                        if (Log.isLoggable(str6, 3)) {
                            Log.d(str6, "Successfully configured exception handler.", null);
                        }
                        z10 = true;
                    }
                    Tasks.call(executorService, new z9.b(z10, sVar2, jVar2));
                    return new z9.c();
                } catch (PackageManager.NameNotFoundException e14) {
                    Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e14);
                    return null;
                }
                th = null;
                strB = u3.b.b("Mapping file ID is: ", string4);
                if (Log.isLoggable("FirebaseCrashlytics", i)) {
                    Log.d("FirebaseCrashlytics", strB, th);
                }
                size = arrayList2.size();
                i10 = 0;
                while (i10 < size) {
                    Object obj4 = arrayList2.get(i10);
                    i10++;
                    da.e eVar3 = (da.e) obj4;
                    String str112 = eVar3.f3098a;
                    String str113 = eVar3.f3099b;
                    String str114 = eVar3.f3100c;
                    int i111 = size;
                    StringBuilder sbE2 = u3.b.e("Build id for ", str112, " on ", str113, ": ");
                    sbE2.append(str114);
                    string3 = sbE2.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", string3, null);
                    }
                    size = i111;
                }
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(sVar);
        }
    }

    @Override // ya.a
    public void b(ya.b bVar) {
    }
}
