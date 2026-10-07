package da;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import fa.i0;
import fa.j0;
import fa.l0;
import fa.m0;
import fa.t1;
import h6.o0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f3115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f3116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Thread f3117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c3.j f3118d;
    public final /* synthetic */ p e;

    public m(p pVar, long j4, Throwable th, Thread thread, c3.j jVar) {
        this.e = pVar;
        this.f3115a = j4;
        this.f3116b = th;
        this.f3117c = thread;
        this.f3118d = jVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        ActivityManager.RunningAppProcessInfo next;
        Boolean boolValueOf;
        long j4 = this.f3115a;
        long j10 = j4 / 1000;
        p pVar = this.e;
        NavigableSet navigableSetC = ((ia.a) pVar.f3134m.f1681b).c();
        String str = !navigableSetC.isEmpty() ? (String) navigableSetC.first() : null;
        if (str == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        pVar.f3127c.c();
        bd.v vVar = pVar.f3134m;
        vVar.getClass();
        String strConcat = "Persisting fatal event for session ".concat(str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        t tVar = (t) vVar.f1682c;
        Context context = tVar.f3156a;
        int i = context.getResources().getConfiguration().orientation;
        o0 o0Var = tVar.f3159d;
        Throwable th = this.f3116b;
        String localizedMessage = th.getLocalizedMessage();
        String name = th.getClass().getName();
        StackTraceElement[] stackTraceElementArrJ = o0Var.j(th.getStackTrace());
        Throwable cause = th.getCause();
        a3.j jVar = cause != null ? new a3.j(cause, o0Var) : null;
        bd.u uVar = new bd.u(1);
        uVar.f1676b = "crash";
        uVar.f1677c = Long.valueOf(j10);
        String str2 = tVar.f3158c.e;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            next = null;
            break;
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Iterator<ActivityManager.RunningAppProcessInfo> it2 = it;
            if (next.processName.equals(str2)) {
                break;
            }
            it = it2;
        }
        if (next != null) {
            boolValueOf = Boolean.valueOf(next.importance != 100);
        } else {
            boolValueOf = null;
        }
        ArrayList arrayList = new ArrayList();
        Thread thread = this.f3117c;
        Boolean bool = boolValueOf;
        arrayList.add(t.e(thread, stackTraceElementArrJ, 4));
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = Thread.getAllStackTraces().entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry<Thread, StackTraceElement[]> next2 = it3.next();
            Thread key = next2.getKey();
            if (!key.equals(thread)) {
                arrayList.add(t.e(key, o0Var.j(next2.getValue()), 0));
            }
            it3 = it3;
            thread = thread;
        }
        uVar.f1678d = new i0(new j0(new t1(arrayList), new l0(name, localizedMessage, new t1(t.d(stackTraceElementArrJ, 4)), jVar != null ? t.c(jVar, 1) : null, 0), null, new m0("0", "0", 0L), tVar.a()), null, null, bool, i);
        uVar.e = tVar.b(i);
        ((ia.a) vVar.f1681b).d(bd.v.a(uVar.b(), (ea.c) vVar.e, (bd.v) vVar.f1684f), str, true);
        try {
            ia.b bVar = pVar.f3130g;
            String str3 = ".ae" + j4;
            bVar.getClass();
            if (!new File(bVar.f5246b, str3).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e);
        }
        c3.j jVar2 = this.f3118d;
        pVar.c(false, jVar2);
        new f(pVar.f3129f);
        p.a(pVar, f.f3102b);
        if (!pVar.f3126b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) pVar.e.f107a;
        return ((TaskCompletionSource) ((AtomicReference) jVar2.i).get()).getTask().onSuccessTask(executor, new aa.c(this, executor, str));
    }
}
